package reservation;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EquipmentOutlineDialog extends Dialog implements ActionListener,WindowListener,ItemListener{

	
	boolean backed; //backボタンが押されたらtrue 通常時はfalse;
	//-------------------パネル-------------------------//
	Panel panelNorth;
	Panel panelMid;                          //上中下のパネルの配置のための変数を設定
	Panel panelSouth;
	//------------入力用コンポーネント（施設名）---------------//
	ChoiceFacility choiceFacility;
	//------------------ボタン--------------------------//
	Button buttonBacked;
	//------------------------------------------------//
	
	//---------------EquipmentOutlineDialog関数の内容↓----------------//
	public EquipmentOutlineDialog(Frame owner ) {
		super(owner,"施設概要",true);
		// TODO Auto-generated constructor stub
		backed = true;
		
		//----------Backボタンの生成----------------//
		buttonBacked = new Button("Back");
		//----------施設選択ボタンの生成-------------//
		choiceFacility = new ChoiceFacility();
		//-------------パネルの生成----------------//
		panelNorth = new Panel();
		panelMid = new Panel();
		panelSouth = new Panel();
		//--------------------------------------//
		
		//--上部パネルに施設名、中央パネルに施設概要、下部パネルにBackボタンを追加--//
		panelNorth.add(new Label("施設名"));
		panelNorth.add(choiceFacility);
		panelMid.add(new Label("施設名"));
		
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
