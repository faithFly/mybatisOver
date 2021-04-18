package com.faith.dao;

import java.util.List;
import java.util.Map;

import com.faith.entity.Goods;
import com.faith.entity.GoodsType;

public interface IGoodsDao {
	//��ѯȫ��
public List<Goods> findAllGoods();
//����id���ҵ�������
public Goods findGoodsById(int id);
////����һ������
public int addOneGoods(Goods goods);
////�޸�һ������
public int updateGoods(Goods goods);
////ɾ��һ������
public int deleteGoods(int id);
//ͨ����Ʒ����ģ����ѯ
public List<Goods> selectLikeGoods(String gname);
//��̬��ѯ
public List<Goods> searchGoodsIf(Goods goods);
//where��ǩ��ѯ	
public List<Goods> searchGoodsWhere(Goods goods);
//Map��װ��ѯ
public List<Goods> searchGoodsMap(Map map);
//��ҳ��ѯ
public List<Goods> searchGoodsByPage(Map map);
//��ѯ��Ʒ����ʾ������Ʒ����
public List<Goods> searchGoodsJoinGoodsType();

}
