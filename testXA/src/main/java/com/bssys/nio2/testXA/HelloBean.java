package com.bssys.nio2.testXA;



import org.springframework.jdbc.core.JdbcTemplate;

/**
 * A bean which we use in the route
 */
public class HelloBean {
	
	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_MESSAGE = "insert into SMEV3_REESTRR (id, messageid, queue, doctype) values (?, ?, ?, ?)";
	private static final String INSERT_MESSAGE2 = "insert into SMEV3_REESTR (id, messageid, queue, doctype) values (?, ?, ?, ?)";
	
	public HelloBean(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void badlogic(){
		update(INSERT_MESSAGE, new String[]{"1","2","3","4"});
	}
	public void goodlogic(){
		update(INSERT_MESSAGE2, new String[]{"1","2","3","4"});
	}
	
	private int update(String sql, Object[] param) {
		int n = -1;
		n = jdbcTemplate.update(sql, param);
		return n;
	}
}
