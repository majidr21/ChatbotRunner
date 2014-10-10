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
		
		
		output = JOptionPane.showInputDialog(null, baseControler.getNotSoCleverBot().getName() + "says hello, who are you?");
		
		
		return output;
	}

	/**
	 * Displays the supplied input via a popup window.
	 * @param input The text to be displayed.
	 * @return The users input.
	 */
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	}

		
	
