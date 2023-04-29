public class SuperDeluxe {
    int rate;
    boolean wifi;
    boolean status;
    boolean fridge;
    boolean jacuzzi;
    boolean RoomService;
    boolean television;
    boolean filmPackage;

    public void set(int r,boolean w,boolean s,boolean f,boolean j,boolean rs,boolean tv,boolean fp) {
        rate=r;
        wifi=w;
        status=s;
        fridge=f;
        jacuzzi=j;
        RoomService=rs;
        television=tv;
        filmPackage=fp;
    }

    public int getRate() {
        return rate;
    }

    public boolean getWifi() {
        return wifi;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean getFridge() {
        return fridge;
    }

    public boolean getJacuzzi() {
        return jacuzzi;
    }

    public boolean getRoomService() {
        return RoomService;
    }

    public boolean getTelevision() {
        return television;
    }

    public boolean getfilmPackage() {
        return filmPackage;
    }
    public void statuschange() {
        status= !status;
    }
}