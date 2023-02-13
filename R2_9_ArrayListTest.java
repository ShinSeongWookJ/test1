package day09;
import java.util.*;
/*ArrayList
 *  - java.util.List계열
 *  - Vector와 기능은 동일
 *  - Vector는 메서드들이 동기화가 구현되어 있는 반면,
 *    ArrayList는 동기화되어 있지 않음 => 가볍다 =>웹에서 주로 사용
 * 
 * */

public class R2_9_ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Java");
		arrList.add("HTML");
		arrList.add("CSS");
		System.out.println(arrList.size()+"개 저장");
		
		//iterator()메서드 이용해서 한꺼번에 출력하기
		
		Iterator<String> ir= arrList.iterator();
		for(int i=1;ir.hasNext();i++) {
			String p=ir.next();
			System.out.println(i+": "+p);	
		}		
//		Object[]	toArray()
		Object[] arr=arrList.toArray();
		for(Object obj:arr)
			System.out.println(obj);
		
		String str=arrList.get(2);
		System.out.println(str);
		
		Collections.sort(arrList);
		System.out.println("sort이후------------------");
		ir= arrList.iterator();
		for(int i=1;ir.hasNext();i++) {
			String p=ir.next();
			System.out.println(i+": "+p);	
		}
		//List<T> Arrays.asList(T ...)
		//매개변수로 전달된 객체들을 ArrayList에 담아서 반환해주는 메서드
		
		List<R2_9_Person> list=Arrays.asList(
		new R2_9_Person("김철수",22), new R2_9_Person("최연희",21), new R2_9_Person("홍길동",23));
		
		/*List<Person> arrList2=new ArrayList<>();
		arrList2.add(new Person("김철수",22));
		arrList2.add(new Person("김철수",22));
		arrList2.add(new Person("김철수",22));
		*/
		System.out.println("list.size(): "+list.size());
		for(R2_9_Person p:list) {
			System.out.println(p.getName()+"#"+p.getAge());
		}
		Iterator<R2_9_Person> it=list.iterator();
		
		//beforFirst()
		while(it.hasNext()) {
			R2_9_Person p=it.next();
			System.out.println(p.getName());
		}
		//afterLast()
		
		
		
		

	}

}
