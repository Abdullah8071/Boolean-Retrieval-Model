import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//import BooleanModel.Boo;
//import BooleanModel.Tokenizer;

public class IR {
	
	//private static ArrayList<String> collection1;
	
	public static class Boole{
		public ArrayList<String> fetchDocuments ( ) throws FileNotFoundException {
	        ArrayList<String> collection = new ArrayList<String>(); 
	        
	    //File fetching
	        collection.addAll(fetchFromFile(new File("dataset\\speech_0.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_1.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_2.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_3.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_4.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_5.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_6.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_7.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_8.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_9.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_10.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_11.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_12.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_13.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_14.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_15.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_16.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_17.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_18.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_19.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_20.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_21.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_22.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_23.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_24.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_25.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_26.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_27.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_28.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_29.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_30.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_31.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_32.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_33.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_34.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_35.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_36.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_37.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_38.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_39.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_40.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_41.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_42.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_43.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_44.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_45.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_46.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_47.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_48.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_49.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_50.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_50.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_51.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_52.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_53.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_54.txt")));
	        collection.addAll(fetchFromFile(new File("dataset\\speech_55.txt")));
	        
	        
	        return collection;  
		} 
		
	    //Tokenization Process
	    private ArrayList<String> fetchFromFile ( File file ) throws FileNotFoundException {
	        Scanner sc = new Scanner(file);
	        
	        String str = "";
	        Tokenizer t = new Tokenizer();
	        ArrayList<String> collection = new ArrayList<String>();
	        while ( sc.hasNext() ) {
	            String temp = sc.nextLine();
	            
	            
	                if ( str.length() > 0 ) {
	                    collection.add(str);
	                    str = "";
	                }
	                
	             
	                temp = t.tokenize(temp);
	                str = str + temp + ' ';
	            
	        }
	        
	        if ( !str.isEmpty() ) collection.add(str);
	        
	        return collection;
	    }
	    //Stop Words Fetch
	    public ArrayList<String> fetchStopword ( ) throws FileNotFoundException {
	        File file = new File("dataset/Stopword-List.txt");
	        Scanner sc = new Scanner(file);
	        
	        ArrayList<String> list = new ArrayList<String>();
	        while ( sc.hasNext() ) list.add(sc.nextLine());
	        
	        return list;
	    }
	    
	    public ArrayList<String> fetchQuery ( ) throws FileNotFoundException { 
	        File file = new File("dataset/QueryList.txt");
	        Scanner sc = new Scanner(file);
	        
	        ArrayList<String> list = new ArrayList<String>();
	        while ( sc.hasNext() ) list.add(sc.nextLine());
	        
	        return list;
	    }
		}
	    public  static class Tokenizer {
	        public String tokenize ( String str ) {
	            str = str.toLowerCase();
	            
	            String toReturn = "";
	            String[] array = str.split(" ");
	            for ( int i=0; i<array.length; ++i ) 
	                toReturn = toReturn + removeSpecial(array[i]) + ' ';
	            
	            return toReturn;
	        }
	        //Stop Words Removal
	        public String removeStopword ( String str, ArrayList<String> stopword ) {
	            String toReturn = "";
	            String[] array = str.split(" ");
	            
	            for ( int i=0; i<array.length; ++i ) {
	                if ( !(stopword.contains(array[i])) ) toReturn = toReturn + array[i] + ' ';
	            }
	            
	            return toReturn;
	        }
	        
	    
	        private String removeSpecial ( String str ) {
	            return str.replaceAll("[^a-zA-Z0-9]", "");
	        }
	        
	    }
	    //Invertred Index Generation
	    public static class  InvertedIndex {
	        public Map<String, ArrayList<Integer>> dictionary;
	        int count=0;
	        
	        public InvertedIndex ( ) {
	            dictionary = new HashMap<String, ArrayList<Integer>>();
	           // Map<String, Map<String, Integer>> wordToDocumentMap;
	           
	        }
	        
