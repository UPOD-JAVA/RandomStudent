public enum Gender {

    MALE("Bey"),
    FEMALE("Hanım");

    private final String postfix;

    private Gender(String prefix) {
        this.postfix = prefix;
    }

    public String getPostfix() {
        return this.postfix;
    }

}
