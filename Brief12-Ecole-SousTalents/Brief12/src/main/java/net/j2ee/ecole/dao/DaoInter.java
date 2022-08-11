package net.j2ee.ecole.dao;

public interface DaoInter<T>{
	  public void save(T type);
	  public void update(T type);
	  public void delete(int type);
	  public T get(int type);
}