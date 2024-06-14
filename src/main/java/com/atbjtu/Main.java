package com.atbjtu;
import java.util.function.Consumer;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/8 21:34
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Consumer<String> printConsumer = s -> System.out.println("First Consumer: " + s);
        Consumer<String> anotherConsumer = s -> System.out.println("Second Consumer: " + s);

        // 组合两个Consumer
        Consumer<String> combinedConsumer = printConsumer.andThen(anotherConsumer);

        // 调用组合后的Consumer
        combinedConsumer.accept("Hello, World!");
    }
}