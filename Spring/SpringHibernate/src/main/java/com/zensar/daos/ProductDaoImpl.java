package com.zensar.daos;
/*
 * Author: Vaidik Khandelwal
 * Creation Date: 31th Jul 2019 10.41PM IST
 * Modified Date: 31th Jul 2019 10.41PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Its a Dao Implementor.
 * 
 * */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hTemplate;
	
	public void insert(Product product) {
		// TODO Auto-generated method stub
		hTemplate.save(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hTemplate.delete(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hTemplate.update(product);
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hTemplate.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(Product.class);
	}

	
}
