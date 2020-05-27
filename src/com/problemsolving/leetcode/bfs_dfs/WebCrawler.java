package com.problemsolving.leetcode.bfs_dfs;

import java.util.List;

public class WebCrawler {
    // Working Code
/*    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        Set<String> hset = new HashSet<>();
        hset.add(startUrl);
        String hostname = "http://"+startUrl.split("/")[2];
        dfs(startUrl,hostname,hset,htmlParser);
        return new ArrayList<>(hset);
    }

    private void dfs(String startUrl, String hostname,Set<String> hset, HtmlParser htmlParser){
        for(String url: htmlParser.getUrls(startUrl)){
            if(url.startsWith(hostname) && hset.add(url)){
                dfs(url,hostname,hset,htmlParser);
            }
        }
    }*/
}
