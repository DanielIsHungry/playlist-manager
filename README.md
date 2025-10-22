# Playlist Manager

This is a small Java console program called **PlaylistManager**.  
It lets you view, replace, and search for songs in a short playlist using a simple text menu.

---

## How it works

When you start the program, it creates a playlist of 5 songs:
```
Albert is handsome  
Albert is very handsome  
Albert is incredibly handsome  
Apples  
Albert might be handsome
```

You’ll then see a menu like this:

```
What do you wanna do to your playlist?
1. Print the playlist
2. Replace a song (Coming NOW!!)
3. Search a song (Coming NOW Too!!)
4. Finish the program
```

---

## Menu Options

**1. Print the playlist**  
Shows all songs with their position numbers.

**2. Replace a song**  
Lets you pick a song number (1–5) and type in a new title.  
If you enter an invalid number, it tells you off in a funny way.

**3. Search a song**  
You can search for a song by its title (case-insensitive).  
If it’s found, the program tells you the position.  
If not, it says it doesn’t exist.

**4. Finish the program**  
Ends the loop and exits with a goodbye message.

---

## Example Run

```
Albert's Greatest Hits is now available on a potatoe!
The tomatos are:
Handsome tomato song 1: Albert is handsome
Handsome tomato song 2: Albert is very handsome
Handsome tomato song 3: Albert is incredibly handsome
Handsome tomato song 4: Apples
Handsome tomato song 5: Albert might be handsome

What do you wanna do to your playlist?
1. Print the playlist
2. Replace a song (Coming NOW!!)
3. Search a song (Coming NOW Too!!)
4. Finish the program
```

---

## Notes

- The menu keeps running until you choose option **4**.  
- Song titles are stored in a `String[]` array.
- The `Scanner` is used for user input.
- This program is meant to be lighthearted and funny — especially with the “tomato” and “banana” variable names.

---

## How to Run

1. Save the file as `PlaylistManager.java`
2. Compile:
   ```
   javac PlaylistManager.java
   ```
3. Run:
   ```
   java PlaylistManager
   ```
## Author
By Daniel
