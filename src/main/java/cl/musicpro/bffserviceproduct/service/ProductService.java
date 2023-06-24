package cl.musicpro.bffserviceproduct.service;




import cl.musicpro.bffserviceproduct.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cl.musicpro.bffserviceproduct.client.ProductSvcFeingClient;
import cl.musicpro.bffserviceproduct.model.dto.CommonResponseDTO;
import lombok.extern.log4j.Log4j2;


@Service
@Log4j2
public class ProductService {
    @Autowired
    ProductSvcFeingClient productSvcFeingClient;

    public  CommonResponseDTO getProducts(){

        log.info("Request cl.musicpro.bffserviceproduct.service[getProducts]");
        log.info("[getProducts] Response: "+productSvcFeingClient.getProducts().toString());
        return productSvcFeingClient.getProducts();
    }
    public CommonResponseDTO getProduct(int id){
        log.info("Request cl.musicpro.bffserviceproduct.service[getProduct]");
        log.info("[getProduct] Response: "+productSvcFeingClient.getProducts().toString());
        return productSvcFeingClient.getProduct(id);
    }

    public CommonResponseDTO deleteProduct(int id){
        log.info("Request cl.musicpro.bffserviceproduct.service[deleteProduct]");
        log.info("[deleteProduct] Response: "+productSvcFeingClient.getProducts().toString());
        return productSvcFeingClient.deleteProduct(id);
    }
    public ResponseEntity<CommonResponseDTO> addProduct(ProductDTO productDTO){
        log.info("Request cl.musicpro.bffserviceproduct.service[addProduct]");
        log.info("[addProduct] Response: "+productSvcFeingClient.getProducts().toString());
        return productSvcFeingClient.addProduct(productDTO);
    }
    public ResponseEntity<CommonResponseDTO> editProduct(ProductDTO productDTO){
        log.info("Request cl.musicpro.bffserviceproduct.service[editProduct]");
        log.info("[editProduct] Response: "+productSvcFeingClient.getProducts().toString());
        return productSvcFeingClient.EditProduct(productDTO);
    }
}
