package chapter1;

public class Exersize1 {
	
		public static void intToBin(int num)
		{
			System.out.println("Converting to binary");
			String binary = Integer.toBinaryString(num);
			System.out.println(binary);
			
			//Convert int to string using radix 2
			String bin = Integer.toString(num, 2);
			System.out.println("Radix 2 = " + bin);			
		}
		
		public static void intToOct(int num)
		{
			System.out.println("Converting to octal");
			String octal = Integer.toOctalString(num);
			System.out.println(octal);
			
			//convert int to string in base 8 (radix 8)
			String oct = Integer.toString(num, 8);
			System.out.println("Radix 8 = " + oct);
			
			System.out.printf("Conversion Character method: o = %o\n", num);
		}
		
		public static void intToHex(int num)
		{
			System.out.println("Converting to hexadecimal");
			String hex = Integer.toHexString(num);
			System.out.println(hex);
			
			//convert int to string in base 16 (radix 16)
			String he = Integer.toString(num, 16);
			System.out.println("Radix 16 = " + he);
			
			System.out.printf("Conversion Character method: x = %x\n", num);
		}
		
		public static void intReciprocalasFloatingHex(int num) 
		{
			double rec = 1f/num;
			System.out.printf("Reciprocal = %g - hex floating point: %a\n" , rec, rec);
		}
		
		public static void convertInt(int num)
		{
			intToBin(num);
			intToOct(num);
			intToHex(num);
			intReciprocalasFloatingHex(num);
		}
		
	public static void main(String[] args) {
		convertInt(5);
	}
}
