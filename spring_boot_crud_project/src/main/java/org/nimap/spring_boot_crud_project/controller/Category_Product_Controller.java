package org.nimap.spring_boot_crud_project.controller;

import java.util.List;
import java.util.Optional;

import org.nimap.spring_boot_crud_project.dao.Catogery_Product_Dao;
import org.nimap.spring_boot_crud_project.dto.Category;
import org.nimap.spring_boot_crud_project.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Category_Product_Controller
{
	
	@Autowired
	Catogery_Product_Dao dao;
	
	//Create Category
	@PostMapping("api/categories")
	public Category saveCatogery(@RequestBody Category category)
	{
		 return dao.saveCategory(category);
	}
	
	//Get all Categories
	@GetMapping("api/categories/page")
	public List<Category> getAllCategory(@RequestParam(value = "pagenumber",defaultValue="0", required=false)Integer pagenumber,
					     @RequestParam(value = "pagesize", defaultValue = "2",required = false)Integer pagesize)
	{
		return dao.getAllCategory(pagenumber,pagesize);
	}
	
	//Get category By Id
	@GetMapping("api/categories/getId/{id}")
	public Optional<Category> getById(@PathVariable("id")int id)
	{
		return dao.getCategoryById(id);
	}
	
	//Update category By Id
	@PutMapping("api/categories/updateId/{id}")
	public Category updateCategory(@RequestBody Category category,@PathVariable("id") int id)
	{
		return dao.updateCategory(category,id);
	}
	
	//Delete category By Id
	@DeleteMapping("api/categories/deleteId/{id}")
	public void deleteById(@PathVariable("id") int id)
	{
		dao.deleteCategory(id);
	}
	
	//CREATE PRODUCT
	@PostMapping("api/products")
	public Product saveProduct(@RequestBody Product product)
	{
		return dao.saveProduct(product);
	}
	
	//GET ALL PRODUCT
	@GetMapping("api/products/page")
	public List<Product> getAllProduct(@RequestParam(value = "pagenumber",defaultValue="0", required=false)Integer pagenumber,
					   @RequestParam(value = "pagesize", defaultValue = "2",required = false)Integer pagesize)
	{
		return dao.getAllProduct(pagenumber,pagesize);
	}
	
	//GET BY ID
	@GetMapping("api/products/getId/{id}")
	public Optional<Product> getProductById(@PathVariable("id") int id)
	{
		return dao.findById(id);
	}
	
	//UPDATE PRODUCT BY ID
	@PutMapping("api/products/updateId/{id}")
	public Product updateProduct(@RequestBody Product products,@PathVariable("id") int id)
	{
		return dao.updateproduct(products,id);

	}
	
	//DELETE BY ID
	@DeleteMapping("api/products/deleteId/{id}")
	public void deleteProductById(@PathVariable int id)
	{
		dao.deleteProductById(id);
	}
}
