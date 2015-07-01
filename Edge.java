
public class Edge{

    private int start;
    private int end;
    private int weight;
    private int orig_start;
    private int orig_end;

    Edge( int start, int end, int weight ) {
        this.start = start;
        this.end = end;
        this.weight = weight;
        this.orig_end=this.end;
        this.orig_start=this.start;
    }

    public String toString()
    {
        return " " + start + " " + end + " " + weight;
    }
}