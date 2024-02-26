/*5. Write a Class CheckTriangular within that implement methods to check whether a matrix is
i) Lower triangular ii) Upper triangular iii) Diagonal iv) Identity v) Tridiagonal.
 * 
 */


package Pdf1;
class CheckTriangular<T extends Number>{
	private T[][] matrix;
	private int row;
	private int col;
	
	public CheckTriangular(T[][] matrix) {
		this.matrix = matrix;
		this.row = matrix.length;
		this.col = matrix[0].length;
	}
	
	public void show() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public boolean isLowertriangular() {
		if(row!=col) {
			System.out.println("Matrix should be square matrix");
			return false;
		}else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(j>i) {
						if(matrix[i][j] instanceof Integer) {
							if(!matrix[i][j].equals(0)) {
								return false;
							}
						}
						if(matrix[i][j] instanceof Double) {
							if(!matrix[i][j].equals(0.0)) {
								return false;
							}
						}
						if(matrix[i][j] instanceof Float) {
							if(!matrix[i][j].equals(0.0f)) {
								return false;
							}
						}
					}
				}
			}
			
			return true;
		}
		
	}
	
	public boolean isUppertriangular() {
		if(row!=col) {
			System.out.println("Matrix should be square matrix");
			return false;
		}else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(j<i) {
						if(matrix[i][j] instanceof Integer) {
							if(!matrix[i][j].equals(0)) {
								return false;
							}
						}
						if(matrix[i][j] instanceof Double) {
							if(!matrix[i][j].equals(0.0)) {
								return false;
							}
						}
						if(matrix[i][j] instanceof Float) {
							if(!matrix[i][j].equals(0.0f)) {
								return false;
							}
						}
					}
				}
			}
			
			return true;
		}
		
	}
	
	public boolean isDiagonal() {
		if(row!=col) {
			System.out.println("Matrix should be square matrix");
			return false;
		}else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(matrix[i][j] instanceof Integer) {
						if((i!=j) && (!matrix[i][j].equals(0))) {
							return false;
						}
					}
					if(matrix[i][j] instanceof Double) {
						if((i!=j) && (!matrix[i][j].equals(0.0))) {
							return false;
						}
					}
					if(matrix[i][j] instanceof Float) {
						if((i!=j) && (!matrix[i][j].equals(0.0f))) {
							return false;
						}
					}
				}
			}
			
			return true;
		}
		
	}
	
	public boolean Identity() {
		if(row!=col) {
			System.out.println("Matrix should be square matrix");
			return false;
		}else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(matrix[i][j] instanceof Integer) {
						if((i!=j) && (!matrix[i][j].equals(0))) {
							return false;
						}
						if((i==j) && (!matrix[i][j].equals(1))) {
							return false;
						}
					}
					if(matrix[i][j] instanceof Double) {
						if((i!=j) && (!matrix[i][j].equals(0.0))) {
							return false;
						}
						if((i==j) && (!matrix[i][j].equals(1.0))) {
							return false;
						}
					}
					if(matrix[i][j] instanceof Float) {
						if((i!=j) && (!matrix[i][j].equals(0.0f))) {
							return false;
						}
						if((i==j) && (!matrix[i][j].equals(1.0f))) {
							return false;
						}
					}
				}
			}
			
			return true;
		}
	}
	
	public boolean Istridiagonal() {
		if(row!=col) {
			System.out.println("Matrix should be square matrix");
			return false;
		}else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(matrix[i][j] instanceof Integer) {
						if((i==j) || (i-1==j) || (i+1==j)) {
							if(matrix[i][j].equals(0)) {
								return false;
							}
						}else {
							if(!matrix[i][j].equals(0)) {
								return false;
							}
						}
					}
					if(matrix[i][j] instanceof Double) {
						if((i==j) || (i-1==j) || (i+1==j)) {
							if(matrix[i][j].equals(0.0)) {
								return false;
							}
						}else {
							if(!matrix[i][j].equals(0.0)) {
								return false;
							}
						}
					}
					if(matrix[i][j] instanceof Float) {
						if((i==j) || (i-1==j) || (i+1==j)) {
							if(matrix[i][j].equals(0.0f)) {
								return false;
							}
						}else {
							if(!matrix[i][j].equals(0.0f)) {
								return false;
							}
						}
					}
					
				}
			}
			
			return true;
		}
	}
}
public class Pdf1_qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] a1 = {{1,0,0},{2,3,0},{4,5,6}};
		CheckTriangular<Integer> mat = new CheckTriangular<>(a1);
		System.out.println("Matrix1 is : ");
		mat.show();
		System.out.println("Is matrix1 lower triangular ? "+mat.isLowertriangular());
		System.out.println("Is matrix1 upper triangular ? "+mat.isUppertriangular());
		System.out.println("Is matrix1 diagonal? "+mat.isDiagonal());
		
		System.out.println();
		Integer[][] a2 = {{1,2,4},{0,3,5},{0,0,6}};
		CheckTriangular<Integer> mat2 = new CheckTriangular<>(a2);
		System.out.println("Matrix2 is : ");
		mat2.show();
		System.out.println("Is matrix2 lower triangular ? "+mat2.isLowertriangular());
		System.out.println("Is matrix2 upper triangular ? "+mat2.isUppertriangular());
		
		System.out.println();
		Double[][] a3 = {{2.0,0.0,0.0},{0.0,2.0,0.0},{0.0,0.0,2.0}};
		CheckTriangular<Double> mat3 = new CheckTriangular<>(a3);
		System.out.println("Matrix3 is : ");
		mat3.show();
		System.out.println("Is matrix3 lower triangular ? "+mat3.isLowertriangular());
		System.out.println("Is matrix3 upper triangular ? "+mat3.isUppertriangular());
		System.out.println("Is matrix3 diagonal? "+mat3.isDiagonal());
		System.out.println("is matrix3 is identity?"+mat3.Identity());
		
		System.out.println();
		Double[][] a4 = {{1.0,0.0,0.0},{0.0,1.0,0.0},{0.0,0.0,1.0}};
		CheckTriangular<Double> mat4 = new CheckTriangular<>(a4);
		System.out.println("Matrix4 is : ");
		mat4.show();
		System.out.println("Is matrix4 lower triangular ? "+mat4.isLowertriangular());
		System.out.println("Is matrix4 upper triangular ? "+mat4.isUppertriangular());
		System.out.println("Is matrix4 diagonal? "+mat4.isDiagonal());
		System.out.println("is matrix4 identity?"+mat4.Identity());
		System.out.println("Is matrix4 tridiagonal?"+mat4.Istridiagonal());
		
		
		System.out.println();
		Double[][] a5 = {{3.0,5.0,0.0,0.0,0.0},{2.0,1.0,3.0,0.0,0.0},{0.0,3.0,4.0,2.0,0.0},{0.0,0.0,5.0,1.0,2.0},{0.0,0.0,0.0,5.0,2.0}};
		CheckTriangular<Double> mat5 = new CheckTriangular<>(a5);
		System.out.println("Matrix5 is : ");
		mat4.show();
		System.out.println("Is matrix5 lower triangular ? "+mat5.isLowertriangular());
		System.out.println("Is matrix5 upper triangular ? "+mat5.isUppertriangular());
		System.out.println("Is matrix5 diagonal? "+mat5.isDiagonal());
		System.out.println("is matrix5 identity?"+mat5.Identity());
		System.out.println("Is matrix5 tridiagonal?"+mat5.Istridiagonal());

	}

}

