package com.hlj.annotation.method;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
 
public class AnnotationMain {
 
    public static void main(String[] args) {
    	AnnotationMain annotationMain = new AnnotationMain();
    	annotationMain.toString();
    	oldMethod();
    }
 
    @Override
    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
    	System.out.println("Overriden toString method"); 
        return "Overriden toString method";
    }
 
    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }
 
    @SuppressWarnings({ "unchecked", "deprecation" })
    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10)
    public static void genericsTest() throws FileNotFoundException {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }
 
}