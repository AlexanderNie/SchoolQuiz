package com.welearn.domain.entities;
// Generated 26 Jan, 2018 7:24:21 AM by Hibernate Tools 4.3.1



/**
 * Quizes generated by hbm2java
 */
public class Quizes  implements java.io.Serializable {


     private Integer id;
     private int quizId;
     private String quizName;
     private int totalQuestions;
     private int displayQuestions;
     private int timeAllotted;
     private int setDefault;

    public Quizes() {
    }

    public Quizes(int quizId, String quizName, int totalQuestions, int displayQuestions, int timeAllotted, int setDefault) {
       this.quizId = quizId;
       this.quizName = quizName;
       this.totalQuestions = totalQuestions;
       this.displayQuestions = displayQuestions;
       this.timeAllotted = timeAllotted;
       this.setDefault = setDefault;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getQuizId() {
        return this.quizId;
    }
    
    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }
    public String getQuizName() {
        return this.quizName;
    }
    
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }
    public int getTotalQuestions() {
        return this.totalQuestions;
    }
    
    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
    public int getDisplayQuestions() {
        return this.displayQuestions;
    }
    
    public void setDisplayQuestions(int displayQuestions) {
        this.displayQuestions = displayQuestions;
    }
    public int getTimeAllotted() {
        return this.timeAllotted;
    }
    
    public void setTimeAllotted(int timeAllotted) {
        this.timeAllotted = timeAllotted;
    }
    public int getSetDefault() {
        return this.setDefault;
    }
    
    public void setSetDefault(int setDefault) {
        this.setDefault = setDefault;
    }




}


