package scrollContainerTC;

import totalcross.sys.Settings;
import totalcross.ui.MainWindow;

public class ScrollContainerTC extends MainWindow {

	public ScrollContainerTC(){
		setUIStyle(Settings.Material);
	}
	
	public void initUI(){
	new ScrollContainerSample().swapToTopmostWindow();
	}
	
}
