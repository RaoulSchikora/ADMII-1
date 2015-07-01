import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * class for the writer of the stp
 * @author raoul schikora
 *
 */
public class STPwriter {
	
	public Tree tree;
	
	int numberEdges;
	
	int cost;
	
	/**
	 * default constructor
	 */
	public STPwriter() {
		
	}
	/**
	 * constructor that is given a tree for the STP
	 * @param tree
	 */
	public STPwriter(Tree tree){
		this.tree = tree;
		this.numberEdges = tree.nedges;
		for(int i = 0; i < this.tree.edgelist.size(); i++){
			this.cost += this.tree.edgelist.get(i).orig_weight;
		}
	}

	/**
	 * method to write to file
	 * @param filename
	 * @throws IOException 
	 */
	public void writeToFile(String filename) throws IOException{
		BufferedWriter output = null;
        try {
            File file = new File(filename + ".txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(String.valueOf(this.cost));
            output.write(System.lineSeparator());
            output.write(String.valueOf(this.numberEdges));
            output.write(System.lineSeparator());
            for(int i = 0; i<this.tree.edgelist.size(); i++){
            	output.write(String.valueOf(this.tree.edgelist.get(i).start));
            	output.write(" ");
            	output.write(String.valueOf(this.tree.edgelist.get(i).end));
            	output.write(System.lineSeparator());
            }
            System.out.println("file printed successfully");
            
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if ( output != null ) output.close();
        }
	}
}
