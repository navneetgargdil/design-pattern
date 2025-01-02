package BehaviouralPatterns.Template;

abstract class FileParser  {
    public final void parse() {
        openFile();
        parseFile();
        closeFile();
    }

    protected void openFile() {
        System.out.println("open file");
    }

    protected void closeFile() {
        System.out.println("close file");
    }

    protected abstract void parseFile();
    
}

class  CSVParserA extends FileParser {

    @Override
    protected void parseFile() {
        // TODO Auto-generated method stub
        System.out.println("parse CSV File");
    }
    
}

class  XMLParserA extends FileParser {

    @Override
    protected void parseFile() {
        // TODO Auto-generated method stub
        System.out.println("parse XML File");
    }
    
}

public class TemplatePattern {
    public static void main(String[] args) {
        CSVParserA csvParserA = new CSVParserA();
        csvParserA.parse();

        XMLParserA xmlParserA = new XMLParserA();
        xmlParserA.parse();
    }
}
