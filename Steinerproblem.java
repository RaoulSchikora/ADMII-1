import java.util.ArrayList;


public class Steinerproblem {
	public int nnodes, nedges;
	public ArrayList<Edge> edgelist;
	public ArrayList<Integer> terminals;
	
	public Steinerproblem(int nnodes, int nedges, ArrayList<Edge> edges, ArrayList<Integer> terminals){
		this.nnodes=nnodes;
		this.nedges=nedges;
		this.edgelist = (ArrayList<Edge>) edges.clone();
		this.terminals= (ArrayList<Integer>) terminals.clone();
	}


	public ArrayList<Edge> dijkstra(Integer integer) {
		// TODO Auto-generated method stub
		return null;
	}

	public void contract(ArrayList<Edge> shortestP) {
		// TODO Auto-generated method stub
		
	}
	
}
