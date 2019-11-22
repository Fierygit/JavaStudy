package Basic.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD, ElementType.TYPE})

public @interface Annotation1 {

	
		String value();
}
