package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private static  Properties properties;
    private final static String propertyFilePath = "src/test/resources/configs/Configuration.properties";

    public static void configFileRead() {
        
//        try {
//            FileInputStream inputStream = new FileInputStream(propertyFilePath);
//            properties.load(inputStream);
//            inputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        	try {
    			FileInputStream fis;
    			fis = new FileInputStream(propertyFilePath);
    			properties = new Properties();

    			try {
    				properties.load(fis);
    				fis.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    			throw new RuntimeException("Config.properties not found at" + propertyFilePath);
    		}
        }
    

    public static String browserType() {
		String browser = properties.getProperty("browser");
		LoggerLoad.info("Get Browser Type from Properties");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Browser Not Specified in Config.Properties file");
	}
//    public static String getProperty(String key) {
//        return properties.getProperty(key);
//    }
    public static String applicationUrl() {
		String url = properties.getProperty("appurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Config.properties file");
	}

	// HomePage URL
	public static String gethomePage() {
		String homePageurl = properties.getProperty("homepageurl");
		if (homePageurl != null)
			return homePageurl;
		else
			throw new RuntimeException("HomePageurl not specified in the Config.properties file");
	}
	
	//ResisterPage URL		
	public static String getRegisterPage(){
		String registerurl=properties.getProperty("registerurl");
		if (registerurl != null)
			return registerurl;
		else 
			throw new RuntimeException("ResisterPage not specified in the Config.properties file");
	}

	
	//SigninPage URL		
	public static String getSigninPage(){
		String signinurl=properties.getProperty("signinurl");
		if (signinurl != null)
			return signinurl;
		else 
			throw new RuntimeException("ResisterPage not specified in the Config.properties file");				
	}

	public static String geturl(String pagename) {
		String url = properties.getProperty(pagename);
		if (url != null)
			return url;
		else
			throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
	}
	public static String getexcelfilepath() {
		String excelfilelpath = properties.getProperty("excelpath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	}
	
	
	//DataStructure URL		
			public static String DataStructureIntroPage(){
				String dsurl=properties.getProperty("datastructureintrourl");
				if (dsurl != null)
					return dsurl;
				else 
					throw new RuntimeException("DataStructure Intro URL not specified in the Config.properties file");				
			}
			
			public static String DataStructureTimeComplexityPage(){
				String dsurl=properties.getProperty("datastructuretimecomplexity");
				if (dsurl != null)
					return dsurl;
				else 
					throw new RuntimeException("DataStructure time complexity URL not specified in the Config.properties file");				
			}
			
			public static String DataStructureTryEditorPage(){
				String dsurl=properties.getProperty("datastrcuturetryeditor");
				if (dsurl != null)
					return dsurl;
				else 
					throw new RuntimeException("DataStructure try editor URL not specified in the Config.properties file");				
			}
			
			//stack URL		
			public static String StackIntroPage(){
				String stackurl=properties.getProperty("stackhomepage");
				if (stackurl != null)
					return stackurl;
				else 
					throw new RuntimeException("Stack Intro URL not specified in the Config.properties file");				
			}
			public static String StackOperationPage(){
				String stacoperationkurl=properties.getProperty("operationstackpage");
				if (stacoperationkurl != null)
					return stacoperationkurl;
				else 
					throw new RuntimeException("Stack operation URL not specified in the Config.properties file");	
			
	}
			public static String StacktryherePage(){
				String stactryherekurl=properties.getProperty("tryherestackpage");
				if (stactryherekurl != null)
					return stactryherekurl;
				else 
					throw new RuntimeException("Stack tryhere URL not specified in the Config.properties file");	
			}
			public static String StacktryeditorPage(){
						String stacktryeditorkurl=properties.getProperty("tryherestackpage");
				if (stacktryeditorkurl != null)
					return stacktryeditorkurl;
				else 
					throw new RuntimeException("Stack tryhereeditor URL not specified in the Config.properties file");	
			}
			public static String Stackpracticspage(){
						String stackpracticskurl=properties.getProperty("tryherestackpage");
						if (stackpracticskurl != null)
							return stackpracticskurl;
						else 
							throw new RuntimeException("Stack practics URL not specified in the Config.properties file");	
	}

			//Array URL
			public static String arrayPageURL() {
				String arrayPageurl = properties.getProperty("Arraypage");
				if (arrayPageurl != null)
					return arrayPageurl;
				else
					throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
			}
			
			public static String ArraysinPythonpageurl() {
				String ArraysinPython = properties.getProperty("ArraysinPythonpage");
				if (ArraysinPython != null)
					return ArraysinPython;
				else
					throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
			}
			public static String tryEditorURL() {
				String tryeditorurl = properties.getProperty("TryEditorPage");
				if (tryeditorurl != null)
					return tryeditorurl;
				else
					throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
			}
			
			public static String arraylisturl() {
				String arraylist = properties.getProperty("ArraysUsingList");
				if (arraylist != null)
					return arraylist;
				else
					throw new RuntimeException("ArraysUsingList not specified in the Configuration.properties file.");
			}
			
			public static String arraybasicoperationutl() {
				String arraybasicoperationlist = properties.getProperty("BasicOperationsinLists");
				if (arraybasicoperationlist != null)
					return arraybasicoperationlist;
				else
					throw new RuntimeException("BasicOperationsinLists not specified in the Configuration.properties file.");
			}
			public static String arrayapplicationurl() {
				String arryapplicationpage = properties.getProperty("ApplicationsofArray");
				if (arryapplicationpage != null)
					return arryapplicationpage;
				else
					throw new RuntimeException("ApplicationsofArray not specified in the Configuration.properties file.");
			}
			
			public static String arraypracticepageurl() {
				String arrypracticepage = properties.getProperty("Practicepage");
				if (arrypracticepage != null)
					return arrypracticepage;
				else
					throw new RuntimeException("BasicOperationsinLists not specified in the Configuration.properties file.");
			}
			
			public static String arrayquestionurl() {
				String arryquestionpage = properties.getProperty("QuestionSearchthearray");
				if (arryquestionpage != null)
					return arryquestionpage;
				else
					throw new RuntimeException("BasicOperationsinLists specified in the Configuration.properties file.");
			}
			
			public static String QuestionFindNumberswithEvenNumberofDigitsurl() {
				String QuestionFindNumberswithEvenNumberofDigitspage = properties.getProperty("QuestionFindNumberswithEvenNumberofDigits");
				if (QuestionFindNumberswithEvenNumberofDigitspage != null)
					return QuestionFindNumberswithEvenNumberofDigitspage;
				else
					throw new RuntimeException("QuestionFindNumberswithEvenNumberofDigits specified in the Configuration.properties file.");
			}
			
			public static String QuestionSquaresofaSortedArrayurl() {
				String QuestionSquaresofaSortedArrayurlpage = properties.getProperty("QuestionSquaresofaSortedArray");
				if (QuestionSquaresofaSortedArrayurlpage != null)
					return QuestionSquaresofaSortedArrayurlpage;
				else
					throw new RuntimeException("QuestionSquaresofaSortedArray specified in the Configuration.properties file.");
			}
			// Linked list	
			public static String getLinkedListUrl() {								  
					String linkedlisturl = properties.getProperty("linkedlisturl");
					if (linkedlisturl != null)
						return linkedlisturl;
					else
						throw new RuntimeException("linked list url not specified in the Configuration.properties file.");
		  
				}
		
				
		
			
			public static String getlinktoqueue()
			{
				String read_queue = properties.getProperty("queueurl");
				if (read_queue !=null)
				{
					return read_queue;
				}
				else
				{
					throw new RuntimeException("QUEUE  page url not specified in config file");
				}
			}
				
				public static String getImpOfQPythonUrl()
				{
					String read_linkq = properties.getProperty("Queue_impurl");
					if(read_linkq != null)
					{	
						return read_linkq;
					}
					else
				      throw new RuntimeException("Queue Implementation  page not specified in config file");
					
				}
				public static String getEditorUrl()
				{
					String ed = properties.getProperty("editorurl");
					if (ed != null)
					{
						return ed;
					}
					else
						throw new RuntimeException("Editor page url not specified in config file");
				}
				
				public static String getImpCollDQUrl()
				{
					String coln = properties.getProperty("Queue_collect");
					if(coln!=null)
						return coln;
					else
						throw new RuntimeException("Collection page url not specified in config file");
						
				}
				
				public static String getqueue_array()
				{
					String arr = properties.getProperty("Queue_imp_array");
					if(arr!=null)
						return arr;
					else
						throw new RuntimeException("Queue Implementatiom Array page url not specified in config file");
						
				}
				
				public static String getqueue_opns()
				{
					String q_opr = properties.getProperty("Queue_operations");
					if(q_opr!=null)
						return q_opr;
					else
						throw new RuntimeException("Queue Opeartions page url not specified in config file");
						
				}
				public static String getQPracQuesUrl()
				{
					String p_qt = properties.getProperty("Prac_quest");
					if(p_qt!=null)
						return p_qt;
					else
						throw new RuntimeException("Practice Question page url not specified in config file");
						
				}
				
				// GraphPage URL

				public static String getGraphPage() {
					String graphurl = properties.getProperty("graphpageurl");
					if (graphurl != null)
						return graphurl;
					else
						throw new RuntimeException("GraphPage not specified in the Config.properties file");

				}

				// GraphPageLink URL

				public static String getGraphlinkPage() {
					String glinkurl = properties.getProperty("graphlinkurl");
					if (glinkurl != null)
						return glinkurl;
					else
						throw new RuntimeException("GraphPage link not specified in the Config.properties file");

				}
			//GraphRepresntationPageLink URL

				public static String getGraphReplinkPage() {
					String greplinkurl = properties.getProperty("graphrepresentationslinkurl");
					if (greplinkurl != null)
						return greplinkurl;
					else
						throw new RuntimeException("Graph Representations Page link not specified in the Config.properties file");

				}

			//GraphPracticeQuestionLink URL

				public static String getGraphPQlinkPage() {
					String gpracqlinkurl = properties.getProperty("graphpracticelinkurl");
					if (gpracqlinkurl != null)
						return gpracqlinkurl;
					else
						throw new RuntimeException("Graph Representations Page link not specified in the Config.properties file");

				}
				
				public static String TreePage(){
					String treepageurl=properties.getProperty("treepageurl");
					if (treepageurl != null)
						return treepageurl;
					else 
						throw new RuntimeException("treepage not specified in the Config.properties file");
				
				
			}
				
				public static String TreeOverviewPage(){
					String overviewtreepageurl=properties.getProperty("treeoverviewurl");
					if (overviewtreepageurl != null)
						return overviewtreepageurl;
					else 
						throw new RuntimeException("treepageoverview not specified in the Config.properties file");
				
				
				}
				
				public static String TryEditorPage(){
					String tryeditorpageurl=properties.getProperty("treetryeditorurl");
					if (tryeditorpageurl != null)
						return tryeditorpageurl;
					else 
						throw new RuntimeException("treetryeditor page url not specified in the Config.properties file");			
				}
				
				//TRYEDITOR URL
				public static String tryeditorPage() {
					String try_edurl = properties.getProperty("tryeditorurl");
					if (try_edurl != null)
						return try_edurl;
					else
						throw new RuntimeException("TryEditorPage not specified in the Config.properties file");

				}
				
				//LinkedlistPage  URL
				
				public static String linklist_getstarted() {
					String linklist_gs = properties.getProperty("linkedlist");
					if (linklist_gs!= null) {
						return linklist_gs;
					} else {
						throw new RuntimeException("Linkeslist page url not specified in config file");
					}
				}
				
				
				// LINKEDLIST INTRO URL
				
				public static String linklist_int() {
					String linklist_int = properties.getProperty("linkedlist_intro");
					if (linklist_int!= null) {
						return  linklist_int;
					} else {
						throw new RuntimeException("Linkedlist Intro  page url not specified in config file");
					}
				}
				
				//LINKEDLIST CREATION PAGE URL
				
				
				public static String linklist_creation() {
					String linklist_crt = properties.getProperty("linkedlist_create");
					if (linklist_crt!= null) {
						return linklist_crt;
					} else {
						throw new RuntimeException("Linkedlist creation page url not specified in config file");
					}
				}
				
				//LINKEDLIST Types of Linked list
				
				public static String linklist_types() {
					String linklist_typs = properties.getProperty("linkedlist_type_of_linklist");
					if (linklist_typs!= null) {
						return linklist_typs;
					} else {
						throw new RuntimeException("Linkedlist Types page url not specified in config file");
					}
				}
				
				//LINKEDLIST Implemention in Python
				public static String linklist_python() {
					String linklist_pyt = properties.getProperty("linkedlist_im_in_python");
					if ( linklist_pyt != null) {
						return  linklist_pyt;
					} else {
						throw new RuntimeException("Linkedlist Implemention in Python page url not specified in config file");
					}
				}
				
				//LINKEDLIST  Traversal
				
				
					public static String linklist_traversal() {
						String linklist_trv = properties.getProperty("linkedlist_traversal");
						if ( linklist_trv != null) {
							return  linklist_trv;
						} else {
							throw new RuntimeException("Linkedlist Traversal page url not specified in config file");
						}
					}
					
					//LINKEDLIST  Insertion
					
					
						public static String linklist_insertion() {
							String linklist_ins = properties.getProperty("linkedlist_insertion");
							if ( linklist_ins != null) {
								return  linklist_ins;
							} else {
								throw new RuntimeException("Linkedlist Insertion page url not specified in config file");
							}
						}
					
						//LINKEDLIST Deletion
						
						
						public static String linklist_deletion() {
							String linklist_del = properties.getProperty("linkedlist_deletion");
							if ( linklist_del != null) {
								return  linklist_del;
							} else {
								throw new RuntimeException("Linkedlist Deletion page url not specified in config file");
							}
						}
			            //LINKEDLIST Practice Question
						
						
						public static String linklist_Practquest() {
							String linklist_pq = properties.getProperty("linkedlist_pracq");
							if (  linklist_pq != null) {
								return   linklist_pq;
							} else {
								throw new RuntimeException("Linkedlist Deletion page url not specified in config file");
							}
						
}
}





		
		
		

