package com.bridgelabz.java_stack_queue_hashmap;

public class StockSpan {

    public int[] findStockSpan(int[] price) {

        int n = price.length;

        int[] stack = new int[n];
        int top = -1;

        int[] span = new int[n];

        for (int i = 0; i < n; i++) {

            while (top != -1 &&
                    price[stack[top]] <= price[i]) {

                top--;
            }

            if (top == -1) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack[top];
            }

            stack[++top] = i;
        }

        return span;
    }

    public static void main(String[] args) {

        StockSpan s = new StockSpan();

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] result = s.findStockSpan(price);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}