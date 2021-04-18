package com.faith.dao;

import java.util.List;
import java.util.Map;

import com.faith.entity.Goods;
import com.faith.entity.GoodsType;

public interface IGoodsDao {
	//查询全部
public List<Goods> findAllGoods();
//根据id查找单条数据
public Goods findGoodsById(int id);
////增加一条数据
public int addOneGoods(Goods goods);
////修改一条数据
public int updateGoods(Goods goods);
////删除一条数据
public int deleteGoods(int id);
//通过商品名称模糊查询
public List<Goods> selectLikeGoods(String gname);
//动态查询
public List<Goods> searchGoodsIf(Goods goods);
//where标签查询	
public List<Goods> searchGoodsWhere(Goods goods);
//Map封装查询
public List<Goods> searchGoodsMap(Map map);
//分页查询
public List<Goods> searchGoodsByPage(Map map);
//查询商品并显示出其商品类型
public List<Goods> searchGoodsJoinGoodsType();

}
