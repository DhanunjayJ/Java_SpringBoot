package com.dj.springeccom.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dj.springeccom.Model.Product;
import com.dj.springeccom.Service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://curly-capybara-wrwpwjj95vj6254rr-5173.app.github.dev/")
public class ProductController {
    
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId){
        Optional<Product> product = service.getProductById(productId);
        if (product.isPresent()) {
          return new ResponseEntity<>(product.get().getImageData(), HttpStatus.OK);
        } else {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }     
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product,@RequestPart MultipartFile imageFile) {
    Product savedProduct = null;
        try{
        savedProduct = service.addOrUpdateProduct(product,imageFile);
        return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
      } catch (IOException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
    return service.getProductById(id)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProdcut(@PathVariable int id, @RequestPart Product product,@RequestPart MultipartFile imageFile){
      Product updatedProduct = null;
      try{
        updatedProduct = service.addOrUpdateProduct(product,imageFile);
        return new ResponseEntity<>("Updated",HttpStatus.OK);
      }catch(IOException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
      }
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
      Optional<Product> product = service.getProductById(id);
      if(product.isPresent()){
        service.deleteProduct(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
      }
      return new ResponseEntity<>("Product Not Found",HttpStatus.NOT_FOUND);
    }

  @GetMapping("/products/search")
  public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword){
    List<Product> products = service.searchProducts(keyword);
    System.out.println("Searching for "+keyword);
    return new ResponseEntity<>(products,HttpStatus.OK);
  }

}
