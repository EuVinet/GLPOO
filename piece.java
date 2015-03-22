import java.awt.Point;

public class Piece {

	private Face faces[];	
		
	public Piece(Face faceOuestPiece, Face faceNordPiece, Face faceEstPiece, Face faceSudPiece){
		faces[0] = faceOuestPiece;
		faces[1] = faceNordPiece;
		faces[2] = faceEstPiece;
		faces[3] = faceSudPiece;
	}
	
	public Face getFace(int nb){
		return faces[nb];
	}
			
	public void rotateDirect(){
		Face temp = faces[0];
		faces[0]=faces[1];
		faces[1]=faces[2];
		faces[2]=faces[3];
		faces[3]=temp;
	}	
	
	public void rotateIndirect(){
		Face temp = faces[0];
		faces[0]=faces[3];
		faces[3]=faces[2];
		faces[2]=faces[1];
		faces[1]=temp;
	}
	
}
