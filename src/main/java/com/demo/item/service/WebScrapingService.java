package com.demo.item.service;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@RequiredArgsConstructor
@Transactional
@Service
public class WebScrapingService {

    private final WebDriver seleniumWebDriver;

    // jsoup 을 이용한 정적 스크래퍼 메서드
    public String jsoupScrapeWebsite(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println("Jsoup Scraping Data: " + doc.title());
            return doc.title();
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }

    // selenium 을 이용한 동적 스크래퍼 메서드
    public String seleniumScrapeWebsite(String url) {
        seleniumWebDriver.get(url);
        System.out.println("Selenium Scraping Data: " + seleniumWebDriver.getTitle());
        return seleniumWebDriver.getTitle();
    }
}
