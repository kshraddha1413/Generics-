
public class GenericMathod {
	//genetic metod
    public static <T>void getPrint(T obj) {
    	System.out.println(obj.getClass().getName() +"="+ obj);
    	
    }
    public static <T extends Number> T genericAdd(T obj1,T obj2){
    	T sum=null;
    	String type=obj1.getClass().getName();//finding type of object 
    	if((type).contains("Integer")) {
    		//we can not directly add  objects so first casting objects according to type
    	//and casting again result and resturn type is also casting
    		sum=(T)(Integer)((Integer)obj1+(Integer)obj2);
    	}
    	if((type).contains("Double")) {
        	sum=(T)(Double)((Double)obj1+(Double)obj2);
        	
        	}
    	
    	return sum;
    }
    
	public static void main(String[] args) {
		getPrint(11);//calling generic method by sending Integer object
		getPrint("America");//calling generic method by sending Integer object
	    System.out.println(genericAdd(22,30));
	    System.out.println(genericAdd(20,30));

	}

}
