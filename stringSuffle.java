package Arrays;

public class stringSuffle {
	
	public static String restoreString(String s, int[] indices) {
        char ch[]=new char[indices.length];
 
        
         for(int i=0; i<indices.length; i++){
            ch[indices[i]]=s.charAt(i);
            
         }
        return new String(ch);
    }

	public static void main(String[] args) {
		String s="codeleet";
		int indices[]= {4,5,6,7,0,1,2,3};
		String ans=restoreString(s, indices);
		System.out.println(ans);
	}

}
