public class URL {
    private String schema;
    private String login;
    private String passphrase;
    private String hote;
    private String chemin;
    private Integer port;

    // Constructeur sans argument
    public URL() {
        // Ne fait rien
    }

    // Getters
    public String getSchema() {
        return schema;
    }

    public String getLogin() {
        return login;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public String getHote() {
        return hote;
    }

    public String getChemin() {
        return chemin;
    }

    public Integer getPort() {
        return port;
    }
}
