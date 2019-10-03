public class TrafficLight {

    /**
     * id = nummer het verkeers licht
     */
    private int id;
    private int numberOfLightsOn;
    private int CurrentCollor;

    public TrafficLight() {
        id = 0;
        numberOfLightsOn = 3;
        CurrentCollor = 1;
    }

    public TrafficLight(int id, int numberOfLightsOn) {
        this.id = id;
        this.numberOfLightsOn = numberOfLightsOn;
    }

    public String showColor(int light) {

        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                break;
            default:
                System.out.println("Red");
                result = "red";
                break;
        }
        return result;
    }

    public int showId() {
       return id;
    }

    public void showColorAndId(int light) {
        String result;
        result = showColor(light);

        System.out.println("My color is "
                + result
                + " and my id is: "
                + showId()
        );
    }

    public boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    public int getCurrentCollor() {
        return CurrentCollor;
    }

    public void setCurrentCollor(int currentCollor) {
        this.CurrentCollor = currentCollor;
    }

    public int getNumberOfLightsOn() {
        return numberOfLightsOn;
    }

    public void setNumberOfLightsOn(int numberOfLightsOn) {
        this.numberOfLightsOn = numberOfLightsOn;
    }
}
