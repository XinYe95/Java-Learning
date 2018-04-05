package com.yexin.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		//DateFormat是一个抽象类，不能自己建，只能建它的子类
		//建立一个自定义的时间格式，自己随便定义，也叫格式化字符串
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh时mm秒");
		//使用format将Date转化为字符串
		Date d = new Date(123213123L);
		String str = df.format(d);
		System.out.println(str); //1970年01月02日 07时13秒
		
		//使用parse将字符串转化成Date
		//需要在main方法中throws parseException
		String str2 = "1970年01月02日 07时13秒";
		Date d2;
		try {
			d2 = df.parse(str2);
			System.out.println(d2);//Fri Jan 02 07:13:00 JST 1970
			System.out.println(d2.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
}
