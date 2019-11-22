package DesignPattern.behavior.CommandPattern;

/**
 * @author Firefly
 * @version 1.0
 * @date 2019/11/15 17:06
 */

public class Client {


    public static void main(String[] args) {
        Command commandA = new ConcreteCommandA();
        Command commandB = new ConcreteCommandB();

        Invoker invoker = new Invoker(commandA);
        invoker.execute("invoker1");
        invoker.undo("invoker1");
        System.out.println("------------------");

        invoker.setCommand(commandB);
        invoker.execute("inveker2");
        invoker.undo("invoker2");

    }


}
