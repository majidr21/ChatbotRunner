package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatBotAppController
{
	private ChatbotView appView;
	private Chatbot notSoCleverBot;

	/**
	 * Creates a ChatbotAppController and initializes the associated View and
	 * Model objects.
	 */
	public ChatBotAppController()
	{
		setAppView(new ChatbotView(this));
		notSoCleverBot = new Chatbot("Mr. not so clever");

	}

	/**
	 * Allows other objects access to the notSoCleverBot.
	 * 
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}

	/**
	 * Starts the Chatbot application
	 */

	public void start()
	{
		Object startMessage = null;
		String message = appView.displayChatbotConversations(startMessage);
		
		while(!notSoCleverBot.quitChecker(message))
		{
			message = notSoCleverBot.processText(message);
			message = appView.displayChatbotConversations(message);
		}

//		String message = JOptionPane.showInputDialog(null, "Would you like to continue");
//		if (notSoCleverBot.quitChecker(message))
//		{
//			message = notSoCleverBot.processText(message);
//				message = chatbot.view ;
//				
//		}
//
//		JOptionPane.showMessageDialog(null, "We are not done yet...");
	}

	private void quit()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);

	}

	public ChatbotView getAppView()
	{
		return appView;
	}

	public void setAppView(ChatbotView appView)
	{
		this.appView = appView;
	}
}
