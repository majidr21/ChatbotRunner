package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotAppController;

public class ChatbotView
{

	
	private ChatBotAppController baseControler;
	
	public ChatbotView(ChatBotAppController baseController)
	{
		this.baseControler = baseController;
	}

	public String displayChatbotConversations(String input)
	{
		String output = "";
		
		
		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + "says hello, who are you?");
		
		
		return output;
	}
}
	
		
		
	