	        public InvertedIndex constructIndex ( Boole bm, ArrayList<String> collection, Tokenizer t ) throws FileNotFoundException {
	             ArrayList<String> stopword = bm.fetchStopword();
	                //int count=0;         
	             Map<String, Set<Doc>> wordDocMap = new HashMap<>();
	             //System.out.print(collection);
	            for ( int i=0; i<collection.size(); ++i ) {
	                String temp = t.removeStopword(collection.get(i), stopword);
	                String[] array = temp.split(" ");
	                
	                for ( int j=1; j<array.length; ++j ) {
	                    if ( !(this.dictionary.containsKey(array[j])) ) {
	                    	//Map<String, Integer> documentToCountMap = wordToDocumentMap.get(array[j]);
	                        ArrayList<Integer> list = new ArrayList<Integer>();
	                        list.add((i+1)/2);
	                       // count=count+1;
	                                        
	                        this.dictionary.put(array[j], list);
	                    } else {
	                        ArrayList<Integer> list = this.dictionary.get(array[j]);
	                        list.add((i+1)/2);
	                                        
	                        this.dictionary.put(array[j], list);
	                    }
	                }
	                
	                count=count+1;
	            }
	           // System.out.print(count);
	            this.sortAndRemoveDuplicateHash();
	            return this;
	        }
	      
			
	       
	        //Posting List
	        private ArrayList<Integer> removeDuplicate ( ArrayList<Integer> posting ) {
	            ArrayList<Integer> removeDuplicate = new ArrayList<Integer>();
	            for ( int i=0; i<posting.size(); ++i ) {
	                if( !removeDuplicate.contains(posting.get(i)) ) removeDuplicate.add(posting.get(i));
	            }
	            
	            return removeDuplicate;
	        }
	        
	        private void sortAndRemoveDuplicateHash ( ) {
	            for ( Map.Entry<String, ArrayList<Integer>> entry : dictionary.entrySet() ) {
	                entry.setValue(removeDuplicate(entry.getValue()));
	                Collections.sort(entry.getValue());
	            }
	            
	            Map<String, ArrayList<Integer>> map = new TreeMap<String, ArrayList<Integer>>(dictionary);
	            dictionary = map;
	        }
	        
	       public static class Doc {
	            String docName;
	            Map<String, Integer> m = new HashMap<>();

	            public Doc(String docName){
	                this.docName = docName;
	            }
	            public String getDocName() {
	                return this.docName;
	            }
	       }
	       //Document Index Print
	        public void printIndex ( ) {
	            for ( Map.Entry<String, ArrayList<Integer>> entry : dictionary.entrySet() ) {
	                System.out.print(entry.getKey() + " " + entry.getValue().size() + " -> ");
	                for ( int i=0; i<entry.getValue().size(); ++i ) System.out.print(entry.getValue().get(i) + " ");
	                System.out.println();
	            }
	        }
	        //File exception handling
	        public void writeIndexToFile ( ) throws IOException {
	            File file = new File("dataset/InvertedIndex.txt");
	            int k = 0;
	            if ( !file.exists() ) 
	                file.createNewFile();
	            
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            Map<String, Map<String, Integer>> wordToDocumentMap;
	           
	            int j=0;
	            for ( Map.Entry<String, ArrayList<Integer>> entry : dictionary.entrySet() ) {
	                if ( j>=1 ) {
	                    bw.write(entry.getKey() + " " + entry.getValue().size() + " -> ");
	                    for ( int i=0; i<entry.getValue().size(); ++i ) 
	                    	//k=(entry.getValue().get(i)/84)+1;
	                    	bw.write(entry.getValue().get(i) + " ");
	                    	bw.newLine();
	                    //getValue().get(i)
	                    
	                    
	                } else ++j;
	            }
	            
	            bw.flush();
	            bw.close();
	        }
	    }
	    //Position Index
	    public static class PositionalIndex {
	        public Map<String, pTerm> dictionary = new HashMap<String, pTerm>();
	        
