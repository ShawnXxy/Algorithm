package sort.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestInSortedMatrix {
	
	/**
	 * Dijkstra's Algorithm: 
	 * Expand node at [i][j] and generate nodes of [i + i][j] and [i][j + 1]
	 * Until kth node is poped out the priority queue
	 * 
	 * Time :
	 * 	
	 * 	generate 2 nodes: 2logk = logk
	 * 	poll() from pq: logk since only k elements in pq
	 * 
	 * 	poll() k times: klogk
	 * 
	 * @author ShawnX
	 *
	 */
	
	class Cell {
		public int row;
		public int col;
		public int key;
		public Cell(int row, int col, int key) {
			this.row = row;
			this.col = col;
			this.key = key;
		}
	}
	
	public int kthSmallest(int[][] matrix, int k) {
		// assumption :
		// 1, matrix is not null;
		// 2, rows != 0 && cols != 0
		// 3, k <= rows * cols.
		int rows = matrix.length;
		int cols = matrix[0].length;
		PriorityQueue<Cell> minHeap = new PriorityQueue<>(k, new Comparator<Cell>() {
			@Override
			public int compare(Cell c1, Cell c2) {
				if (c1.key == c2.key) {
					return 0;
				}
				if (c1.key < c2.key) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		boolean[][] visited = new boolean[rows][cols];
		minHeap.offer(new Cell(0, 0, matrix[0][0]));
		visited[0][0] = true;
		for (int i = 0; i < k - 1; i++) {
			Cell cur = minHeap.poll();
			if (cur.row + 1 < rows && !visited[cur.row + 1][cur.col]) {
				minHeap.offer(new Cell(cur.row + 1, cur.col, matrix[cur.row + 1][cur.col]));
				visited[cur.row + 1][cur.col] = true;
			}
			if (cur.col + 1 < cols && !visited[cur.row][cur.col + 1]) {
				minHeap.offer(new Cell(cur.row, cur.col + 1, matrix[cur.row][cur.col + 1]));
				visited[cur.row][cur.col + 1] = true;
			}
		}
		return minHeap.peek().key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestInSortedMatrix solution = new KthSmallestInSortedMatrix();
		// test case 1
		int[][] matrix = new int[][] {
														{},
														};
	}

}
