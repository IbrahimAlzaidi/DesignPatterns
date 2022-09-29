package BehavioralDesigns.Memento;

public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data: \nIbrahim\nHarith\n");

        System.out.println(fileWriter + "\n\n");

        //lets save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second set of data: \nAl-Zaidi\n");
        //Checking file content
        System.out.println(fileWriter + "\n\n");
        // let's undo to last save
        caretaker.undo(fileWriter);

        System.out.println(fileWriter + "\n\n");
    }
}