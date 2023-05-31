package cl.musicpro.bffserviceproduct.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.musicpro.bffserviceproduct.model.dto.CommonResponseDTO;

import cl.musicpro.bffserviceproduct.service.ProductService;

@RestController
@RequestMapping("/products-bff")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(path="/products", produces=MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO getProducts(){
        return productService.getProducts();
    }

}
