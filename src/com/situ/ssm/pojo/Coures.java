package com.situ.ssm.pojo;

import java.util.List;

public class Coures {
	private Integer id;
	private String name;
	private Integer grade;
	private List<Banji> banjiList;
	
	
	public Coures() {
		super();
	}
	

	public Coures(Integer id, String name, Integer grade, List<Banji> banjiList) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.banjiList = banjiList;
	}

	public List<Banji> getBanjiList() {
		return banjiList;
	}

	public void setBanjiList(List<Banji> banjiList) {
		this.banjiList = banjiList;
	}

	public Coures(Integer id, String name, Integer grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public Coures(String name, Integer grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Coures [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
}
