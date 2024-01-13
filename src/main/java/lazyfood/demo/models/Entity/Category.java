package lazyfood.demo.models.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "CategoryId")
    private String CategoryId;
    @Column(name = "CategoryName")
    private String CategoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> Products;

    public Category() {
        this.CategoryId = "";
        this.CategoryName = "";
    }

    public Category(String id, String name) {
        CategoryId = id;
        CategoryName = name;
        Products = new ArrayList<>();
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        this.CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }
}