package test.java.com.example.productapi.controller;

import com.example.productapi.controller.ProductController;
import com.example.productapi.model.Product;
// import com.example.productapi.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@ContextConfiguration(classes = {ProductController.class})
public class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductController productController;

    // @MockBean
    // private ProductService productService;

    // @Test
    // public void testGetProducts() {
    //     Product product1 = new Product();
    //     product1.setId(1L);
    //     product1.setName("Product 1");

    //     Product product2 = new Product();
    //     product2.setId(2L);
    //     product2.setName("Product 2");

    //     List<Product> expectedProducts = Arrays.asList(product1, product2);

    //     when(productService.getProducts()).thenReturn(expectedProducts);

    //     List<Product> actualProducts = productController.getProducts();

    //     assertEquals(expectedProducts, actualProducts);
    // }

    @Test
    public void testGetProductsReturnStatus() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/products")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetProductsPagination() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/products?page=0&size=15")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray())
                .andExpect(jsonPath("$.content.length()").value(15));
    }

    @Test
    public void testGetProductsData() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/products")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content[0].name").exists())
                .andExpect(jsonPath("$.content[0].price").exists())
                .andExpect(jsonPath("$.content[0].stockAvailability").exists());
    }
}