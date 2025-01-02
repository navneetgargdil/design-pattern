package BehaviouralPatterns.Template;

class ParseCSVWithout {

    public void parseFile() {
        openFile();
        System.out.println("parse csv");
        closeFile();
    }
    private void openFile() {
        System.out.println("Open File.");
    }
    private void closeFile() {
        System.out.println("Close File.");
    }

}

class ParseXMLWithout {

    public void parseFile() {
        openFile();
        System.out.println("parse xml");
        closeFile();
    }
    private void openFile() {
        System.out.println("Open File.");
    }
    private void closeFile() {
        System.out.println("Close File.");
    }

}


public class WithoutTemplate {
    public static void main(String[] args) {
        
        ParseCSVWithout csvWithout = new ParseCSVWithout();
        csvWithout.parseFile();
    }
}
