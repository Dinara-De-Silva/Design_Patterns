package Bahavioral_Command;

import java.util.ArrayList;
import java.util.List;

interface TextFileOperator{
    void execute();
}

class OpenOperator implements TextFileOperator{
    TextFile file;
    public OpenOperator(TextFile file){this.file=file;}
    @Override
    public void execute() {
        file.openFile();
    }
}
class SaveOperator implements TextFileOperator{
    TextFile file;
    public SaveOperator(TextFile file){this.file=file;}
    @Override
    public void execute() {
        file.saveFile();
    }
}

class TextFile{
    private String name;

    public TextFile(String name){this.name=name;}
    public void openFile(){
        System.out.println(name+" file opened.");
    }
    public void saveFile(){
        System.out.println(name+" file saved.");
    }
}

class Executor {
    private final List<TextFileOperator> textFileOperators = new ArrayList<>();
    public void executeOperation(TextFileOperator operation){
        textFileOperators.add(operation);
        operation.execute();
    }
}

public class CommandApplication{
    public static void main(String Arg[]){
        Executor executor=new Executor();
        executor.executeOperation(new OpenOperator(new TextFile("abc.txt")));
        executor.executeOperation(new SaveOperator(new TextFile("efgh.docz")));
    }
}