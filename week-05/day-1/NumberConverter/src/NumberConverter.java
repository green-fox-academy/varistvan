public class NumberConverter {

    public String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };
    public String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    public int nr;
    public String numberWord;

    public NumberConverter(int nr) {
        this.nr = nr;
    }

    public NumberConverter(String word) {
        this.numberWord = word;
    }

    public String convert() {
        if (this.nr == 0) {
            return "zero";
        } else if (this.nr < 20 && this.nr > 0) {
            return numNames[this.nr];
        } else {
            return tensNames[this.nr / 10] + numNames[this.nr % 10];
        }

    }

    public boolean isNegative() {
        if (this.nr < 0) {
            return true;
        } else {
            return false;
        }
    }

    public int convertToNr() {
        int total = 0;
        for (int i = 0; i < numNames.length; i++) {
            if (numNames[i].contains(this.numberWord)) {
                return i;
            }
        }
        String[] splitted = this.numberWord.split(" ");
        for (int j = 0; j < tensNames.length; j++) {
            if (tensNames[j].contains(splitted[1])) {
                total += j * 10;
            }
        }
        for (int i = 0; i < numNames.length; i++) {
            if ((numNames[i].contains(splitted[2])) && (numNames[i].length() < 6)) {
                total += i;
            }
        }
        return total;
    }
}