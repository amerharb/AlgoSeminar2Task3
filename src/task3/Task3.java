package task3;

public class Task3
{

    public static void main(String[] args)
    {
        Queue<String> q;
        q = new Queue<>();

        while (true) {
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String ans;

            System.out.println("Enter the Value to Add to the Queue or dq to Dequeue or Exit");
            System.out.print(">");
            ans = sc.nextLine();
            if (ans.toLowerCase().contains("exit")) {
                break;
            } else if (ans.toLowerCase().contains("dq")) {
                System.out.println(q.dequeue());
            } else {
                q.queue(ans);
            }

        }
    }

}
