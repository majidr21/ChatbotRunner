package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private String    contentArea;
	
	
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0.
	 * @param name the name of the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		// this. means talk to the current class
		numberOfChats = 0;
	    contentArea = "";
	    userInputList = new ArrayList<String>();
		memeList = new ArrayList<String>();
		fillMemeList();
		// this. means talk to the current class
		
	}
	private ArrayList<String> memelist;
	private ArrayList<String> userInputList;
	private ChatUser myUser;
	
	/**
	 * Returns the chatbot's name.
	 * @return Chatbot's name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the number of chats
	 * @return Number of chats
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
	
	/**
	 * Sets the Chatbot's name.
	 * @param name Chatbot's name
	 */
	public void setName(String name)
	
	
	{
	
	
		this.name = name;
	}
	
	/**
	 * Adds 1 to the number of chats.
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}
	
	
	/**
	 * Fills the meme list with memes
	 */
	private void fillMemeList()
	{
		memeList.add("y u mad bro");
		memeList.add("doh!");
		memeList.add("nyan cat");
		memeList.add("velociraptor");
		memeList.add("awkard moment");
		memeList.add("memes");
	}
	
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		for(int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			 
		}
		
		return isAMeme;
	}
	
	/**
	 * Checks for the input "au revoir" to close the app.
	 * @param input The supplied String value.
	 * @return Whether or not it is OK to quit.
	 */



	
	/**
	 * Process the supplied text from the user to provide a message from the Chatbot.
	 * @param userText the user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		
		int randomChoice = (int)(Math.random()* 3);		
		if (userText != null)
		
		if (randomChoice == 0)
		{
			processedText = "that is wayyyyyyyyyyyy too long to read";
		}
		else
		{
			processedText = "short messages are short on meaning";
		}
			//use stringLenthChecker here
		{
		 if(randomChoice ==1)
		{
			 if(contentChecker(userText))
			 {
				 processedText = "you know that the secret invloves: " + userText;
			 }
			 else
			 {
				 processedText = "";
			 }
		}
		 else if (randomChoice == 2)
		 {
			//use contentChecker here
		}
		{
		if(memeChecker(userText))
		{
			processedText = "hey, you found a meme: " + userText;
			processedText = " isn'that cool: ";
		}
		else
		{
			processedText = "Boring, that wasn't a meme.";
			processedText = "You're boring me, I think im going to leave";
		}
			}
		if(randomChoice ==3)
		{
			//User based talking
		}
		else
		{
			//userInput list add
		}
		
		return processedText;
		}
	}
	
	private boolean contentChecker(String userText)
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Checks if the user has asked to quit.
	 * @param input Text typed by user.
	 */
		
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equals("goodbye"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}
	
	@SuppressWarnings("unused")
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
		
		return matchesInput;
	}
	public String getContentArea()
	{
		return contentArea;
	}

	public void setContentArea(String contentArea)
	{
		this.contentArea = contentArea;
	}

	public ChatUser getMyUser()
	{
		return myUser;
	}

	public void setMyUser(ChatUser myUser)
	{
		this.myUser = myUser;
	}

	public ArrayList<String> getMemelist()
	{
		return memelist;
	}

	public void setMemelist(ArrayList<String> memelist)
	{
		this.memelist = memelist;
	}
}


