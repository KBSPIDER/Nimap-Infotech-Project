package org.nimap.spring_boot_crud_project.repository;

import org.nimap.spring_boot_crud_project.dto.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Category_Repository extends JpaRepository<Category, Integer>
{

}
