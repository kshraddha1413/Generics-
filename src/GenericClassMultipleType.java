
public class GenericClassMultipleType <T,U>{
	T obj1;
	U obj2;
	public GenericClassMultipleType(T obj1,U obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
		
	}
	public void getPrint(){
		System.out.println(obj1);
		System.out.println(obj2);
	}
	

	public static void main(String[] args) {
		GenericClassMultipleType <String,Integer> obj=new GenericClassMultipleType<String, Integer>("America",1);
		obj.getPrint();
		
	}

}
