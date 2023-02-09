package edu.miu.cs.cs425.finalreview.service.impl;

import edu.miu.cs.cs425.finalreview.model.Supplier;
import edu.miu.cs.cs425.finalreview.repository.SupplierRepository;
import edu.miu.cs.cs425.finalreview.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class supplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier addSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
}
