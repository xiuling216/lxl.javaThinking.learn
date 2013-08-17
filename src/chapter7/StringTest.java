package chapter7;

public class StringTest {
	public static void main(String[] args){
        String str = "s";
        changeStr(str);
        System.out.println(str);
        
        int num=20;
        changeInt(num);
        System.out.println(num);
    }

	private static void changeStr(String old) {
		old = old + "-change";
	}

	private static void changeInt(int i) {
		i=i+3;
	}

}