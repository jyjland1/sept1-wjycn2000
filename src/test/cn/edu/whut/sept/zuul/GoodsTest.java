package test.cn.edu.whut.sept.zuul; 

import cn.edu.whut.sept.zuul.Goods;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Goods Tester. 
* 
* @author <Authors name> 
* @since <pre>1ÔÂ 3, 2023</pre> 
* @version 1.0 
*/ 
public class GoodsTest { 

@Before
public void before() throws Exception {
    System.out.println("before");
} 

@After
public void after() throws Exception {
    System.out.println("after");
} 

/** 
* 
* Method: getShortDescription() 
* 
*/ 
@Test
public void testGetShortDescription() throws Exception { 
//TODO: Test goes here...
    Goods good = new Goods("computer", 100);
    System.out.println(good.getShortDescription());
} 

/** 
* 
* Method: getWeight() 
* 
*/ 
@Test
public void testGetWeight() throws Exception { 
//TODO: Test goes here...
    Goods good = new Goods("computer", 100);
    System.out.println(good.getWeight());
} 

/** 
* 
* Method: getLongDescription() 
* 
*/ 
@Test
public void testGetLongDescription() throws Exception { 
//TODO: Test goes here...
    Goods good = new Goods("computer", 100);
    System.out.println(good.getLongDescription());
}

} 
