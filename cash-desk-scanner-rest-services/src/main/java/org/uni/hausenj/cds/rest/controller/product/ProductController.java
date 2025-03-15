package org.uni.hausenj.cds.rest.controller.product;

import org.uni.hausenj.cds.model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/product")
	public Product getProduct(@RequestParam(value = "id", defaultValue = "0") String id) {
		Product p = new Product();
		p.setId(Long.parseLong(id));
		p.setName(String.format("Product name of product with id=%s", id));
		return p;
	}
}