package co.firmareal.controller;

import java.util.List;

import co.firmareal.shared.dto.products.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.firmareal.entity.Product;

@Controller
public class AppController {
    @Autowired
    private ProductDto products;

    @RequestMapping("/")
    public String homepage(Model model) {
        List<Product> products = this.products.getProducts();
        model.addAttribute("products", products);
        return "homepage";
    }
}