/*
	Output:
	Matrix1 is : 
	1 0 0 
	2 3 0 
	4 5 6 
	Is matrix1 lower triangular ? true
	Is matrix1 upper triangular ? false
	Is matrix1 diagonal? false
	
	Matrix2 is : 
	1 2 4 
	0 3 5 
	0 0 6 
	Is matrix2 lower triangular ? false
	Is matrix2 upper triangular ? true
	
	Matrix3 is : 
	2.0 0.0 0.0 
	0.0 2.0 0.0 
	0.0 0.0 2.0 
	Is matrix3 lower triangular ? true
	Is matrix3 upper triangular ? true
	Is matrix3 diagonal? true
	is matrix3 is identity?false
	
	Matrix4 is : 
	1.0 0.0 0.0 
	0.0 1.0 0.0 
	0.0 0.0 1.0 
	Is matrix4 lower triangular ? true
	Is matrix4 upper triangular ? true
	Is matrix4 diagonal? true
	is matrix4 identity?true
	Is matrix4 tridiagonal?false
	
	Matrix5 is : 
	1.0 0.0 0.0 
	0.0 1.0 0.0 
	0.0 0.0 1.0 
	Is matrix5 lower triangular ? false
	Is matrix5 upper triangular ? false
	Is matrix5 diagonal? false
	is matrix5 identity?false
	Is matrix5 tridiagonal?true

*/
