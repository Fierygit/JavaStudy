package Basic.Annotation;


import java.lang.annotation.Annotation;

public class Demo02 {

	public static void main(String[] args) {
		try {
			Class<?> forName = Class.forName("Annotation.Student");
			Annotation[] annotations = forName.getAnnotations();

			for (Annotation a : annotations) {
				System.out.println(a);
			}

			Annotation2 annotation2 = (Annotation2) forName.getAnnotation(Annotation2.class);
			System.out.println(annotation2.value());

			// 获取类的属性的注解
			java.lang.reflect.Field age = forName.getDeclaredField("age");
			Field annotation = age.getAnnotation(Field.class);
			
			//首先先获取到类的属性的名字，然后通过，属性的名字来获取注解的名字
			System.out.println(annotation.columnName());

			// 根据获取的名字，执行sql语句，实现语句的拼凑
			// 注解需要读取，不然没有什么作用对的

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
