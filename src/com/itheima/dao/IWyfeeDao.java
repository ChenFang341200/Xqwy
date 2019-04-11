package com.itheima.dao;

import com.itheima.po.Wyfee;

import java.util.List;


public interface IWyfeeDao {

	public abstract int addWyfee(Wyfee wyfee);

	public abstract int delWyfee(String wyfee_id);

	public abstract int delWyfees(String[] wyfee_ids);

	public abstract int updateWyfee(Wyfee wyfee);

	public abstract Wyfee getWyfee(Wyfee wyfee);

	public abstract List<Wyfee>  listWyfees(Wyfee wyfee);

	public abstract int listWyfeesCount(Wyfee wyfee);

}
