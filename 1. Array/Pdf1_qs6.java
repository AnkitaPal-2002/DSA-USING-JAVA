/*
 * 6. Write a program to find whether a matrix is orthogonal or not. Also find the 1-norm of the
matrix.
 */
package Pdf1;
import java.lang.reflect.Array;
import java.util.*;
class Matrix<T extends Number>{
	private T[][] mat;
	private int row;
	private int col;
	Matrix(T[][] mat){
		this.mat = mat;
		this.row = mat.length;
		this.col = mat[0].length;
	}
	
	public void show() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//calculating transpose matrix
	public Matrix<T> transpose() {
		@SuppressWarnings("unchecked")
		//T[][] res = (T[][]) new Object[col][row];
		T[][] res = (T[][])Array.newInstance(mat[0][0].getClass(), col, row);
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[j][i] = mat[i][j];
			}
		}
		
		return new Matrix<>(res);
	}
	
	//multiplication of the two matrixes
	public Matrix<T> multiply(Matrix mat1){
		@SuppressWarnings("unchecked")
		T[][] res = (T[][])Array.newInstance(mat[0][0].getClass(), this.row, mat1.col);
		for(int i=0;i<this.row;i++) {
			for(int j = 0;j<mat1.col;j++) {
				T sum = (T)Integer.valueOf(0);
				
				for(int k=0;k<this.col;k++) {
					T cell = (T) Double.valueOf(this.mat[i][k].doubleValue()*mat1.mat[k][j].doubleValue());
					sum = (T) Integer.valueOf(sum.intValue()+cell.intValue());
					
				}
				res[i][j] = sum;
				
			}
		}
		
		return new Matrix<>(res);
	}
	
	public boolean isIdentity() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if((i==j) && (!this.mat[i][j].equals(1))) {
					return false;
				}
				if((i!=j) && (!this.mat[i][j].equals(0))) {
					return false;
				}
			}
			
			
		}
		return true;
	}
	
	
}
public class Pdf1_qs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] arr = {{-1,1},{2,1}};
		Matrix<Integer> mat1=new Matrix<>(arr);
		System.out.println("matrix is : ");
		mat1.show();
		
		Matrix<Integer> transpose=mat1.transpose();
		System.out.println("Transpose of the matrix is : ");
		transpose.show();
		
		Matrix<Integer> multi = mat1.multiply(transpose);
		System.out.println("Multiplication of the matrix is : ");
		multi.show();
		
		System.out.println("Is orthogonal ? "+multi.isIdentity());
		
		

	}

}


/*Output:
 * 
 * 	SET 1:
 * 	matrix is : 
	-1 0 
	0 1 
	Transpose of the matrix is : 
	-1 0 
	0 1 
	Multiplication of the matrix is : 
	1 0 
	0 1 
	Is orthogonal ? true

	SET 2:
	matrix is : 
	-1 1 
	2 1 
	Transpose of the matrix is : 
	-1 2 
	1 1 
	Multiplication of the matrix is : 
	2 -1 
	-1 5 
	Is orthogonal ? false

 * 
 */
