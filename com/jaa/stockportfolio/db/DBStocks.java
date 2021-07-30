package com.jaa.stockportfolio.db;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jaa.stockportfolio.Stock;
import com.jaa.stockportfolio.StockPortfolioData;

public class DBStocks {
	public List<StockPortfolioData> getStocks() {

		Reader reader;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();


		List<StockPortfolioData> stocks = session.selectList("Stock.getAll");

		session.commit();
		session.close();

		return (stocks);

	}

	public void updateStocks(ArrayList<Stock> stocks) {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			for(Stock stock: stocks) {
				session.insert("Stock.insertStock",stock);
				System.out.println("record inserted successfully");
				
			}
			session.commit();
			session.close();
			
		} catch (RuntimeException re) {
			re.printStackTrace();
		}

	}
}
