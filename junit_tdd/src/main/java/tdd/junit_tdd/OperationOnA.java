package tdd.junit_tdd;
public class OperationOnA {
    public String operations(String string) {
    	String result=string;
		if(string.charAt(0)=='A' && string.charAt(1)!='A')
			result=charRemoveAt(string,0);
		else if(string.charAt(1)=='A' && string.charAt(0)!='A')
			result=charRemoveAt(string,1);
	    else if(string.charAt(0)=='A' && string.charAt(1)=='A')
	        result=string.substring(2,string.length());
	    return result;
	    }
	public static String charRemoveAt(String str, int p) { 
	    return str.substring(0,p)+str.substring(p+1); 
	}
}
