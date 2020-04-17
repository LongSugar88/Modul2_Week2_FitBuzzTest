public class FizzBuzz {
    public static String isFitBuzz(int number){
        String result = "" + number;
        boolean isDivisionBy3 = number%3 == 0 || isContainNumber(number, '3');
        boolean isDivisionBy5 = number%5 == 0 || isContainNumber(number, '5');
        boolean isDivisionBy15 = number%3 == 0 && number%5 == 0;
        boolean checkSpellCondition = number >=0 && number <100;

        if( checkSpellCondition ){
            result = changeNumberToWord(number);
        }
        if(isDivisionBy15){
            result = "FitBuzz";
        }
        else if(isDivisionBy5){
            result = "Buzz";
        }
        else if(isDivisionBy3){
            result = "Fit";
        }
        return result;
    }
    public static boolean isContainNumber( int number, char divisionNumber){
        String numberToString = String.valueOf(number);
        boolean isContain = false;
        for( int i=1; i < numberToString.length(); i++){
            if( numberToString.charAt(i) == divisionNumber){
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    public static String changeNumberToWord(int number){
        String word;
        if(number == 1){
            word = "một";
        }
        else if(number > 10){
            int secondElement = number%10;
            int firstElement = (number - secondElement)/10;
            word = spellNumber(firstElement) + " mươi " + spellNumber(secondElement);
        }
        else {
            word = spellNumber(number);
        }
        return word;
    }

    public static String spellNumber(int number){
        String word = "";
        switch (number){
            case 0:
                word = "không";
                break;
            case 1:
                word = "mốt";
                break;
            case 2:
                word = "hai";
                break;
            case 3:
                word = "ba";
                break;
            case 4:
                word = "bốn";
                break;
            case 5:
                word = "năm";
                break;
            case 6:
                word = "sáu";
                break;
            case 7:
                word = "bảy";
                break;
            case 8:
                word = "tám";
                break;
            case 9:
                word = "chín";
                break;
            case 10:
                word = "mười";
                break;
        }
        return word;
    }
}
