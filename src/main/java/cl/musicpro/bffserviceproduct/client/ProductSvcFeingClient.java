package cl.musicpro.bffserviceproduct.client;
import cl.musicpro.bffserviceproduct.model.dto.CommonResponseDTO;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="bff-products-svc",url="http://localhost:8181/products-svc")
public interface ProductSvcFeingClient {
    
    @GetMapping(path = "/products",produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getProducts();
}
