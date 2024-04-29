package DepthFirstSearch;

import java.util.Arrays;

public class SumofDistancesinTreeAns2 {

	public static int[][] graph;
	public static int[] count;
    public static int[] res;
	public static int N;
	
	public static void dfs1(int cur, int parent) {
        for (int child : graph[cur]) {
            if (child != parent) {
                dfs1(child, cur);
                count[cur] += count[child];
                res[cur] += res[child] + count[child];
            }
        }
    }
	
    public static void dfs2(int cur, int parent) {
        for (int child : graph[cur]) {
            if (child != parent) {
                res[child] = res[cur] + N - 2 * count[child];
                dfs2(child, cur);
            }
        }
    }
	
	public static int[] sumOfDistancesInTree(int n, int[][] edges) {
        N = n;
        res = new int[N];
        graph = new int[N][];
        count = new int[N];
        
        for (int[] e : edges) {
            ++count[e[0]];
            ++count[e[1]];
        }
        for (int i = 0; i < N; i++) {
            graph[i] = new int[count[i]];
        }
        for (int[] e : edges) {
            graph[e[0]][--count[e[0]]] = e[1];
            graph[e[1]][--count[e[1]]] = e[0];
        }
        
        Arrays.fill(count, 1);
        
        dfs1(0, -1);
        dfs2(0, -1);
        return res;
    }

	public static void main(String[] args) {
		int[][] edges = { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 } };
		System.out.println(Arrays.toString(sumOfDistancesInTree(6, edges)));

	}

}
