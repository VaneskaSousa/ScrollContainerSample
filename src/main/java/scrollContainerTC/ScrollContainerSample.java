package scrollContainerTC;

import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.image.Image;

public class ScrollContainerSample extends Container{
	private ScrollContainer sc;
	private Label lb;
	private ImageControl ic;
	private Image img;
	
	public ScrollContainerSample(){
		setBackColor(0xFFFFFF);
	}
	
	public void initUI(){
		
		lb = new Label("This is a Horizontal ScrollContainer");
		Font ft = Font.getFont(true, Font.NORMAL_SIZE+3);
		lb.setFont(ft);
		add(lb,LEFT+10,TOP+10);
		
		sc = new ScrollContainer(true,false){
			public void initUI(){
				setBackColor(0xEEEEEE);
				try{

					
					img = new Image("img/ft1.png");
					ic = new ImageControl(img);
					ic.scaleToFit = true;
					ic.hwScale = true;
					ic.transparentBackground = true;
					add(ic,LEFT+10,TOP+7,PARENTSIZE+60,PARENTSIZE+90);
					
					img = new Image("img/ft3.png");
					ic = new ImageControl(img);
					ic.scaleToFit = true;
					ic.hwScale = true;
					ic.transparentBackground = true;
					add(ic,AFTER+10,TOP+7,PARENTSIZE+60,PARENTSIZE+90);
					
					img = new Image("img/ft2.png");
					ic = new ImageControl(img);
					ic.scaleToFit = true;
					ic.hwScale = true;
					ic.transparentBackground = true;
					add(ic,AFTER+10,TOP+7,PARENTSIZE+60,PARENTSIZE+90);
					
					
				}catch(Exception e){
					
				}
			}
		};
		add(sc,LEFT+5,AFTER+5,PARENTSIZE+95,PARENTSIZE+40);
		
		lb = new Label("This is a ScrollContainer in Vertical");
		lb.setFont(ft);
		add(lb,LEFT+10,AFTER+10);
		
		sc = new ScrollContainer(false,true){
			public void initUI(){
				setBackColor(0xEEEEEE);
				try{
					img = new Image("img/ft4.jpg");
					ic = new ImageControl(img);
					ic.scaleToFit = true;
					ic.hwScale = true;
					ic.transparentBackground = true;
					add(ic,CENTER,TOP+7,PARENTSIZE+80,PARENTSIZE+90);
					
					img = new Image("img/ft5.jpg");
					ic = new ImageControl(img);
					ic.scaleToFit = true;
					ic.hwScale = true;
					ic.transparentBackground = true;
					add(ic,CENTER,AFTER+7,PARENTSIZE+80,PARENTSIZE+90);
					
					img = new Image("img/ft6.jpg");
					ic = new ImageControl(img);
					ic.scaleToFit = true;
					ic.hwScale = true;
					ic.transparentBackground = true;
					add(ic,CENTER,AFTER+7,PARENTSIZE+80,PARENTSIZE+90);
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		};
		add(sc,LEFT+5,AFTER+5,PARENTSIZE+95,PARENTSIZE+30);
	}
}
