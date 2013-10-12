**********************************************************************************************
     ______                                                 _____     _______     ______
    /      |         /\      \            /     /\         |     \   |       \   /      \   
           |        /  \      \          /     /  \        |      \  |          |           
           |       /    \      \        /     /    \       |      /  |          |            
           |      /______\      \      /     /______\      |_____/   |----|     |            
           |     /        \      \    /     /        \     |         |          |      __     
    \      |    /          \      \  /     /          \    |         |          |        |    
     \____/    /            \      \/     /            \   |         |_______/   \______/     
    
                                                                    BY- Abhishek Kharche         
**********************************************************************************************


This project is performed in Software Design class as an individual project in University
of Delaware. The Project is written in Java programming language. JavaPEG is an open
source software used to edit the images, it is very lightweight software and simple to 
understand. The objective of project was to extend the software's functionality to make
it efficient. I have selected the GUI of software and tried to extend it so that it can
have multiple choice for viewing images in folder, just like we have option of large
images, small images, details in windows explorer. This project use inbuilt Java Swing 
and AWT packages.

Note:- Project was mainly about Reverse Engineering (UML Diagrams are not included)

**********************************************************************************************

FILES IN THE BUCKET:-

MainGUI.java - Original GUI java file by the software
MainGUI_Edit.java -  Edited GUI java file
Difference_Report.txt - Changes I made to the original file
JavaPEG Code - Contains the snapshot of project implementation

(To see the complete Difference Report, Go To http://diffchecker.com/4j0xmcad)

**********************************************************************************************

EXPLANATION:-

* I have included 3 java packages viz;

	1. import java.awt.Component; and 
	2. import java.awt.Insets;
	3. import javax.swing.BoxLayout;

	Component is an object used for graphical representation. It can provide GUI with 
	buttons, checkboxes, scrollbars & interact with user. Insets are used for border 
	representations of the containers (It can place the window on four sides; top, 
	bottom, right or left). Finally boxlayout allows multiple components to be laid out
	either vertically or horizontally.

* I initialized a variable selectLayout so that user can select the layout of his choice. 
  There were 3 layouts provided in the extension and the default one was with Large Icons 
  (number 3).

* Skipping some sections where GUI creates the main layout and all other panels, 
  I have created some panels over the main panel, explained as follows;

	Each panel is considered as a button and defined as an object of JButton.
	button1= Large Thumbnails (LayOut = 3),
	button1= Small Thumbnails (LayOut = 6),
	button1= List Thumbnails (LayOut = 1)

* To create each button at each load time, one has to follow these 3 methods sequentially;
	1. thumbNailsPanel.invalidate(); -> makes the component invalid
	2. thumbNailsPanel.repaint();	 -> Overrides the dirty region
	3. thumbNailsPanel.updateUI();	 -> sets current UI over older one
Finally add all these buttons to the SOUTH side of BorderLayout (inbuilt package)

* Now we have set all the properties of the Buttons, but there should be a provision 
  to select an option and display the results after clicking that button. We need to add 
  the buttons, buttons will be treated as a thumbnails & we will use addThumbnail method.
  We first select the number of columns based on the option selected by user;
		
		// To get width of visible portion of Panel
		int columns = thumbNailsPanel.getVisibleRect().width ;   
		columns = (int)Math.floor( columns/100.0 );
		if(selectLayout == 6)
			columns = columns;	     // Default option 
		else if(selectLayout == 3)	
			columns = columns/2;	     // For small icons
		else 
			columns = 1;		     // For list
		int width = (thumbNailsPanel.getVisibleRect().width - 22) / columns;

  And add the thumbNail using thumbNailsPanel.add(thumbNail, c); where c is 
  GridBagConstraints

* thumbContainer is used to create the scrollbar when there are more number of icons
  (i.e. images) to fit in thumbnail.

* To Load more and more images from the selected folder, following is done;

	if(completePath!=null)
		loadThumbNails(new File(completePath));
	thumbNailsPanel.invalidate();
	thumbNailsPanel.repaint();
	thumbNailsPanel.updateUI();		// This will create new thumbNail for each image.

Note:- Some of boundary conditions such as x and y axis co-ordinates are hard coded for 
       SIMPLICITY.

------------------------------------------ THANK YOU -------------------------------------

