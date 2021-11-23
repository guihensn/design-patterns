public class EarthPlanet {
    private static EarthPlanet  earth;
    private float angle = 0;

    private EarthPlanet(){
    }

    public static EarthPlanet getEarth(){
        if(EarthPlanet.earth == null){
            EarthPlanet.earth = new EarthPlanet();
        }
        return EarthPlanet.earth;
    }

    public void rotate(float degrees){
        this.angle += degrees;
    }

    public float getAngle() {
        return angle;
    }
}
