package week7;

class RangeException extends Exception {     
    public RangeException(String message) {  
            super(message);  
        }  
    }  
      
    public class StudentMarks {     
        public static void main(String[] args) {         
            try {              
                if (args.length != 7) {  
                    System.out.println("Please enter student's name followed by marks in 6 subjects.");                 
                    return;  
                }  
                String studentName = args[0];  
                int totalMarks = 0;  
      
                for (int i = 1; i < 7; i++) {  
                    int marks = Integer.parseInt(args[i]);                 
                if (marks < 0 || marks > 50) {  
                        throw new RangeException("Marks for subject " + i + " are out of range (0-50).");  
                }  
                totalMarks += marks;  
                }  
      
                double percentage = (double) totalMarks / 300 * 100;             
                System.out.println("Student: " + studentName);  
                System.out.println("Total Marks: " + totalMarks);  
                System.out.println("Percentage: " + percentage + "%");  
            } catch (RangeException e) {  
                System.out.println(e.getMessage());  
            } catch (NumberFormatException e) {  
                System.out.println("Invalid number format. Please enter valid integers for marks.");  
            }  
        }  
    }  
    
