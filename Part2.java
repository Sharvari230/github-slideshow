
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
        public String findSimpleGene(String dna,String startcodon,String stopcodon){
        int startIndex=dna.indexOf(startcodon);
        if(startIndex==-1){
            return "";
        }
        int stopIndex=dna.indexOf(stopcodon,startIndex+3);
        if(stopIndex==-1){
            return "";
        }
        String result=dna.substring(startIndex,stopIndex+3);
        if(result.length()%3==0){
            return result;
        }
        else{
            return"";
        }
    }
    
    public void testSimpleGene(){
        String startcodon="ATG";
        String stopcodon="TAA";
        String dna1="ATCTGACTTGTAA";
        System.out.println("DNA is "+dna1);
        String gene1=findSimpleGene(dna1,startcodon,stopcodon);
        System.out.println("Gene is "+gene1);
        
        String dna2="ATCTATGTCCCTGACGT";
        System.out.println("DNA is "+dna2);
        String gene2=findSimpleGene(dna2,startcodon,stopcodon);
        System.out.println("Gene is "+gene2);
        
        String dna3="ATCTACGTCCCTGACGT";
        System.out.println("DNA is "+dna3);
        String gene3=findSimpleGene(dna3,startcodon,stopcodon);
        System.out.println("Gene is "+gene3);
        
        String dna4="ATCTATGTCCCTAACGT";
        System.out.println("DNA is "+dna4);
        String gene4=findSimpleGene(dna4,startcodon,stopcodon);
        System.out.println("Gene is "+gene4);
        
        String dna5="ATGTATGTCCCATAACGT";
        System.out.println("DNA is "+dna5);
        String gene5=findSimpleGene(dna5,startcodon,stopcodon);
        System.out.println("Gene is "+gene5);
        
    }

}
