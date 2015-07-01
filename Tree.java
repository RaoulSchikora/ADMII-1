import java.util.ArrayList;


public class Tree {
	int nnodes;
	int nedges;
	
	public ArrayList<Edge> edgelist;
	
	
	public Tree(){
		this.nnodes=0;
		this.nedges=0;
		this.edgelist= new ArrayList<Edge>();
	}
	
	

	public void addPath(ArrayList<Edge> shortestP) {
		
		
			edgelist.addAll(shortestP);
			this.nedges+=shortestP.size();
			if(this.nnodes==0)this.nnodes+=shortestP.size()/2;
			else this.nnodes+=shortestP.size()/2-1;
		
		
	}
}
