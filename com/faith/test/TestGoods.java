package com.faith.test;
import java.util.*;
import com.faith.dao.*;
import com.faith.entity.GoodsType;
import com.faith.entity.orderDetails;
import org.apache.ibatis.session.SqlSession;
import com.faith.entity.Goods;
import com.faith.utils.MyBatisUtil;
import java.math.BigDecimal;
public class TestGoods {
public static void main(String [] args){
	//searchGoodsFromDetails();
	searchOrderbyGoodsId();
//findeAllGoods();
//findGoodsById();
	//insertGoods();
//	updateGoods();
	//deleteGoods();
      //likeSelectGoods();
 	//searchGoodsIf();
	//searchGoodsWhere();
	//searchGoodsMap();
	//searchGoodsByPage();
	//???????????
//	System.out.println("??????????");
//	selectAllGoods();
	//findGoodsByTid();
	//searchGoodsJoinGoodsType();
}

//??????id??????????
public static void findGoodsById() {
	Scanner input =new Scanner(System.in);
	System.out.println("?????????????????????");
	int gid=input.nextInt();
	IGoodsDao goodDao=new GoodsDaoImpl();
    Goods goods=goodDao.findGoodsById(gid);
    System.out.println(goods.toString());
   
}
//?????????????
public static void findeAllGoods() {
    IGoodsDao goodDao=new GoodsDaoImpl();
	List<Goods> sList=goodDao.findAllGoods();
	for(int i=0;i<sList.size();i++) {
	System.out.println(sList.get(i).toString());
	}
}
//?????????????
public static void insertGoods() {
	IGoodsDao goodDao=new GoodsDaoImpl();
	Goods goods=new Goods();
	goods.setGname("ipad");
	BigDecimal aDouble =new BigDecimal(5000.00);
	goods.setGprice(aDouble);
	goods.setGquantity("700");
	int count=goodDao.addOneGoods(goods);
	if(count>0) {
		 System.out.println("??????????");
		 System.out.println("???????????????"+goods.getGid());
	}
}
//?????????
public static void updateGoods() {
	IGoodsDao goodDao=new GoodsDaoImpl();
	Scanner input =new Scanner(System.in);
	System.out.println("????????????????????");
	int gid=input.nextInt();
	Goods goods=goodDao.findGoodsById(gid);
	if(goods!=null) {
		System.out.println("????????????????");
		System.out.println(goods.toString());
		System.out.println("???????????????????????");
		String gname=input.next();
		System.out.println("????????????????????");
		BigDecimal gprice=input.nextBigDecimal();
		System.out.println("????????????????????????");
		String gquantity=input.next();
		goods=new Goods();
		goods.setGname(gname);
		goods.setGprice(gprice);
		goods.setGquantity(gquantity);
		goods.setGid(gid);
	    goodDao.updateGoods(goods);
	}else {
		System.out.println("????????????");
	}
}
//?????????
public static void deleteGoods() {
	IGoodsDao goodDao=new GoodsDaoImpl();
	Scanner input =new Scanner(System.in);
	System.out.println("?????????????????????");
	int gid=input.nextInt();
	Goods goods=goodDao.findGoodsById(gid);
	if(goods!=null) {
		int count=goodDao.deleteGoods(gid);
		if(count>0) {
			System.out.println("????????");
		}
	}else {
		System.out.println("????????????");
	}
}
//??????
public static void likeSelectGoods() {
	IGoodsDao goodDao=new GoodsDaoImpl();
	Scanner input =new Scanner(System.in);
	System.out.println("????????????????????????");
	String name=input.next();
	List<Goods> list=goodDao.selectLikeGoods(name);
	//java lambda???????
	//	list.forEach(item->{
	//		System.out.println(item);
	//	});
	//for???
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).toString());
	}
}
//??????
public static void searchGoodsIf() {
	IGoodsDao goodDao=new GoodsDaoImpl();
	Goods goods=new Goods();
	Scanner input =new Scanner(System.in);
	System.out.println("????????????????????????(????????)");
	goods.setGname(input.nextLine());
	System.out.println("?????????????????????????(????????)");
	goods.setGquantity(input.nextLine());
	System.out.println("?????????????????????(????????)");
	goods.setGprice(input.nextBigDecimal());
	List<Goods> list=goodDao.searchGoodsIf(goods);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).toString());
	}
}
//where ??????
public static void searchGoodsWhere() {
	IGoodsDao goodDao=new GoodsDaoImpl();
	Goods goods=new Goods();
	Scanner input =new Scanner(System.in);
	System.out.println("????????????????????????(????????)");
	goods.setGname(input.nextLine());
	System.out.println("?????????????????????????(????????)");
	goods.setGquantity(input.nextLine());
	System.out.println("?????????????????????(????????)");
	goods.setGprice(input.nextBigDecimal());
	List<Goods> list=goodDao.searchGoodsWhere(goods);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).toString());
	}
}
//map??????????
public static void searchGoodsMap() {
	IGoodsDao goodDao=new GoodsDaoImpl();
	Map<String,Object> map=new HashMap<String,Object>();
	Scanner input =new Scanner(System.in);
	System.out.println("????????????????????????(????????)");
	map.put("gname", input.nextLine());
	System.out.println("?????????????????????????(????????)");
	map.put("gquantity", input.nextLine());
	System.out.println("?????????????????????????(??0????)");
	map.put("priceStart", input.nextInt());
	System.out.println("????????????????????????(??0????)");
	map.put("priceEnd", input.nextInt());
	List<Goods> list=goodDao.searchGoodsMap(map);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).toString());
	}
	
}
//??????
public static void searchGoodsByPage() {
	Scanner input =new Scanner(System.in);
	System.out.println("??????????????");
	int pageSize=input.nextInt();
	System.out.println("??????????????");
	int pageIndex=input.nextInt();
    Map map=new HashMap();
    //?????????
    int startRow=(pageIndex-1)*pageSize;
    map.put("startRow", startRow);
    map.put("pageSize", pageSize);
    IGoodsDao goodsDao=new GoodsDaoImpl();
    List<Goods> list=goodsDao.searchGoodsByPage(map);
    list.forEach(item->System.out.println(item));
    	
    }
