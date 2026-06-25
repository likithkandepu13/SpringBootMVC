package org.example.curdoperationsbyparams.controller;

import org.example.curdoperationsbyparams.entity.Product;
import org.example.curdoperationsbyparams.model.productModel;
import org.example.curdoperationsbyparams.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    productService service;

    @GetMapping(path = "/getbyqunatity/{n}")
    public List<Product> getproducts(@PathVariable("n") int n)
    {
        return service.getAllProductsByQuantity(n);
    }

    @GetMapping(path = "/getAllproducts")
    public List<Product> getproducts()
    {
        return service.getAllProducts();
    }
    // get one on one mapping
    @GetMapping("/getbyyom/{yom}")
    public List<Product> getProductsByYom(@PathVariable("yom") int yom)
    {
        return service.getProductsByYom(yom);
    }

    //updating the content
    //http://localhost:8081/updateproduct?name=Samsung Galaxy S25&quantity=500
    @PutMapping("/updateproduct")
    public String updateProduct(@RequestParam("name")String name,@RequestParam("quantity")int quantity)
    {
        return service.updateProduct(name,quantity);

    }

    @DeleteMapping("/deleteproduct")
    public String deleteProduct(@RequestParam("id") int id)
    {
        return service.deleteProduct(id);
    }

    @PostMapping("/addproduct")
    public ResponseEntity<String> addProduct(@RequestBody productModel pm) {

        String s = service.addProduct(pm);

        if ("success".equals(s)) {
            return ResponseEntity
                    .status(201)
                    .body("Product added successfully");
        }

        return ResponseEntity
                .status(400)
                .body("Product addition failed");
    }
}