package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.CategoryApiRequest;
import com.example.study.model.network.response.CategoryApiResponse;
import com.example.study.service.CategoryApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryApiController implements CrudInterface<CategoryApiRequest, CategoryApiResponse> {

    @Autowired
    CategoryApiLogicService categoryApiLogicService;

    @PostMapping("")
    @Override
    public Header<CategoryApiResponse> create(@RequestBody Header<CategoryApiRequest> request) {
        return categoryApiLogicService.create(request);
    }

    @GetMapping("{id}")
    @Override
    public Header<CategoryApiResponse> read(@PathVariable Long id) {
        return categoryApiLogicService.read(id);
    }

    @PutMapping("")
    @Override
    public Header<CategoryApiResponse> update(@RequestBody Header<CategoryApiRequest> request) {
        return null;
    }

    @DeleteMapping("{id}")
    @Override
    public Header delete(@PathVariable Long id) {
        return null;
    }
}
