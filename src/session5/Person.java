package session5;

public class Person {
    String name = "john doe";
    int  age = 34;
    String job ="Unemployed";
    String[] skills ={"manual testing", "test design","","",""};

    void learnNewSkill(String skill){
        this.skills[2]= skill;
    }
    String applyForAJob(String newJob){
        job = newJob;
        return newJob;
    }
}

