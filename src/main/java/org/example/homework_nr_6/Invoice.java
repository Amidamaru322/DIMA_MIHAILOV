package org.example.homework_nr_6;

public class Invoice {

    private String model;
    private String description;
    private Integer quantity = 0;
    private Double price = 0.0;

    public Invoice(String model, String description, Integer quantity, Double price) {
        this.model = model;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        if (quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0.0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public double getAmount() {
        return price * quantity;
    }

}