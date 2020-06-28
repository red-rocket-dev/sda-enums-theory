package pl.sda.enums;

public enum Brand {
    FIAT(5), PORSCHE(10), FORD(5);

    private int rating;

    Brand(int rating) {
        this.rating = rating;
    }

    public boolean isRatingEqual(int expectedRating) {
        return expectedRating == rating;
    }
    //może też mieć statyczne
    public static String statyczna() {
        return "";
    }
}
