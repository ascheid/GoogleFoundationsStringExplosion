
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String stringSplosion(String str) {
		  StringBuilder s = new StringBuilder();
		  for(int i = 0 ; i< str.length(); i++)
		  {
		    s.append(str.substring(0, i+1));
		  }
		  return s.toString();
		}

}
