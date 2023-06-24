package cl.musicpro.bffserviceproduct.controller;


import cl.musicpro.bffserviceproduct.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/product/{id}", produces =MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO getProduct(@PathVariable int id){ return productService.getProduct(id);}

    @PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO> addProduct(@RequestBody ProductDTO productoDTO){ return productService.addProduct(productoDTO);}

    @PutMapping(path = "/product/edit", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>EditProduct(@RequestBody ProductDTO productoDTO){return productService.editProduct(productoDTO);}

    @DeleteMapping(path = "/product/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO DeleteProduct(@PathVariable int id){return productService.deleteProduct(id);}

}
