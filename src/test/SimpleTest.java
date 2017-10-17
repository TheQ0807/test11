package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

	/*@Test
	public void testGetTotalRows(){
		
		BoardDao dao = new BoardDao();
		int result = dao.getTotalRows();
		Assert.assertEquals(10, result);
	}*/
	
	BoardDao dao;
	
	
	@Test
	public void test(){
		dao = new BoardDao();
		dao.getTotalRows();
	}
	public void testTwo(){
		dao.getTotalRows();
	}
	/*@Before
	public void setup(){
		dao = new BoardDao();
		c = new Criteria();
	}
	@After
	public void tearDown(){
		System.out.println("after.......");
	}
	@Test
	public void testOne(){
		System.out.println("testone.....");
	}
	@Test
	public void testTwo(){
		System.out.println("testTwo.....");
	}
	*/
}
