public class CompressDan {
    public static void main(String[] args) {
    String o = "o";
    String L = "L";

    String numberString = "11001010 01111000 11100011 11100101 11101010 00111110 01001001 10010100 \n" +
            "00110111 01101010 00101001 11110100 00011011 11101011 11100000 11111111 \n" +
            "11000100 00101100 00001010 10010100 00010011 00111111 10001110 01100111 \n" +
            "10101001 11001011 11111101 01010011 01011111 11011001 00111111 00111010 \n" +
            "11110111 01101011 11111001 00000010 11111001 01110111 11100000 10111000 \n" +
            "10101000 01000101 11111001 11000010 01011000 00100010 11110011 01000010 \n" +
            "11111011 01011111 10000010 00011000 10100101 10001010 00100100 10111111 \n" +
            "11010111 00000000 11110110 11000000 10000111 11001001 11001010 00100100 \n" +
            "10001101 01101000 11001100 00111100 01110000 10010100 10111110 00111110 \n" +
            "01100111 10000100 11110000 11011011 10110100 00110000 11000111 10101100 \n" +
            "11001010 00100010 11000101 11101001 01111110 10010000 00110100 01101000 \n" +
            "11010001 01010010 10101100 11111101 00110001 11000100 01110101 11101111 \n" +
            "10001010 11011001 01111000 11111011 01101010 10110100 11110011 00010011 \n" +
            "11110110 01010010 01111100 11011111 10111111 11111000 10011010 01100000 \n" +
            "01001101 00100011 10101111 10000011 11010101 00011101 10000010 11011111 \n" +
            "10011000 11000010 00101000 11111000 10000110 00101111 01010111 00011001 \n" +
            "11100001 00010100 01101011 10110001 01100001 10111100 10001011 10011011 \n" +
            "11100101 10011000 11011100 01000101 01010101 11000011 11100110 01011110 \n" +
            "00011001 11111110 00010001 11111111 01011100 11001011 11111010 10001111 \n" +
            "00011010 11011110 10001111 10101001 11111111 10010000 00010011 01000100 \n" +
            "10001100 01001100 00110010 11101001 01010100 11110011 01100000 10111110 \n" +
            "01010110 10110100 10001111 11001111 00000000 00100100 11100100 10100110 \n" +
            "00101111 01011101 10000100 00100001 01010111 11110000 01011000 11001011 \n" +
            "11001110 00100001 00011010 00000100 11000110 10110101 00011101 10101111 \n" +
            "00000101 01010101 10110010 01100110 11111000 10011010 10000101 01001111 \n" +
            "11100101 01010001 01101000 11101110 11001100 11100001 00110101 01110111 \n" +
            "11110100 01100111 10001010 00100110 11000101 01000110 00010001 00000010 \n" +
            "11100100 00000111 10111010 10101101 00100011 01110001 01110101 01101110 \n" +
            "01010001 11100111 01111111 10010011 01101101 10010110 00111000 11000001 \n" +
            "01000000 01111110 10000010 11110000 00000010 00000100 11110100 01010101 \n" +
            "11101011 10011000 00000111 10111001 01100011 11101111 00001010 00010100 \n" +
            "01011110 10100011 10011100 10111000 00111101 10110110 11110110 10110110 \n" +
            "10001100 00001010 11110111 00111000 00001001 00101001 10100001 11011000 \n" +
            "11100010 01011001 10111101 00111100 11110101 10110110 00010101 01011110 \n" +
            "01110001 10100001 11100000 11111101 10100110 00001011 00101110 00101000 \n" +
            "10001010 10011011 00010001 01001000 00001111 00100100 10111111 10100100 \n" +
            "01001001 01011101 01100011 00001010 10011001 11011010 11110100 01100010 \n" +
            "01000001 10010111 11101011 11001101";
        StringBuilder compressed = new StringBuilder();
        Integer nuller = 0;
        Integer eter = 0;
        for (int i = 0; i <numberString.length() ; i++) {
            if (numberString.charAt(i) == '0')
            {
                if (eter == 1)
                {compressed.append(L);}
                else if (eter > 0)
                {compressed.append(eter.toString()+L);}

                eter = 0;
                nuller++;
            }
            if (numberString.charAt(i) == '1')
            {
                if (nuller == 1)
                {compressed.append(o);}
                else if (nuller>0)
                {compressed.append(nuller.toString()+o);}
                nuller = 0;
                eter++;
            }

        }

        System.out.println(compressed.toString());

    }
}
