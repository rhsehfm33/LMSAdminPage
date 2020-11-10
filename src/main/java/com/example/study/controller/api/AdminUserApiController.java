package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.AdminUserApiRequest;
import com.example.study.model.network.response.AdminUserApiResponse;
import com.example.study.service.AdminUserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adminUser")
public class AdminUserApiController implements CrudInterface<AdminUserApiRequest, AdminUserApiResponse> {

    @Autowired
    AdminUserApiLogicService adminUserApiLogicService;

    @PostMapping("")
    @Override
    public Header<AdminUserApiResponse> create(@RequestBody Header<AdminUserApiRequest> request) {
        return adminUserApiLogicService.create(request);
    }

    @GetMapping("{id}")
    @Override
    public Header<AdminUserApiResponse> read(@PathVariable Long id) {
        return null;
    }

    @PutMapping("")
    @Override
    public Header<AdminUserApiResponse> update(@RequestBody Header<AdminUserApiRequest> request) {
        return null;
    }

    @DeleteMapping("{id}")
    @Override
    public Header delete(@PathVariable Long id) {
        return null;
    }
}
