public class Telephone {
    private String ddd;
    private String number;

    public Telephone(String ddd, String number) {
        if (ddd == null || number == null) {
            throw new IllegalArgumentException("DDD and Number is required!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD invalid!");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Number invalid!");
        }
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }
}
