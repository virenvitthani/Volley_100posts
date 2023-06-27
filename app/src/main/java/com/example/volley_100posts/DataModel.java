package com.example.volley_100posts;

public class DataModel {

    int id;
    String titel;
    int userId;
    String body;

    public DataModel(int id, String titel, int userId, String body) {
        this.id = id;
        this.titel = titel;
        this.userId = userId;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", userId=" + userId +
                ", body='" + body + '\'' +
                '}';
    }
}
