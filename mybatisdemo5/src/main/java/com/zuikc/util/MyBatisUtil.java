package com.zuikc.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	public static SqlSession getSqlSession(){
		SqlSession session = null;
		try {
			//加载mybatis的配置文件
			InputStream inputStream = MyBatisUtil.class.getClassLoader().
					getResourceAsStream("mybatis.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			session = factory.openSession();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return session;
	}
	public static void close(SqlSession session){
		try {
			if(session!=null){
				session.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
