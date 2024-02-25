public class challenge1 {

    public static void main(String[] args){

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
