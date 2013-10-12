package moller.javapeg.program;
/**
 * This class was created : 2009-02-25 by Fredrik Möller
 * Latest changed         : 2009-02-26 by Fredrik Möller
 *                        : 2009-03-01 by Fredrik Möller
 *                        : 2009-03-02 by Fredrik Möller
 *                        : 2009-03-03 by Fredrik Möller
 *                        : 2009-03-04 by Fredrik Möller
 *                        : 2009-03-05 by Fredrik Möller
 *                        : 2009-03-09 by Fredrik Möller
 *                        : 2009-03-10 by Fredrik Möller
 *                        : 2009-03-11 by Fredrik Möller
 *                        : 2009-03-18 by Fredrik Möller
 *                        : 2009-03-25 by Fredrik Möller
 *                        : 2009-03-26 by Fredrik Möller
 *                        : 2009-04-04 by Fredrik Möller
 *                        : 2009-04-05 by Fredrik Möller
 *                        : 2009-04-06 by Fredrik Möller
 *                        : 2009-04-12 by Fredrik Möller
 *                        : 2009-04-13 by Fredrik Möller
 *                        : 2009-04-15 by Fredrik Möller
 *                        : 2009-04-23 by Fredrik Möller
 *                        : 2009-04-29 by Fredrik Möller
 *                        : 2009-05-04 by Fredrik Möller
 *                        : 2009-05-13 by Fredrik Möller
 *                        : 2009-05-14 by Fredrik Möller
 *                        : 2009-05-15 by Fredrik Möller
 *                        : 2009-05-16 by Fredrik Möller
 *                        : 2009-05-19 by Fredrik Möller
 *                        : 2009-05-20 by Fredrik Möller
 *                        : 2009-05-21 by Fredrik Möller
 *                        : 2009-05-25 by Fredrik Möller
 *                        : 2009-05-26 by Fredrik Möller
 *                        : 2009-05-28 by Fredrik Möller
 *                        : 2009-05-30 by Fredrik Möller
 *                        : 2009-06-01 by Fredrik Möller
 *                        : 2009-06-02 by Fredrik Möller
 *                        : 2009-06-04 by Fredrik Möller
 *                        : 2009-06-06 by Fredrik Möller
 *                        : 2009-06-10 by Fredrik Möller
 *                        : 2009-06-12 by Fredrik Möller
 *                        : 2009-06-15 by Fredrik Möller
 *                        : 2009-06-16 by Fredrik Möller
 *                        : 2009-06-17 by Fredrik Möller
 *                        : 2009-07-02 by Fredrik Möller
 *                        : 2009-07-03 by Fredrik Möller
 *                        : 2009-07-04 by Fredrik Möller
 *                        : 2009-07-13 by Fredrik Möller
 *                        : 2009-07-15 by Fredrik Möller
 *                        : 2009-07-18 by Fredrik Möller
 *                        : 2009-07-19 by Fredrik Möller
 *                        : 2009-07-20 by Fredrik Möller
 *                        : 2009-07-23 by Fredrik Möller
 *                        : 2009-07-24 by Fredrik Möller
 *                        : 2009-08-02 by Fredrik Möller
 *                        : 2009-08-03 by Fredrik Möller
 *                        : 2009-08-09 by Fredrik Möller
 *                        : 2009-08-11 by Fredrik Möller
 *                        : 2009-08-16 by Fredrik Möller
 *                        : 2009-08-19 by Fredrik Möller
 *                        : 2009-08-20 by Fredrik Möller
 *                        : 2009-08-21 by Fredrik Möller
 *                        : 2009-08-23 by Fredrik Möller
 *                        : 2009-08-30 by Fredrik Möller
 *                        : 2009-09-05 by Fredrik Möller
 *                        : 2009-09-06 by Fredrik Möller
 *                        : 2009-09-08 by Fredrik Möller
 *                        : 2009-09-13 by Fredrik Möller
 *                        : 2009-09-14 by Fredrik Möller
 *                        : 2009-09-19 by Fredrik Möller
 *                        : 2009-11-13 by Fredrik Möller
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

import moller.javapeg.StartJavaPEG;
import moller.javapeg.program.applicationstart.ValidateFileSetup;
import moller.javapeg.program.config.Config;
import moller.javapeg.program.config.ConfigViewerGUI;
import moller.javapeg.program.gui.ImageViewer;
import moller.javapeg.program.gui.MetaDataPanel;
import moller.javapeg.program.gui.StatusPanel;
import moller.javapeg.program.gui.VariablesPanel;
import moller.javapeg.program.helpviewer.HelpViewerGUI;
import moller.javapeg.program.imagelistformat.ImageList;
import moller.javapeg.program.jpeg.JPEGThumbNail;
import moller.javapeg.program.jpeg.JPEGThumbNailRetriever;
import moller.javapeg.program.language.Language;
import moller.javapeg.program.logger.Logger;
import moller.javapeg.program.metadata.MetaData;
import moller.javapeg.program.metadata.MetaDataUtil;
import moller.javapeg.program.model.FileModel;
import moller.javapeg.program.model.MetaDataTableModel;
import moller.javapeg.program.model.PreviewTableModel;
import moller.javapeg.program.progress.RenameProcess;
import moller.javapeg.program.progress.ThumbNailLoading;
import moller.javapeg.program.rename.RenameProcessContext;
import moller.javapeg.program.rename.ValidatorStatus;
import moller.javapeg.program.rename.process.FileProcessor;
import moller.javapeg.program.rename.process.PostFileProcessor;
import moller.javapeg.program.rename.process.PreFileProcessor;
import moller.javapeg.program.rename.validator.FileAndSubDirectoryTemplate;
import moller.javapeg.program.rename.validator.JPEGTotalPathLength;
import moller.javapeg.program.thumbnailoverview.ThumbNailOverViewCreator;
import moller.javapeg.program.updates.NewVersionChecker;
import moller.javapeg.program.updates.NewVersionGUI;
import moller.util.gui.Screen;
import moller.util.gui.Table;
import moller.util.gui.Update;
import moller.util.io.FileUtil;
import moller.util.io.JPEGUtil;
import moller.util.io.StreamUtil;
import moller.util.mnemonic.MnemonicConverter;
import moller.util.version.containers.VersionInformation;


public class MainGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4478711914847747931L;
	
	private static Config config;
	private static Logger logger;
	private static Language lang;

	private JButton destinationPathButton;
	private JButton startProcessButton;
	private JButton removeSelectedImagesButton;
	private JButton removeAllImagesButton;
	private JButton openImageListButton;
	private JButton saveImageListButton;
	private JButton exportImageListButton;
	private JButton moveUpButton;
	private JButton moveDownButton;
	private JButton openImageViewerButton;
	private JButton moveToTopButton;
	private JButton moveToBottomButton;
	
	private JLabel destinationPathLabel;
	private JLabel subFolderLabel;
	private JLabel subFolderPreviewTextFieldLabel;
	private JLabel fileNameTemplateLabel;
	private JLabel infoPanelLabel;
	private JLabel amountOfImagesInImageListLabel;
	private JLabel imagePreviewLabel;
	
	private JTextField destinationPathTextField;
	private JTextField subFolderTextField;
	private JTextField fileNameTemplateTextField;
	private JTextField subFolderNamePreviewTextField;

	private JMenu fileMenu;
	private JMenu helpMenu;
	private JMenu configMenu;

	private JMenuItem configGUIJMenuItem;
	private JMenuItem shutDownProgramJMenuItem;
	private JMenuItem openDestinationFileChooserJMenuItem;
	private JMenuItem startProcessJMenuItem;
	private JMenuItem helpJMenuItem;
	private JMenuItem aboutJMenuItem;
	private JMenuItem popupMenuAddImageToViewList;
	private JMenuItem popupMenuAddAllImagesToViewList;
	
	private JPopupMenu rightClickMenu;

	private JPanel thumbNailsPanel;
	private JPanel infoPanel;
	
	private JSplitPane thumbNailMetaPanelSplitPane;
	private JSplitPane verticalSplitPane;
	private JSplitPane mainSplitPane;
	
	private JMenuBar menuBar;

	private JCheckBox createThumbNailsCheckBox;

	private JTabbedPane tabbedPane;
	private JTabbedPane mainTabbedPane;

	private JTable metaDataTable;
	private JTable previewTable;
		
	private JTree tree;
	
	private Mouselistener mouseListener;
	private MouseButtonListener mouseRightClickButtonListener;
	
	private int iconWidth = 160;
	private int columnMargin = 0;
	
	private GridLayout thumbNailGridLayout;
	
	private ThumbNailLoading pb;
	
	private JPanel thumbNailsBackgroundsPanel;
	
	private MetaDataTableModel metaDataTableModel;
	private PreviewTableModel previewTableModel;
	
	private StatusPanel statusBar;
	private MetaDataPanel imageMetaDataPanel;
	
	private ThumbNailListener thumbNailListener;
	
	private DefaultListModel imagesToViewListModel;
	
	private JList imagesToViewList;
		
	public MainGUI(){
		
		if(!FileUtil.testWriteAccess(new File(C.USER_HOME))) {
			JOptionPane.showMessageDialog(null, "Can not create files in direcotry: " + C.USER_HOME);
		} 		
		ValidateFileSetup.check();
				
		config =  Config.getInstance();
		logger =  Logger.getInstance();
		lang   =  Language.getInstance();
		
		logger.logDEBUG("JavaPEG is starting");		
		logger.logDEBUG("Language File Loading Started");
		this.readLanguageFile();
		logger.logDEBUG("Language File Loading Finished");
		if(config.getBooleanProperty("updatechecker.enabled")) {
			logger.logDEBUG("Application Update Check Started");
			this.checkApplicationUpdates();
			logger.logDEBUG("Application Update Check Finished");
		}
		logger.logDEBUG("Creation of Main Frame Started");
		this.createMainFrame();
		logger.logDEBUG("Creation of Main Frame Finished");
		logger.logDEBUG("Creation of Menu Bar Started");
		this.createMenuBar();
		logger.logDEBUG("Creation of Menu Bar Finished");
		this.createToolBar();
		this.createRightClickMenu();
		logger.logDEBUG("Adding of Event Listeners Started");
		this.addListeners();
		logger.logDEBUG("Adding of Event Listeners Finished");
		logger.logDEBUG("Application initialization Started");
		this.initiateProgram();
		logger.logDEBUG("Application initialization Finished");
		logger.logDEBUG("Check Available Memory Started");
		this.checkAvailableMemory();
		logger.logDEBUG("Check Available Memory Finished");
		logger.logDEBUG("Application Context initialization Started");
		this.initiateApplicationContext();
		logger.logDEBUG("Application Context initialization Finished");
	}
		
	private void checkApplicationUpdates() {
			
		logger.logDEBUG("Search for Application Updates Started");
		Thread updateCheck = new Thread(){

			public void run(){
				NewVersionChecker nvc = NewVersionChecker.getInstance();
				
				long latestVersion = nvc.newVersionExists(C.VERSION_TIMESTAMP);
				if(latestVersion > C.VERSION_TIMESTAMP) {
					Map<Long, VersionInformation> vim = nvc.getVersionInformation(C.VERSION_TIMESTAMP);
					
					if(vim != null) {
						VersionInformation vi = vim.get(latestVersion);
						
						String changeLog     = nvc.getChangeLog(vim, C.VERSION_TIMESTAMP);
						String downloadURL   = vi.getDownnloadURL();
						String fileName      = vi.getFileName();
						String versionNumber = vi.getVersionNumber();
						int fileSize = vi.getFileSize();
						
						NewVersionGUI nvg = new NewVersionGUI(changeLog, downloadURL, fileName, versionNumber, fileSize);
						nvg.init();
						nvg.setVisible(true);
					}
				}			
				logger.logDEBUG("Search for Application Updates Finished");
			}
		};
		updateCheck.start();
	}
	
	private void checkAvailableMemory() {
		long maxHeapSize = Runtime.getRuntime().maxMemory(); 
				
		if (maxHeapSize < 399572992) {
			logger.logERROR("Maximum Size of Java Heap is to small. Current size is: " + maxHeapSize + " bytes and it must be atleast 399572992 bytes");
			JOptionPane.showMessageDialog(null, lang.get("errormessage.maingui.notEnoughMemory"), lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
			closeApplication(1);
		}
	}
	
	// Inläsning av språkfil
	private void readLanguageFile(){
		lang.loadLanguageFile();
	}

	private void createMenuBar(){

		// Skapa menyrader i arkiv-menyn
		openDestinationFileChooserJMenuItem = new JMenuItem(lang.get("menu.item.openDestinationFileChooser"));
		openDestinationFileChooserJMenuItem.setAccelerator(KeyStroke.getKeyStroke(MnemonicConverter.convertAtoZCharToKeyEvent(lang.get("menu.iten.openDestinationFileChooser.accelerator").charAt(0)), ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		
		startProcessJMenuItem = new JMenuItem(lang.get("menu.item.startProcess"));
		startProcessJMenuItem.setToolTipText(lang.get("tooltip.selectSourceDirectoryWithImagesAndDestinationDirectory"));
		startProcessJMenuItem.setAccelerator(KeyStroke.getKeyStroke(MnemonicConverter.convertAtoZCharToKeyEvent(lang.get("menu.iten.startProcess.accelerator").charAt(0)), ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		startProcessJMenuItem.setEnabled(false);
		
		shutDownProgramJMenuItem = new JMenuItem(lang.get("menu.item.exit"));
		shutDownProgramJMenuItem.setAccelerator(KeyStroke.getKeyStroke(MnemonicConverter.convertAtoZCharToKeyEvent(lang.get("menu.iten.exit.accelerator").charAt(0)), ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		
		fileMenu = new JMenu(lang.get("menu.file"));
		fileMenu.setMnemonic(lang.get("menu.mnemonic.file").charAt(0));

		fileMenu.add(openDestinationFileChooserJMenuItem);
		fileMenu.add(startProcessJMenuItem);
		fileMenu.add(shutDownProgramJMenuItem);
								
		// Create rows in the Configuration menu
		configGUIJMenuItem = new JMenuItem(lang.get("menu.item.configuration"));
		configGUIJMenuItem.setAccelerator(KeyStroke.getKeyStroke(MnemonicConverter.convertAtoZCharToKeyEvent('c'), ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));

		configMenu = new JMenu(lang.get("menu.configuration"));
		configMenu.setMnemonic(lang.get("menu.mnemonic.configuration").charAt(0));
		
		configMenu.add(configGUIJMenuItem);
		
		// Skapa menyrader i hjälp-menyn
		helpJMenuItem = new JMenuItem(lang.get("menu.item.programHelp"));
		helpJMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, KeyEvent.CTRL_MASK + KeyEvent.ALT_MASK));
		
		aboutJMenuItem = new JMenuItem(lang.get("menu.item.about"));
		aboutJMenuItem.setAccelerator(KeyStroke.getKeyStroke(MnemonicConverter.convertAtoZCharToKeyEvent(lang.get("menu.item.about.accelerator").charAt(0)), ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		
		helpMenu = new JMenu(lang.get("menu.help"));
		helpMenu.setMnemonic(lang.get("menu.mnemonic.help").charAt(0));

		helpMenu.add(helpJMenuItem);
		helpMenu.add(aboutJMenuItem);

		menuBar = new JMenuBar();

		menuBar.add(fileMenu);
		menuBar.add(configMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
	}

	private void createToolBar(){
	}

	private JScrollPane createThumbNailsBackgroundPanel(){
	
		thumbNailGridLayout = new GridLayout(0, 6);
		thumbNailsPanel = new JPanel(thumbNailGridLayout);

		JScrollBar hSB = new JScrollBar(JScrollBar.HORIZONTAL);
		JScrollBar vSB = new JScrollBar(JScrollBar.VERTICAL);

		hSB.setUnitIncrement(40);
		vSB.setUnitIncrement(40);

		JScrollPane scrollpane = new JScrollPane(thumbNailsPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollpane.setHorizontalScrollBar(hSB);
		scrollpane.setVerticalScrollBar(vSB);
		
		return scrollpane;
	}

	private JPanel createInfoPanel() {

		// Skapa övergripande panel som håller innehåller för övrigt innehåll.
		infoPanel = new JPanel(new BorderLayout());
		infoPanel.setBorder(BorderFactory.createCompoundBorder(new EtchedBorder(EtchedBorder.LOWERED), new EmptyBorder(2, 2, 1, 2)));
		
		infoPanelLabel = new JLabel(lang.get("information.panel.informationLabel"));
		infoPanelLabel.setForeground(Color.GRAY);

		// Skapa en tabbed pane som innehåller tre paneler
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);

		// Skapa tabellmodeller
    	previewTableModel = PreviewTableModel.getInstance();
    	metaDataTableModel = MetaDataTableModel.getInstance();
    	
    	// Skapa tabellen för metadata-informatonen och sätt attribut till den
    	metaDataTable = new JTable(metaDataTableModel);
		metaDataTable.setEnabled(false);
		metaDataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		metaDataTable.getTableHeader().setReorderingAllowed(false);

		// Skapa tabellen för namnförhandsgranskningen och sätt attribut till den
		previewTable = new JTable(previewTableModel);
		previewTable.setEnabled(false);
		previewTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		previewTable.getTableHeader().setReorderingAllowed(false);

		// Skapa scrollbars...
		JScrollBar mhSB = new JScrollBar(JScrollBar.HORIZONTAL);
		JScrollBar mvSB = new JScrollBar(JScrollBar.VERTICAL);

		JScrollBar phSB = new JScrollBar(JScrollBar.HORIZONTAL);
		JScrollBar pvSB = new JScrollBar(JScrollBar.VERTICAL);

		// ... och sätt dess egenskaper
		mhSB.setUnitIncrement(40);
		mvSB.setUnitIncrement(40);

		phSB.setUnitIncrement(40);
		pvSB.setUnitIncrement(40);

		JScrollPane scrollpaneMeta = new JScrollPane(metaDataTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollpaneMeta.setHorizontalScrollBar(mhSB);
		scrollpaneMeta.setVerticalScrollBar(mvSB);

		subFolderPreviewTextFieldLabel = new JLabel(lang.get("information.panel.subFolderNameLabel"));

		subFolderNamePreviewTextField = new JTextField();
		subFolderNamePreviewTextField.setEditable(false);
		subFolderNamePreviewTextField.setBackground(Color.WHITE);

		JScrollPane scrollpanePreview = new JScrollPane(previewTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollpanePreview.setHorizontalScrollBar(phSB);
		scrollpanePreview.setVerticalScrollBar(pvSB);
		
		JPanel previewSubDirectoryPanel = new JPanel(new GridLayout(2, 1));
		previewSubDirectoryPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 4, 1));
		previewSubDirectoryPanel.add(subFolderPreviewTextFieldLabel);
		previewSubDirectoryPanel.add(subFolderNamePreviewTextField);
				
		JPanel previewTablePanel = new JPanel(new BorderLayout());
		previewTablePanel.add(previewSubDirectoryPanel, BorderLayout.NORTH);
		previewTablePanel.add(scrollpanePreview, BorderLayout.CENTER);
		
		tabbedPane.addTab(lang.get("information.panel.metaDataLabel"), scrollpaneMeta);
		tabbedPane.addTab(lang.get("information.panel.previewLabel"), previewTablePanel);
				
		infoPanel.add(infoPanelLabel, BorderLayout.NORTH);
		infoPanel.add(tabbedPane, BorderLayout.CENTER);
		
		return infoPanel;
	}

	// Denna metod anropas när innehållet i textfälten för undermappsnamn
	// eller filnamnmall ändrats.
	private void updatePreviewTable() {
		
		ApplicationContext ac = ApplicationContext.getInstance();
		
		if(ac.getMetaDataObjects().size() > 0 && ac.getDestinationPath().length() > 0) {
	
			ValidatorStatus vs = JPEGTotalPathLength.getInstance().test();
						
			if (vs.isValid()) {
				tabbedPane.setSelectedIndex(1);
				previewTableModel.setRowCount(0);
				previewTableModel.setColumns();
								
				RenameProcessContext rpc = RenameProcessContext.getInstance();
						
				Map<File, File> allJPEGFileNameMappings = rpc.getAllJPEGFileNameMappings();
				
				Set<File> sortedSet = new TreeSet<File>(allJPEGFileNameMappings.keySet());
										
				for (File file : sortedSet) {
					Object[] row = {file.getName(), allJPEGFileNameMappings.get(file).getName()};
					previewTableModel.addRow(row);
				}
	
				Table.packColumns(previewTable, 6);
	
				subFolderNamePreviewTextField.setText(rpc.getSubDirectoryName());
			} else {
				JOptionPane.showMessageDialog(null, vs.getStatusMessage(), lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
			}
		} else {
			subFolderNamePreviewTextField.setText("");
			previewTableModel.setColumnCount(0);
		}
	}

	private void createMainFrame(){

		this.setTitle("JavaPEG 2.4");

		InputStream imageStream = null;
		ImageIcon titleImageIcon = new ImageIcon();
		try {
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/javapeg.gif");
			titleImageIcon.setImage(ImageIO.read(imageStream));
			this.setIconImage(titleImageIcon.getImage());
		} catch (Exception e) {
			logger.logERROR("Could not open the image javapeg.gif");
		} finally {
			StreamUtil.closeStream(imageStream);
		}
		
		this.setSize(new Dimension(config.getIntProperty("mainGUI.window.width"), config.getIntProperty("mainGUI.window.height")));

		Point xyFromConfig = new Point(config.getIntProperty("mainGUI.window.location.x"),config.getIntProperty("mainGUI.window.location.y"));
				
		if(Screen.isOnScreen(xyFromConfig)) {
			this.setLocation(xyFromConfig);
		} else {
			this.setLocation(0,0);
			JOptionPane.showMessageDialog(null, lang.get("errormessage.maingui.locationError"), lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
			logger.logERROR("Could not set location of Main GUI to: x = " + xyFromConfig.x + " and y = " + xyFromConfig.y + " since that is outside of available screen size.");
		}
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e){
			logger.logERROR("Could not set desired Look And Feel for Main GUI");
			
			StringBuilder sb = new StringBuilder(4096);
			
			for(StackTraceElement element : e.getStackTrace()) {
				sb.append(element.toString());
				sb.append(System.getProperty("line.separator"));
			}
			logger.logERROR(sb.toString());
		}
		
		thumbNailListener = new ThumbNailListener();
		mouseRightClickButtonListener = new MouseButtonListener();

		mainSplitPane = new JSplitPane();
		mainSplitPane.setDividerLocation(config.getIntProperty("mainSplitPane.location"));
		mainSplitPane.setOneTouchExpandable(true);
					
		verticalSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		verticalSplitPane.setDividerLocation(config.getIntProperty("verticalSplitPane.location"));
		verticalSplitPane.setOneTouchExpandable(true);
				
		thumbNailMetaPanelSplitPane = new JSplitPane();
		thumbNailMetaPanelSplitPane.setDividerLocation(config.getIntProperty("thumbNailMetaDataPanelSplitPane.location"));
		thumbNailMetaPanelSplitPane.setOneTouchExpandable(true);
		thumbNailMetaPanelSplitPane.setDividerSize(10);

		JLabel thumbNailsTitleLable = new JLabel(lang.get("picture.panel.pictureLabel"));
		thumbNailsTitleLable.setForeground(Color.GRAY);
		
		thumbNailsBackgroundsPanel = new JPanel(new BorderLayout());
		thumbNailsBackgroundsPanel.setBorder(BorderFactory.createCompoundBorder(new EtchedBorder(EtchedBorder.LOWERED), new EmptyBorder(2, 2, 2, 2)));
		thumbNailsBackgroundsPanel.add(thumbNailsTitleLable, BorderLayout.NORTH);
		thumbNailsBackgroundsPanel.add(this.createThumbNailsBackgroundPanel(), BorderLayout.CENTER);
		
		mainTabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		mainTabbedPane.addTab(lang.get("tabbedpane.imageRename"), this.createRenamePanel());
		mainTabbedPane.addTab(lang.get("tabbedpane.imageView")  , this.createViewPanel());
//		tabbedPane.addTab("Categorize Images", new JPanel());
		
		imageMetaDataPanel = new MetaDataPanel();
		thumbNailMetaPanelSplitPane.setLeftComponent(thumbNailsBackgroundsPanel);			
		thumbNailMetaPanelSplitPane.setRightComponent(imageMetaDataPanel);
		
		verticalSplitPane.setTopComponent(mainTabbedPane);
		verticalSplitPane.setBottomComponent(thumbNailMetaPanelSplitPane);
					
		mainSplitPane.setLeftComponent(createTreePanel());
		mainSplitPane.setRightComponent(verticalSplitPane);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.add(mainSplitPane, BorderLayout.CENTER);
			
		boolean [] timerStatus = {false,false,false,false};
		statusBar = new StatusPanel(timerStatus);
		
		this.add(statusBar, BorderLayout.SOUTH);
	}
	
	private JPanel createTreePanel() {
			
		JPanel treePanelBackground = new JPanel(new BorderLayout());
		treePanelBackground.setBorder(BorderFactory.createCompoundBorder((new EtchedBorder(EtchedBorder.LOWERED)), new EmptyBorder(2, 2, 2, 2)));
		
		JLabel inputLabel = new JLabel(lang.get("labels.sourcePath"));
		inputLabel.setForeground(Color.GRAY);
		
		treePanelBackground.add(inputLabel, BorderLayout.NORTH);
		treePanelBackground.add(this.initiateJTree(), BorderLayout.CENTER);
		
		JPanel borderPanel = new JPanel(new BorderLayout());
		borderPanel.setBorder(BorderFactory.createCompoundBorder((new BevelBorder(BevelBorder.LOWERED)), new EmptyBorder(2, 2, 0, 2)));
		borderPanel.add(treePanelBackground, BorderLayout.CENTER);
		
		return borderPanel;
	}
	
	private JPanel createRenamePanel() {
		
		GBHelper posBackgroundPanel = new GBHelper();
		
		JPanel backgroundJPanel = new JPanel(new GridBagLayout());
		backgroundJPanel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		
		backgroundJPanel.add(this.createRenameInputPanel(), posBackgroundPanel.nextCol());
		backgroundJPanel.add(new Gap(2), posBackgroundPanel.nextCol());
		backgroundJPanel.add(this.createInfoPanel(), posBackgroundPanel.nextCol().expandW());
				
		return backgroundJPanel;
	}
	
	private JPanel createViewPanel() {
		
		GBHelper posBackgroundPanel = new GBHelper();
				
		JPanel backgroundJPanel = new JPanel(new GridBagLayout());
		backgroundJPanel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
		backgroundJPanel.add(this.createViewPanelListSection(), posBackgroundPanel.expandH());
		backgroundJPanel.add(new Gap(2), posBackgroundPanel.nextCol().expandW());
						
		return backgroundJPanel;
	}
	
	private JPanel createViewPanelListSection () {
		
		removeSelectedImagesButton = new JButton();
		removeAllImagesButton      = new JButton();
		openImageListButton        = new JButton();
		saveImageListButton        = new JButton();
		exportImageListButton      = new JButton();
		moveUpButton               = new JButton();
		moveDownButton             = new JButton();
		openImageViewerButton      = new JButton();
		moveToTopButton            = new JButton();
		moveToBottomButton         = new JButton();
		
		InputStream imageStream = null;
		
		ImageIcon removePictureImageIcon = new ImageIcon();
		ImageIcon removeAllPictureImageIcon = new ImageIcon();
		ImageIcon openImageListImageIcon = new ImageIcon();
		ImageIcon saveImageListImageIcon = new ImageIcon();
		ImageIcon exportImageListImageIcon = new ImageIcon();
		ImageIcon moveUpImageIcon = new ImageIcon();
		ImageIcon moveDownImageIcon = new ImageIcon();
		ImageIcon viewImagesImageIcon = new ImageIcon();
		ImageIcon moveToTopImageIcon = new ImageIcon();
		ImageIcon moveToBottomImageIcon = new ImageIcon();
		
		try {		
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/remove.gif");
			removePictureImageIcon.setImage(ImageIO.read(imageStream));
			removeSelectedImagesButton.setIcon(removePictureImageIcon);
			removeSelectedImagesButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.removeSelectedImages"));
			
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/removeall.gif");
			removeAllPictureImageIcon.setImage(ImageIO.read(imageStream));
			removeAllImagesButton.setIcon(removeAllPictureImageIcon);	
			removeAllImagesButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.removeAllImages"));
			
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/open.gif");
			openImageListImageIcon.setImage(ImageIO.read(imageStream));
			openImageListButton.setIcon(openImageListImageIcon);	
			openImageListButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.openImageList"));
			
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/save.gif");
			saveImageListImageIcon.setImage(ImageIO.read(imageStream));
			saveImageListButton.setIcon(saveImageListImageIcon);	
			saveImageListButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.saveImageList"));
			
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/export.gif");
			exportImageListImageIcon.setImage(ImageIO.read(imageStream));
			exportImageListButton.setIcon(exportImageListImageIcon);	
			exportImageListButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.exportImageList"));
						
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/up.gif");
			moveUpImageIcon.setImage(ImageIO.read(imageStream));
			moveUpButton.setIcon(moveUpImageIcon);	
			moveUpButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.moveUp"));
			
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/down.gif");
			moveDownImageIcon.setImage(ImageIO.read(imageStream));
			moveDownButton.setIcon(moveDownImageIcon);	
			moveDownButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.moveDown"));
			
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/view.gif");
			viewImagesImageIcon.setImage(ImageIO.read(imageStream));
			openImageViewerButton.setIcon(viewImagesImageIcon);	
			openImageViewerButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.viewImages"));

			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/top.gif");
			moveToTopImageIcon.setImage(ImageIO.read(imageStream));
			moveToTopButton.setIcon(moveToTopImageIcon);
			moveToTopButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.moveToTop"));

			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/viewtab/bottom.gif");
			moveToBottomImageIcon.setImage(ImageIO.read(imageStream));
			moveToBottomButton.setIcon(moveToBottomImageIcon);
			moveToBottomButton.setToolTipText(lang.get("maingui.tabbedpane.imagelist.button.moveToBottom"));

		} catch (Exception e) {
			logger.logERROR("Could not open the image add.gif");
		} finally {
			StreamUtil.closeStream(imageStream);
		}
				
		imagesToViewListModel = new DefaultListModel();
		
		imagesToViewList = new JList(imagesToViewListModel);
		imagesToViewList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JPanel backgroundPanel = new JPanel(new GridBagLayout());
		backgroundPanel.setBorder(BorderFactory.createCompoundBorder(new EtchedBorder(EtchedBorder.LOWERED), new EmptyBorder(2, 2, 2, 2)));
				
		GBHelper posVerticalButtonPanel = new GBHelper();
		
		JPanel verticalButtonPanel = new JPanel(new GridBagLayout());
		verticalButtonPanel.add(removeSelectedImagesButton, posVerticalButtonPanel);
		verticalButtonPanel.add(removeAllImagesButton, posVerticalButtonPanel.nextRow());
		verticalButtonPanel.add(moveToTopButton, posVerticalButtonPanel.nextRow());
		verticalButtonPanel.add(moveUpButton, posVerticalButtonPanel.nextRow());
		verticalButtonPanel.add(moveDownButton, posVerticalButtonPanel.nextRow());
		verticalButtonPanel.add(moveToBottomButton, posVerticalButtonPanel.nextRow());
		
		
		GBHelper posHorisontalButtonPanel = new GBHelper();
		
		JPanel horisontalButtonPanel = new JPanel(new GridBagLayout());
		
		horisontalButtonPanel.add(openImageListButton, posHorisontalButtonPanel);
		horisontalButtonPanel.add(saveImageListButton, posHorisontalButtonPanel.nextCol());
		horisontalButtonPanel.add(exportImageListButton, posHorisontalButtonPanel.nextCol());
		horisontalButtonPanel.add(openImageViewerButton, posHorisontalButtonPanel.nextCol());
				
		GBHelper posBackgroundPanel = new GBHelper();

		JScrollPane spImageList = new JScrollPane(imagesToViewList);

		JLabel imageListLabel = new JLabel(lang.get("maingui.tabbedpane.imagelist.label.list"));
		imageListLabel.setForeground(Color.GRAY);

		amountOfImagesInImageListLabel = new JLabel();
		this.setNrOfImagesLabels();

		JLabel previewLabel = new JLabel(lang.get("maingui.tabbedpane.imagelist.label.preview"));
		previewLabel.setForeground(Color.GRAY);
		
		JPanel previewBackgroundPanel = new JPanel(new GridBagLayout());
		
		GBHelper posPreviewPanel = new GBHelper();
				
		imagePreviewLabel = new JLabel();
				
		JPanel previewPanel = new JPanel();
		previewPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
							
		previewPanel.add(imagePreviewLabel);

		previewBackgroundPanel.add(previewPanel, posPreviewPanel);
		
		JPanel imageListPanel = new JPanel();
		imageListPanel.setBorder(BorderFactory.createCompoundBorder(new EtchedBorder(EtchedBorder.LOWERED), new EmptyBorder(2, 2, 2, 2)));
				
		backgroundPanel.add(imageListLabel, posBackgroundPanel);
		backgroundPanel.add(previewLabel, posBackgroundPanel.nextCol().nextCol().nextCol().nextCol());
		backgroundPanel.add(spImageList, posBackgroundPanel.nextRow().expandH());
		
		backgroundPanel.add(new Gap(3), posBackgroundPanel.nextCol());
		backgroundPanel.add(verticalButtonPanel, posBackgroundPanel.nextCol().align(GridBagConstraints.NORTH));
		backgroundPanel.add(new Gap(3), posBackgroundPanel.nextCol());
		backgroundPanel.add(previewBackgroundPanel, posBackgroundPanel.nextCol().align(GridBagConstraints.NORTH));
		backgroundPanel.add(new Gap(3), posBackgroundPanel.nextRow());
		backgroundPanel.add(horisontalButtonPanel, posBackgroundPanel.nextRow().align(GridBagConstraints.WEST));
		backgroundPanel.add(amountOfImagesInImageListLabel, posBackgroundPanel.nextCol().nextCol().nextCol().nextCol());
		
		return backgroundPanel;
	}
	
	private boolean setStartProcessButtonState() {
		
		ApplicationContext ac = ApplicationContext.getInstance();
		
		if (ac.getMetaDataObjects().size() > 0 && ac.getDestinationPath().length() > 0) {
			startProcessButton.setToolTipText(lang.get("tooltip.beginNameChangeProcessButton"));
			startProcessJMenuItem.setToolTipText("");
			return true;
		} else if (ac.getMetaDataObjects().size() > 0) {
			startProcessButton.setToolTipText(lang.get("tooltip.selectDestinationDirectory"));
			startProcessJMenuItem.setToolTipText(lang.get("tooltip.selectDestinationDirectory"));
			return false;
		} else if (ac.getDestinationPath().length() > 0) {
			startProcessButton.setToolTipText(lang.get("tooltip.selectSourceDirectoryWithImages"));
			startProcessJMenuItem.setToolTipText(lang.get("tooltip.selectSourceDirectoryWithImages"));
			return false;
		} else {
			startProcessButton.setToolTipText(lang.get("tooltip.selectSourceDirectoryWithImagesAndDestinationDirectory"));
			startProcessJMenuItem.setToolTipText(lang.get("tooltip.selectSourceDirectoryWithImagesAndDestinationDirectory"));
			return false;
		}
	}
		
	private JPanel createRenameInputPanel() {
			
		createThumbNailsCheckBox = new JCheckBox(lang.get("checkbox.createThumbNails"));
		createThumbNailsCheckBox.setToolTipText(lang.get("tooltip.createThumbNails"));
		createThumbNailsCheckBox.setActionCommand("createThumbNailsCheckBox");
		
		InputStream imageStream = null;
		ImageIcon playPictureImageIcon = new ImageIcon();
		try {
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/play.gif");
			playPictureImageIcon.setImage(ImageIO.read(imageStream));
		} catch (Exception e) {
			logger.logERROR("Could not open the image play.gif");
		} finally {
			StreamUtil.closeStream(imageStream);
		}
				
		startProcessButton = new JButton(playPictureImageIcon);
		startProcessButton.setActionCommand("startProcessButton");
		startProcessButton.setToolTipText(lang.get("tooltip.selectSourceDirectoryWithImagesAndDestinationDirectory"));
		startProcessButton.setPreferredSize(new Dimension(30, 20));
		startProcessButton.setMinimumSize(new Dimension(30, 20));
		startProcessButton.setEnabled(false);
		
		imageStream = null;
		ImageIcon openPictureImageIcon = new ImageIcon();
		try {
			imageStream = StartJavaPEG.class.getResourceAsStream("resources/images/open.gif");
			openPictureImageIcon.setImage(ImageIO.read(imageStream));
		} catch (Exception e) {
			logger.logERROR("Could not open the image open.gif");
		} finally {
			StreamUtil.closeStream(imageStream);
		}
		
		destinationPathLabel = new JLabel(lang.get("labels.destinatonPath"));
		destinationPathLabel.setForeground(Color.GRAY);

		destinationPathTextField = new JTextField();
		destinationPathTextField.setEditable(false);
		destinationPathTextField.setBackground(Color.WHITE);
		
		destinationPathButton = new JButton(openPictureImageIcon);
		destinationPathButton.setActionCommand("destinationPathButton");
		destinationPathButton.setToolTipText(lang.get("tooltip.destinationPathButton"));
		destinationPathButton.setPreferredSize(new Dimension(30, 20));
		destinationPathButton.setMinimumSize(new Dimension(30, 20));
						
		subFolderLabel = new JLabel(lang.get("labels.subFolderName"));
		subFolderLabel.setForeground(Color.GRAY);

		subFolderTextField = new JTextField();
		subFolderTextField.setEnabled(false);
		subFolderTextField.setToolTipText(lang.get("tooltip.enableTemplateFields"));
				
		fileNameTemplateLabel = new JLabel(lang.get("labels.fileNameTemplate"));
		fileNameTemplateLabel.setForeground(Color.GRAY);
		
		fileNameTemplateTextField = new JTextField();
		fileNameTemplateTextField.setEnabled(false);
		fileNameTemplateTextField.setToolTipText(lang.get("tooltip.enableTemplateFields"));
				
		GBHelper inputPos = new GBHelper();
		JPanel inputPanel = new JPanel(new GridBagLayout());
		inputPanel.add(destinationPathLabel, inputPos);
		inputPanel.add(destinationPathTextField, inputPos.nextRow());
		inputPanel.add(destinationPathButton, inputPos.nextCol());
		inputPanel.add(new Gap(4), inputPos.nextRow());
		inputPanel.add(subFolderLabel, inputPos.nextRow());
		inputPanel.add(subFolderTextField, inputPos.nextRow());
		inputPanel.add(new Gap(4), inputPos.nextRow());
		inputPanel.add(fileNameTemplateLabel, inputPos.nextRow());
		inputPanel.add(fileNameTemplateTextField, inputPos.nextRow());
				
		GBHelper posBackground = new GBHelper();
		JPanel backgroundPanel = new JPanel(new GridBagLayout());
		backgroundPanel.setBorder(BorderFactory.createCompoundBorder(new EtchedBorder(EtchedBorder.LOWERED), new EmptyBorder(2, 2, 2, 2)));
		backgroundPanel.add(inputPanel, posBackground.align(GridBagConstraints.NORTHWEST));
		backgroundPanel.add(new Gap(10), posBackground.nextCol());
		backgroundPanel.add(new VariablesPanel(), posBackground.nextCol());
		backgroundPanel.add(new Gap(5), posBackground.nextRow());
		backgroundPanel.add(createThumbNailsCheckBox, inputPos.nextRow().nextCol().nextCol());
		backgroundPanel.add(startProcessButton, inputPos.nextRow().nextCol().nextCol().align(GridBagConstraints.EAST));
						
		return backgroundPanel; 
	}
	
	private JScrollPane initiateJTree() {
		
		tree = new JTree (new FileModel (new Comparator<Object> (){
			public int compare (Object fileAsObjectA, Object fileAsObjectB){
				File fileA = (File) fileAsObjectA;
				File fileB = (File) fileAsObjectB;
				return (fileA.isDirectory () && ! fileB.isDirectory ()) ? -1 : (! fileA.isDirectory () && fileB.isDirectory ()) ? 1 : fileA.getAbsolutePath ().compareToIgnoreCase (fileB.getAbsolutePath ());
			}
		}));
	
		DefaultTreeCellRenderer renderer = 	new DefaultTreeCellRenderer();
    	renderer.setLeafIcon(renderer.getDefaultClosedIcon());
		
		tree.setCellRenderer(renderer);
		tree.setRootVisible (false);
		tree.setShowsRootHandles (true);
		tree.addMouseListener(mouseListener = new Mouselistener());
		
		return new JScrollPane(tree);
	}

	public void addListeners(){
		this.addWindowListener(new WindowDestroyer());
		shutDownProgramJMenuItem.addActionListener(new MenuListener());
		openDestinationFileChooserJMenuItem.addActionListener(new MenuListener());
		startProcessJMenuItem.addActionListener(new MenuListener());
		destinationPathButton.addActionListener(new ButtonListener());
		startProcessButton.addActionListener(new ButtonListener());
		helpJMenuItem.addActionListener(new MenuListener());
		aboutJMenuItem.addActionListener(new MenuListener());
		configGUIJMenuItem.addActionListener(new MenuListener());
		
		subFolderTextField.getDocument().addDocumentListener(new JTextFieldListener());
		fileNameTemplateTextField.getDocument().addDocumentListener(new JTextFieldListener());
		tabbedPane.addChangeListener(new JTabbedPaneListener());
		createThumbNailsCheckBox.addActionListener(new CheckBoxListener());
		thumbNailsBackgroundsPanel.addComponentListener(new ComponentListener());
		
		removeSelectedImagesButton.addActionListener(new RemoveSelectedImagesListener());
		removeAllImagesButton.addActionListener(new RemoveAllImagesListener());
		openImageListButton.addActionListener(new OpenImageListListener());
		saveImageListButton.addActionListener(new SaveImageListListener());
		exportImageListButton.addActionListener(new ExportImageListListener());
		moveUpButton.addActionListener(new MoveImageUpInListListener());
		moveDownButton.addActionListener(new MoveImageDownInListListener());
		moveToTopButton.addActionListener(new MoveImageToTopInListListener());
		moveToBottomButton.addActionListener(new MoveImageToBottomInListListener());
		openImageViewerButton.addActionListener(new OpenImageViewerListener());
		
		popupMenuAddImageToViewList.addActionListener(new AddImageToViewList());
		popupMenuAddAllImagesToViewList.addActionListener(new AddAllImagesToViewList());
		
		imagesToViewList.addListSelectionListener(new ImagesToViewListListener());
	}
	
	public void createRightClickMenu(){
		
		rightClickMenu = new JPopupMenu();

		popupMenuAddImageToViewList = new JMenuItem(lang.get("maingui.popupmenu.addImageToList"));
		popupMenuAddAllImagesToViewList = new JMenuItem(lang.get("maingui.popupmenu.addAllImagesToList"));
		
		rightClickMenu.add(popupMenuAddImageToViewList);
		rightClickMenu.add(popupMenuAddAllImagesToViewList);
	}

	public void initiateProgram(){
		
	 	subFolderTextField.setText(config.getStringProperty("subFolderName"));
		fileNameTemplateTextField.setText(config.getStringProperty("fileNameTemplate"));

		if(config.getBooleanProperty("createThumbNailsCheckBox")) {
			createThumbNailsCheckBox.setSelected(true);
		}
		Update.updateAllUIs();		
	}
	
	public void initiateApplicationContext() {
		ApplicationContext ac = ApplicationContext.getInstance();
		// Disabled to avoid NPE:s with current model of load previous path at application start (Not loading)
//		ac.setSourcePath(config.getStringProperty("sourcePath"));
		ac.setTemplateFileName(config.getStringProperty("fileNameTemplate"));
		ac.setTemplateSubFolderName(config.getStringProperty("subFolderName"));
		ac.setCreateThumbNailsCheckBoxSelected(config.getBooleanProperty("createThumbNailsCheckBox"));
	}

	private void saveSettings(){
		
		config.setStringProperty("sourcePath", ApplicationContext.getInstance().getSourcePath());

		if(!destinationPathTextField.getText().equals(""))
			config.setStringProperty("destinationPath", destinationPathTextField.getText());

		config.setStringProperty("subFolderName", subFolderTextField.getText());
		config.setStringProperty("fileNameTemplate", fileNameTemplateTextField.getText());
		config.setBooleanProperty("createThumbNailsCheckBox", createThumbNailsCheckBox.isSelected());
		config.setIntProperty("mainGUI.window.location.x", this.getLocationOnScreen().x);
		config.setIntProperty("mainGUI.window.location.y", this.getLocationOnScreen().y);
		config.setIntProperty("mainGUI.window.width", this.getSize().width);
		config.setIntProperty("mainGUI.window.height", this.getSize().height);
		config.setIntProperty("mainSplitPane.location", mainSplitPane.getDividerLocation());
		config.setIntProperty("verticalSplitPane.location", verticalSplitPane.getDividerLocation());
		config.setIntProperty("thumbNailMetaDataPanelSplitPane.location", thumbNailMetaPanelSplitPane.getDividerLocation());
				
		try {
			config.saveSettings();
		} catch (FileNotFoundException e) {
			logger.logFATAL("Could not save configuration to file: ");
			for(StackTraceElement element : e.getStackTrace()) {
				logger.logFATAL(element.toString());	
			}
			
		} catch (IOException e) {
			logger.logFATAL("Could not save configuration to file: ");
			for(StackTraceElement element : e.getStackTrace()) {
				logger.logFATAL(element.toString());	
			}
		}
	}
		
	private void addThumbnail(JButton thumbNail) {
		thumbNailsPanel.add(thumbNail);
	}
	
	private void updateGUI() {
		thumbNailsPanel.updateUI();
	}
	
    private void validateInputInRealtime() {
	    	
		if (subFolderTextField.isFocusOwner() || fileNameTemplateTextField.isFocusOwner()) {
			ApplicationContext ac = ApplicationContext.getInstance();
			ac.setTemplateFileName(fileNameTemplateTextField.getText());
			ac.setTemplateSubFolderName(subFolderTextField.getText());
			
			ValidatorStatus vs = FileAndSubDirectoryTemplate.getInstance().test();
			
			if(vs.isValid()) {
				updatePreviewTable();
			} else {
				JOptionPane.showMessageDialog(null,vs.getStatusMessage(), lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private void setInputsEnabled(boolean state) {
		destinationPathButton.setEnabled(state);
		openDestinationFileChooserJMenuItem.setEnabled(state);
		fileNameTemplateTextField.setEnabled(state);
		subFolderTextField.setEnabled(state);
		createThumbNailsCheckBox.setEnabled(state);
		startProcessButton.setEnabled(state);
		startProcessJMenuItem.setEnabled(state);
		tree.setEnabled(state);
	}
	
	private void closeApplication(int exitValue) {
		if(exitValue == 0) {
			saveSettings();
		}
		logger.logDEBUG("JavePEG was shut down");
		logger.flush();
		System.exit(exitValue);
	}
		
	// WindowDestroyer
	private class WindowDestroyer extends WindowAdapter{
		public void windowClosing (WindowEvent e){
			closeApplication(0);
		}
	}

	// Menylyssnarklass
	private class MenuListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String actionCommand = e.getActionCommand();

			if(actionCommand.equals(lang.get("menu.item.exit"))){
				closeApplication(0);
			} 
			
			else if(actionCommand.equals(lang.get("menu.item.openDestinationFileChooser"))) {
				destinationPathButton.doClick();
			} else if(actionCommand.equals(lang.get("menu.item.startProcess"))) {
				startProcessButton.doClick();
			} else if (actionCommand.equals(lang.get("menu.item.about")))	{

				JOptionPane.showMessageDialog(null, lang.get("aboutDialog.TextRowA") +
                                             "\n" + lang.get("aboutDialog.TextRowB") +
                                             "\n" +
                                             "\n" + lang.get("aboutDialog.TextRowC") +
                                             "\n" + lang.get("aboutDialog.TextRowD") +
                                             "\n" +
                                             "\n" + lang.get("aboutDialog.TextRowE") +
                                             "\n" +
                                             "\n" + lang.get("aboutDialog.TextRowF") +
                                             "\n" + lang.get("aboutDialog.TextRowG") +
                                             "\n" + lang.get("aboutDialog.TextRowH"), lang.get("aboutDialog.Label"), JOptionPane.INFORMATION_MESSAGE);
	    	} else if (actionCommand.equals(lang.get("menu.item.programHelp"))) {
				new HelpViewerGUI().setVisible(true);				
			} else if (actionCommand.equals(lang.get("menu.item.configuration"))) {
				new ConfigViewerGUI().setVisible(true);				
			}
		}
	}

	// Knapplyssnarklass
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String actionCommand = e.getActionCommand();
			
			if(actionCommand.equals("destinationPathButton")) {
				destinationPathTextField.setEditable(true);

				/**
			     * Kontrollera så att sparad sökväg fortfarande existerar
			     * och i annat fall hoppa upp ett steg i trädstrukturen och
			     * kontrollera ifall den sökvägen existerar
			     **/
				File tempFile = new File(config.getStringProperty("destinationPath"));

				boolean exists = false;
				while(!exists) {
					try {
						if(!tempFile.exists()) {
							tempFile = tempFile.getParentFile();
						} else {
							exists = true;
						}
					} catch (NullPointerException npe) {
						System.out.println("catch");
						FileSystemView fsv = FileSystemView.getFileSystemView(); 
						tempFile = fsv.getDefaultDirectory();
						exists = true;
					}
				}
				
				JFileChooser chooser = new JFileChooser(tempFile.getAbsolutePath());
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.setDialogTitle(lang.get("fileSelectionDialog.destinationPathFileChooser"));
				int returnVal = chooser.showOpenDialog(MainGUI.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					String temp = chooser.getSelectedFile().getAbsolutePath();
					
					char [] tempArray = temp.toCharArray();

					for(int i = 0; i < tempArray.length; i++) {
						if((int)tempArray[i] == 92) {
							tempArray[i] = '/';
						}
					}
					
					if (!ApplicationContext.getInstance().getSourcePath().equals(String.valueOf(tempArray))) {
						
						ApplicationContext.getInstance().setDestinationPath(String.valueOf(tempArray));
						destinationPathTextField.setText(String.valueOf(tempArray));
						config.setStringProperty("destinationPath", destinationPathTextField.getText());
						
						subFolderTextField.setEnabled(true);
						subFolderTextField.setToolTipText(lang.get("tooltip.subFolderName"));
						
						fileNameTemplateTextField.setEnabled(true);
						fileNameTemplateTextField.setToolTipText(lang.get("tooltip.fileNameTemplate"));
							
						destinationPathTextField.setEnabled(true);
						destinationPathTextField.setEditable(false);
						
						startProcessButton.setEnabled(setStartProcessButtonState());
						startProcessJMenuItem.setEnabled(setStartProcessButtonState());
					} else {
						JOptionPane.showMessageDialog(null, lang.get("errormessage.maingui.sameSourceAndDestination"), lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
					}	
				}
			}
			
			if(actionCommand.equals("startProcessButton")){
				if(ApplicationContext.getInstance().isImageViewerDisplayed()) {
					JOptionPane.showMessageDialog(null, lang.get("errormessage.jpgrename.imageViewerMustBeClosed"), lang.get("errormessage.maingui.informationMessageLabel"), JOptionPane.INFORMATION_MESSAGE);
				} else {
					removeMouseListener();
					setInputsEnabled(false);		

					String subFolderName = "";
					String fileNameTemplate = ""; 

					// Ta bort eventuella mellanslag först och sist i undermappsnamnsmallen
					subFolderName = subFolderTextField.getText();
					subFolderName = subFolderName.trim();
					subFolderTextField.setText(subFolderName);

					// Ta bort eventuella mellanslag först och sist i filnamnsmallen
					fileNameTemplate = fileNameTemplateTextField.getText();
					fileNameTemplate = fileNameTemplate.trim();
					fileNameTemplateTextField.setText(fileNameTemplate);

					Thread renameThread = new Thread() {

						public void run(){

							RenameProcess rp = new RenameProcess();
							rp.init();
							rp.setVisible(true);

							logger.logDEBUG("Pre File Processing Started");
							rp.setLogMessage(lang.get("rename.PreFileProcessor.starting"));
							ValidatorStatus vs = PreFileProcessor.getInstance().startTest(rp);
							logger.logDEBUG("Pre File Processing Finished");
							rp.setLogMessage(lang.get("rename.PreFileProcessor.finished"));

							if(!vs.isValid()) {
								rp.setAlwaysOnTop(false);
								JOptionPane.showMessageDialog(null, vs.getStatusMessage(), lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
								logger.logERROR("Pre File Processing found following errors:\n" + vs.getStatusMessage());
								rp.setLogMessage(lang.get("rename.PreFileProcessor.error")+ "\n" + vs.getStatusMessage());
								rp.setAlwaysOnTop(true);
								setInputsEnabled(true);
								addMouseListener();
							} else {
								logger.logDEBUG("File Processing Started");
								rp.setLogMessage(lang.get("rename.FileProcessor.starting"));
								FileProcessor.getInstance().process(rp);
								logger.logDEBUG("File Processing Finished");
								rp.setLogMessage(lang.get("rename.FileProcessor.finished"));

								if(createThumbNailsCheckBox.isSelected()) {
									logger.logDEBUG("Thumb Nail Overview Creation Started");
									rp.setLogMessage(lang.get("thumbnailoverview.ThumbNailOverViewCreator.starting"));
									ThumbNailOverViewCreator.getInstance().create();
									logger.logDEBUG("Thumb Nail Overview Creation Finished");
									rp.setLogMessage(lang.get("thumbnailoverview.ThumbNailOverViewCreator.finished"));
									rp.incProcessProgress();
								}

								logger.logDEBUG("File Integrity Check Started");
								rp.setLogMessage(lang.get("rename.PostFileProcessor.integrityCheck.starting"));
								if(!PostFileProcessor .getInstance().process(rp)) {
									rp.setAlwaysOnTop(false);
									JOptionPane.showMessageDialog(null, lang.get("rename.PostFileProcessor.integrityCheck.error"), lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
									rp.setAlwaysOnTop(true);
									rp.setLogMessage(lang.get("rename.PostFileProcessor.integrityCheck.error"));
								}
								logger.logDEBUG("File Integrity Check Finished");
								rp.setLogMessage(lang.get("rename.PostFileProcessor.integrityCheck.finished"));
								rp.incProcessProgress();

								rp.setAlwaysOnTop(false);
								JOptionPane.showMessageDialog(null, lang.get("rename.FileProcessor.finished"), "", JOptionPane.INFORMATION_MESSAGE);
								rp.setAlwaysOnTop(true);

								setInputsEnabled(true);
								addMouseListener();
							}
							rp.renameProcessFinished();
						}
					};
					renameThread.start();	
				}
			}
		}
	}

	private class JTextFieldListener implements DocumentListener {

	    public void insertUpdate(DocumentEvent e) {
			validateInputInRealtime();
	    }
	    public void removeUpdate(DocumentEvent e) {
			validateInputInRealtime();
	    }
	    public void changedUpdate(DocumentEvent e) {
	    }
	}
		
	private class JTabbedPaneListener implements ChangeListener {

		public void stateChanged(ChangeEvent evt) {
			if(tabbedPane.getSelectedIndex() == 1) {
				updatePreviewTable();
			}
		}
	}
	
	private class CheckBoxListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			String actionCommand = e.getActionCommand();

			if(actionCommand.equals("createThumbNailsCheckBox")) {
				ApplicationContext.getInstance().setCreateThumbNailsCheckBoxSelected(createThumbNailsCheckBox.isSelected());
			}
		}
	}
	
	private void loadThumbNails(final File sourcePath) {
		this.removeMouseListener();
		setInputsEnabled(false);
		
		ApplicationContext ac = ApplicationContext.getInstance();
		
		thumbNailsPanel.removeAll();
		thumbNailsPanel.updateUI();
		
		// Rensa en eventuellt ifylld filnamnsförhandsgranskningstabell.
		// Detta kan ske då det redan öppnats bilder tidigare och dessa
		// fått förhandsgranskning på sina filnamn
		previewTableModel.setRowCount(0);
						
		// Clear the Panel with meta data from potentially already 
		// shown meta data
		imageMetaDataPanel.clearMetaData();
		
		metaDataTableModel.setColumnCount(0);
		metaDataTableModel.setRowCount(0);
		
		String sourcePathString = sourcePath.getAbsolutePath();
		
		ac.setSourcePath(sourcePathString);
		ac.clearMetaDataObjects();
		
		config.setStringProperty("sourcePath", sourcePathString);
		statusBar.setStatusMessage(lang.get("statusbar.message.selectedPath") + " " + sourcePathString, lang.get("statusbar.message.selectedPath"), 0);
				
		final Thread loadFilesThread = new Thread() {
			public void run() {
				FileRetriever.getInstance().loadFilesFromDisk(sourcePath);
			}
		};
		loadFilesThread.start();
		
		pb = new ThumbNailLoading(0, sourcePath.listFiles().length, this);
		pb.setVisible(true);
		
		metaDataTableModel.setColumns();
		
		Thread thumbNailsFetcher = new Thread() {
			
			public void run(){
		
				boolean bufferContainsImages = true;
				while (loadFilesThread.isAlive() || bufferContainsImages) {
					
					final File jpegFile = ApplicationContext.getInstance().handleJpegFileLoadBuffer(null, Action.RETRIEVE);
					
					if(jpegFile != null) {
									
						JPEGThumbNail tn =	JPEGThumbNailRetriever.getInstance().retrieveThumbNailFrom(jpegFile);
		
						JButton thumbContainer = new JButton();
						thumbContainer.setIcon(new ImageIcon(tn.getThumbNailData()));
						thumbContainer.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
						thumbContainer.setToolTipText(MetaDataUtil.getToolTipText(jpegFile));
						thumbContainer.setActionCommand(jpegFile.getAbsolutePath());
						thumbContainer.addActionListener(thumbNailListener);
						thumbContainer.addMouseListener(mouseRightClickButtonListener);
		
						columnMargin = thumbContainer.getBorder().getBorderInsets(thumbContainer).left;
						columnMargin += thumbContainer.getBorder().getBorderInsets(thumbContainer).right;
		
						int width = thumbContainer.getIcon().getIconWidth();
		
						if (width > iconWidth) {
							iconWidth = width;
						}
		
						addThumbnail(thumbContainer);
						
						MetaData metaData = MetaDataUtil.getMetaData(jpegFile);
						
						metaDataTableModel.addTableRow(metaData);
						ApplicationContext.getInstance().addMetaDataObject(metaData);
						setStatusMessages();
						updateGUI();
						pb.updateProgressBar();							
					} else if (!loadFilesThread.isAlive()){
						bufferContainsImages = false;
					}
										
					try {
						if (loadFilesThread.isAlive()) {
							Thread.sleep(10);
						}
					} catch (InterruptedException e1) {
					}
				}
				pb.dispose();
				addMouseListener();
				startProcessButton.setEnabled(setStartProcessButtonState());
				startProcessJMenuItem.setEnabled(setStartProcessButtonState());

				Table.packColumns(metaDataTable, 6);
				setInputsEnabled(true);
			}
		};
		thumbNailsFetcher.start();
		setStatusMessages();
				
		// Byta till metadata-tabben ifall tabben skulle stå i annat läge.
		tabbedPane.setSelectedIndex(0);	
	}
		
	/**
	 * Mouse listener
	 */
	private class Mouselistener extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			int selRow = tree.getRowForLocation(e.getX(), e.getY());
			TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
			if(selRow != -1) {
				Object [] path = selPath.getPath();
				String totalPath = "";
				for(int i=0; i<path.length; i++){
					if(i==0 || i==1 || i==path.length-1){
						totalPath = totalPath + path[i].toString();
					} else{
						totalPath = totalPath + path[i].toString() + "\\";
					}
				}	
				loadThumbNails(new File(totalPath));
			}	
		}
	}

	private void removeMouseListener(){
		tree.removeMouseListener(mouseListener);
	}
	
	private void addMouseListener(){
		tree.addMouseListener(mouseListener);
	}
	
	private void setNrOfImagesLabels () {
		amountOfImagesInImageListLabel.setText(lang.get("maingui.tabbedpane.imagelist.label.numberOfImagesInList") + " " + Integer.toString(imagesToViewListModel.size()));
	}
	
	private void setStatusMessages() {
		int nrOfImages =  FileRetriever.getInstance().handleNrOfJpegImages(Action.RETRIEVE);
		
		if (nrOfImages > 0) {
			int nrOfColumns = thumbNailGridLayout.getColumns();
			
			statusBar.setStatusMessage(Integer.toString(nrOfColumns), lang.get("statusbar.message.amountOfColumns"), 1);
			
			int extraRow = nrOfImages % nrOfColumns == 0 ? 0 : 1;
			int rowsInGridLayout = (nrOfImages / nrOfColumns) + extraRow; 

			statusBar.setStatusMessage(Integer.toString(rowsInGridLayout), lang.get("statusbar.message.amountOfRows"), 2);
			statusBar.setStatusMessage(Integer.toString(nrOfImages), lang.get("statusbar.message.amountOfImagesInDirectory"), 3);
		} else {
			statusBar.setStatusMessage("0", lang.get("statusbar.message.amountOfColumns"), 1);
			statusBar.setStatusMessage("0", lang.get("statusbar.message.amountOfRows"), 2);
			statusBar.setStatusMessage("0", lang.get("statusbar.message.amountOfImagesInDirectory"), 3);
		}
	}
	
	private class ComponentListener extends ComponentAdapter {
		@Override
		public void componentResized(ComponentEvent e) {
			if (((thumbNailsPanel.getVisibleRect().width - (columnMargin * thumbNailGridLayout.getColumns())) / iconWidth) != thumbNailGridLayout.getColumns()) {
				
				int columns = (thumbNailsPanel.getVisibleRect().width - ((thumbNailGridLayout.getHgap() * thumbNailGridLayout.getColumns()) + columnMargin * thumbNailGridLayout.getColumns())) / iconWidth;
				
				thumbNailGridLayout.setColumns(columns > 0 ? columns : 1);
				thumbNailsPanel.invalidate();
				thumbNailsPanel.repaint();
				thumbNailsPanel.updateUI();
				setStatusMessages();
			}				
		}
	}
	
	private class ThumbNailListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			imageMetaDataPanel.setMetaData(new File(e.getActionCommand()));
		}
	}
	
	private class RemoveSelectedImagesListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (!imagesToViewList.isSelectionEmpty()) {
				
				int [] selectedIndices = imagesToViewList.getSelectedIndices();
								
				// Remove all the selected indices
				while(selectedIndices.length > 0) {
					imagesToViewListModel.remove(selectedIndices[0]);
					selectedIndices = imagesToViewList.getSelectedIndices();
				}
				imagePreviewLabel.setIcon(null);
				setNrOfImagesLabels();
			}
		}
	}
	
	private class RemoveAllImagesListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (imagesToViewListModel.size() > 0) {
				imagesToViewListModel.clear();
				imagePreviewLabel.setIcon(null);
				setNrOfImagesLabels();
			}
		}
	}
	
	private class OpenImageListListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			FileNameExtensionFilter fileFilterPolyView = new FileNameExtensionFilter("JavaPEG Image List", "jil");
			
			JFileChooser chooser = new JFileChooser();
							
			chooser.setAcceptAllFileFilterUsed(false);
			chooser.setDialogTitle(lang.get("maingui.tabbedpane.imagelist.filechooser.openImageList.title"));
			chooser.addChoosableFileFilter(fileFilterPolyView);
							
			File source = null;	
			
			int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	
		    	if(!imagesToViewListModel.isEmpty()) {
		    		int returnValue = JOptionPane.showConfirmDialog(null, lang.get("maingui.tabbedpane.imagelist.filechooser.openImageList.nonSavedImageListMessage"));
					
					/**
					 * 0 indicates a yes answer, and then the current list 
					 * shall be overwritten, otherwise just return.
					 */ 
					if(returnValue != 0) {
						return;
					}	
		    	}
		    			    	
		    	source = chooser.getSelectedFile();
		    	
		    	try {
					List<String> fileContent = FileUtil.readFromFile(source);
					
					imagesToViewListModel.clear();
					
					List<String> notExistingFiles = new ArrayList<String>();
									
					for(String filePath : fileContent) {
						File file = new File(filePath);
						
						if(file.exists()) {
							imagesToViewListModel.addElement(file);
						} else {
							notExistingFiles.add(filePath);
						}
					}
					
					if(!notExistingFiles.isEmpty()) {		
						StringBuilder missingFilesErrorMessage = new StringBuilder();
						
						String lS = System.getProperty("line.separator");

						missingFilesErrorMessage.append(lang.get("maingui.tabbedpane.imagelist.filechooser.openImageList.missingFilesErrorMessage"));
						missingFilesErrorMessage.append(lS);
						missingFilesErrorMessage.append(lS);
													
						for(String path : notExistingFiles) {
							missingFilesErrorMessage.append(path);
							missingFilesErrorMessage.append(lS);
						}
													
						JOptionPane.showMessageDialog(null, missingFilesErrorMessage, lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
					}
					setNrOfImagesLabels();
				} catch (IOException ioe) {
					JOptionPane.showMessageDialog(null, lang.get("maingui.tabbedpane.imagelist.filechooser.openImageList.couldNotReadFile") + "\n(" + source.getAbsolutePath() + ")", lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
					logger.logERROR("Could not read from file:");
					logger.logERROR(ioe);
				}
		    }
		}
	}
	
	private class SaveImageListListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (imagesToViewListModel.size() > 0) {
				
				FileNameExtensionFilter fileFilterPolyView = new FileNameExtensionFilter("JavaPEG Image List", "jil");
				
				JFileChooser chooser = new JFileChooser();
								
				chooser.setAcceptAllFileFilterUsed(false);
				chooser.setDialogTitle(lang.get("maingui.tabbedpane.imagelist.filechooser.saveImageList.title"));
				chooser.addChoosableFileFilter(fileFilterPolyView);
								
				File destination = null;	
				
				int returnVal = chooser.showSaveDialog(null);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	destination = chooser.getSelectedFile();			    				    	
			    	ImageList.getInstance().createList(imagesToViewListModel, destination, "jil", "JavaPEG Image List");
			    }
			}
		}
	}
	
	private class MoveImageUpInListListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int selecteIndex = imagesToViewList.getSelectedIndex();
			
			if(selecteIndex > -1) {
				if(selecteIndex > 0) {
					Object obj = imagesToViewListModel.remove(selecteIndex);
					imagesToViewListModel.add(selecteIndex - 1, obj);
					imagesToViewList.setSelectedIndex(selecteIndex - 1);
				}
			}
		}
	}
	
	private class MoveImageDownInListListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int selecteIndex = imagesToViewList.getSelectedIndex();
			
			if(selecteIndex > -1) {
				if(selecteIndex < (imagesToViewListModel.size() - 1)) {
					Object obj = imagesToViewListModel.remove(selecteIndex);
					imagesToViewListModel.add(selecteIndex + 1, obj);
					imagesToViewList.setSelectedIndex(selecteIndex + 1);
				}
			}			
		}
	}
	
	private class MoveImageToTopInListListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int selecteIndex = imagesToViewList.getSelectedIndex();
			
			if (selecteIndex > 0) {
				Object obj = imagesToViewListModel.remove(selecteIndex);
				imagesToViewListModel.add(0, obj);
				imagesToViewList.setSelectedIndex(0);
			}	
		}
	}
	
	private class MoveImageToBottomInListListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int selecteIndex = imagesToViewList.getSelectedIndex();
			
			if (selecteIndex > -1) {
				Object obj = imagesToViewListModel.remove(selecteIndex);
				imagesToViewListModel.addElement(obj);
				imagesToViewList.setSelectedIndex(imagesToViewListModel.size() - 1);
			}	
		}
	}
	
	private class OpenImageViewerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(!imagesToViewListModel.isEmpty()) {
				
				ApplicationContext ac = ApplicationContext.getInstance();
				if (ac.isImageViewerDisplayed()) {
					JOptionPane.showMessageDialog(null, lang.get("errormessage.maingui.onlyOneImageViewer"), lang.get("errormessage.maingui.informationMessageLabel"), JOptionPane.INFORMATION_MESSAGE);
				} else {
					List<File> imagesToView = new ArrayList<File>();

					for (int i = 0; i < imagesToViewListModel.size(); i++) {
						imagesToView.add((File)imagesToViewListModel.get(i));
					}

					ImageViewer imageViewer = new ImageViewer(imagesToView);
					imageViewer.setVisible(true);
					ac.setImageViewerDisplayed(true);
				}
			}
		}
	}
		
	private class ExportImageListListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (imagesToViewListModel.size() > 0) {
				
				FileNameExtensionFilter fileFilterIrfanView = new FileNameExtensionFilter("IrfanView", "txt");
				FileNameExtensionFilter fileFilterPolyView  = new FileNameExtensionFilter("PolyView" , "pvs");
				FileNameExtensionFilter fileFilterXnView    = new FileNameExtensionFilter("XnView"   , "sld");
								
				JFileChooser chooser = new JFileChooser();
								
				chooser.setAcceptAllFileFilterUsed(false);
				chooser.setDialogTitle(lang.get("maingui.tabbedpane.imagelist.filechooser.exportImageList.title"));
				chooser.addChoosableFileFilter(fileFilterIrfanView);
				chooser.addChoosableFileFilter(fileFilterPolyView);
				chooser.addChoosableFileFilter(fileFilterXnView);
												
				File destination = null;	
				
				int returnVal = chooser.showSaveDialog(null);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	destination = chooser.getSelectedFile();
			    				    
			    	String listFormat      = ((FileNameExtensionFilter)chooser.getFileFilter()).getExtensions()[0];
			    	String listDescription = ((FileNameExtensionFilter)chooser.getFileFilter()).getDescription();
										
			    	ImageList.getInstance().createList(imagesToViewListModel, destination, listFormat, listDescription);
			    }
			}
		}
	}
	
	private class AddImageToViewList implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			imagesToViewListModel.addElement(new File(e.getActionCommand()));
			setNrOfImagesLabels();
		}
	}
	
	private class AddAllImagesToViewList implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				
			File imageFilePath = new File(ApplicationContext.getInstance().getSourcePath());
			
			for (File file : imageFilePath.listFiles()) {
				try {
					if (JPEGUtil.isJPEG(file)) {
						imagesToViewListModel.addElement(file);
					}
				} catch (FileNotFoundException fnfex) {
					JOptionPane.showMessageDialog(null, lang.get("fileretriever.canNotFindFile") + "\n(" + file.getAbsolutePath() + ")", lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
					logger.logERROR("Could not find file:");
					logger.logERROR(fnfex);
				} catch (IOException iox) {
					JOptionPane.showMessageDialog(null, lang.get("fileretriever.canNotReadFromFile") + "\n(" + file.getAbsolutePath() + ")", lang.get("errormessage.maingui.errorMessageLabel"), JOptionPane.ERROR_MESSAGE);
					logger.logERROR("Can not read from file:");
					logger.logERROR(iox);
				}
			}
			setNrOfImagesLabels();
		}		
	}
	
	private class ImagesToViewListListener implements ListSelectionListener {
		
		public void valueChanged(ListSelectionEvent e) {
			int selectedIndex = imagesToViewList.getSelectedIndex();
						
			if (selectedIndex > -1) {
				JPEGThumbNail thumbNail = JPEGThumbNailRetriever.getInstance().retrieveThumbNailFrom((File)imagesToViewListModel.get(selectedIndex));
				imagePreviewLabel.setIcon(new ImageIcon(thumbNail.getThumbNailData()));
			}
		}
	}
	
	private class MouseButtonListener extends MouseAdapter{
		public void mouseReleased(MouseEvent e){
			if(e.isPopupTrigger() && (mainTabbedPane.getSelectedIndex() == 1)) {
				rightClickMenu.show(e.getComponent(),e.getX(), e.getY());
				popupMenuAddImageToViewList.setActionCommand(((JButton)e.getComponent()).getActionCommand());
			}
		}
	}
}