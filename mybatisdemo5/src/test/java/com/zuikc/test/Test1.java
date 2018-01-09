package com.zuikc.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.zuikc.dao.EmpMapper;
import com.zuikc.entity.Emp;
import com.zuikc.util.MyBatisUtil;

public class Test1 {
	@Test
	public void testGetSession(){
		SqlSession session = MyBatisUtil.getSqlSession();
		
		System.out.println(session);
	}
	@Test
	public void test1(){
		SqlSession session = MyBatisUtil.getSqlSession();
		try {
			//通过session直接获取接口对象
			EmpMapper dao = session.getMapper(EmpMapper.class);
			Emp emp = new Emp();
			emp.setEname("张%");
			//emp.setSal(5000.0);
			List<Emp> emps = dao.queryEmpByCondition(emp);
			session.clearCache();
			for(Emp e:emps)
				System.out.println(e);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MyBatisUtil.close(session);
		}
		
		
	}
	@Test
	public void test5(){
		SqlSession session = MyBatisUtil.getSqlSession();
		try {
			//通过session直接获取接口对象
			EmpMapper dao = session.getMapper(EmpMapper.class);
			Emp emp1 = dao.queryEmpById(1);
			System.out.println("emp1:    "+emp1);
			
			session.commit();
			
			session = MyBatisUtil.getSqlSession();
			dao = session.getMapper(EmpMapper.class);
			Emp emp2 = dao.queryEmpById(1);
			System.out.println("emp2:    "+emp2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MyBatisUtil.close(session);
		}
		
		
	}
	@Test
	public void test6(){
		SqlSession session1 = MyBatisUtil.getSqlSession();
		SqlSession session2 = MyBatisUtil.getSqlSession();
		try {
			//通过session直接获取接口对象
			EmpMapper dao = session1.getMapper(EmpMapper.class);
			Emp emp1 =  dao.queryEmpById(1);
			System.out.println("emp1:    "+emp1);
			session1.commit();
			dao = session2.getMapper(EmpMapper.class);
			Emp emp2 =  dao.queryEmpById(1);
			System.out.println("emp2:    "+emp2);
			session1.commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MyBatisUtil.close(session1);
			MyBatisUtil.close(session2);
		}
		
		
	}
	@Test
	public void test2(){
		SqlSession session = MyBatisUtil.getSqlSession();
		try {
			//通过session直接获取接口对象
			EmpMapper dao = session.getMapper(EmpMapper.class);
			Emp emp = new Emp();
			emp.setEname("张三");
			//emp.setJob("程序员");
			List<Emp> emps = dao.queryEmpByCondition2(emp);
			for(Emp e:emps)
				System.out.println(e);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MyBatisUtil.close(session);
		}
		
		
	}
	@Test
	public void test3(){
		SqlSession session = MyBatisUtil.getSqlSession();
		try {
			//通过session直接获取接口对象
			EmpMapper dao = session.getMapper(EmpMapper.class);
			Emp emp = new Emp();
			emp.setEmpno(1);
			//emp.setEname("张大三");
			emp.setComm(600.0);
			//emp.setJob("程序员");
			dao.updateEmp(emp);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MyBatisUtil.close(session);
		}
		
		
	}
	@Test
	public void test4(){
		SqlSession session = MyBatisUtil.getSqlSession();
		try {
			//通过session直接获取接口对象
			EmpMapper dao = session.getMapper(EmpMapper.class);
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			//emp.setJob("程序员");
			List<Emp> emps = dao.queryEmpByDeptno(list);
			for(Emp e:emps)
				System.out.println(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MyBatisUtil.close(session);
		}
		
		
	}
}
