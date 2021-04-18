package com.faith.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.faith.entity.Goods;
import com.faith.utils.MyBatisUtil;

public class GoodsDaoImpl implements IGoodsDao {
	private static final String Resource="com.faith.dao.IGoodsDao.";
	@Override
	public List<Goods> findAllGoods(){
		SqlSession session=null;
		List<Goods> list=new ArrayList<Goods>();
		try {
            session=MyBatisUtil.getSession();
			list=session.selectList("com.faith.dao.IGoodsDao.findAllGoods");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Goods findGoodsById(int id) {
		SqlSession session=null;
		//List<Goods> list=new ArrayList<Goods>();
		Goods goods=new Goods();
		try {
			session=MyBatisUtil.getSession();
		    goods=session.selectOne("com.faith.dao.IGoodsDao.findGoodsById",id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return goods;
	}

	@Override
	public int addOneGoods(Goods goods) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		int count=0;
		try {
			session=MyBatisUtil.getSession();
			count=session.insert("com.faith.dao.IGoodsDao.insert",goods);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return count;
	}

	@Override
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		int count=0;
		try {
			session=MyBatisUtil.getSession();
			count=session.update("com.faith.dao.IGoodsDao.update",goods);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return count;
		
	}

	@Override
	public int deleteGoods(int id) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		int count=0;
		try {
			session=MyBatisUtil.getSession();
			count=session.update("com.faith.dao.IGoodsDao.delete",id);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return count;
	}

	@Override
	public List<Goods> selectLikeGoods(String gname) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		List<Goods> list=new ArrayList<Goods>();
		try {
			session=MyBatisUtil.getSession();
			list=session.selectList("com.faith.dao.IGoodsDao.selectLikeGoods",gname);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	
	@Override
	public List<Goods> searchGoodsIf(Goods goods) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		List<Goods> list=new ArrayList<Goods>();
		try {
			session=MyBatisUtil.getSession();
			list=session.selectList("com.faith.dao.IGoodsDao.searchGoodsIf",goods);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Goods> searchGoodsWhere(Goods goods) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		List<Goods> list=new ArrayList<Goods>();
		try {
			session=MyBatisUtil.getSession();
			list=session.selectList("com.faith.dao.IGoodsDao.searchGoodsWhere",goods);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Goods> searchGoodsMap(Map map) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		List<Goods> list=new ArrayList<Goods>();
		try {
			session=MyBatisUtil.getSession();
			list=session.selectList("com.faith.dao.IGoodsDao.searchGoodsMap",map);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<Goods> searchGoodsByPage(Map map) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		List<Goods> list=new ArrayList<Goods>();
		try {
			session=MyBatisUtil.getSession();
			list=session.selectList(Resource+"searchGoodsByPage",map);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<Goods> searchGoodsJoinGoodsType() {
		// TODO Auto-generated method stub
		SqlSession session=null;
		List<Goods> list=new ArrayList<Goods>();
		try {
			session=MyBatisUtil.getSession();
			list=session.selectList(Resource+"searchGoodsJoinGoodsType");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}


}
