public class SingletonTest {
    public static void main(String args []){
        EarthPlanet earthPlanet1 = EarthPlanet.getEarth();
        EarthPlanet earthPlanet2 = EarthPlanet.getEarth();
        EarthPlanet earthPlanet3 = EarthPlanet.getEarth();

        earthPlanet1.rotate(20);
        earthPlanet2.rotate(30);

        System.out.println("The earth rotation is " + earthPlanet3.getAngle() + " degrees");

        if(earthPlanet1 == earthPlanet2){
            System.out.println("There is just one earth planet!");
        }
    }
}
