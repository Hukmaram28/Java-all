package com.stackroute;import org.springframework.stereotype.Component;
@Component
public class Message {
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    private String message="This is first demo Spring";
}