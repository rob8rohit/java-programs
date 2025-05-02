// ProductController.java
package springboot.productcatalogsystem;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        service.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/display")
    public String displayProducts(Model model) {
        model.addAttribute("products", service.getAllProducts());
        return "display-products";
    }
}
