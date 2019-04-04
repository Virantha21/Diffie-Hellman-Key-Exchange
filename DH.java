public class DH {
    public static void main(String[] args) {
		
		try{
			int public_base = 5;
			int public_modulus = 191;

			long private_key;
			long public_key;
			long session_key;

			if (args.length == 1){
				
				private_key = Integer.parseInt(args[0]);
				public_key = ((long)Math.pow(public_base,private_key))%public_modulus;
				
				System.out.println("The Public Key: "+ public_key);
				
			}

			else if (args.length == 2){
				
				private_key = Integer.parseInt(args[0]);
				public_key = Integer.parseInt(args[1]);

				session_key = ((long)Math.pow(public_key,private_key))%public_modulus;
				
				System.out.println("The Session Key: "+ session_key);
			}

			else {
				
				System.out.println("Invalid Argument...!");
				
			}
		}
		catch (NumberFormatException e) {
			System.out.println("Arguments Format is Invalid...!");
		}
    }
}