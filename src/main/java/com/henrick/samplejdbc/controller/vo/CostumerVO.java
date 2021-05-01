package com.henrick.samplejdbc.controller.vo;


public class CostumerVO {

    public  CostumerVO(){
    }

    public CostumerVO(Integer idCostumer, String nameCostumer) {
        this.idCostumer = idCostumer;
        this.nameCostumer = nameCostumer;
    }

    private Integer idCostumer;
    private String nameCostumer;

    public Integer getIdCostumer() {
        return idCostumer;
    }

    public void setIdCostumer(Integer idCostumer) {
        this.idCostumer = idCostumer;
    }

    public String getNameCostumer() {
        return nameCostumer;
    }

    public void setNameCostumer(String nameCostumer) {
        this.nameCostumer = nameCostumer;
    }

    @Override
    public String toString() {
        return "CostumerVO{" +
                "idCostumer=" + idCostumer +
                ", nameCostumer='" + nameCostumer + '\'' +
                '}';
    }
}
