
class Monkey implements Animal {

    /**
     * Returns the ASCII art representation of the monkey.
     *
     * @return A string containing the ASCII art of the monkey.
     */
  
  @Override
  public String getAnimalArt() {
      return        "                 __,__\r\n" + //
                    "        .--.  .-\"     \"-.  .--.\r\n" + //
                    "       / .. \\/  .-. .-.  \\/ .. \\\r\n" + //
                    "      | |  '|  /   Y   \\  |'  | |\r\n" + //
                    "      | \\   \\  \\ 0 | 0 /  /   / |\r\n" + //
                    "       \\ '- ,\\.-\"`` ``\"-./, -' /\r\n" + //
                    "        `'-' /_   ^ ^   _\\ '-'`\r\n" + //
                    "        .--'|  \\._   _./  |'--. \r\n" + //
                    "      /`    \\   \\ `~` /   /    `\\\r\n" + //
                    "     /       '._ '---' _.'       \\\r\n" + //
                    "    /           '~---~'   |       \\\r\n" + //
                    "   /        _.             \\       \\\r\n" + //
                    "  /   .'-./`/        .'~'-.|\\       \\\r\n" + //
                    " /   /    `\\:       /      `\\'.      \\\r\n" + //
                    "/   |       ;      |         '.`;    /\r\n" + //
                    "\\   \\       ;      \\           \\/   /\r\n" + //
                    " '.  \\      ;       \\       \\   `  /\r\n" + //
                    "   '._'.     \\       '.      |   ;/_\r\n" + //
                    "    /__>     '.       \\_ _ _/   ,  '--.\r\n" + //
                    "   .'   '.   .-~~~~~-. /     |--'`~~-.  \\\r\n" + //
                    "  // / .---'/  .-~~-._/ / / /---..__.'  /\r\n" + //
                    " ((_(_/    /  /      (_(_(_(---.__    .'\r\n" + //
                    "           | |     _              `~~`\r\n" + //
                    "           | |     \\'.\r\n" + //
                    "            \\ '....' |\r\n" + //
                    "             '.,___.' \\   ^__^\n" ;
             
  }
    /**
     * Returns the name of the animal ("monkey").
     * This method overrides the toString method to return the name of the monkey.
     *
     * @return The string "monkey" representing the name of the animal.
     */
  
  @Override
  public String toString() {
    return "monkey";
  }
}
