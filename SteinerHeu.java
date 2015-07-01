import java.util.ArrayList;


public class SteinerHeu {
	
	
	public static void main(String[] args){
		
		STP_Reader input = new STP_Reader(args[0]);
		
		 STP_Reader reader = new STP_Reader( "alue2087.stp" );

	        ArrayList<Edge> edges = reader.get_edges();
	        ArrayList<Integer> terminals = reader.get_terminals();
	        for( Edge edge : edges ) {
	            System.out.println( edge.toString() );
	        }
	            
	        for( Integer i : terminals ) {
	            System.out.println( i );
	        }
	        
	      Steinerproblem problem = reader.toTree();
	      Tree out = new Tree();
	      
	      for(int i=0; i<problem.terminals.size();++i){
	    	 
	    	 ArrayList<Edge> shortestP = problem.dijkstra(terminals.get(i));
	    	 out.addPath(shortestP);
	    	 problem.contract(shortestP);
	    	 
	      }
		
	}
}
