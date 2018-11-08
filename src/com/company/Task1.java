package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman on 08.11.2018.
 */
public class Task1 {
    public int rectangle(int a, int b) {
        return a*b;
    }

    public void inputSides() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int res = rectangle(a, b);
        System.out.println(res);
    }

}
