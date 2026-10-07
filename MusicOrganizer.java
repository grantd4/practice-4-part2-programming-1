import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
     
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    { 
        files = new ArrayList<>();
        
    }
    //quesiton 1
    public void checkIndex(int index){
        if (index<0 || index>=files.size()){
            System.out.println("INVALID");
        }
    }
    //question 2
    public boolean validIndex(int index) {
        if( index<0 || index>=files.size()){
            return false;
        }
        else {
            return true;
        
        } 
    }
    // question 4&6
    //5: If there are 3 files in the ArrayList, 3 println statements would be needed. However, the number of println statements would depend on how many files are in the collection.
    public void listAllFiles() {
        for(String filename : files)
        {
            System.out.println(filename);
        
        }
    }
    
    
    
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    // question 3
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    //question 7 
    public void listWithIndex()
    {
        for(int position = 0; position < files.size(); position++)
        {
            String filename = files.get(position);
            System.out.println(position + ": " + filename);
        }
    }
    //quesiton 8 and 9
    public void listMatching(String searchString)
    {
        boolean found = false;
        
        for(String filename : files)
        {
            if(filename.contains(searchString))
            {
                System.out.println(filename);
                found = true;
            
            }
        }
        
        if(!found)
        {System.out.println("No files matched.");
    
        }
    }
    // quesiton 3
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
}
