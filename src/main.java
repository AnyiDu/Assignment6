import javax.swing.*;



	public class main {
		public static void main(String[] args) {

			JFrame frame = new JFrame("Main");//set the width and height
			frame.setSize(400, 250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();//create panel
			frame.add(panel);//add panel
			myFrame frame1 = new myFrame();
			frame1.placeComponents(panel);
			frame.setVisible(true);

		}
	}

