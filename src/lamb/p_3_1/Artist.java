package lamb.p_3_1;

public class Artist {

String city;

    public Artist(String city) {
        this.city = city;
    }

    public boolean isFrom(String city) {
        if(city.equals(this.city)){
            return true;
        }else {
            return false;
        }

    }
}
