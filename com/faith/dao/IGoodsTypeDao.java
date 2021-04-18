package com.faith.dao;

import com.faith.entity.Goods;
import com.faith.entity.GoodsType;

import java.util.List;

public interface IGoodsTypeDao {
    public List<GoodsType> findGoodsById();
}
