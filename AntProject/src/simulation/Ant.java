package simulation;

import core.Direction;

/**
 * 
 * Ant class
 * 
 * @author _________
 *
 */
public class Ant {
	
	private int iPos;
	private int jPos;
	private Direction direction;
	
	/**
	 * 
	 * @param iPos ���ϵ�x��λ�ã���1��ʼ
	 * @param jPos ���ϵ�y��λ�ã���1��ʼ
	 * @param direction ���ϵĵ�ǰ����
	 */
	public Ant(int iPos, int jPos, Direction direction){
		this.iPos=iPos;
		this.jPos=jPos;
		this.direction=direction;
	}
	
	/**
	 * ����ת��ǰ��һ��
	 * @return 
	 */
	public void moveLeft(){
		if(direction==Direction.EAST){
			direction=Direction.NORTH;
			jPos-=1;
		}else if(direction==Direction.SOUTH){
			direction=Direction.EAST;
			iPos+=1;
		}else if(direction==Direction.WEST){
			direction=Direction.SOUTH;
			jPos+=1;
		}
		else if(direction==Direction.NORTH){
			direction=Direction.WEST;
			iPos-=1;
		}
	}
	
	/**
	 * ����ת��ǰ��һ��
	 * @return 
	 */
	public void moveRight(){
		if(direction==Direction.EAST){
			direction=Direction.SOUTH;
			jPos+=1;
		}else if(direction==Direction.SOUTH){
			direction=Direction.WEST;
			iPos-=1;
		}else if(direction==Direction.WEST){
			direction=Direction.NORTH;
			jPos-=1;
		}
		else if(direction==Direction.NORTH){
			direction=Direction.EAST;
			iPos+=1;
		}
	}

	/**
	 * ������������
	 * @return
	 */
	public String getCurrentPos(){
		return new StringBuffer("(").append(getiPos()).append(",").append(getjPos()).append(")").toString();
	}
	
	public int getiPos() {
		return iPos;
	}

	public void setiPos(int iPos) {
		this.iPos = iPos;
	}

	public int getjPos() {
		return jPos;
	}

	public void setjPos(int jPos) {
		this.jPos = jPos;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}
