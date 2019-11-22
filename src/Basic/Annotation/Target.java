package Basic.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@java.lang.annotation.Target(value = {ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Target {

	
	 	String student() default "";
	 	int age()  default 0;
	 	
	 	String[] schools() default {"hnu","hello"};

}
