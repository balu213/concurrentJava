package com.bala.interviews.practice.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Script {
    public static void main(String[] args) {
        ScriptEngine se = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            // evaluate the javascript file.
            se.eval(new FileReader("/Users/bala/Documents/workspace/InterviewPractice/src/test.js"));

            // get handle of JavaScript file’s context
            Invocable invocable = (Invocable) se;

            // invoke function defined in the file’s context and pass the
            // argument.
            Object result = invocable.invokeFunction("fun1", "Mr. X");

            // print the result and its type.
            System.out.println(result);
            System.out.println(result.getClass()); // - See more at:
                                                   // http://www.nagarro.com/us/en/perspectives/post/33/Java-8-Nashorn-Engine-for-JavaScript-Interoperability-and-Performance#sthash.UxqOd2IM.dpuf
        } catch (ScriptException | FileNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
