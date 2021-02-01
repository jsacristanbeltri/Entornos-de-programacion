package T6_E1;

public class WindowsTest {
    public static void main(String[] args){
        Window [] windows = new Window[10];
        for (int i=0;i<10;i++){
            windows[i] = new Window("window"+i, generateNumber(90,120),generateNumber(40,100));
            System.out.println(windows[i]);
        }
    }

    public static int generateNumber(int min, int max)
    {
        int numberRandom= min+(int)(Math.random() * max);

        return numberRandom;
    }
}
