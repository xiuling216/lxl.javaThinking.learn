//: annotations/database/Uniqueness.java
// Sample of nested annotations
package annonation.database;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
} // /:~
