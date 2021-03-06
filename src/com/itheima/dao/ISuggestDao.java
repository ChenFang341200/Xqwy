package com.itheima.dao;

import com.itheima.po.Suggest;

import java.util.List;


public interface ISuggestDao {

	public abstract int addSuggest(Suggest suggest);

	public abstract int delSuggest(String suggestid);

	public abstract int delSuggests(String[] suggestids);

	public abstract int updateSuggest(Suggest suggest);

	public abstract Suggest getSuggest(Suggest suggest);

	public abstract List<Suggest>  listSuggests(Suggest suggest);

	public abstract int listSuggestsCount(Suggest suggest);

}
