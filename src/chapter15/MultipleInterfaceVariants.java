package chapter15;

//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won't compile)

interface Payable<T> {
}

class Employee1 implements Payable<Employee1> {
}

// class Hourly extends Employee1 implements Payable<Hourly> {
// } // /:~
