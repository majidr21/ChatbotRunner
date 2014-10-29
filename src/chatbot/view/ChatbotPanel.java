package chatbot.view;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatBotAppController;
import javax.swing.JScrollPane;

public class ChatbotPanel extends JPanel
{
	private ChatBotAppController baseController;
	private JButton sampleButton;
	private JTextField sampleField;
	
	public ChatbotPanel(ChatBotAppController baseController)
	{
		setForeground(Color.MAGENTA);
		this.setBaseController(baseController);
		
		sampleButton = new JButton("click on me please :)");
		sampleField = new JTextField(25);
		
		SpringLayout baseLayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		LayoutManager baseLayout = null;
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
		}
		
	});
	
}

	public ChatBotAppController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(ChatBotAppController baseController)
	{
		this.baseController = baseController;
	}
}

