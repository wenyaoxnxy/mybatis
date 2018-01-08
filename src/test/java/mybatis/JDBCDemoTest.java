package mybatis;

import org.junit.Before;
import org.junit.Test;

public class JDBCDemoTest {
	
	private JDBCDemo jdbcDemo;
	
	@Before
	public void init() {
		this.jdbcDemo = new JDBCDemo();
	}

	@Test
	public void test() {
		this.jdbcDemo.readWechatTableUsers();
	}

}
