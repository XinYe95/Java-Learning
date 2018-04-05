package com.yexin.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		//DateFormat��һ�������࣬�����Լ�����ֻ�ܽ���������
		//����һ���Զ����ʱ���ʽ���Լ���㶨�壬Ҳ�и�ʽ���ַ���
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��");
		//ʹ��format��Dateת��Ϊ�ַ���
		Date d = new Date(123213123L);
		String str = df.format(d);
		System.out.println(str); //1970��01��02�� 07ʱ13��
		
		//ʹ��parse���ַ���ת����Date
		//��Ҫ��main������throws parseException
		String str2 = "1970��01��02�� 07ʱ13��";
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
