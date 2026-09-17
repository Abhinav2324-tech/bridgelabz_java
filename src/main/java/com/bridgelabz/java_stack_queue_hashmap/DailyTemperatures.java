package com.bridgelabz.java_stack_queue_hashmap;
public class DailyTemperatures {

    public int[] findDailyTemperatures(int[] temperature) {

        int n = temperature.length;

        int[] stack = new int[n];
        int top = -1;

        int[] answer = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (top != -1 &&
                    temperature[stack[top]] <= temperature[i]) {

                top--;
            }

            if (top == -1) {
                answer[i] = 0;
            } else {
                answer[i] = stack[top] - i;
            }

            stack[++top] = i;
        }

        return answer;
    }

    public static void main(String[] args) {

        DailyTemperatures d = new DailyTemperatures();

        int[] temperature =
                {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result =
                d.findDailyTemperatures(temperature);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}