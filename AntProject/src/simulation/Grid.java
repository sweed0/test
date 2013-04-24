package simulation;

/**
 * 
 * Grid class
 * 
 * @author _________
 *
 */
public class Grid {

	//false:��ɫ���ӣ�true����ɫ����
	boolean[][] grid;

	/**
	 * Constructor for the grid.
	 * 
	 * Initial state is that the every cell in the grid is white
	 * 
	 * @param height - height of the grid
	 * @param width - width of the grid
	 */
	public Grid(int height, int width) {
		grid=new boolean[width][height];
	}

	public int getHeight() {
		return grid[0].length;
	}

	public int getWidth() {
		return grid.length;
	}

	/**
	 * ��ȡ��i�е�j�еĸ����Ƿ�Ϊ��ɫ
	 * @param i
	 * @param j
	 * @return
	 */
	public boolean isWhite(int i, int j) {
		if(checkValideXY(i, j)){
			return !grid[i-1][j-1];
		}
		return false;
	}
	
	/**
	 * ��ȡ��i�е�j�еĸ����Ƿ�Ϊ��ɫ
	 * @param i
	 * @param j
	 * @return
	 */
	public boolean isBlack(int i, int j) {
		if(checkValideXY(i, j)){
			return grid[i-1][j-1];
		}
		return false;
	}

	/**
	 * ���õ�i�У���j��Ϊ��ɫ
	 * @param i
	 * @param j
	 */
	public void setWhite(int i, int j) {
		if(checkValideXY(i, j)){
			grid[i-1][j-1]=false;
		}
	}

	/**
	 * ���õ�i�У���j��Ϊ��ɫ
	 * @param i
	 * @param j
	 */
	public void setBlack(int i, int j) {
		if(checkValideXY(i, j)){
			grid[i-1][j-1]=true;
		}
	}
	
	/**
	 * �����ӵ���ɫ�ĳ��෴����ɫ
	 */
	public void changeGridColor(int i,int j){
		if(checkValideXY(i, j)){
			grid[i-1][j-1]=!grid[i-1][j-1];
		}
	}
	
	/**
	 * �ж������Ƿ񳬳�Grid
	 * @param ant
	 * @return
	 */
	public boolean isAntOver(Ant ant){
		return !checkValideXY(ant.getiPos(), ant.getjPos());
	}
	
	/**
	 * ��ӡ����
	 */
	public void print(Ant ant){
		for(int j=0;j<getHeight();j++){
			for(int i=0;i<getWidth();i++){
				if(i==0){
					System.out.print("|");
				}
				if(ant!=null && i==ant.getiPos()-1 && j==ant.getjPos()-1){
					System.out.print((grid[i][j]?1:0)+ant.getCurrentPos()+ant.getDirection().getDirection()+"|");
				}else{
					if(i==ant.getiPos()-1){
						System.out.print(""+(grid[i][j]?1:0)+"       |");
					}else{
						System.out.print(""+(grid[i][j]?1:0)+"|");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("======================");
		System.out.println("");
	}
	
	/**
	 * ��֤x��y�Ƿ񳬳��߽�
	 * @param x
	 * @param y
	 * @return
	 */
	protected boolean checkValideXY(int x,int y){
		if(x>grid.length || x<1 || y>grid.length || y<1){
			return false;
		}
		return true;
	}
}
