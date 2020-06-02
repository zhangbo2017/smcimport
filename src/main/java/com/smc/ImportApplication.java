package com.smc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author BoZhang
 * E-mail:dlzbo@cn.ibm.com
 * @version date：May 12, 2020 7:50:07 PM
*/
@SpringBootApplication
@EnableEurekaClient
public class ImportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImportApplication.class, args);
	}

}
