//package test;
//
//import java.util.*;
//import java.lang.*;
//import java.util.regex.*;
//
//class TransactionParty {
//         String seller ;
//         String buyer ;
//        public void TransactionParty(String seller, String buyer)
//        {
//        	
//        }
//}
//
//class Receipt extends TransactionParty{
//	String regex ="([a-zA-Z-'][a-zA-Z\\d-']*)-";
//	String actualString = "buyerseller";
//	Pattern pattern =Pattern.compile(regex);
//	Matcher matcher = pattern.matcher(actualString);
//	boolean matchfound = false;{
//    while (matcher.find()) {
//        System.out.println("found the Regex in text:"
//                           + matcher.group()
//                           + " starting index:" + matcher.start()
//                           + " and ending index:"
//                           + matcher.end());
//
//        matchfound = true;
//    }
//    if (!matchfound) {
//        System.out.println("No match found for Regex.");
//        return 0;
//    }
//}
//
//	TransactionParty transactionParty;
//         String productsQR;
//         public void Receipt(TransactionParty transactionParty, String productsQR){
//
//        	 
//         }
//}
//
//class GenerateReceipt extends Receipt{
//           public void verifyParty(Receipt r){ 
//            Return r;
//        }
//        public void calcGST(Receipt r){
//            Return  r;
//        }
//        
//class Source extends GenerateReceipt{
//  public static void main(String[] args){
//
//	  TransactionParty r = new TransactionParty();
//	  r.transactionParty.seller;
//  }
//  }
//}