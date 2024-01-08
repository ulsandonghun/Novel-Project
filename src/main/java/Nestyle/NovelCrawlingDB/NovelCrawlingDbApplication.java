package Nestyle.NovelCrawlingDB;

import Nestyle.NovelCrawlingDB.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovelCrawlingDbApplication {
	@Autowired
	NewsService newsService ;

	public static void main(String[] args) {

		SpringApplication.run(NovelCrawlingDbApplication.class, args);
	}

}
