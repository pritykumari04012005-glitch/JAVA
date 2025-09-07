public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = " Prit";

        System.out.println("before if");
        if (isMale) System.out.println("Mr." + name);

    else System.out.println("Ms." + name);
    System.out.println("after if");
    boolean isSeniorCitizen = false;
    boolean isAdult = true;
    if(isSeniorCitizen) {
        System.out.println("hellow Senior Citizen");
    }else {
        if (isAdult) {
            System.out.println("hellow Adult");
        } else {
            System.out.println("hellow child");
        }
        }
    }
}
