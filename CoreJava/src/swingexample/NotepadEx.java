package swingexample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JSeparator;
import java.io.FileNotFoundException;
class Notepad extends JFrame {
	Container c;
	JTextArea text;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem fileNew,fileOpen,fileSave,fileExit,editCut,editCopy,editPaste,helpAbout;
	Notepad(){
		setTitle("Document.txt");
		setSize(1000,600);
		this.setLocationRelativeTo(null);
		c=this.getContentPane();
		Font font =new Font("Arial",Font.BOLD,30);
		text=new JTextArea();
		text.setFont(font);
		c.add(new JScrollPane(text),BorderLayout.CENTER);
		mb=new JMenuBar();
		this.setJMenuBar(mb);
		file =new JMenu("File");
		fileNew=new JMenuItem("New");
		fileNew.addActionListener((ActionEvent)-> {
			text.setText("");
			this.setTitle("Document1.txt");
			});
		fileOpen=new JMenuItem("Open");
		fileOpen.addActionListener((ActionEvent)->{
			JFileChooser fileChooser =new JFileChooser();
			FileNameExtensionFilter filter=new FileNameExtensionFilter("Text File(*.txt)","txt");
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(filter);
			int action=fileChooser.showOpenDialog(this);
			if(action==JFileChooser.APPROVE_OPTION) {
				try {
					BufferedReader br =new BufferedReader(new FileReader(fileChooser.getSelectedFile().toString()));
				    text.read(br, font);
				    this.setTitle(fileChooser.getSelectedFile().getName());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				return;
			}
		});
		fileSave=new JMenuItem("Save");
		fileSave.addActionListener((ActionEvent)->{
			JFileChooser fileChooser =new JFileChooser();
			FileNameExtensionFilter filter=new FileNameExtensionFilter("Text File(*.txt)","txt");
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(filter);
			int action=fileChooser.showSaveDialog(this);
			if(action==JFileChooser.APPROVE_OPTION) {
				try {
					BufferedWriter wr =new BufferedWriter(new FileWriter(fileChooser.getSelectedFile().toString()));
				    text.write(wr);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				return;
			}
		});
		
		fileExit=new JMenuItem("Exit");
		fileExit.addActionListener((ActionEvent)->System.exit(0));
		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		file.add(new JSeparator());
		file.add(fileExit);
		edit =new JMenu("Edit");
		editCut=new JMenuItem("Cut");
		editCut.addActionListener((ActionEvent)->text.cut());
		editCopy=new JMenuItem("Copy");
		editCopy.addActionListener((ActionEvent)->text.copy());
		editPaste=new JMenuItem("Paste");
		editPaste.addActionListener((ActionEvent)->text.paste());
		edit.add(editCut);
		edit.add(editCopy);
		edit.add(editPaste);
		help=new JMenu("Help");
		helpAbout=new JMenuItem("About");
		
		help.add(helpAbout);
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class NotepadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Notepad();
	}

}
