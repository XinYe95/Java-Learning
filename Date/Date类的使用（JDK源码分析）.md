# 1. 时间处理相关类：
 
   * java.util.Date：核心
   * java.sql.Date/Time/Timestamp: 数据库相关，继承核心
   * java.text.DateFormat：时间格式化
   * java.text.SimpleDateFormat：时间和字符串转换
   * java.util.Calendar：日期计算，比如100天之后是哪天
   * java.util.GregorianCalendar：公历

# 2. Date时间类(java.util.Date)：
  * 在标准Java类库中包含一个Date类。它的对象表示一个特定的瞬间。
  * Java中如何表现时间：选择1970.1.1 0点作为标准纪元。从该时刻开始到某个时刻的毫秒数，类型是long。在零点之前，就用负数表示。

<
```
//The class Date represents a specific instant in time, with millisecond precision
//public Date() {
//this(System.currentTimeMillis());
//}
Date d = new Date();
long t = System.currentTimeMillis();
System.out.println(t); //1522742521607,标准纪元到现在的毫秒数
		
//距离标准纪元1000毫秒
Date d2 = new Date(1000);
System.out.println(d2); //Thu Jan 01 09:00:01 JST 1970
System.out.println(d2.toGMTString());//1 Jan 1970 00:00:01 GMT 不建议使用
		
//getTime:获得毫秒数
System.out.println(d2.getTime()); //1000
		
//setTime:设置毫秒数
d2.setTime(23432345);
System.out.println(d2.toGMTString());//1 Jan 1970 06:30:32 GMT
		
/**
 * compare to:时间比较
 * 返回值：+:d3>d4；   0:d3=d4    -:d3<d4
*/
Date d3 = new Date(434234);
Date d4 = new Date(1000);
System.out.println(d3.compareTo(d4));
```

