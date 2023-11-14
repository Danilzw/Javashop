package ex001.Models;

import ex001.Presenters.Model;

public class Toys implements Model{

    private String name;
    private int id;
    private static int counter;
    private int weight;

    {
        id = ++counter;
    }

    public Toys(String name,int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public int getId() {
        return id;
    }

    public String toString()
    {
        return String.format("#%d,Name:%s",id,name);
    }
}
