package Nestyle.NovelCrawlingDB.Controller;

import Nestyle.NovelCrawlingDB.Domain.News;
import Nestyle.NovelCrawlingDB.Service.NewsService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public String news(Model model) throws Exception{
        List<News> newsList = newsService.getNewsDatas();
        model.addAttribute("news", newsList);

        return "news";
    }
}
