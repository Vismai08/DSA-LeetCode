class Solution {
    
    public static String to32BitHex(int number) {
        // Convert to a 64-bit long and mask it to keep only the lower 32 bits
        long unsignedValue = number & 0xFFFFFFFFL; 
        
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder result = new StringBuilder();
        
        // Loop 8 times because a 32-bit number has 8 hex digits (4 bits each)
        for (int i = 0; i < 8; i++) {
            int last4Bits = (int) (unsignedValue & 0xF); // Get rightmost 4 bits
            result.insert(0, hexChars[last4Bits]);       // Add the hex char to the front
            unsignedValue = unsignedValue >>> 4;         // Shift right by 4 bits
        }
        
        return result.toString();
    }
    public String toHex(int num) {
        if (num==0)
        {
            return("0");
        }
        
        else if(num>0)
        {
            String hexa = "";int div = 0;
            int a=num;
            while(a>0)
            {
                if (a<=9)
                {
                    hexa=hexa+(char)(a + '0');
                    break;
                }
                else if (a>9 && a<16)
                {
                    hexa=hexa+((char)(a+87));
                    break;
                }
                else
                {
                    div=a%16;
                    if (div<=9)
                    {
                    hexa=hexa+(char)(div+'0');
                    }
                    else if (div>9 && div<16)
                    {
                    hexa=hexa+((char)(div+87));
                    }

                }
            a=a/16;
            div=0;
            }
            String reversed = new StringBuilder(hexa).reverse().toString();
        return(reversed);

        }
        
        
        
        else
        {
            
          return(to32BitHex(num)); 
        }

        
    }
}