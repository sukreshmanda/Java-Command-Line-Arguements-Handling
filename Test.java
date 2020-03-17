public class Test{
	public static void main(String args[]){
		Parser p = new Parser(args);
		int a = p.getInt("age");
		float[] b = p.getFloatArray("name");
		float c = p.getFloat("salary");
		System.out.println("Name "+b+" Age "+a+" Salary "+c);
	}
}
