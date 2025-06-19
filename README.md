# Music playlist manager
- **Developer**: Jason Barasa
- **Student Number**: ST10483276
- **Group**: 1
- **Course**: Higher Certificate Mobile Development and Web Application 
- **Subject**: Introduction to Mobile Application Development

## Links
- **GitHub Repository**: https://github.com/VCSTDN2024/imad5112-practicum-2025-ST10483276/tree/main/app/src
---

Project Overview
------------------
A mobile application called the **Music playlist app** was created as a part of a Higher Certificate Mobile Development and Web Application exam practical.  This app was made with **Android Studio** and **Kotlin**.  The main function of the app is to allow users to add songs to a playlist, rate the songs on a 5-point scale, provide comments, and enter any artist-related information.
 The application was created in accordance with the assignment's specifications, which included using GitHub for version control and CI/CD automation with GitHub Actions, as well as developing a working mobile application.

App Purpose and Features
---------------------------
The main goal of this app is to rate music in a playlist out of 5 and discover new music from other users.

### Key Features:
- **Feature 1 Display songs:** After filling in the information needed, you can view all the artist that you mentioned.
- **Feature 2 Calculate average:** This feature allows the user to calculate the Ratings of each song. 
- **Feature 3 Notification:** When the information is stored, the system will let the user know that the data has been captured. 
- **Feature 4 Notifications for error:** When the information isn't complying to the rules, the system will let the user know that the user know that data has been entered incorrectly. 
- **Feature 5 Notifications for empty:**: if the user leaves a field empty, the app will let the user know that a field is empty and that it has to be filled in. All information have to be filled in in order to continue.

------------------------
## Design Considerations

1. **User friendly (UX)**: The app was designed with the goal of providing an intuitive and easy-to-navigate user interface, ensuring a seamless user experience.
   
2. **Responsiveness**: The app was built to ensure it performs well on different screen sizes, with particular attention to device compatibility.
   
3. **Simplicity**: The design is minimalistic, focusing on core features without overwhelming the user.   
---
How the app works
------------------
This app is a music based playlist app were the user will have to fill in the details needed to be stored. these fields that need to be filled in order to excecute the process are, 
- Song Title: The name of the song
- Artist Name:The name of the artist that made the song
- Ratings: The overrall feedback on the track out of 5
- Comments: The gerne of the track 

This app also has a Notifications block that will appear. for example,
1. If a user adds the track "Holding Hands by A-reece" the system will notify the user by saying "___ added to the playlist.".
2. if any field is empty the system will tell the user ""All fields are required! please fill in any missed fields"

When you start up the app you will see the 3 buttons which are Add to Playlist,View Playlist and Exit which terminates the application

In the list screen, the user has to fill out the following list mentioned above:
- Song Title
- Artist Name
- Ratings
- Comments

In the last screen when the user presses View playlist, they can view the songs that they have added from the dialog screen that was asking for information to be typed in. while you can display all the songs you can also work out the average Ratings which will total up all the reviews out of 5 and divide it by how many users voted and when the user is done or they want to add more songs, they can press the  "Back To Home Screen" button to go to the first screen.

---
 Screenshots and App Demo
---------------------------
- Screenshot 2025-06-19 133640.png (Main Activity kotlin file)
- Screenshot 2025-06-19 133825.png (Main screen)
- Screenshot 2025-06-19 133657.png (Main Activity kotlin file)
- Screenshot 2025-06-19 133753.png (Dialog box to be filled in)
- Screenshot 2025-06-19 133808.png (Displaying screen)
- Screenshot 2025-06-19 133825.png (Detailed view)
- Screenshot 2025-06-19 144734.png (Detailed view kotlin file)
- Screenshot 2025-06-19 144750.png (Detailed view kotlin file)

- planning (rough sketch of the layout).png
---
