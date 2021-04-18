package com.faith.dao;

import com.faith.entity.Goods;
import com.faith.entity.GoodsType;
import com.faith.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class GoodsTypeDaoImpl implements IGoodsTypeDao{
public static SqlSession session=null;
    @Override
    public List<GoodsType> findGoodsById() {
        List<GoodsType> list=new ArrayList<GoodsType>();
        try{
        session= MyBatisUtil.getSession();
            list=session.selectList("com.faith.dao.IGoodsTypeDao.findGoodsById");
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
        return list;
    }
}
