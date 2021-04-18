package com.faith.entity;

import java.math.BigDecimal;
import java.util.List;

public class Goods {
    private int gid;
	private String gname;
	private BigDecimal gprice;
	private String gquantity;
	private int gtype;
	private List<GoodsType> goodsTypesType;

	@Override
	public String toString() {
		return "Goods{" +
				"gid=" + gid +
				", gname='" + gname + '\'' +
				", gprice=" + gprice +
				", gquantity='" + gquantity + '\'' +
				", gtype=" + gtype +
				", goodsTypesType=" + goodsTypesType +
				'}';
	}


	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public BigDecimal getGprice() {
		return gprice;
	}

	public void setGprice(BigDecimal gprice) {
		this.gprice = gprice;
	}

	public String getGquantity() {
		return gquantity;
	}

	public void setGquantity(String gquantity) {
		this.gquantity = gquantity;
	}

	public int getGtype() {
		return gtype;
	}

	public void setGtype(int gtype) {
		this.gtype = gtype;
	}

	public List<GoodsType> getGoodsTypesType() {
		return goodsTypesType;
	}

	public void setGoodsTypesType(List<GoodsType> goodsTypesType) {
		this.goodsTypesType = goodsTypesType;
	}



}
