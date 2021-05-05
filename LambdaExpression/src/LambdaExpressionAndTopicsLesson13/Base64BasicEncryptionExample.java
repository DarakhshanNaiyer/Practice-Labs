package LambdaExpressionAndTopicsLesson13;

import java.util.Base64;

public class Base64BasicEncryptionExample {

	public static void main(String args[]) {
		// Getting Encoder
     
		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder= Base64.getDecoder();
		
     // Creating Byte Array
        byte[] byteArr= {1,2,3,4};
        byte[] byteArr2=encoder.encode(byteArr);
     
        System.out.println("Encoded byte array" +byteArr2);
     
        byte[] byteArr3= new byte[10];
        int x=encoder.encode(byteArr,byteArr3);
        
        byte[] dbyte = decoder.decode(byteArr2);
//        byte[] dbyte = new byte[] (decoder.decode(byteArr3));
        
//        System.out.println(new Byte (dbyte));
        System.out.println("Decoded byte Array:" +dbyte);

     
     //Above returns no. of bytes written.
      
     System.out.println("Encode byte Array written to another array:"+byteArr3);
     System.out.println("Number of bytes written:"+x);
     
     String str = encoder.encodeToString("Sample".getBytes());
     
     System.out.println("Encoded String:" +str);
     
//     Base64.Decoder decoder= Base64.getDecoder();
      
     //Above line Decoding String.
     
     String dstr = new String (decoder.decode(str));
     
     System.out.println("Decoded string:" +dstr);
     
	}

}
