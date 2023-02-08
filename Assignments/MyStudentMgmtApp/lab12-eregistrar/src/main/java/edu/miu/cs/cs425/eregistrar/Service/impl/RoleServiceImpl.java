package edu.miu.cs.cs425.eregistrar.Service.impl;

import edu.miu.cs.cs425.eregistrar.Service.RoleService;
import edu.miu.cs.cs425.eregistrar.model.Role;
import edu.miu.cs.cs425.eregistrar.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
