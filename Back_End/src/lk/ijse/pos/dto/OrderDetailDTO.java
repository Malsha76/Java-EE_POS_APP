package lk.ijse.pos.dto;

import java.io.Serializable;

public class OrderDetailDTO implements Serializable {

    private String orderId;
    private String description;
    private int qtyOnHand;
    private double unitPrice;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderDetailDTO(String orderId, String description, int qtyOnHand, double unitPrice) {
        this.orderId = orderId;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public OrderDetailDTO() {
    }
}
