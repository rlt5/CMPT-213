import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;

public class PeerFeedbackProcessor {

    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Need arguments: InputDirectory, OutputDirectory");
        }

        String inputDirectory = args[0];
        String outputDirectory = args[1];

        System.out.println(inputDirectory);
        System.out.println(outputDirectory);

        File inputFolder = new File(inputDirectory);
        File outputFolder = new File(outputDirectory);
        if (inputFolder.isDirectory() == false){
            System.out.println("Invalid input directory");
            return;
        }
        if (outputFolder.isDirectory() == false){
            System.out.println("Invalid output directory");
            return;
        }

    }



    static int inspectInput(String inputDirectory, String outputDirectory){


//        File[] fileList = folder.listFiles(new FileFilter(){
//            @Override
//            public boolean accept(File file){
//                return file.getName().endsWith(".json");
//            }
//        });

//        for (File subFile : fileList){
//            System.out.println(" sub file: " + subFile.getAbsolutePath());
//        }
//        fileList = folder.listFiles();
//        for (File subFile : fileList){
//            System.out.println(" 2sub file: " + subFile.getAbsolutePath());
//        }
//        File[] fileList = folder.listFiles(filter);

//        try{
//            folder.getAbsolutePath();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        return 0;
    }
}
