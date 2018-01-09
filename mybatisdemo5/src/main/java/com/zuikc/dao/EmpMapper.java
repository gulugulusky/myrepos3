package com.zuikc.dao;

import java.util.List;

import com.zuikc.entity.Emp;

public interface EmpMapper {
	public List<Emp> queryEmpByCondition(Emp emp);//可以按照姓名、职务、日期、日期区间、工资
	public List<Emp> queryEmpByCondition1(Emp emp);//可以按照姓名、职务、日期、日期区间、工资
	public List<Emp> queryEmpByCondition2(Emp emp);//可以按照姓名、职务、日期、日期区间、工资
	public void saveEmp(Emp emp);
	public void updateEmp(Emp emp);
	public List<Emp> queryEmpByDeptno(List<Integer> list);//根据多个部门编号做查询
	public Emp queryEmpById(int empno);
	public List<Emp> queryAll();
}
