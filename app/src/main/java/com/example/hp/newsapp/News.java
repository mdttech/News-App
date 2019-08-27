package com.example.hp.newsapp;

/**
 * {@link com.example.hp.newsapp.News} represents a single topic news release.
 * Each news object has 3 properties: title, date, and section.
 */

public class News {

    // title of news
    private String mVersionTitle;

    // date of the release of the news
    private String mVersionDate;

    // section of the news
    private String mVersionSection;

    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     *author of the news
     */
    private String mVersionAuthor;



    /*
     * Create a new NEWS object.
     *
     * @param vTitle is the name of news
     * @param vDate is the corresponding date of the news
     * @param vSection is the section of the news
     * @param url is the website URL to find more details about the news
     * */
    public News(String vTilte, String vDate, String vSection, String url, String vAuthor) {
        mVersionTitle = vTilte;
        mVersionDate = vDate;
        mVersionSection = vSection;
        mUrl = url;
        mVersionAuthor = vAuthor;
    }

    /**
     * Get the title of news
     */
    public String getVersionTitle() {
        return mVersionTitle;
    }

    /**
     * Get the  date of the release of the news
     */
    public String getVersionDate() {
        return mVersionDate;
    }

    /**
     * Get the section of the news
     */
    public String getVersionSection() {
        return mVersionSection;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Get the author of news
     */
    public String getVersionAuthor() {
        return mVersionAuthor;
    }


}

