import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;

import java.util.*;
import java.io.*;

class kittu{// creating preants class(inheritance)
    int id;
    String name;

    public int getid(int x){
        if (x==0 || x==1){
            return 1;
        }
        return id;
    }
    public String getname(){
        return name;
    }
    public void setid(int n){
        id=n;
    }
    public void setname(String m){
        name = m;
    }// creating the sub class
    class suraj extends kittu{
        int salary;
        public int getslary(){
            return salary;
        }
        public void setsalary(int s){
            salary=s;
        }
    }
    public static void main(String[] args) {
        // calling the fucntion of superclass
        kittu fuck = new kittu();
        fuck.setid(25);
        fuck.setname("bindu");

        System.out.println(fuck.getid());
    }
}
