package com.college.yawn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category implements Serializable
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	private String cateogyName;
	private String categoryDescription;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCateogyName() {
		return cateogyName;
	}
	public void setCateogyName(String cateogyName) {
		this.cateogyName = cateogyName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	
	
	
}
