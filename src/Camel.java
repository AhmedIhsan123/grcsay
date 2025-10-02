public class Camel implements Animal {
    @Override
    public String getAnimalArt() {
        // Return ASCII art or description for Camel
        return "                                   __\r\n" + //
                "                     .--.      .'  `.\r\n" + //
                "                   .' . :\\    /   :  L\r\n" + //
                "                   F     :\\  /   . : |        .-._\r\n" + //
                "                  /     :  \\/        J      .' ___\\\r\n" + //
                "                 J     :   /      : : L    /--'   ``.\r\n" + //
                "                 F      : J           |  .<'.o.  `-'>\r\n" + //
                "                /        J             L \\_>.   .--w)\r\n" + //
                "               J        /              \\_/|   . `-__|\r\n" + //
                "               F                        / `    -' /|)\r\n" + //
                "              |   :                    J   '        |\r\n" + //
                "             .'   ':                   |    .    :  \\\r\n" + //
                "            /                          J      :     |L\r\n" + //
                "           F                              |     \\   ||\r\n" + //
                "          F .                             |   :      |\r\n" + //
                "         F  |                             ; .   :  : F\r\n" + //
                "        /   |                                     : J\r\n" + //
                "       J    J             )                ;        F\r\n" + //
                "       |     L           /      .:'                J\r\n" + //
                "    .-'F:     L        ./       :: :       .       F\r\n" + //
                "    `-'F:     .\\    `:.J         :::.             J\r\n" + //
                "      J       ::\\    `:|        |::::\\            |\r\n" + //
                "      J        |:`.    J        :`:::\\            F\r\n" + //
                "       L   :':/ \\ `-`.  \\       : `:::|        .-'\r\n" + //
                "       |     /   L    >--\\         :::|`.    .-'\r\n" + //
                "       J    J    |    |   L     .  :::: :`, /\r\n" + //
                "        L   F    J    )   |        >::   : /\r\n" + //
                "        |  J      L   F   \\     .-.:'   . /\r\n" + //
                "        ): |     J   /     `-   | |   .--'\r\n" + //
                "        /  |     |: J        L  J J   )\r\n" + //
                "        L  |     |: |        L   F|   /\r\n" + //
                "        \\: J     \\:  L       \\  /  L |\r\n" + //
                "         L |      \\  |        F|   | )\r\n" + //
                "         J F       \\ J       J |   |J\r\n" + //
                "          L|        \\ \\      | |   | L\r\n" + //
                "          J L        \\ \\     F \\   F |\r\n" + //
                "           L\\         \\ \\   J   | J   L\r\n" + //
                "          /__\\_________)_`._)_  |_/   \\_____\r\n" + //
                "                              \"\"   `\"\"\"\r\n" + //
                "";
    }

    /**
     * Returns the name of the animal ("camel").
     * This method overrides the toString method to return the name of the cow.
     *
     * @return The string "camel" representing the name of the animal.
     */
    @Override
    public String toString() {
        return "camel";
    }
}
