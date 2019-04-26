package com.example.jiancheng.mvpmodel.Model;

public class Content {
    public String ID,Name,Conversation,Date;

    public Content(String ID, String name, String conversation, String date) {
        this.ID = ID;
        Name = name;
        Conversation = conversation;
        Date = date;
    }

    public Content() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getConversation() {
        return Conversation;
    }

    public void setConversation(String conversation) {
        Conversation = conversation;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
