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

	
	boolean backed; //back�{�^���������ꂽ��true �ʏ펞��false;
	//-------------------�p�l��-------------------------//
	Panel panelNorth;
	Panel panelMid;                          //�㒆���̃p�l���̔z�u�̂��߂̕ϐ���ݒ�
	Panel panelSouth;
	//------------���͗p�R���|�[�l���g�i�{�ݖ��j---------------//
	ChoiceFacility choiceFacility;
	//------------------�{�^��--------------------------//
	Button buttonBacked;
	//------------------------------------------------//
	
	//---------------EquipmentOutlineDialog�֐��̓��e��----------------//
	public EquipmentOutlineDialog(Frame owner ) {
		super(owner,"�{�݊T�v",true);
		// TODO Auto-generated constructor stub
		backed = true;
		
		//----------Back�{�^���̐���----------------//
		buttonBacked = new Button("Back");
		//----------�{�ݑI���{�^���̐���-------------//
		choiceFacility = new ChoiceFacility();
		//-------------�p�l���̐���----------------//
		panelNorth = new Panel();
		panelMid = new Panel();
		panelSouth = new Panel();
		//--------------------------------------//
		
		//--�㕔�p�l���Ɏ{�ݖ��A�����p�l���Ɏ{�݊T�v�A�����p�l����Back�{�^����ǉ�--//
		panelNorth.add(new Label("�{�ݖ�"));
		panelNorth.add(choiceFacility);
		panelMid.add(new Label("�{�ݖ�"));
		
		
		
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
