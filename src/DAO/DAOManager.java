package DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import VO.Person;

public class DAOManager {

	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 留덉씠諛뷀떚�뒪
																				// 媛앹껜

	// 湲� ���옣
	public ArrayList<Person> selectPerson1() {
		SqlSession session = null;
		ArrayList<Person> pList = new ArrayList<>();

		try {
			session = factory.openSession();
			Mapper mapper = session.getMapper(Mapper.class);
			pList = mapper.selectPerson1();
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return pList;
	}
}
