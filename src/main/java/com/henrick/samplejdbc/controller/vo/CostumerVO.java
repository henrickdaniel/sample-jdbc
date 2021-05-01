package com.henrick.samplejdbc.controller.vo;


public class CostumerVO {

    public  CostumerVO(){
    }

    public CostumerVO(Integer idProduct, String nameProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    private Integer idProduct;
    private String nameProduct;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "CostumerVO{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
