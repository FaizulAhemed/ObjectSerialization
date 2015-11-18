import java.util.ArrayList;


public class Test {
	
	private String sample = "sample";
	public int price = 20;
	Double testdouble = 25.2085;
	protected Long data = null;
	private Character c='A';
	ArrayList<Integer> arr = new ArrayList<>();
	ArrayList<String> str = new ArrayList<>();
	public Test(){
		
		arr.add(50);
		arr.add(89);
		arr.add(6);
		
		str.add("Str 1");
		str.add("Str 2");
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("tested ok!");
		String result = ObjectSerializer.serializer(new Test());
		System.out.println(result);
		
	}

}
