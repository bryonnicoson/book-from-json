package com.bryonnicoson.bookfromjson;

import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by bryon on 7/15/16.
 */
public class Book {

    final String book_url = "https://bryonnicoson-ruby-book.herokuapp.com";

    private String title, author, setting;
    private int year_published;
//    private boolean isFiction;
//    private String[] characters;

    private OkHttpClient client = new OkHttpClient();
    private Request request;
    private Response response;

    public Book(String title, String author, String setting, int year_published) {
        this.title = title;
        this.author = author;
        this.setting = setting;
        this.year_published = year_published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public int getYear_published() {
        return year_published;
    }

    public void setYear_published(int year_published) {
        this.year_published = year_published;
    }


}
