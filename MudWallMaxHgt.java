/**
 * 
 */
package com.alg.top20.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sudha
 *
 */
public class MudWallMaxHgt {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//The first line contains an integer, n, the number of elements in stickPositions
		int n = Integer.parseInt(br.readLine());

		int stickPos[] = new int[n];
		//Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, stickPositions[i].
		for(int i=0;i<n; i++) {
			stickPos[i] = Integer.parseInt(br.readLine());
		}

		//The next line contains the integer, n, the number of elements in stickHeights.
		int noOfEle = Integer.parseInt(br.readLine());
			
		//Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, stickHeights[i].
		int stickHeights[] = new int[n];
		int max=0;
		for(int i=0;i<noOfEle; i++) {
			stickHeights[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, stickHeights[i]);
		}
		
		/*
		 * int a[][] = new int[max][stickPos[n-1]];
		 * 
		 * for(int i=0;i<n;i++){ for(int j=0;j<stickHeights[i];j++){
		 * 
		 * a[j][i] = stickHeights[i]; } }
		 */
		
		System.out.println(findMaxH(stickPos,stickHeights));

	}

	private static int findMaxH(int[] stickPos, int[] stickHeights) {
		int n = stickPos.length;
        int max = 0;
 
        for (int i=0; i<n-1; i++) {
        	
            if (stickPos[i]<stickPos[i+1]-1) {
                int hitDiff =  Math.abs(stickHeights[i+1] - stickHeights[i]);
                int gapLen = stickPos[i+1] - stickPos[i] - 1;
                int remain = 0;
                if (gapLen > hitDiff) {
                    int low = Math.max(stickHeights[i+1], stickHeights[i]) + 1;
                    int remainingGap = gapLen - hitDiff - 1;
                    remain = low + remainingGap/2;
 
                } else {
                	remain = Math.min(stickHeights[i+1], stickHeights[i]) + gapLen;
                }
 
                max = Math.max(max, remain);
            }
        }
 
        return max;
		
	}

}
