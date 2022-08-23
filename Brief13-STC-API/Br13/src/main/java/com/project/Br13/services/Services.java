package com.project.Br13.services;

import java.util.List;

public interface Services <T> {
	  public List<T>getall();
	  public T getById(Long type);
	  public T save(T type);
	  public T update(T type1);
	  public void delete(Long type);
	 
}