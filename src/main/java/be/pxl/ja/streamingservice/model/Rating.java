package be.pxl.ja.streamingservice.model;

public enum Rating {

    LITTLE_KIDS(6),
    OLDER_KIDS(11),
    TEENS(15),
    MATURE(999);

    private int minimumAge;

    public int getMinimumAge() {
        return minimumAge;
    }

    Rating(int minimumAge){

    }




}
