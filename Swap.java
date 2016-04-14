import static java.lang.Math.*;

public class Swap {
	public String replace(String Bin) throws Exception {
		
		for(int i = 0; i<Bin.length(); i++) {
			if (Bin.charAt(i)!='0' && Bin.charAt(i)!='1')
				throw new Exception("To nie jest liczba binarna");
		}
		
		String Dec = new String();
		
		int p = 0;
		double result = 0;
		int Result;
		 
		 
		for (int i=Bin.length()-1; i>=0; i--) {
			if (Bin.charAt(i) == '0')
				p++;
			if (Bin.charAt(i) == '1') {
				result = result + pow(2, p);
				p++;
			}
		}
		
		Result = (int) result;
		Dec = Integer.toString(Result);
		 
		return Dec;

	}
}
