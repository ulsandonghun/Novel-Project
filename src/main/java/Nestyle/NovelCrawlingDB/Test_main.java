package Nestyle.NovelCrawlingDB;

import Nestyle.NovelCrawlingDB.Domain.News;
import Nestyle.NovelCrawlingDB.Service.NewsService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;

public class Test_main {

    public static void main(String[] args) throws IOException {
         String News_URL = "https://www.hkbs.co.kr/news/articleList.html?sc_section_code=S1N1&view_type=sm";

        List<News> newsList = new ArrayList<>();
        Document document = Jsoup.connect(News_URL).get();
//        System.out.println("document = " + document);

        Elements contents = document.select("#section-list > ul");

        System.out.println(contents);

        for (
                Element content : contents) {
            News news = News.builder()
                    .image(content.select("a img").attr("abs:src")) // 이미지
                    .subject(content.select("h4 a").text())		// 제목
                    .url(content.select("a").attr("abs:href"))		// 링크
                    .build();
            newsList.add(news);
        }
    }

}
