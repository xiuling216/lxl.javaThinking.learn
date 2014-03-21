//: annotations/database/DBTable.java
package annonation.database;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
// Applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
} // /:~
