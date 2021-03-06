package ro.fasttrackit.curs22.homework.curs22homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {

    @Id
    @GeneratedValue
    private int id;
    private String quest;
    private String opt1;
    private String opt2;
    private String opt3;
    private boolean valid;
    private String choose;
    private String correctAnswer;

    public Question() {
    }

    public Question(String quest, String opt1, String opt2, String opt3, boolean valid, String choose, String correctAnswer) {
        this.quest = quest;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.valid = valid;
        this.choose = choose;
        this.correctAnswer = correctAnswer;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}


