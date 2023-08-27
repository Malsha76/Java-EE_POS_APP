package lk.ijse.pos.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO  {

    private String oid;
    private LocalDate date;
    private String customerID;
    private List<OrderDetailDTO> orderDetails = new ArrayList<>();

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public List<OrderDetailDTO> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetailDTO> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public OrderDTO(String oid, LocalDate date, String customerID, List<OrderDetailDTO> orderDetails) {
        this.oid = oid;
        this.date = date;
        this.customerID = customerID;
        this.orderDetails = orderDetails;
    }

    public OrderDTO() {
    }


}
