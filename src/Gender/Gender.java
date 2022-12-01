package Gender;

public enum Gender {
    FEMALE("женщина"),
    MALE("мужчина");
    private String pol;
    Gender(String pol){
        this.pol= pol;
    }

    @Override
    public String toString() {
        return pol;
    }
}
