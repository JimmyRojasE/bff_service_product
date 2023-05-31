package cl.musicpro.bffserviceproduct.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.bffserviceproduct.client.ProductSvcFeingClient;
import cl.musicpro.bffserviceproduct.model.dto.CommonResponseDTO;
import lombok.extern.log4j.Log4j2;


@Service
@Log4j2
public class ProductService {
    @Autowired
    ProductSvcFeingClient productSvcFeingClient;
    
    public CommonResponseDTO getProducts(){
        log.info("Request cl.musicpro.bffserviceproduct.service[getProducts]");
        log.info("[getProducts] Response: "+productSvcFeingClient.getProducts().toString());
        return productSvcFeingClient.getProducts();
    }
}
