public class Luxury {
    int rate;
    boolean wifi;
    boolean status;
    boolean fridge;
    boolean jacuzzi;
    boolean roomservice;
    boolean television;
    boolean filmPackage;

    public void set(int r,boolean w,boolean s,boolean f,boolean j,boolean rs,boolean tv,boolean fp) {
        rate=r;
        wifi=w;
        status=s;
        fridge=f;
        jacuzzi=j;
        roomservice=rs;
        television=tv;
        filmPackage=fp;
    }

    public int getRate () {
        return rate;
    }

    public boolean getStatus () {
        return status;
    }

    public boolean getWifi () {
        return wifi;
    }

    public boolean getFridge () {
        return fridge;
    }

    public boolean getJacuzzi () {
        return jacuzzi;
    }

    public boolean getRoomservice () {
        return roomservice;
    }

    public boolean getTelevision () {
        return television;
    }

    public boolean getFilmPackage () {
        return filmPackage;
    }

    public void statuschange() {
        if(status)
            status=false;
        else
            status=true;
    }
}
