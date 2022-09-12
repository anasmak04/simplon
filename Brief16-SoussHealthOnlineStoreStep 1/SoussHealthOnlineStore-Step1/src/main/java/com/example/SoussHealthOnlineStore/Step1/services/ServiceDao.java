package com.example.SoussHealthOnlineStore.Step1.services;

import java.util.List;

public interface ServiceDao<T> {
	public List<T> getall();

	public T getById(Long type);

	public T save(T type);

	public void update(Long type3, T type1);

	public void delete(Long type);
}
