package Memento;

public class Janela {
	String TextField=new String();
	String[] TextArea=new String[10];
	public String getTextField() {
		return TextField;
	}
	public void setTextField(String textField) {
		TextField = textField;
	}
	public String[] getTextArea() {
		return TextArea;
	}
	public void setTextArea(String[] textArea) {
		TextArea = textArea;
	}
	
	public void addTextArea(String s )
	{
		TextArea[TextArea.length]=s;
	}
	
	 public void imprimeJanela()
	 {
		System.out.println(TextField);
		
		int i;
		
		for(i=0; i<TextArea.length; i++)
		{
			System.out.println(TextArea[i]);
		}
		
		}
	 }
	
	
	
	
	

