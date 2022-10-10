package testirovaniepr3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Destruction {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        String path = in.nextLine();

	        File file = new File(path);
	        if(!file.exists()){
	            System.out.println("Неправильный путь");
	            return;
	        }

	        recursiveDelete(file);
	    }

	    public static void recursiveDelete(File file){
	    	// если папка вызываем рекурсивное удаление всего
	        if (file.isDirectory()) {
	            for (File f : file.listFiles()) {
	                recursiveDelete(f);
	            }
	        }

	        if(file.isDirectory())
	            file.delete();
	        else {
	            deleteFile(file);
	        }
	    }

	    public static void deleteFile(File file){

	        overwriteFile(file, "1516516565468");
	        overwriteFile(file, "ergkjkregvrekgrek");
	        overwriteFile(file, "wef1ew65f4ew6rv4r8e9vg46f");

	        file.delete();
	    }

	    public static void overwriteFile(File file, String str){
	        FileWriter writer = null;
	        try {
	            writer = new FileWriter(file);
	            // Запись в файл
	            writer.write(str);
	            writer.flush();
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

}
