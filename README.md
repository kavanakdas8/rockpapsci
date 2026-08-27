# Rock, Paper And Scissors 
A lightweight, interactive command-line Rock, Paper, Scissors game built in Java. Play against the computer in real time with continuous round tracking, dynamic scorekeeping, and input validation.

## Features

1. Continuous Gameplay: Play as many rounds as you want without restarting the program.
2. Live Score Tracker: Tracks player vs. computer wins throughout the session.
3. Input Validation: Handles invalid choices gracefully and prompts the player to re-enter.
4. Randomized AI: Generates unpredictable computer moves using Java's `Random` utility.

## Tech Stack

1. Language: Java (JDK 8 or higher)
2. Environment: Console / Terminal

## How to Run

**Option 1: Run via IntelliJ IDEA**
1. Clone or download this repository.
2. Open the project folder in IntelliJ IDEA.
3. Locate `RockPaperScissors.java` inside the `src` directory.
4. Click the green **Run** arrow next to the `main` method (or press `Shift + F10`).

**Option 2: Run via Terminal**

1. Clone the repository:
   ```bash
   git clone [https://github.com/kavanakdas/rockpapsci.git](https://github.com/kavanakdas/rockpapersci.git)
   cd rockpapersci

**How to Play**
1.When prompted, type one of the following moves:
* rock
* paper
* scissors
2.View the round outcome and updated scores.
3.Type quit at any time to end the session and see your final score.

**Example Output**

Enter choice (rock, paper, scissors or quit): rock
Computer chose: scissors
You won this round!
Score -> You: 1 | Computer: 0

Enter choice (rock, paper, scissors or quit): paper
Computer chose: scissors
Computer won this round!
Score -> You: 1 | Computer: 1

Enter choice (rock, paper, scissors or quit): quit
Final Score -> You: 1 | Computer: 1
