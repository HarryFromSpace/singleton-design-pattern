package com.app.pattern.singleton;

public class SinglePatternMain
{
    public static void main(String[] args)
    {
        //SingleObject singleObject = new SingleObject();
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.show();
    }
}
