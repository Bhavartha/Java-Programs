import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class S_P_S
{
    public static void main(String[] args)
    {
        Map<String,Map<String,String>> map= new HashMap<>();
        map.put("Stone", new HashMap <String,String>()
                            {{  put("Paper","You Win");
                                put("Stone","Its a Draw");
                                put("Scissor","You Lose");
                            }}
                );

        map.put("Paper", new HashMap <String,String>()
                            {{  put("Paper","Its a Draw");
                                put("Stone","You Lose");
                                put("Scissor","You Win");
                            }}
                );

        map.put("Scissor", new HashMap <String,String>()
                            {{  put("Paper","You Lose");
                                put("Stone","You Win");
                                put("Scissor","Its a Draw");
                            }}
                );

        Scanner s= new Scanner(System.in);
        String choice[] = {"Stone", "Paper", "Scissor"};
        Random rand= new Random();
        int play=1;
        while (play!=0)
        {
            System.out.println();
            System.out.print("Enter your choice: Stone / Paper / Scissor: ");
            String comp_choice= choice[rand.nextInt(choice.length)];
            String your_choice = s.next();
            System.out.println("Computer choice: "+ comp_choice);
            String output = map.get(comp_choice).get(your_choice);
            if(output==null)
            {
                System.out.println("\nInvalid User Input");
                System.out.println("Please enter from: Stone, Paper, Scissor");
            }
            else
                System.out.println(output);
            System.out.print("\nDo you want to play again? 0 / 1: ");
            play = s.nextInt();
        }
    }
}
