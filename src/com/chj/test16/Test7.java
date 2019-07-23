package com.chj.test16;

public class Test7 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setSore(-99.0);


    }


}




class NoScoreException extends RuntimeException{
    public NoScoreException() {
    }

    public NoScoreException(String message) {
        super(message);
    }
}

class Student{
    private String name;
    private double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setSore(double score) throws NoScoreException{
        if(score<0){
             throw new NoScoreException("分数不能为负数");
        }else {
            this.setSore(score);
        }
    }

}