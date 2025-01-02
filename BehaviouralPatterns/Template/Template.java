package BehaviouralPatterns.Template;

interface ParseFile {

    void openFile();
    void parseFile();
    void closeFile();

    default void parse() {
        openFile();
        parseFile();
        closeFile();
    }
}

class Parser implements ParseFile {

    @Override
    public void openFile() {
        // TODO Auto-generated method stub
        System.out.println("Open file");
    }

    @Override
    public void parseFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parseFile'");
    }

    @Override
    public void closeFile() {
        // TODO Auto-generated method stub
        System.out.println("Close file");
    }
    
    

 }

class XMLParser extends Parser {

    public void parseFile() {
        System.out.println("parse xml file");
    }
    
 }

class CSVParser implements ParseFile {


    @Override
    public void openFile() {
        System.out.println("Open file");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file");
    }

    @Override
    public void parseFile() {
        System.out.println("parse csv file");
    }

    
}



 interface Flow {
    void phase1();
    void phase2();
}

final class FlowManager implements Flow {
    private final Flow flow;

    public FlowManager(Flow flow) {
        this.flow = flow;
    }

    public void startFlow() {
        flow.phase1();
        flow.phase2();
    }

    @Override
    public void phase1() {
        flow.phase1();
    }

    @Override
    public void phase2() {
        flow.phase2();
    }
}

public class Template {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();

        XMLParser xmlParser = new XMLParser();

        xmlParser.parse();

        FlowManager flowManager = new FlowManager(null);
        flowManager.startFlow();

    }
}
