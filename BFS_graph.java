import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_graph {
    static class Edge {
        int source;
        int dest;// destination
        int wt;// wight

        Edge(int s, int d, int w) {
            this.source = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void add(ArrayList<Edge>[] grap) {
        
        for (int i = 0; i < grap.length; i++) {
            grap[i] = new ArrayList<>();
        }
        // // 0
        // grap[0].add(new Edge(0, 1, 5));
        // // 1
        // grap[1].add(new Edge(1, 0, 5));
        // grap[1].add(new Edge(1, 2, 1));
        // grap[1].add(new Edge(1, 3, 3));
        // // 2
        // grap[2].add(new Edge(2, 1, 1));
        // grap[2].add(new Edge(2, 3, 1));
        // grap[2].add(new Edge(2, 4, 1));
        // // 3
        // grap[3].add(new Edge(3, 1, 3));
        // grap[3].add(new Edge(3, 2, 1));
        // // 4
        // grap[4].add(new Edge(4, 2, 2));
        // BFS(grap);


          // 0
        grap[0].add(new Edge(0, 1, 5));
        grap[0].add(new Edge(0, 2, 5));
        // 1
        grap[1].add(new Edge(1, 0, 5));
        grap[1].add(new Edge(1, 3, 1));
        // 2
        grap[2].add(new Edge(2, 0, 1));
        grap[2].add(new Edge(2, 4, 1));
        // 3
        grap[3].add(new Edge(3, 1, 3));
        grap[3].add(new Edge(3, 4, 1));
        grap[3].add(new Edge(3, 5, 1));
        // 4
        grap[4].add(new Edge(4, 2, 2));
        grap[4].add(new Edge(4, 3, 2));
        grap[4].add(new Edge(4, 5, 2));
        //5
        grap[5].add(new Edge(5, 3, 2));
        grap[5].add(new Edge(5, 4, 2));
        grap[5].add(new Edge(5, 6, 2));
        //6
        grap[6].add(new Edge(6, 5, 9));
    }

    public static void BFS(ArrayList<Edge>[] grap) {

        boolean vis[] = new boolean[grap.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int crr = q.remove();
            if (!vis[crr]) {
                System.out.println(crr);
                vis[crr] = true;
                for (int i = 0; i < grap[crr].size(); i++) {
                    Edge e = grap[crr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge>[] grap,int crr,boolean vis[]) {
        System.out.print(crr+" ");
        vis[crr]=true;
        for (int i = 0; i < grap[crr].size(); i++) {
            Edge e=grap[crr].get(i);
            if(!vis[e.dest]){
                DFS(grap, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        int v = 8;
        ArrayList<Edge>[] grap = new ArrayList[v];
        add(grap);
        //BFS(grap);
        DFS(grap, 0, new boolean[v]);
    }
}
