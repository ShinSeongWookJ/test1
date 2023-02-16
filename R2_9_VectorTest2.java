package day09;
import java.util.*;
import java.util.Iterator;
import java.util.Vector;

public class R2_9_VectorTest2 {

	public static void main(String[] args) {
		// [1] Person객체 3개 생성하세요
		R2_9_Person p1=new R2_9_Person("김수지",22);
		R2_9_Person p2=new R2_9_Person("황현희",23);
		R2_9_Person p3=new R2_9_Person("이순신",24);
		// [2] Person을 저장할 Vector를 생성하고 3개 객체 저장하기
		Vector<R2_9_Person> v=new Vector<>(10,5);
		v.add(p1);
		v.add(p2);
		v.add(p3);
		v.add(p1);
		// [3] for루프 이용해서 벡터에 저장된 Person의 이름과 나이를 출력하세요
		for(int i=0;i<v.size();i++) {
			R2_9_Person p=v.get(i);
			System.out.println(p.getName()+": "+p.getAge()+"세");
		}
		//Enumeration<E>	elements()
		//Iterator<E>	iterator()
		/*Enumeration<E> elements()
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		System.out.println("---------------");
		Enumeration<R2_9_Person> en=v.elements();
		
		while(en.hasMoreElements()) {
			R2_9_Person p=en.nextElement();
			System.out.println(p.getName());
		}
		System.out.println("****************");
//		while(en.hasMoreElements()) {
//			Person p=en.nextElement();
//			System.out.println(p.getName());
//		}
		
		//Iterator<E>	iterator() 메서드 활용해서 v의 요소들 이름#나이 출력하기
		Iterator<R2_9_Person> it=v.iterator();
		for(int i=1;it.hasNext();i++) {
			R2_9_Person p=it.next();
			System.out.println(i+": "+p.getName()+"#"+p.getAge());
		}
		//벡터에 저장된 요소들을 배열로 카피해보자.
		//void	copyInto(Object[] anArray)
		R2_9_Person[] arr=new R2_9_Person[v.size()];
		v.copyInto(arr);
		
		for(R2_9_Person a:arr) {
			System.out.println(a.getName());
		}
		
		
		//void	removeAllElements()
		// void clear()
		//벡터에 저장된 객체 모두 지우기
		v.clear();
		System.out.println("--clear 이후----------");
		for(R2_9_Person p:v) {
			System.out.println(p.getName());
		}
		System.out.println(v.size());
		

	}

}