	        public PositionalIndex constructIndex ( Boole bm, ArrayList<String> collection, Tokenizer t ) throws FileNotFoundException {
	            ArrayList<String> stopword = bm.fetchStopword();
	                            
	            for ( int i=0; i<collection.size(); ++i ) {
	                String temp = t.removeStopword(collection.get(i), stopword);
	                String[] array = temp.split(" ");
	                                
	                for ( int j=1; j<array.length; ++j ) {
	                    if ( !(this.dictionary.containsKey(array[j])) ) {
	                        pTerm term = new pTerm();
	                        term.documentFrequency++;
	                        term.documentNumber.add((i+1)/2);
	                        
	                        term.documentPosition.add(new ArrayList<Integer>());
	                        term.documentPosition.get(0).add(j+1);
	                        
	                        this.dictionary.put(array[j], term);
	                    } else {
	                        pTerm term = this.dictionary.get(array[j]);
	                        term.documentFrequency++;
	                        
	                        if ( term.documentNumber.contains(i+1) ) {
	                            boolean found = false;
	                            for ( int k=0; !found && k<term.documentNumber.size(); ++k ) {
	                                if ( term.documentNumber.get(k) == i+1 ) {
	                                    found = true;
	                                    term.documentPosition.get(k).add(j+1);
	                                    this.dictionary.put(array[j], term);
	                                }
	                            }
	                        } else {
	                            term.documentNumber.add(i+1);
	                        
	                            term.documentPosition.add(new ArrayList<Integer>());
	                            term.documentPosition.get(term.documentPosition.size()-1).add(j+1);
	                            
	                            this.dictionary.put(array[j], term);
	                        }
	                    }
	                }
	            }
	            
	            Map<String, pTerm> map = new TreeMap<String, pTerm>(dictionary);
	            dictionary = map;
	            
	            return this;
	        }
	        
	        public void printIndex ( ) {
	            for ( Map.Entry<String, pTerm> entry : dictionary.entrySet() ) {
	                System.out.println("<" + entry.getKey() + ", " + entry.getValue().documentFrequency);
	                for ( int i=0; i<entry.getValue().documentNumber.size(); ++i ) {
	                    System.out.print("D" + entry.getValue().documentNumber.get(i) + ": ");
	                    for ( int j=0; j<entry.getValue().documentPosition.get(i).size(); ++j ) System.out.print(entry.getValue().documentPosition.get(i).get(j) + " ");
	                    System.out.println();
	                }
	                System.out.println(">");
	            }
	        }
	        //Writing positional index to a new file
	        public void writeIndexToFile ( ) throws IOException {
	            File file = new File("dataset/Positional-Index.txt");
	            int l=0;
	            if ( !file.exists() ) 
	                file.createNewFile();
	            
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            
	            int k=0;
	            for ( Map.Entry<String, pTerm> entry : dictionary.entrySet() ) {
	                if ( k>=1 ) {
	                    bw.write("<" + entry.getKey() + ", " + entry.getValue().documentFrequency);
	                    bw.newLine();
	                    for ( int i=0; i<entry.getValue().documentNumber.size(); ++i ) {
	                    	
	                        bw.write("D" + entry.getValue().documentNumber.get(i) + ": ");
	                        for ( int j=0; j<entry.getValue().documentPosition.get(i).size(); ++j ) bw.write(entry.getValue().documentPosition.get(i).get(j) + " ");
	                        bw.newLine();
	                    }
	                       
	                    bw.write(">"); bw.newLine();
	                } else ++k;
	            }
	            
	            bw.flush();
	            bw.close();
	        }
	    }
	    public static class pTerm {
	        public int documentFrequency = 0;
	        public ArrayList<Integer> documentNumber;
	        public ArrayList<ArrayList<Integer>> documentPosition;
	        
