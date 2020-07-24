package fr.afpa.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import fr.afpa.utils.JdbcUtils;

public abstract class BaseDao {

	private QueryRunner queryRunner = new QueryRunner();

	/**
	 * update information from a sql request
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public int update(String sql, Object... args) {
		Connection connection = JdbcUtils.getConnection();
		try {
			return queryRunner.update(connection, sql, args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(connection);
		}
		return -1;
	}

	/**
	 * return an object according to sql sentence
	 * 
	 * @param <T>
	 * @param type
	 * @param sql
	 * @param args
	 * @return
	 */
	public <T> T queryForOne(Class<T> type, String sql, Object... args) {
		Connection con = JdbcUtils.getConnection();
		try {
			return queryRunner.query(con, sql, new BeanHandler<T>(type), args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(con);
		}
		return null;
	}

	/**
	 * return a list of objects according to sql request
	 * 
	 * @param <T>
	 * @param type
	 * @param sql
	 * @param args
	 * @return
	 */
	public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
		Connection con = JdbcUtils.getConnection();
		try {
			return queryRunner.query(con, sql, new BeanListHandler<T>(type), args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(con);
		}
		return null;
	}

	/**
	 * return an object according to sql request
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public Object queryForSingleValue(String sql, Object... args) {

		Connection conn = JdbcUtils.getConnection();

		try {
			return queryRunner.query(conn, sql, new ScalarHandler(), args);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(conn);
		}
		return null;

	}
}
