import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws ParseException {
//		String a = "hello";
//		String b = new String("hello");
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(a.equals(b));
//
//		b = b + 1;
//		System.out.println(b.hashCode());
//		System.out.println(b);
//		System.out.println(b.trim());
//
//		StringBuffer c = new StringBuffer(a);
//		String d = c.toString();
//		c.reverse();
//		System.out.println(c.hashCode());
//		System.out.println(d.hashCode());

//			String dateString = "1996-11-22 00:00:00";
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			Date date = format.parse(dateString);
//			System.out.println("내 생일 : "+date);
//			Calendar cal =Calendar.getInstance();
//			cal.setTime(date);
//			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//			System.out.println("내 생일이 있는 달의 마지막 날의 날짜 : "+lastDay+"일");
//			Date date1 = new Date();
//			long birthDay = date.getTime();
//			long now = date1.getTime();
//			long count = now-birthDay;
//			long countSecond = count / (1000);
//			long countHour = count/ (60 * 60 * 1000);
//			long countDay = count / (24 * 60 * 60 * 1000);
//			System.out.println("태어나서 지금까지 : "+countSecond+"초");
//			System.out.println("태어나서 지금까지 : "+countHour+"시간");
//			System.out.println("태어나서 지금까지 : "+countDay+"일");
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String nowTime = format.format(new Date());
//		System.out.println(nowTime);
//		
//		String date1 = "2020-12-30";
//		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = format2.parse(date1);
//		System.out.println(date);
//		SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd E");
//		System.out.println(format3.format(date));

//		GregorianCalendar a = (GregorianCalendar) GregorianCalendar.getInstance();
//		a.set(2023, 4, 9);
//		System.out.println(a.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
//		Date now = new Date();
//		System.out.println(now.getTime()/1000/60/60/24/365);
//		
//			int a = 10;
//			boolean b = true;
//			
//			Integer c = new Integer(10);
//			Integer d = 30;
//		
//			Boolean e = true;
//			
//			ArrayList<Integer> aaa =new ArrayList<Integer>();
//			aaa.add(5);
//			System.out.println(aaa);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Number : ");

		try {
			String inputString = scanner.nextLine();
			int a = Integer.parseInt(inputString);
			System.out.println(10 / a);
		} catch (NullPointerException e) {
			System.out.println("NULL");
		} catch (NumberFormatException e) {
			System.out.println("DDDDDD");
		} catch (Exception e) {
			System.out.println("오류 발생");
		}

	}
}
