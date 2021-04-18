package com.faith.entity;

import java.util.List;

public class orderDetails {
    private int orderDetails_Id;
    private int orderDetails_Orderid;
    private int orderDetails_Goosid;
    private List<Goods> goods;
    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }


    public int getOrderDetails_Id() {
        return orderDetails_Id;
    }

    public void setOrderDetails_Id(int orderDetails_Id) {
        this.orderDetails_Id = orderDetails_Id;
    }

    public int getOrderDetails_Orderid() {
        return orderDetails_Orderid;
    }

    public void setOrderDetails_Orderid(int orderDetails_Orderid) {
        this.orderDetails_Orderid = orderDetails_Orderid;
    }

    public int getOrderDetails_Goosid() {
        return orderDetails_Goosid;
    }

    public void setOrderDetails_Goosid(int orderDetails_Goosid) {
        this.orderDetails_Goosid = orderDetails_Goosid;
    }



    @Override
    public String toString() {
        return "orderDetails{" +
                "orderDetails_Id=" + orderDetails_Id +
                ", orderDetails_Orderid=" + orderDetails_Orderid +
                ", orderDetails_Goosid=" + orderDetails_Goosid +
                '}';
    }

}
