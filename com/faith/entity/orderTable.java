package com.faith.entity;

public class orderTable {
    private int order_Id;
    private String order_Buyer;
    private String order_ComTime;
    public int getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public String getOrder_Buyer() {
        return order_Buyer;
    }

    public void setOrder_Buyer(String order_Buyer) {
        this.order_Buyer = order_Buyer;
    }

    public String getOrder_ComTime() {
        return order_ComTime;
    }

    public void setOrder_ComTime(String order_ComTime) {
        this.order_ComTime = order_ComTime;
    }

    @Override
    public String toString() {
        return "orderTable{" +
                "order_Id=" + order_Id +
                ", order_Buyer='" + order_Buyer + '\'' +
                ", order_ComTime='" + order_ComTime + '\'' +
                '}';
    }


}
