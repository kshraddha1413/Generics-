import java.util.ArrayList;

//Programs that uses Generics has got many benefits over non-generic code.
//Code Reuse: We can write a method/class/interface once and use for any type we want.
//Type Safety : Generics make errors to appear compile time than at run time 
//(It’s always better to know problems in your code
//		at compile time rather than making your code fail at run time). 
//Suppose you want to create an ArrayList that store name of students and 
//if by mistake programmer adds an integer object instead of string, compiler allows it. 
//But, when we retrieve this data from ArrayList, it causes problems at runtime.
public class GenericAdvantage {
	public static void main(String[] args) {
		//creating arraylist without sepcifying type
		ArrayList list=new ArrayList();
		list.add(11);
		list.add(22);
		list.add("america");//program allowing String type also
		Integer i1=(Integer)list.get(0);//if we will not type evertime we to typecast
		Integer i2=(Integer)list.get(1);
		System.out.println(i1);
		System.out.println(i2);
//		Integer i3=(Integer)list.get(3);//it will give runtyme exception
	//we can solve this problem by specify type
		ArrayList<Integer> ilist=new ArrayList<Integer>();
		ilist.add(11);
		ilist.add(22);
		//ilist.add("america"),//at compile it is not allowing
		System.out.println(ilist.get(0));//no need for casting
		System.out.println(ilist.get(1));
	}
  
}
