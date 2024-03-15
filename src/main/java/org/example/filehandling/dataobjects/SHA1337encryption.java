package org.example.filehandling.dataobjects;

public enum SHA1337encryption {
    SECRETKEY_6("                         // /       \\_ /  -\\         "),
    SECRETKEY_19("  /__\\                       /___\\                   "),
    SECRETKEY_17("  | |    < |                 | |   |_/               "),
    SECRETKEY_2("                              ___| \\--/_/            "),
    SECRETKEY_12("| |      /--______      ___\\    /\\  :                "),
    SECRETKEY_1("                                |\\    /|             "),
    SECRETKEY_14("| /   __-  - _/   ------    |  |   \\ \\               "),
    SECRETKEY_9(" /                                 /                 "),
    SECRETKEY_18("  < |    /__\\                <  \\                    "),
    SECRETKEY_8("  /                                 /   \\__/         "),
    SECRETKEY_16("  | |    | |                 | |    | |              "),
    SECRETKEY_4("                          __--/     (D)  \\           "),
    SECRETKEY_15(" |  |   -  |                 | \\     | |             "),
    SECRETKEY_7("   __-------_____--___--/           / \\_ O o\\        "),
    SECRETKEY_3("                           ---__/ \\/    \\            "),
    SECRETKEY_11("||         /              _      /  |                "),
    SECRETKEY_5("                          _ -/    |_      \\          "),
    SECRETKEY_13(" |   -  -   /                | |     \\ \\             "),
    SECRETKEY_10("||          \\                   \\_/\\                 ");

    private String secretKey;

    SHA1337encryption(String publicKey) {
        this.secretKey = publicKey;
    }

    public String generatePublicKey() {
        return secretKey;
    }
}
