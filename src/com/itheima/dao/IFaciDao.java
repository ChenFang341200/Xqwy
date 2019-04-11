package com.itheima.dao;

import com.itheima.po.Faci;

import java.util.List;


public interface IFaciDao {

	public abstract int addFaci(Faci faci);

	public abstract int delFaci(String faci_id);

	public abstract int delFacis(String[] faci_ids);

	public abstract int updateFaci(Faci faci);

	public abstract Faci getFaci(Faci faci);

	public abstract List<Faci>  listFacis(Faci faci);

	public abstract int listFacisCount(Faci faci);

}
