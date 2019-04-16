package io.github.dalayach.Print_tools;

public class TUTORIAL_RUN_ME extends String_printer
{

   public static void how_to_use_String_printer()
   {
   
      System.out.print("String_printer sp = new String_printer();");
      String_printer sp = new String_printer();
      
      System.out.print("\n\n//Left justified");
      System.out.print("\nsp.print_l(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      sp.print_l(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_l(false, 20, \"ace\", \"ventura\", \"show\");    = ");
      sp.print_l(false, 20, "ace", "ventura", "show");
      
      System.out.print("\n\n//Right justified");
      System.out.print("\nsp.print_r(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      sp.print_r(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_r(false, 20, \"ace\", \"ventura\", \"show\");    = ");
      sp.print_r(false, 20, "ace", "ventura", "show");
      
      System.out.print("\n\n//Center justified");
      System.out.print("\nsp.print_c(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      sp.print_c(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_c(false, 20, \"ace\", \"ventura\", \"show\");    = ");
      sp.print_c(false, 20, "ace", "ventura", "show"); 
      
      
      
      System.out.println("\n\n\n\n/* Arrays work too! */\n\nString arr[] = {\"ace\", \"ventura\", \"show\"};");
      String[] arr = {"ace", "ventura", "show"};
   
      System.out.print("\nsp.print_c(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      sp.print_c(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_c(true, 20, arr);                          = ");
      sp.print_c(true, 20, arr);       
      
      
      System.out.print("\n\n\n\n/* You can control the size of each column too! */\n");
      
      System.out.print("\nsp.print_c(true, 20, arr);                          = ");
      sp.print_c(true, 20, arr);
      System.out.print("\nsp.print_c(true, 10, arr);                          = ");
      sp.print_c(true, 10, arr);
      
      System.out.print("\n/\n* If the size parameter is too small, all columns (FOR THAT ROW ONLY) will automatically extend to the size of the widest column */\n");
      System.out.print("\nsp.print_c(true, 20, arr);                          = ");
      sp.print_c(true, 20, arr);
      System.out.print("\nsp.print_c(true, 10, arr);                          = ");
      sp.print_c(true, 10, arr);
      System.out.print("\nsp.print_c(true, 5, arr);                           = ");
      sp.print_c(true, 5, arr);
      System.out.print("\nsp.print_c(true, 3, arr);                           = ");
      sp.print_c(true, 3, arr);
      System.out.print("\nsp.print_c(true, 1, arr);                           = ");
      sp.print_c(true, 1, arr);
      System.out.print("\nsp.print_c(true, 0, arr);                           = ");
      sp.print_c(true, 0, arr);
      System.out.print("\nsp.print_c(true, -1, arr);                          = ");
      sp.print_c(true, 0, arr);
      
      System.out.println("\n\n\n\n/* Overloaded version of the function WITHOUT the border check. Basically, it gives"
         + " borders without asking you. */");
         
         
      System.out.print("\nsp.print_c(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      sp.print_c(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_c(true, 20, arr);                          = ");
      sp.print_c(true, 20, arr);
      System.out.print("\nsp.print_c(20, arr);                                = ");
      sp.print_c(20, arr);
      
      
   }
   
   public static void main(String[] args)
   {
   
      how_to_use_String_printer();
   
   }

}