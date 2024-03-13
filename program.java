public class NetworkFixer {
    private boolean cellularConnected;
    private boolean internetConnected;

    public NetworkFixer() {
        // Initialize with both cellular and internet disconnected
        this.cellularConnected = false;
        this.internetConnected = false;
    }

    public void connectToCellular() {
        // Simulate connecting to cellular network
        this.cellularConnected = true;
        System.out.println("Connected to cellular network.");
    }

    public void connectToInternet() {
        // Simulate connecting to internet
        this.internetConnected = true;
        System.out.println("Connected to internet.");
    }

    public void fixNetworkIssues() {
        if (!cellularConnected) {
            connectToCellular();
        }

        if (!internetConnected) {
            connectToInternet();
        }

        System.out.println("Network issues fixed.");
    }

    public static void main(String[] args) {
        NetworkFixer fixer = new NetworkFixer();
        fixer.fixNetworkIssues();
    }
}
