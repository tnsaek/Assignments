package edu.miu.cs.cs425.finalreview.service;

import edu.miu.cs.cs425.finalreview.model.Supplier;

import java.util.List;

public interface SupplierService {

    public Supplier addSupplier(Supplier supplier);
    public List<Supplier> getAllSuppliers();
}
