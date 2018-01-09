package br.com.algorithm;

public class AppendAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ababe";
		String t = "abac";

		char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(int i=0; i < Math.min(s.length(),t.length()); i++){
            if(sArray[i] == tArray[i]){
                continue;
            }
            else {
            	System.out.println(s.substring(i));
            	System.out.println(t.substring(i));
            }
        }

	}

	static String appendAndDelete(String s, String t, int k) {
        String isEquals = "No";

        if(s.length() + t.length() <= k){
            isEquals = "Yes";
        }
        else if(s.equals(t) && k%2 == 0){
            isEquals = "Yes";
        }
        else {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();

            for(int i=0; i < Math.min(s.length(),t.length()); i++){
                if(sArray[i] == tArray[i]){
                    continue;
                }
                else {
                	int diff = s.substring(i).length() + t.substring(i).length() -k;

                	if(diff == 0 || diff%2 == 0) {
						isEquals = "Yes";
						break;
					}
                }
            }
        }

        return isEquals;
    }
}
