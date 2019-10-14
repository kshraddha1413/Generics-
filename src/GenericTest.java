


//Program to create Generic class
public class GenericTest<T> {//generic class specified by<>
	//Type always Generic Type like Integer,String,Double not primitive type int,char,double
	T obj;
	public GenericTest(T obj) {
		this.obj=obj;
		 
	}
	public T getObject() {
		return this.obj;
		
	}


	public static void main(String[] args) {
		//creating instance of Integer Type
		GenericTest<Integer> iobj=new GenericTest<Integer>(16);
		System.out.println(iobj.getObject());
		//creating instance of String Type
		GenericTest<String> sobj=new GenericTest<String>("amarica");
		System.out.println(sobj.getObject());
	}

}
