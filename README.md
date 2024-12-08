# Program Description

This program allows the user to input a sentence, splits it into individual words, and identifies the longest word in the sentence. It uses basic string manipulation and array traversal to accomplish its functionality.

## Key Features:
1. **Input**: The user provides a sentence via the console.
2. **Word Splitting**: The program uses the `split` method with a regular expression (`\\s+`) to separate the sentence into words based on whitespace.
3. **Longest Word Identification**: A `for` loop iterates through the array of words, comparing the length of each word to track the longest one.
4. **Output**: The longest word is displayed.

## Code Overview:
- **Scanner Object**: Used to read user input.
- **Array of Words**: Created by splitting the input sentence.
- **Comparison Loop**: Iterates over the array to find the word with the greatest length.
- **Output**: Displays the longest word found.