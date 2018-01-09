package com.zuikc.dao;

import java.util.List;


import com.zuikc.entity.Dept;

public interface DeptMapper {
	public Dept queryDeptById(int deptno);
	public List<Dept>queryAllDept();
	public List<Dept> queryDeptAndEmp();
	public void saveDept(Dept dept);
	public void updateDept(Dept dept);
	public void deleteDept(int deptno);
}
