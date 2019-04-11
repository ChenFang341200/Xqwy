package com.itheima.dao;

import com.itheima.po.Carfee;

import java.util.List;


public interface ICarfeeDao {

	public abstract int addCarfee(Carfee carfee);

	public abstract int delCarfee(String carfee_id);

	public abstract int delCarfees(String[] carfee_ids);

	public abstract int updateCarfee(Carfee carfee);

	public abstract Carfee getCarfee(Carfee carfee);

	public abstract List<Carfee>  listCarfees(Carfee carfee);

	public abstract int listCarfeesCount(Carfee carfee);

}
