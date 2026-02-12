## Student Utility App
This is a console-based Java application that performs basic mathematical and logical operations using a menu-driven system.
This project demonstrates good understanding of git and github workflow, java syntax and structure, variables and datatypes, operators, loops, methods and input handlig using Scanner.
## Features
- Addition: Sums two user-provided integers.
- Even/Odd Checker: Determines the parity of any given number.
- Number Sequencer: Prints all integers from 1 up to a user-defined limit ($N$).
- Day of the Week: Converts a number (1–7) into its corresponding weekday name.
- Input Validation: Robust error handling that prevents the app from crashing when non-numeric text is entered.
## Project Structure
This project is organized into three distinct parts to maintain the Single Responsibility Principle:
- Main.java: The entry point. Handles the application lifecycle and the primary menu loop.
- InputCalculation.java: The "Engine." Contains pure static methods for mathematical calculations and logic.
- UserInput.java: The "Handler." A Java Record that manages interactions between the user and the calculation logic.
## Usage
### Clone the repository:
```
Bash
git clone https://github.com/your-username/student-utility.git
```
### Compile the project:
```
Bash
javac -d target/classes src/org/Necy/*.java 
```
### Run the application:
```
Bash
java -cp target/classes org.Necy.Main
```
### Example Output

```
Plaintext
=========STUDENT UTILITY APP=========
1. Add two numbers
2. Check if a number is EVEN or ODD
3. Print numbers from 1 to N
4. Display day of the week
5. Exit
Enter your choice:
2
Enter a number:
10
EVEN
```
## Technical Highlights
- Error Handling: Uses scanner.hasNextInt() checks to ensure the program recovers gracefully from invalid user input.
- Modern Java: Utilizes the enhanced switch expression for cleaner mapping of days.
- Decoupled Logic: The calculation logic is independent of the console input, making it easily unit-testable.
