package com.microservices.departmentservice.service;

import com.microservices.departmentservice.dto.DepartmentDto;

public interface DepertmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartment(String departmentCode);
}
