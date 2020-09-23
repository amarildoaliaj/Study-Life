package com.aliaj.amarildo.studylife.object;

/**
 * Oggetto Nota
 */

public class Note {

    private String title;
    private String body;

    public Note(String title, String body){
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

}
