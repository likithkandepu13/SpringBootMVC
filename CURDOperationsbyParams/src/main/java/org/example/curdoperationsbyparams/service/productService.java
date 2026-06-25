package org.example.curdoperationsbyparams.service;

import org.example.curdoperationsbyparams.entity.Description;
import org.example.curdoperationsbyparams.entity.Product;
import org.example.curdoperationsbyparams.model.productModel;
import org.example.curdoperationsbyparams.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {

    @Autowired
    productRepo repo;

    public String addProduct(productModel pm)
    {
        Product p=new Product();
        p.setPname(pm.getPname());
        p.setQuantity(pm.getQuantity());
        Description d = new Description();
        d.setModel(pm.getDescription().getModel());
        d.setYom(pm.getDescription().getYom());
        p.setDescription(d);
        try{
            repo.save(p);
            return "success";
        }
        catch (Exception e)
        {
            return "fail";
        }

    }

    public List<Product> getAllProducts() {
       return repo.findAll();
    }

    public List<Product> getAllProductsByQuantity(int n)
    {
        return repo.findByQuantity(n);
    }

    public List<Product> getProductsByYom(int yom)
    {
        return repo.findByDescriptionYom(yom);
    }

    public String updateProduct(String name,int quantity) {
        Product p = repo.findByPname(name);
        if(p!=null)
        {
            int z =p.getQuantity();
            p.setQuantity(quantity);
            return "prodcut updated from "+z+ " to "+p;
        }
        return "product not found";

    }

    public String deleteProduct(int id)
    {
        if(repo.findById(id)!=null)
        {
            repo.deleteById(id);
            return " deleted successfully";
        }
        else {
            return "product not found";
        }
    }

}
