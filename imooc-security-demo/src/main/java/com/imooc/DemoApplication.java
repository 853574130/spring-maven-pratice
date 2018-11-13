/**
 * @Description: TODO
 * @version V1.0
 */
package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iahusoaix
 *
 */

@SpringBootApplication
@RestController
public class DemoApplication {

	/**
	 *@author iauhsoaix
	 *@parameter@param args
	 *@date2018年11月13日
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
/*异常解决
 * 1.Cannot determine embedded database driver class for database type NONE
 * 不能决定内嵌的数据库驱动
 * application.properties中配置数据库链接账号密码等属性
 * 2.No Spring Session store is configured: set the 'spring.session.store-type' property
 * spring.session.store-type'前期还用不到，
 * 在application.properties设置spring.session.store-type'关掉
 * 3.http://localhost:8080/访问时会跳出身份验证，这是spring security的默认配置，
 * 先在配置文件中关掉
 * 
 */
}
