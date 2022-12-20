package org.example;

public class MoodAnalyser {
  String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
      try {
        if(message.contains("happy"))
          return "HAPPY";
        else
          return "SAD";
      } catch (NullPointerException e) {
        return "HAPPY";
      }
    }
}
