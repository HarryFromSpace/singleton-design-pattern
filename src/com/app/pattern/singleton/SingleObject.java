package com.app.pattern.singleton;

public class SingleObject
{
    private static SingleObject singleObject = new SingleObject();
    public String instaceMember = "Himanshu";


    private SingleObject()
    {}


    static SingleObject getInstance()
    {
        return singleObject;
    }


    public void show()
    {
        System.out.println(instaceMember + " is implementing this Pattern");
    }

}
