package com.example.study.service;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public abstract class BaseService<Req, Res, Entity> implements CrudInterface<Req, Res> {

    @Autowired(required = false)
    protected JpaRepository<Entity, Long> baseRepository;

    protected abstract Header<Res> response(Entity data);

    public Header<List<Res>> search(Pageable pageable) {
        Page<Entity> searchedData = baseRepository.findAll(pageable);

        List<Res> dataApiResponseList = searchedData.stream()
                .map(this::response)
                .map(headerDataApiResponse -> headerDataApiResponse.getData())
                .collect(Collectors.toList());

        // List<UserApiResponse> -> Header<List<UserApiResponse>>
        Pagination pagination = Pagination.builder()
                .totalPages(searchedData.getTotalPages())
                .totalElements(searchedData.getTotalElements())
                .currentPage(searchedData.getTotalPages())
                .currentElements(searchedData.getNumberOfElements())
                .build();

        return Header.OK(dataApiResponseList, pagination);
    }


}
