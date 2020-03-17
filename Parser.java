import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
public class Parser{
	private HashMap<String,String> hash;
	private HashMap<String,String[]> hashArray;
	public Parser(String[] a){
		hash = new HashMap<String,String>();
		hashArray = new HashMap<String,String[]>();
		try{
			String arr = "";
			for(String i: a){
				arr+=" "+i;
			}
			StringTokenizer st = new StringTokenizer(arr.substring(1,arr.length()),"_");
			while(st.hasMoreTokens()){
				String exp = st.nextToken();	
				StringTokenizer at = new StringTokenizer(exp);
				if(at.countTokens() > 1){
					String key = at.nextToken();
					if(exp.contains("[") && exp.contains("]")){
						String te = at.nextToken();
						ArrayList<String> array = new ArrayList<String>();
						StringTokenizer re = new StringTokenizer(te,"[],");
						while(re.hasMoreTokens()){
							array.add(re.nextToken());
						}
						String[] we = new String[array.size()];
						for(int i=0;i<we.length;i++){
							we[i] = array.get(i);
						}
						hashArray.put(key,we);
					}else{
						String value = "";
						while(at.hasMoreTokens()){
							value+=at.nextToken()+" ";
						}
						value = value.substring(0,value.length()-1);
						if(hash.containsKey(key)){
							new RuntimeException(" Single key can't be used multiple times "+key);
						}
						hash.put(key,value);
					}
				}
			}
		}catch(Exception e){
			System.out.println("Not possible to execute "+e);
		}
	}
	public int getInt(String a){
		return Integer.parseInt(hash.get(a));
	}
	public double getDouble(String b){
		return Double.parseDouble(hash.get(b));
	}
	public float getFloat(String c){
		return Float.parseFloat(hash.get(c));
	}
	public String getString(String a){
		return hash.get(a);
	}
	public String[] getStringArray(String a){
		return hashArray.get(a);
	}
	public int[] getIntArray(String a){
		String[] lk = hashArray.get(a);
		int[] bt = new int[lk.length];
		int i=0;
		for(String b : lk){
			bt[i++] = Integer.parseInt(b);
		}
		return bt;
	}
	public double[] getDoubleArray(String a){
		String[] lk = hashArray.get(a);
		double[] bt = new double[lk.length];
		int i=0;
		for(String b : lk){
			bt[i++] = Double.parseDouble(b);
		}
		return bt;
	}
	public float[] getFloatArray(String a){
		String[] lk = hashArray.get(a);
		float[] bt = new float[lk.length];
		int i=0;
		for(String b : lk){
			bt[i++] = Float.parseFloat(b);
		}
		return bt;
	}
}
