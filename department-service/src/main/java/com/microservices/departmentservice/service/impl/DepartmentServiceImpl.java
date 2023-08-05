package com.microservices.departmentservice.service.impl;
import com.microservices.departmentservice.dto.DepartmentDto;
import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;
import com.microservices.departmentservice.service.DepertmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepertmentService {

    private DepartmentRepository departmentRepository;
    private ModelMapper modelMapper;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = modelMapper.map(departmentDto, Department.class);
        Department savedDepartment = departmentRepository.save(department);
        DepartmentDto departmentDto1 = modelMapper.map(savedDepartment, DepartmentDto.class);
        return departmentDto1;
    }
    @Override
    public DepartmentDto getDepartment(String departmentCode) {
        Department departmentByDepartmentCode = departmentRepository.getDepartmentByDepartmentCode(departmentCode);
        return modelMapper.map(departmentByDepartmentCode, DepartmentDto.class);
    }
}