	        public pTerm ( ) {
	            documentNumber = new ArrayList<Integer>();
	            documentPosition = new ArrayList<ArrayList<Integer>>();
	        }
	    }
	    //Query reading and parsing
	    public static class QueryHandler {
	        public ArrayList<Integer> processBoolean ( String query, InvertedIndex ii, ArrayList<String> collection ) {
	            String[] array = query.split(" ");
	            
	            ArrayList<Integer> list = new ArrayList<Integer>();
	            if ( array.length > 0 ) {
	                int start = 2;
	                
	                if ( "NOT".equals(array[0]) ) {
	                    list = ii.dictionary.get(array[1]);
	                    ArrayList<Integer> temp = new ArrayList<Integer>();
	                    for ( int i=1; i<collection.size(); ++i ) {
	                        if ( !list.contains(i) ) temp.add(i);
	                    }
	                    
	                    list = temp;
	                    start = 3;
	                }
	                else list = ii.dictionary.get(array[0]);
	                
	                for ( int i=start; i<array.length; i+=2 ) {
	                    if ( "AND".equals(array[i-1]) ) {
	                        if ( !("NOT".equals(array[i])) ) {
	                            if ( ii.dictionary.containsKey(array[i]) ) list.retainAll(ii.dictionary.get(array[i]));
	                            else return (new ArrayList<Integer>());
	                        } else {
	                            ArrayList<Integer> tmp = new ArrayList<Integer>();
	                            for ( int j=0; j<collection.size(); ++j ) tmp.add(j+1);
	                            if ( ii.dictionary.containsKey(array[i+1]) ) {
	                                tmp.removeAll(ii.dictionary.get(array[i+1]));
	                                list.retainAll(tmp);
	                                i = i+1;
	                            }
	                        }
	                    } else if ( "OR".equals(array[i-1]) ) {
	                        if ( !("NOT".equals(array[i])) ) {
	                            if ( ii.dictionary.containsKey(array[i]) ) list.addAll(ii.dictionary.get(array[i]));
	                        } else {
	                            ArrayList<Integer> tmp = new ArrayList<Integer>();
	                            for ( int j=0; j<collection.size(); ++j ) tmp.add(j+1);
	                            if ( ii.dictionary.containsKey(array[i+1]) ) {
	                                tmp.removeAll(ii.dictionary.get(array[i+1]));
	                                list.addAll(tmp);
	                                i = i+1;
	                            }
	                        } 
	                    }
	                }
	            }
	            
	            removeDuplicate(list);
	            return list;
	        }
	        //Proximity query processing
	        public ArrayList<Integer> processProximity ( String query, PositionalIndex pi, ArrayList<String> collection ) {
	            String[] array = query.split(" ");
	            
	            ArrayList<Integer> result = new ArrayList<Integer>();
	            
	            if ( array.length > 0 ) {
	                String regex = "(.*)" + array[0];
	                for ( int i=2; i<array.length; i+=2 ) {
	                    String positional = array[i+1];
	                    positional = positional.substring(1);

	                    for ( int j=1; j<Integer.parseInt(positional); ++j ) regex += "\\s(\\S+)";
	                    
	                    regex += "\\s";
	                    regex += array[i];
	                    regex += "(.*)";
	                    
	                    ++i;
	                }
	                
	                for ( int i=0; i<collection.size(); ++i ) {
	                    if ( collection.get(i).matches(regex) ) result.add(i+1);
	                }
	                
	                solve(collection, result, regex, 0);
	            }
	            
	            return result;
	        }
	        
