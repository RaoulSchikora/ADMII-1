import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.LinkedList;

public class STP_Reader {

   


    private int number_of_nodes;
    private int number_of_edges;
    private int number_of_terminals;
    
    private ArrayList<Integer> terminals;
    private ArrayList<Edge> edges;


    public STP_Reader(String filename) {

        File f = new File(filename);

        number_of_nodes = 0;
        number_of_edges = 0;
        number_of_terminals = 0;

        terminals = new ArrayList<Integer>();
        edges = new ArrayList<Edge>();


        Pattern edge_pattern = Pattern.compile("E\\s(\\d+)\\s(\\d+)\\s(\\d+)");
        Pattern terminal_pattern = Pattern.compile("T\\s(\\d+)");
                
        try {

            BufferedReader br = new BufferedReader(new FileReader(f));
            
            String line;
            
            while ((line = br.readLine()) != null) {
                Matcher em = edge_pattern.matcher(line);
                if( em.matches() ) {
                    Edge edge = new Edge( Integer.parseInt( em.group(1)), Integer.parseInt(em.group(2)), Integer.parseInt(em.group(3)));
                    edges.add(edge);
                    continue;
                }
                Matcher tm = terminal_pattern.matcher(line);
                if( tm.matches() ) {
                    terminals.add( Integer.parseInt(tm.group(1)) );
                    continue;                    
                }
                
            }    
            br.close();           
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOexecption");
        }
        
    }

    public ArrayList<Edge> get_edges() {
        return edges;

    }

    public ArrayList<Integer> get_terminals() {
        return terminals;
    }

    public int get_number_of_nodes() {
        return number_of_nodes;
    }

    public int get_number_of_edges() {
        return number_of_edges;
    }

    public int get_number_of_terminals() {
        return number_of_terminals;
    }

  
    
    public Steinerproblem toTree(){
    	Steinerproblem tree = new Steinerproblem(this.number_of_nodes, this.number_of_edges, this.edges, this.terminals);
    	return tree;
    	
    }

}


