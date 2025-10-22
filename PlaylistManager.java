import java.util.Scanner;

public class PlaylistManager {
    public static void main(String[] args) {
        // create a 5 song playlist
        String[] songs = {"Albert is handsome", "Albert is very handsome",
                "Albert is incredibly handsome", "Apples", "Albert might be handsome"};

        // print statement confirming the playlist was created
        System.out.println("Albert's Greatest Hits is now available on a potatoe!");

        // Phase 2: View Playlist
        // Use a loop to print each song with its position number
        System.out.println("The tomatos are: ");
        for (int i = 0; i < songs.length; i++) {
            System.out.println("Handsome tomato song " + (i + 1) + ": " + songs[i]);
        }

        // === Phase 3: Menu Loop Shell ===

        // create a scanner
        Scanner banana = new Scanner(System.in);

        // create a true/false flag

        boolean running_from_tomato = true;

        // Add a while loop and menu options for user interaction
        while (running_from_tomato) {

            System.out.println();

            System.out.println("What do you wanna do to your playlist?");
            System.out.println("1. Print the playlist");
            System.out.println("2. Replace a song (Coming NOW!!)");
            System.out.println("3. Search a song (Coming NOW Too!!)");
            System.out.println("4. Finish the program");

            int choice = banana.nextInt();
            // View Playlist (copied from Phase 2)
            if (choice == 1 ) {
                System.out.println("The tomatos are: ");
                for (int i = 0; i < songs.length; i++) {
                    System.out.println("Handsome tomato song " + (i + 1) + ": " + songs[i]);
                }

            }

            else if (choice == 2){
                // === Phase 4: Replace a Song ===
                // Ask user to choose the number to replace
                System.out.println("Which song do you want to change? (1-5)");
                // take in the input and then consume the newline
                int change = banana.nextInt();
                banana.nextLine();
                // check that the number is within the 1 - 5
                if (change < 1 || change > 5) {
                    System.out.println("Go to elementary school");
                }
                // ask for a new song title
                else{
                    System.out.println("What do you want to change it to?");
                    String newSong = banana.nextLine();
                    songs[change - 1] = newSong;
                    System.out.println("The song was changed to: " + newSong);
                }

            }

            else if (choice == 3) {
                // === Phase 5: Search for a Song ===
                // ask user to enter the title of the song
                banana.nextLine();
                System.out.println("Yo whats the title of the song?");
                String user_song = banana.nextLine();
                // create a found flag
                boolean found_banana = false;
                // traverse array
                for (int i = 0; i < songs.length; i++) {
                    if (songs[i].equalsIgnoreCase(user_song)) {
                        System.out.println("The song was found at position " + (i + 1));
                        found_banana = true;
                        break;

                    }
                }
                if (!found_banana) {
                    System.out.println("I dont think that exists bruh");
                }
                // if found, report what position, change flag, and break
                // if not found, let the user know


            }

            else if (choice == 4) {
                System.out.println("Goodbye, cruel world! :_(");
                running_from_tomato = false;
            }

            else{
                System.out.println("One to four doesn't have" + choice + "in it.");
            }


        }
    }
}