	        private void solve ( ArrayList<String> collection, ArrayList<Integer> result, String regex, int iterator ) {
	            String newRegex = regex;
	            int index = newRegex.indexOf("(\\S+)");
	            
	            if ( index != -1 ) {
	                String afterChange = newRegex.substring(0, index)+newRegex.substring(index+5, newRegex.length());
	                
	                if ( afterChange.contains("\\s\\s") ) {
	                    int in = afterChange.indexOf("\\s\\s");
	                    
	                    afterChange = afterChange.substring(0, in)+afterChange.substring(in+2, afterChange.length());
	                }
	                
	                for ( int i=0; i<collection.size(); ++i ) {
	                    if ( collection.get(i).matches(afterChange) ) result.add(i+1);
	                }
	                
	                solve(collection, result, afterChange, iterator+1);
	            }
	        }
	        
	        public ArrayList<Integer> processPhrase ( String query, InvertedIndex ii, ArrayList<String> collection ) {
	            String[] array = query.split(" ");
	            
	            ArrayList<Integer> list = new ArrayList<Integer>();
	            if ( array.length > 0 ) {
	                list = ii.dictionary.get(array[0]);
	                if ( array.length > 1 ) {
	                    for ( int i=1; i<array.length; ++i ) {
	                        if ( ii.dictionary.containsKey(array[i]) ) list.retainAll(ii.dictionary.get(array[i]));
	                        else return (new ArrayList<Integer>());
	                    }
	                }
	            }
	            
	            ArrayList<Integer> phraseList = new ArrayList<Integer>();
	            if ( list != null ) {
	                for ( int i=0; i<list.size(); ++i ) {
	                    if ( collection.get(list.get(i)-1).contains(query) ) phraseList.add(list.get(i));
	                }
	            }
	            
	            return phraseList;
	        }
	        
	        private ArrayList<Integer> removeDuplicate ( ArrayList<Integer> list ) {
	            ArrayList<Integer> unique = new ArrayList<Integer>();
	            for ( int i=0; i<list.size(); ++i ) {
	                if ( !unique.contains(list.get(i)) ) unique.add(list.get(i));
	            }
	            
	            return unique;
	        }
	        public void printList ( ArrayList<Integer> list ) {
	            if ( list != null ) {
	            	//int k=0;
	            	 for ( int i=0; i<list.size(); ++i ) 
	            		 System.out.print(list.get(i) + " ");
	                //System.out.println();
	            }
	        }
	    }
	    //Main Function
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 ArrayList<String> collection1 = new ArrayList<String>();
		 //ArrayList<String> collection2 = new ArrayList<String>();
		IR b1 = new IR();
		Boole b2 = new Boole();
		collection1 = b2.fetchDocuments();
		//collection2= b2.fetchStopword();
		Tokenizer t = new Tokenizer();
		InvertedIndex ii = new InvertedIndex();
		ii.constructIndex(b2, collection1, t);
		ii.writeIndexToFile();
		PositionalIndex pi = new PositionalIndex();
		pi.constructIndex(b2, collection1, t);
		pi.writeIndexToFile();
		QueryHandler q1 = new QueryHandler();
		ArrayList<Integer> query1 = new ArrayList<Integer>();
		
		
		
//System.out.println();
		
		System.out.println("\nTesting queries \n");
		String query = "not hammer";	
		query1=q1.processBoolean(query, ii, collection1);
		System.out.println("\nAnswer: \n");
		q1.printList(query1);
		 query = "united OR plane";	
		query1=q1.processBoolean(query, ii, collection1);
		System.out.println("\nAnswer \n");
		q1.printList(query1);
		 query = "busy";	
		query1=q1.processBoolean(query, ii, collection1);
		System.out.println("\nAnswer \n");
		q1.printList(query1);
		
		
		System.out.println("\nEnter Query to search");
		Scanner scan = new Scanner(System.in);
		String query2 = scan.next();
		query2=query2.toLowerCase();
		query1=q1.processBoolean(query2, ii, collection1);
		System.out.println("\nAnswer \n");
		q1.printList(query1);
		
		
		query1=q1.processProximity(query, pi, collection1);
		q1.printList(query1);
		
		//q1.processBoolean(query, ii, collection1);
		//q1.processPhrase(query, ii, collection1);
		 
	}
	

}
