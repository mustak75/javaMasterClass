public class Hello {

    public static void main(String[] args){
        System.out.println("Hello, Mustak");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I'm really scared about aliens");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        
        System.out.println(s);

        double myFirstVariable = 20.00d;
        double mySecondVariable = 80.00d;
        double myThirdVariable = (myFirstVariable + mySecondVariable) * 100.00d;
        System.out.println("My myThirdVariable value is : " + myThirdVariable);
        double myFourthVariable = myThirdVariable % 40.00d;
        boolean myFifthVariable = (myFourthVariable == 0.00d) ? true : false;
        System.out.println("My FifthVariable value is : " + myFifthVariable);
        if(!myFifthVariable) {
            System.out.println("Got some remainder");
        }

    }
}
