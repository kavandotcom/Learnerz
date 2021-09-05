package com.example.learnerz;

import android.content.Intent;
import android.widget.Toast;

import java.util.ArrayList;

public class CourseLinks {
    int course_id;
    String levels;
    ArrayList<String> weeks = new ArrayList<>();

    public CourseLinks(String id){
        course_id = Integer.parseInt(id);

    }

    public void SelectCourse(){
        switch (course_id){
            case 1:
                Id1AndroidDevelopment(levels);
            case 2:
                Id2EthicalHacking(levels);
            default:
                DefaultCase();

        }

    }
    public ArrayList<String> Id1AndroidDevelopment(String levels){
        switch (levels){
            case "noobs":
                weeks.add("R.string.Id1noobweek1");
                weeks.add("R.string.Id1noobweek2");
                weeks.add("R.string.Id1noobweek3");
                weeks.add("R.string.Id1noobproject");
                return weeks;

            default:
                break;

        }
        return null;
    }

    public void Id2EthicalHacking(String levels){

    }

    public void DefaultCase(){

    }
}