//????????
public static void selectAllGoods() {
	SqlSession session=MyBatisUtil.getSession();
	IGoodsDao goodsDao=session.getMapper(IGoodsDao.class);
	List<Goods> slist=goodsDao.findAllGoods();
	for(int i=0;i<slist.size();i++) {
		System.out.println(slist.get(i).toString());
	}
}
//查询类别表时同时输出其商品
	public static void findGoodsByTid(){
		IGoodsTypeDao goodsTypeDao=new GoodsTypeDaoImpl();
		List<GoodsType> list=new ArrayList<GoodsType>();
		list=goodsTypeDao.findGoodsById();
		//System.out.println("商品类型编号："+myGoods.getTid()+"类型名称"+myGoods.getTname());
		//List<Goods> sList=myGoods.getGoods();
		//for (int i = 0; i < sList.size(); i++) {
		//	System.out.println(sList.get(i).toString());
		//}
		//System.out.println("商品类型编号："+list.get(0).getTid()+"    类型名称: "+list.get(0).getTname());
		for(int i = 0; i < list.size(); i++){
			System.out.println("商品类型编号："+list.get(i).getTid()+"    类型名称: "+list.get(i).getTname());
			//循环3次
			for(int j=0;j<list.get(i).getGoods().size();j++){
				//获得第一个goods集合
				List<Goods> sList=list.get(i).getGoods();
				System.out.println(sList.get(j).toString());

			}
		}
	}

//查询商品表时同时输出其商品类型
public static void searchGoodsJoinGoodsType(){
		IGoodsDao goodsDao=new GoodsDaoImpl();
		List<Goods> list=new ArrayList<Goods>();
		list=goodsDao.searchGoodsJoinGoodsType();
		for (int i = 0; i < list.size(); i++) {
			//System.out.printf(list.get(i).toString());
			System.out.println("商品id为："+list.get(i).getGid()+" 商品名称:"+list.get(i).getGname()+"  商品价格为："+
					"  商品数量为："+list.get(i).getGquantity()+"  商品类别编号为："+list.get(i).getGtype());
			for (int j = 0; j < list.get(i).getGoodsTypesType().size(); j++) {
				//获得第一个goodsType集合
				List<GoodsType> slist=list.get(i).getGoodsTypesType();
				System.out.println("类别名称为："+slist.get(j).getTname());
			}
		}
	}

//查询1号订单的所有对应的商品
	public static  void searchGoodsFromDetails(){
		System.out.println("请输入你要查询订单的订单号！");
	    Scanner scan=new Scanner(System.in);
	    int orderId=scan.nextInt();
	    SqlSession session=MyBatisUtil.getSession();
		OrderDetailsDao orderDao=session.getMapper(OrderDetailsDao.class);
        List<orderDetails> orderDetailsList=orderDao.searchGoodsByDetail(orderId);
		System.out.println("查询到"+orderId+"号订单的商品有：");
         List<Goods> goodsList=orderDetailsList.get(0).getGoods();
			for (int i = 0; i < goodsList.size(); i++) {
				System.out.println(" 商品名称:"+goodsList.get(i).getGname()+
						"  商品价格为："+goodsList.get(i).getGprice()+
						"  商品数量为："+goodsList.get(i).getGquantity());
				for (int j = 0; j < goodsList.get(i).getGoodsTypesType().size(); j++) {
					//获得第一个goodsType集合
					List<GoodsType> slist=goodsList.get(j).getGoodsTypesType();
					System.out.println("类别名称为："+slist.get(j).getTname());
				}
			}

	}
	//查询订单条件为商品编号
	public static  void searchOrderbyGoodsId(){
		System.out.println("请输入你要查询的商品订单！");
		Scanner scan=new Scanner(System.in);
		int goodsId=scan.nextInt();
		SqlSession session=MyBatisUtil.getSession();
		OrderDetailsDao orderDao=session.getMapper(OrderDetailsDao.class);
		List<orderDetails> orderDetailsList=orderDao.searchOrderbyGoodsId(goodsId);
		if (orderDetailsList.size()<1){
			System.out.println("未能查到相对应的订单号");
		}else {
			System.out.println("查到相对应的订单号为：");
			for (int i = 0; i < orderDetailsList.size(); i++) {
				System.out.println(orderDetailsList.get(i).getOrderDetails_Orderid());
			}

		}

	}





























}
