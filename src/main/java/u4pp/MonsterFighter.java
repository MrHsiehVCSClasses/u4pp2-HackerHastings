package u4pp;

import java.util.Scanner;

public class MonsterFighter {
    private boolean play = true;


    public MonsterFighter(){
        play= true;
    }

    //Main play function for gameplay loop
    public void Play(Scanner scanner){
        //intro before combat begins
        InputHelper InputHelper = new InputHelper(scanner);
        Monster monster1 = new Monster("LizardPerson", 5, 1, 1);
        DefenseMonster monster2 = new DefenseMonster("PizzaDeliveryMan", 10, 2, 20, 3);
        RandomMonster monster3 = new RandomMonster("Ginger", 20, 5, 100);
        System.out.println("The rocky earth distills a soft rumble from the chamber ahead into your legs. A mechanical eye appears out of an indistinguishable crevice in the mesa wall, soulless yet terrifying.");
        System.out.println("It speaks: \"Input access name.\"");
        String answer = scanner.nextLine();
        Fighter player = new Fighter(answer, 10, 5);
        System.out.println("\"Access approved. Welcome, " + answer + "\"");
        System.out.println("Hiding your fright, you step through the intimidating pieces of mesa wall that began separating. Despite your fear, joy is also present, as your inside man gave you the right access code. The truth is in your grasp, all you must do is survive until it's found.");
        System.out.println("Welcome to...");
        System.out.println(
    " _______  _______  _        _______ _________ _______  _______    _______ _________ _______          _________ _______  _______ \n" +
    "(       )(  ___  )( (    /|(  ____ \\\\__   __/(  ____ \\(  ____ )  (  ____ \\\\__   __/(  ____ \\|\\     /|\\__   __/(  ____ \\(  ____ )\n" +
    "| () () || (   ) ||  \\  ( || (    \\/   ) (   | (    \\/| (    )|  | (    \\/   ) (   | (    \\/| )   ( |   ) (   | (    \\/| (    )|\n" +
    "| || || || |   | ||   \\ | || (_____    | |   | (__    | (____)|  | (__       | |   | |      | (___) |   | |   | (__    | (____)|\n" +
    "| |(_)| || |   | || (\\ \\) |(_____  )   | |   |  __)   |     __)  |  __)      | |   | | ____ |  ___  |   | |   |  __)   |     __)\n" +
    "| |   | || |   | || | \\   |      ) |   | |   | (      | (\\ (     | (         | |   | | \\_  )| (   ) |   | |   | (      | (\\ (   \n" +
    "| )   ( || (___) || )  \\  |/\\____) |   | |   | (____/\\| ) \\ \\__  | )      ___) (___| (___) || )   ( |   | |   | (____/\\| ) \\ \\__\n" +
    "|/     \\|(_______)|/    )_)\\_______)   )_(   (_______/|/   \\__/  |/       \\_______/(_______)|/     \\|   )_(   (_______/|/   \\__/");

    //main while loop for game
    while(play == true){
    System.out.println("\n");
    System.out.println("You are imediately greeted by a kind young man, until he isn't! It's a lizard dude in disguise! Cap this fool!");
    //main while loop for first fight
        while(player.canFight() == true && monster1.canFight() == true){
            int input = InputHelper.getIntegerInput("Type (1) for attack, (2) for block, or (3) for focus", 1, 3);
            if(input == 1){
                player.attack(monster1);
                System.out.println("You whooped that Lizzy, he's got " + monster1.getHealth() + " health now");
            } else if (input == 2){
                player.block();
                System.out.println("You whimpered and covered your face, praying for mercy like a wimp");
            } else if (input == 3){
                player.focus();
                System.out.println("You stared at the Lizzy intently, hoping something will change by focusing");
            }
        

            if(monster1.canFight() == true){
                monster1.takeTurn(player);
                System.out.println("That Lizzy got a bite, he did " + monster1.getAttackPower() + " damage. You got " + player.getHealth() + " health now");
            }

        }

        if(player.canFight() == true){
            player.gainEXP(monster1.getExpGiven());

            System.out.println("You mutilate the corpse and enter the main corridor leading to the Illuminati's centre hub. It's filled with Pizza delivery men, and the only logical conclusion drawn is that you must stop PizzaGate by making an example out of one of them.");
//main while loop for second fight
            while(player.canFight() == true && monster2.canFight() == true){
                int input = InputHelper.getIntegerInput("Type (1) for attack, (2) for block, or (3) for focus", 1, 3);
                if(input == 1){
                    player.attack(monster2);
                    System.out.println("You shoved the pizza down his throat; he now has " + monster2.getHealth() + " health");
                } else if (input == 2){
                    player.block();
                    System.out.println("You held up the face of the previous Lizard dude in an attempt to coneal yours.");
                } else if (input == 3){
                    player.focus();
                    System.out.println("You plotted  your next move agains the Pizza man, analyzing the circumference of his box.");
                }
            
    
                if(monster2.canFight() == true){
                    monster2.takeTurn(player);
                    System.out.println("Brotha threw pizza in your face, dealing " + monster2.getAttackPower() + " damage. You now have " + player.getHealth() + " health");
                }
    
            }

            if(player.canFight() == true){
                player.gainEXP(monster2.getExpGiven());

                System.out.println("As the PizzaGateMen scurry away from the newly dismembered body of their staff member, you enter the main Illuminati eyeball doors and approach a cult of Gingers surrounding a Pentagram. Main Ginger boss floats in the middle, beckoning you over.");
//main while loop for third fight
            while(player.canFight() == true && monster3.canFight() == true){
                int input = InputHelper.getIntegerInput("Type (1) for attack, (2) for block, or (3) for focus", 1, 3);
                if(input == 1){
                    player.attack(monster3);
                    System.out.println("You throw the mini-gingers at papa Ging, dealing quite the bit of damage. Bossman now has " + monster3.getHealth() + " health");
                } else if (input == 2){
                    player.block();
                    System.out.println("You take a mini-ginger hostage and use him as a meat-shield");
                } else if (input == 3){
                    player.focus();
                    System.out.println("Using your supreme intelligence on the subject matter, you draw on your knowledge to strike his weakpoint on your next turn.");
                }
            
    
                if(monster3.canFight() == true){
                    int playerHealthOriginal = player.getHealth();
                    monster3.takeTurn(player);
                    if(player.getHealth() == playerHealthOriginal){
                    System.out.println("The Ginger demon tried stealing your soul, but was thrown off track by your racial insults hurled in retaliation");
                    } else if (player.getHealth() != playerHealthOriginal){
                    System.out.println("Boss Ginger unleashes an orange fireball at you, dealing " + monster3.getAttackPower() + " damage. You only have " + player.getHealth() + " health left");
                    }
                }
    
            }

            }

            if(player.canFight() == true){
                System.out.println("You defeated the Ginger, therefore all other enemies lose their lifeforce and you are left to discover the secrets of the Illuminati. You open the book residing within the Pentagram. It reads: \"Ut fama est, Biden pars perantiqua societas secreta in orbem dominatum inclinavit, cuius membra includunt Jay-Z, Beyonce, Kanye West, Katy Perry et Elizabetha regina. Excepto... Biden in usu familiae hereditatis iuratus est, biblia Vulgata Nova a Romano-Catholicis per orbem terrarum adhibita. Jay-Z vocat fabulas de societate Illuminati 'stupid'. Kanye West se putat esse 'ridiculosum' et Katy Perry nuntiavit Rolling Stone, quae theoria fuit conservatio 'fatum hominum in interrete'. Sed tunc… secreta Illuminati dicerent, annon? Δ.)\"");
                play = false;
            } else{
                System.out.println("You die, leaving the secrets of the cave to be forever a mystery due to your incapability.");
                play = false;
            }

            
        } else {
            System.out.println("You die, leaving the secrets of the cave to be forever a mystery due to your incapability.");
            play = false;
        }





    }
    
    }
    

}

