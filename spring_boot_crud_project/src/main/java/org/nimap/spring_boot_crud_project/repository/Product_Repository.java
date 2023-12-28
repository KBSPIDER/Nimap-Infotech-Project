package org.nimap.spring_boot_crud_project.repository;

import org.nimap.spring_boot_crud_project.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product, Integer>
{

}
