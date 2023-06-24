package cl.musicpro.bffserviceproduct.client;
import cl.musicpro.bffserviceproduct.model.dto.CommonResponseDTO;


import cl.musicpro.bffserviceproduct.model.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="bff-products-svc",url="http://localhost:8181/products-svc")
public interface ProductSvcFeingClient {

    @GetMapping(path="/products",produces =MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getProducts();

    @GetMapping(path = "/product/{id}", produces =MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO getProduct(@PathVariable int id);

    @PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO> addProduct(@RequestBody ProductDTO productoDTO);

    @PutMapping(path = "/product/edit", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>EditProduct(@RequestBody ProductDTO productoDTO);

    @DeleteMapping(path = "/product/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO deleteProduct(@PathVariable int id);
}
