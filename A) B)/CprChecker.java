public class CprChecker {

    String cpr;

    public CprChecker(String cpr) {
        this.cpr = cpr;
    }

     public boolean cprValidator(String cpr) {

        int day = Integer.parseInt(cpr.substring(0, 2));
        int month = Integer.parseInt(cpr.substring(2,4));

        if (!(cpr.length() < 10)) {
            return false;
        }

        else {
            if (day <= 31 && month <= 12);
        }
        return true;
     }



    @Override
    public String toString() {
        return "CprChecker{" +
                "cpr=" + cpr +
                '}';
    }
}
