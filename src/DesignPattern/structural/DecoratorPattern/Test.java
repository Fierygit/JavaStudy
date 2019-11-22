package DesignPattern.structural.DecoratorPattern;

/**
 * @author Firefly
 * @version 1.0
 * @date 2019/10/26 16:13
 */

public class Test {
    public static void main(String[] args) {
        Component component1 = new ConcreteComponent1("component1");
        Component component2 = new ConcreteComponent1("component2");

        Component componentDecorator = new ConcreteDecorator(component1);  //装饰一次
        Component componentDecorator1 = new ConcreteDecorator(componentDecorator);//加入新的装饰装饰一次
        componentDecorator1.display();

    }
}
