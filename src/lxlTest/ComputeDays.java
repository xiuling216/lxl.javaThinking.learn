package lxlTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @echo 2014-3-26
 * 
 */
public class ComputeDays {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		long to = df.parse("2034-06-04").getTime();
		long from = df.parse("2014-03-26").getTime();
		long days=(to - from) / (1000 * 60 * 60 * 24);
		System.out.println("离48岁只有   "+days+"  天");
		System.out.println("离48岁只有   "+days/7+"  周");
	}

}
