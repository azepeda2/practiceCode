
class TokenTest {

    public static void main(String args[]) {
	Token t;
	java.io.InputStream infile;
	simplejavaTokenManager tm;
	boolean loop = true;
	if (args.length < 1) {
	  System.out.print("Enter filename as command line argument");
	  return;
	} 
	try {  
	   infile = new java.io.FileInputStream(args[0]);
	} catch (java.io.FileNotFoundException e) {
	    System.out.println("File " + args[0] + " not found."); 
	    return;
	} 
	tm = new simplejavaTokenManager(new SimpleCharStream(infile));
	t = tm.getNextToken();

	while(t.kind != simplejavaConstants.EOF) {
	    System.out.print("Token : "+ t + " : ");
	    System.out.println(simplejavaConstants.tokenImage[t.kind]);
	    t = tm.getNextToken();
	}
    }
}
