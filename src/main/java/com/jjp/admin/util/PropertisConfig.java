package com.jjp.admin.util;
//package com.jjplatform.admin.util;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.core.env.Environment;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.util.StringUtils;
//
//@Configuration
//public class PropertisConfig {
//	private static Logger log = LoggerFactory.getLogger(PropertisConfig.class);
//
//	@Bean
//	public PropertySourcesPlaceholderConfigurer propertisFactoryBean() {
//		log.info("####################[PropertisConfig]####################");
//		String activeProfiles = System.getProperty("spring.profiles.active");
//		log.info("## activeProfiles :: " + activeProfiles);
//		
//		PropertySourcesPlaceholderConfigurer propertiesBean = new PropertySourcesPlaceholderConfigurer();
//		String profiles = StringUtils.isEmpty(activeProfiles) ?  "local" : activeProfiles; 
//		
//		log.info("## profiles :: " + profiles);
//		
////		System.setProperty("spring.profiles.active", profiles);
//		Resource[] resources = new ClassPathResource[]{
//				new ClassPathResource("config/application-"+profiles+".yml")
////			  , new ClassPathResource("config/application-service-"+profiles+".yml")
////			  , new ClassPathResource("config/application-core-"+profiles+".yml")
//		};
//		
//		propertiesBean.setLocations(resources);
//		propertiesBean.setIgnoreUnresolvablePlaceholders( true );
//		
//		return propertiesBean;
//	}
//}
