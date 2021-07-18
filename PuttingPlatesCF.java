package Arrays;

import java.util.Scanner;

public class PuttingPlatesCF {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0) {
			 int r=in.nextInt();
			 int c=in.nextInt();
			 int a[][]=new int[r][c];
			 if(c%2==0) {
				 for(int j=1;j<c;j+=2) {
					 a[0][j]=1;
				 }
				 for(int i=1;i<r;i++) {
					 for(int j=0;j<c;j++) {
						 boolean flag=true;
						 int y1=i+1;
						 int y2=i-1;
						 int x1=j+1;
						 int x2=j-1;
						 if(x1<c&&y2>=0) {
							 if(a[y2][x1]!=0) {
								 flag=false;
								 continue;
							 }
						 } if(y1<r&&x2>=0) {
							 if(a[y1][x2]!=0) {
								 flag=false;
								 continue;
							 }
						 } if(y1<r&&x1<c) {
							 if(a[y1][x1]!=0) {
								 flag=false;
								 continue;
							 }
						 } if(y2>=0&&x2>=0) {
							 if(a[y2][x2]!=0) {
								 flag=false;
								 continue;
							 }
						 } if(y1<r) {
							 if(a[y1][j]!=0) {
								 flag=false;
								 continue;
							 }
						 } if(y2>=0) {
							 if(a[y2][j]!=0) {
								 flag=false;
								 continue;
							 }
						 } if(x2>=0) {
							 if(a[i][x2]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(x1<c) {
							 if(a[i][x1]!=0) {
								 flag=false;
								 continue;
							 }
						 }
						 
						 if(flag==true) {
							 if((i==r-1)||j==0||j==c-1) {
							 a[i][j]=1;
							 j=j+1;
							 }
							 else
							 {
								 a[i][j]=0;
							 }
						 }
					 }
				 }
			 }
			 else
			 {
				 for(int j=0;j<c;j+=2) {
					 a[0][j]=1;
				 }
				 for(int i=1;i<r;i++) {
					 for(int j=0;j<c;j++) {
						 boolean flag=true;
						 int y1=i+1;
						 int y2=i-1;
						 int x1=j+1;
						 int x2=j-1;
						 if(x1<c&&y2>=0) {
							 if(a[y2][x1]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(y1<r&&x2>=0) {
							 if(a[y1][x2]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(y1<r&&x1<c) {
							 if(a[y1][x1]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(y2>=0&&x2>=0) {
							 if(a[y2][x2]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(y1<r) {
							 if(a[y1][j]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(y2>=0) {
							 if(a[y2][j]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(x2>=0) {
							 if(a[i][x2]!=0) {
								 flag=false;
								 continue;
							 }
						 }if(x1<c) {
							 if(a[i][x1]!=0) {
								 flag=false;
								 continue;
							 }
						 }
						 
						 if(flag==true) {
							 if((i==r-1)||j==0||j==c-1) {
								 a[i][j]=1;
								 j=j+1;
								 }
								 else
								 {
									 a[i][j]=0;
								 }
						 }
					 }
				 }
			 }
			 for(int i=0;i<r;i++) {
				 for(int j=0;j<c;j++) {
					 System.out.print(a[i][j]);
				 }
				 System.out.println();
			 }
			 System.out.println();
			t--;
		}
	}
}
