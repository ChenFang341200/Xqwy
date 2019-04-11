package com.itheima.dao;

import com.itheima.po.Car;

import java.util.List;


public interface ICarDao {

	public abstract int addCar(Car car);

	public abstract int delCar(String car_id);

	public abstract int delCars(String[] car_ids);

	public abstract int updateCar(Car car);

	public abstract Car getCar(Car car);

	public abstract List<Car>  listCars(Car car);

	public abstract int listCarsCount(Car car);

}
