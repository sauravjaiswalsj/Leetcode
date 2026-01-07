class Solution {
    enum Roman {
        M(1000, "M"),
        CM(900, "CM"),
        D(500, "D"),
        CD(400, "CD"),
        C(100, "C"),
        XC(90, "XC"),
        L(50, "L"),
        XL(40, "XL"),
        X(10, "X"),
        IX(9, "IX"),
        V(5, "V"),
        IV(4, "IV"),
        I(1, "I");

        final int value;
        final String symbol;

        Roman(int value, String symbol){
            this.value = value;
            this.symbol = symbol;
        }
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        for (Roman r : Roman.values()){
            while (num >= r.value){
                sb.append(r.symbol);
                num -= r.value;
            }
        }

        return sb.toString();
    }
}