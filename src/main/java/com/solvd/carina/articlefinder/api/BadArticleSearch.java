package com.solvd.carina.articlefinder.api;

import com.solvd.carina.articlefinder.util.ClassConstants;
import com.solvd.carina.articlefinder.util.FilepathConstants;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.http.HttpMethodType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Endpoint(
        url = "${config.nyt_api_url}/${config.nyt_api_article_search_path}"
                + "?${queryString}"
                + "${apiKeyValue}",
        methodType = HttpMethodType.GET
)
@ResponseTemplatePath(path = FilepathConstants.ARTICLE_SEARCH_400_RS_TEMPLATE_JSON)
public class BadArticleSearch extends ArticleSearch {
    private static final Logger LOGGER = LogManager.getLogger(ClassConstants.BAD_ARTICLE_SEARCH);

    public BadArticleSearch(String queryString, String apiKeyValue) {
        super(queryString, apiKeyValue);
    }

    public BadArticleSearch(String queryString) {
        super(queryString);
    }


}
