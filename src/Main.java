import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public static ScutireController controller;
    public static ScutireView view;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        view = new ScutireView();
        controller = new ScutireController();

        FetchInputForScutireAndAdd();

    }

    public static void FetchInputForScutireAndAdd()
    {
        System.out.println("Give an excusee Name:");
        String excuseeName = scanner.nextLine();

        System.out.println("Give an excuse:");
        String excuse = scanner.nextLine();


        System.out.println("Give an excuser Name:");
        String excuser = scanner.nextLine();

        Scutire createdScutire = controller.CreateNewScutire(excuseeName,excuse,excuser);
        view.PrintScutireDetails(createdScutire);
    }
}