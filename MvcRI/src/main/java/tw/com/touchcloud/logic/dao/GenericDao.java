/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.logic.dao;

import java.util.List;
import tw.com.touchcloud.enumeration.SqlOrder;

/**
 *
 * @author ErikLin
 */
public interface GenericDao <E,K> {
    public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E find(K key);
    public List<E> getAll() ;
    
    public List<E> getAll(SqlOrder dir, String columnName) ;
}