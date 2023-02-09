package edu.miu.cs.cs425.finalreview.repository;

import edu.miu.cs.cs425.finalreview.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
