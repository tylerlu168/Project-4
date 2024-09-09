import java.util.Scanner;
import java.util.ArrayList;

public class Driver
{
    public static void main(String[] args)
    {
        int terminate = 0;
        System.out.println("[Media Manager]");

        Scanner input = new Scanner(System.in);
        ArrayList<Media> allMedia = new ArrayList<>();

        while(terminate == 0)
        {
            System.out.println("1- Add Image" + "\n" +
                                "2- Add Music" + "\n" +
                                "3- Add Video" + "\n" +
                                "4- Show images" + "\n" +
                                "5- Show music" + "\n" +
                                "6- Show videos" + "\n" +
                                "7- Show images and videos" + "\n" +
                                "8- Show music and videos" + "\n" +
                                "9- Exit");

            System.out.print("Enter option: ");
            int choice = input.nextInt();

            System.out.println();

            if(choice == 1)
            {
                input.nextLine();
                System.out.print("Enter file name: ");
                String fileName = input.nextLine();
                System.out.print("Enter image codec: ");
                String codec = input.nextLine();
                System.out.println();

                Media addImage = new Image(fileName, codec);

                allMedia.add(addImage);
            }
            else if (choice == 2)
            {
                input.nextLine();
                System.out.print("Enter file name: ");
                String fileName = input.nextLine();
                System.out.print("Enter audio codec: ");
                String codec = input.nextLine();
                System.out.println();

                Music addMusic = new Music(fileName, codec);

                allMedia.add(addMusic);
            }
            else if (choice == 3)
            {
                input.nextLine();
                System.out.print("Enter file name: ");
                String fileName = input.nextLine();
                System.out.print("Enter image codec: ");
                String codec = input.nextLine();
                System.out.print("Enter audio codec: ");
                String codec2 = input.nextLine();
                System.out.println();

                Video addVideo = new Video(fileName, codec, codec2);

                allMedia.add(addVideo);


            }
            else if (choice == 4)
            {
                for (int i = 0; i < allMedia.size(); i++)
                {
                    if(allMedia.get(i) instanceof Image)
                    {
                        System.out.println(((Image) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    }
                }
                System.out.println();
            }
            else if (choice == 5)
            {
                for (int i = 0; i < allMedia.size(); i++)
                {
                    if(allMedia.get(i) instanceof Music)
                    {
                        System.out.println(((Music) allMedia.get(i)).getMediaInfo());
                        System.out.println();

                    }
                }
                System.out.println();
            }
            else if (choice == 6)
            {
                for (int i = 0; i < allMedia.size(); i++)
                {
                    if(allMedia.get(i) instanceof Video)
                    {
                        System.out.println(((Video) allMedia.get(i)).getMediaInfo());
                        System.out.println();

                    }
                }
                System.out.println();
            }
            else if (choice == 7)
            {
                for (int i = 0; i < allMedia.size(); i++)
                {
                    if(allMedia.get(i) instanceof Image)
                    {
                        System.out.println(((Image) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    } else if (allMedia.get(i) instanceof Video)
                    {
                        System.out.println(((Video) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    }
                }
                System.out.println();
            }
            else if (choice == 8)
            {
                for (int i = 0; i < allMedia.size(); i++)
                {
                    if(allMedia.get(i) instanceof Music)
                    {
                        System.out.println(((Music) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    } else if (allMedia.get(i) instanceof Video)
                    {
                        System.out.println(((Video) allMedia.get(i)).getMediaInfo());
                        System.out.println();
                    }
                }
            }
            else if (choice == 9)
            {
                System.out.println("Shutting down...");
                terminate = 1;
            }
        }
    }
}
