package Collections.StackExample;

import java.util.Stack;

public class TabManager {


    /* 
     * Let's say we make a Tab Manager:
     * Our user can open a new tab, go back to the old tab, and display all the tabs that are open.
     * Our history is [X,Y,Z] which X is the newest one.
     * When user goes back to the old tab, it closes the old tab.
     * When user opens a new tab, it opens the new tab.
    */



    private Stack<String> tabStack = new Stack<>();

    // A new Tab
    public void openTab(String tab) {
        tabStack.push(tab);
        System.out.println("Opened tab: " + tab);
    }

    // Go back to the old Tab
    public void goBack() {
        if (!tabStack.isEmpty()) {
            String lastTab = tabStack.pop();
            System.out.println("Closed tab: " + lastTab);
        } else {
            System.out.println("No tab to go back.");
        }
    }

    // Display all Tabs
    public void showTabs() {
        System.out.println("Current tabs: " + tabStack);
    }

    public static void main(String[] args) {
        TabManager manager = new TabManager();

        // Open the Tab
        manager.openTab("X");
        manager.openTab("Y");
        manager.openTab("Z");

        // Close the Tab
        manager.goBack(); // Z 
        manager.goBack(); // Y 

        // Display all Tabs
        manager.showTabs(); 
    }
}
