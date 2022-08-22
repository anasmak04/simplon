package com.project.Br13.services;

import java.util.List;

public interface Services <T> {
	  public List<T>getall();
	  public T getById(Integer type);
	  public T save(T type);
	  public void update(T type);
	  public void delete(Integer type);
	 
}