
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;




public class ConvertToCPP extends fortran77BaseVisitor<String>{
    private final String INCLUDE_CMATH = "\n#include <cmath>;\n";
    private final String INCLUDE_IOSTREAM = "#include <iostream>;\n";
    private final String PARAMETER = "parameter";
    private final String NOWA_LINIA = "\n";
    private final String KLAMRA_POCZATEK = "{\n";
    private final String KLAMRA_KONIEC = "}\n";
    private final String FUNCKJA_MAIN = "int main()\n";
    private final String INT = "int";
    private final String DOUBLE = "double";
    private final String BOOLEAN = "bool";
    private final String REAL_FORTRAN = "REAL";
    private final String DOUBLE_FORTRAN = "DOUBLE";
    private final String INTEGRER_FORTRAN = "INTEGER";
    private final String LOGICAL_FORTRAN = "LOGICAL";   
    private final String SREDNIK = ";";
    private final String OTWARCIE_NAWIASU = "(";
    private final String ZAMKNIECIE_NAWIASU = ")";
    private final String SPACJA = " ";
    private final String POCZATEK_TABLICY = "[";
    private final String KONIEC_TABLICY = "]";
    private final String ROWNA_SIE = "=";
    private final String WSKAZNIK = "*";
    private final String NEW = "new";
    private final String DELETE = "delete";
    private final String IF = "if";
    private final String ELSE = "else\n";
    private final String ELSE_IF = "else if\n";
    private final String FOR = "for";
    private final String MNIEJSZE = "<";
    private final String WIEKSZE = ">";
    //private final String KOMENTARZ = "//";
    
    @Override
    public String visitProgram(fortran77Parser.ProgramContext ctx)
    {
        //super.visitChildren(ctx); //sprawdz jak bedzie dzialac odkomentowane
        
        String wynik;
        wynik = "";
        wynik += NOWA_LINIA;
        wynik += INCLUDE_CMATH;
        wynik += INCLUDE_IOSTREAM;
        wynik += NOWA_LINIA;
        wynik += "";
        
        //wynik += typ; //dokonczyc typ danych        
        
        //System.out.println("Liczba dzieci: " + ctx.children.size());
        for (int index = 0; index < ctx.children.size(); index++) 
        {
            //System.out.println(ctx.getChild(index).getText());
            wynik += visit(ctx.getChild(index));
        }
        
        
        //wynik += KLAMRA_KONIEC;        
        return wynik;
    }
    
    @Override
    public String visitIfstatment(fortran77Parser.IfstatmentContext ctx)
    {
        String wynik = "";
        wynik += IF + SPACJA + OTWARCIE_NAWIASU;
        wynik += visit(ctx.getChild(2));//dekodujemy 2 dziecko bo to warunek w instrukcji if
        wynik += ZAMKNIECIE_NAWIASU + NOWA_LINIA + KLAMRA_POCZATEK;
        
        return wynik;
    }
    
            
    
    
    @Override
    public String visitElseSlowo(fortran77Parser.ElseSlowoContext ctx)
    {
        String wynik = KLAMRA_KONIEC + ELSE + KLAMRA_POCZATEK;
        return wynik;
    }
    
    
    @Override
    public String visitDoWyrazenie(fortran77Parser.DoWyrazenieContext ctx)
    {
         String wynik = "";
         String nazwaZmiennej = ctx.getChild(1).getText();// ctx.getChild(1) tym dzieckiem jest nazwa zmiennej z petli for
         String wartoscZmiennej = ctx.getChild(3).getText(); // ctx.getChild(3) tym dzieckiem jest wartosc zmiennej z petli for
         String wartoscKoncowa = ctx.getChild(5).getText();//ctx.getChild(5)tym dzieckiem jest wartosc warunu srodkowego petli for
         String wartoscInkrementacji = ctx.getChild(7).getText();//ctx.getChild(7) tym dzieckiem jest  wartość inkrementacji petli for
         
        wynik += FOR + SPACJA + OTWARCIE_NAWIASU;
        wynik += INT + SPACJA + nazwaZmiennej + SPACJA + ROWNA_SIE + SPACJA;
        wynik += wartoscZmiennej + SREDNIK;
        wynik += SPACJA + nazwaZmiennej + SPACJA + MNIEJSZE + SPACJA + wartoscKoncowa + SREDNIK;
        wynik += SPACJA + nazwaZmiennej + "+=" + SPACJA + SPACJA + wartoscInkrementacji;
        wynik +=  ZAMKNIECIE_NAWIASU + NOWA_LINIA + KLAMRA_POCZATEK;
        
        return wynik;
    }
    
    
    @Override
    public String visitEndDoSlowo(fortran77Parser.EndDoSlowoContext ctx)
    {
        String wynik = KLAMRA_KONIEC;
        return wynik;
    }
    
     @Override
    public String visitEndIfSlowo(fortran77Parser.EndIfSlowoContext ctx)
    {
        String wynik = KLAMRA_KONIEC;
        return wynik;
    }
    
    @Override
    public String visitProgramStatement(fortran77Parser.ProgramStatementContext ctx)
    {
        //Slowo kluczowe program zostalo zamienione funkcja main. Zwracamy pusty ciag poniewaz
        //w metodzie rodzica visitMainProgram wstawiamy funkcje main
        String wynik = "";
        return wynik;
    }
     
    @Override
    public String visitMainProgram(fortran77Parser.MainProgramContext ctx)
    {        
        String wynik;       
        
        //Translacja slowa kluczowego program
        wynik = FUNCKJA_MAIN + KLAMRA_POCZATEK;
        
        //Iterujemy od index1 (drugiego dziecka poniewaz pierwsze dziecko to slowo kluczowe program,
        //zastepujemy je recznie funkcja main
        for (int index = 1; index < ctx.children.size(); index++) 
        {
            //System.out.println(ctx.getChild(index).getText());
            wynik += visit(ctx.getChild(index));
        }
        
        
        wynik += KLAMRA_KONIEC;
        //System.out.println("wynikA: " + wynik);
        
        return wynik;
    }
    
    @Override
    public String visitSubprogramBody(fortran77Parser.SubprogramBodyContext ctx)
    {
        String wynik = "";
        
        for (int index = 0; index < ctx.children.size(); index++) 
        {
            //System.out.println(ctx.getChild(index).getText());
            wynik += visit(ctx.getChild(index));
        }
        
        return wynik;
    }
    
    
    @Override
    public String visitWholeStatement(fortran77Parser.WholeStatementContext ctx)
    {
        String wynik = "";
        
        for (int index = 0; index < ctx.children.size(); index++) 
        {
            //System.out.println(ctx.getChild(index).getText());
            wynik += visit(ctx.getChild(index));
        }
        
        return wynik;
    }
    
    @Override
    public String visitStatement(fortran77Parser.StatementContext ctx)
    {
        String wynik = "";
        
        for (int index = 0; index < ctx.children.size(); index++) 
        {
            //System.out.println(ctx.getChild(index).getText());
            wynik += visit(ctx.getChild(index));
        }
        //System.out.println("wynik: " + wynik);  
        return wynik;
    }
    
    @Override
    public String visitExecutableStatement(fortran77Parser.ExecutableStatementContext ctx)
    {
        String wynik = "";
        //System.out.println("visitExecutableStatement()");
        for (int index = 0; index < ctx.children.size(); index++) 
        {
            //System.out.println(ctx.getChild(index).getText());
            wynik += visit(ctx.getChild(index));
        }

        return wynik;
    }
    
    @Override
    public String visitWyrazenie(fortran77Parser.WyrazenieContext ctx)
    {
        String wynik = "";
        wynik += visit(ctx.getChild(0));
        return wynik;
    }
    
    @Override
    public String visitWyrazenieMatematyczne(fortran77Parser.WyrazenieMatematyczneContext ctx)
    {
        String wynik = "";
        wynik += SPACJA;
        wynik += visit(ctx.getChild(0));
        return wynik;
    }
    
    @Override
    public String  visitOperacja(fortran77Parser.OperacjaContext ctx)
    {
        String wynik = "";
        String prawaCzescWyrazenia;
        wynik += visit(ctx.addExpr(0));
        
        //dekodowanie operatorw < <= > >= == !
        for (int i = 1; i < (ctx.children.size() + 1) / 2; i++)
        {
            prawaCzescWyrazenia = visit(ctx.addExpr(i)).toString();
            //dekodowanie operatorw  <= > >= == !
            if (ctx.op.getType() == fortran77Parser.LT) // <
            {
                wynik += " < ";
            }
            else if (ctx.op.getType() == fortran77Parser.LE) // <=
            {
                wynik += " <= ";
            }
            else if (ctx.op.getType() == fortran77Parser.GT) // >
            {
                wynik += " > ";
            }
            else if (ctx.op.getType() == fortran77Parser.GE) // >=
            {
                wynik += " >= ";
            }
            else if (ctx.op.getType() == fortran77Parser.EQ) // ==
            {
                wynik += " == ";
            }
            
            else // !=
            {
                wynik += " != ";
            }
            
            wynik += prawaCzescWyrazenia;
        }
        
        return wynik;
    }
    
    @Override
    public String visitAddExpr(fortran77Parser.AddExprContext ctx)
    {
        String wynik = "";
        wynik += ctx.getText();
        return wynik;
    }
    
    @Override
    public String visitMultExpr(fortran77Parser.MultExprContext ctx)
    {
        String wynik = "";
        wynik += ctx.getText();
        return wynik;
    }
    
    @Override
    public String visitExpExpr(fortran77Parser.ExpExprContext ctx)
    {
        String wynik = "";
        wynik += ctx.getText();
        return wynik;
    }
    
    @Override
    public String visitFunkcjaMatematyczna(fortran77Parser.FunkcjaMatematycznaContext ctx)
    {
        String wynik = "";
        wynik += visit(ctx.getChild(0));
        return wynik;
    }
    
    //dorobic obsluge dla wiele wymairowych tablic
    @Override
    public String visitNazwaFunkcjiMatematycznej(fortran77Parser.NazwaFunkcjiMatematycznejContext ctx)
    {
        String wynik = "";
        String pomoc = ctx.getText().toUpperCase();
        
        //System.out.println(ctx.getText());
        int indexPierwszegoNawiasu = pomoc.indexOf("(");
        int indexOstatniegoNawiasu = pomoc.lastIndexOf(")");
        
        int liczbaNawiasow = 0; //musimy okreslic czy wewnatrz funkcji mamy liczbe, zmienną czy tablice
        for (int index = 0; index < pomoc.length(); index++)
        {
            if (pomoc.charAt(index) == '(')
            {
                liczbaNawiasow++;
            }
        }
        
        //najpierw trnslacja nazwy funkcji
        if (pomoc.contains("SIN"))
        {
            wynik += "sin";//wynik += "Math.sin" ; 
        }
        else if (pomoc.contains("COS"))
        {
            wynik += "cos";     
        }
        else if (pomoc.contains("ABS"))
        {
           wynik += "abs"; 
        }
        else if (pomoc.contains("SQRT"))
        {
           wynik += "sqrt";    
        }
        else if (pomoc.contains("TAN"))
        {
            wynik += "tan";
        }
        else if (pomoc.contains("ATAN"))
        {
            wynik += "atan";
        }
        else if (pomoc.contains("EXP"))
        {
            wynik += "exp";
        }
        else if (pomoc.contains("LOG10"))
        {
            wynik += "log10";
        }
        else if (pomoc.contains("LOG"))
        {
            wynik += "log";
        }
        else if (pomoc.contains("MIN"))
        {
            wynik += "min";
        }
        else// if (pomoc.contains("MAX"))
        {
            wynik += "max";
        }
        
        //translacja zmiennych i liczb
        if (liczbaNawiasow == 1)
        {
            //liczbaNawiasow + 1 bo omijamy znak "(", w drogim argumenci nie potrzebne bo ta metoda pomija znak z drogiego argumentu
            wynik += OTWARCIE_NAWIASU +  ctx.getText().substring(indexPierwszegoNawiasu + 1, indexOstatniegoNawiasu) + ZAMKNIECIE_NAWIASU;
        }
        else
            {
            //translacja elemnetow tablic dla wszystkich funkcji oprucz max i min. tam spodziewamy sie dwoch argumentow wiec musimy to zrobic inaczej
            if (! (pomoc.contains("MIN") || pomoc.contains("MAX")))
            {
                String zamieniany = ctx.getText().substring(indexPierwszegoNawiasu + 1, indexOstatniegoNawiasu);
                
                for (int index = 0; index < zamieniany.length(); index++)
                {
                    if (zamieniany.charAt(index) == '(')
                    {
                        StringBuilder sb = new StringBuilder(zamieniany);
                        sb.setCharAt(index, '[');
                        zamieniany = sb.toString();
                    }
                    else if (zamieniany.charAt(index) == ')')
                    {
                        StringBuilder sb = new StringBuilder(zamieniany);
                        sb.setCharAt(index, ']');
                        zamieniany = sb.toString();
                    }
                }

                wynik += OTWARCIE_NAWIASU + zamieniany + ZAMKNIECIE_NAWIASU;
            }
            else //dekodowanie min i max
            {
                String zamieniany = ctx.getText().substring(indexPierwszegoNawiasu + 1, indexOstatniegoNawiasu);
                
                for (int index = 0; index < zamieniany.length(); index++)
                 {
                     if (zamieniany.charAt(index) == '(')
                     {
                         StringBuilder sb = new StringBuilder(zamieniany);
                         sb.setCharAt(index, '[');
                         zamieniany = sb.toString();
                     }
                     else if (zamieniany.charAt(index) == ')')
                     {
                         StringBuilder sb = new StringBuilder(zamieniany);
                         sb.setCharAt(index, ']');
                         zamieniany = sb.toString();
                     }
                 }
                
                wynik += OTWARCIE_NAWIASU + zamieniany + ZAMKNIECIE_NAWIASU;
            }
        }
        
        return wynik;
    }
    
    
    
    @Override
    public String visitAssignmentStatement(fortran77Parser.AssignmentStatementContext ctx)
    {
        String wynik = "";
        //System.out.println("visitAssignmentStatement()");
        
        wynik = SPACJA + ctx.getChild(0).getText();//nazwa zmiennej
        //ctx.getChild(1)to znak =
                 
        wynik += ROWNA_SIE;
        //if(wynik == (wynik += ROWNA_SIE))
        {
         
        }    
                
        //ctx.getChild(2) wszystko po znaku =
        wynik += visit(ctx.getChild(2));
        wynik += SREDNIK + NOWA_LINIA;//srednik na koniec lini.
        return wynik;
    }
    
    
    public String dekodowanieTablic(String tablica, String nazwaTypu)
    {
        String wynik = "";
        int pozycjaPoczatkowaWymiarow;
        int pozycjaKoncowaWymiarow;
        
        pozycjaPoczatkowaWymiarow = tablica.indexOf("(");
        pozycjaKoncowaWymiarow = tablica.indexOf(")");
        final String nazwaTablicy = tablica.substring(0, pozycjaPoczatkowaWymiarow);
        String wymiary = tablica.substring((pozycjaPoczatkowaWymiarow + 1), (pozycjaKoncowaWymiarow));//pozycjaPoczatkowaWymiarow + 1 bo odrzucamy znak "("
        String[] wymiaryDoTranslacji = wymiary.split(",");
        
        wynik += nazwaTypu;
        
        
        /*for (int index = 0; index < wymiaryDoTranslacji.length; index++)
        {
            wynik += POCZATEK_TABLICY + KONIEC_TABLICY;
        }*/
                
        for (int index = 0; index < wymiaryDoTranslacji.length; index++)
        {
            wynik += WSKAZNIK;
        }
        
                
        wynik += SPACJA + nazwaTablicy + SPACJA 
                 + ROWNA_SIE + SPACJA + NEW + SPACJA + nazwaTypu;               
        
        
        //Uzupelnienie wymiarow dekodowanej tablicy                    
        for (String s : wymiaryDoTranslacji) 
        {
            wynik += POCZATEK_TABLICY + s + KONIEC_TABLICY;            
        }            
        
        wynik += SREDNIK + NOWA_LINIA;
        return wynik;
    }
    
    /*public String zwalnianieTablic()
    {
       
    } */       
            
    
    @Override
    public String visitTypeStatement(fortran77Parser.TypeStatementContext ctx)
    {
        String wynik = "";
        String typZmiennych = "";
        List<String> listaZmienych = new ArrayList<String>();
        String dekodowanaLinia = ctx.getText().toUpperCase();//ustawiamy duze litery poniewaz fortran ignoruje wilekosc liter,
        //tak bedzie latwiej szukac w ciagach danych;
        //('real' | 'double' 'complex' | 'double' 'precision' | 'integer' | 'logical')
        if (dekodowanaLinia.contains(REAL_FORTRAN))
        {
            typZmiennych = DOUBLE;
        }
        else if (dekodowanaLinia.contains(DOUBLE_FORTRAN))
        {
            typZmiennych = DOUBLE;
        }
        else if (dekodowanaLinia.contains(INTEGRER_FORTRAN))
        {
            typZmiennych = INT;
        }
        else //LOGICAL_FORTRAN
        {
            typZmiennych = BOOLEAN;
        }
        
        //Pierwszym dzieckiem tej galezi jest typ zmiennej, jego okreslenie zrobilismy powyzej,
        //dlatego iterujemy od drugiego dziecka
        
         for (int index = 1; index < ctx.children.size(); index++) 
        {
            //.. niemozna deklarowac tablic zmiennych poprzecinku z innymi zmiennymi.
            //Dlatego kazda deklaracja zmiennej bedzie po tlumaczeniu znajdowac sie w nowej lini
            listaZmienych.add(visit(ctx.getChild(index)));
            /*
            System.out.println("ccc " + ctx.getChild(index).getText());
            wynik += typZmiennych;
            wynik += visit(ctx.getChild(index));
            wynik += SREDNIK;
            wynik +=NOWA_LINIA;
            */
        }
        
         for (int index = 0; index < listaZmienych.size(); index++)
         {
             //Kazdy element tablicy moze zawierac kilka deklaracji. Zanim zaczniemy je przetwarzac musimy je rozdzielic poprzez znak ";".
             String[] zmieneRozdzielone = listaZmienych.get(index).split(";");
 
             //Musimy odroznic deklaracje zmiennych od deklaracji tablic
             //Szukamy znaku "(" by okreslic czy przetwarzamy tablice czy zwykla zmiena. Tablice zawieraja szukany znak.
             for (int i = 0; i < zmieneRozdzielone.length; i++)
             {
                if (zmieneRozdzielone[i].contains(OTWARCIE_NAWIASU))
                {
                 wynik += dekodowanieTablic(zmieneRozdzielone[i], typZmiennych);
                }
                else
                {
                    wynik += typZmiennych + SPACJA + zmieneRozdzielone[i] + SREDNIK + NOWA_LINIA;
                }
             }
  
         }
         
        //System.out.println("ddd " + ctx.children.size() + " wynik " + wynik);
        return wynik;
    }
    
    @Override
    public String visitTypeStatementNameList(fortran77Parser.TypeStatementNameListContext ctx)
    { 
        String wynik = "";
        //System.out.println("ddd " + ctx.children.size());
        
        for (int index =0; index < ctx.children.size(); index++)
        {
            //Nieparzyste dzieci to zmiene, parzyste to znak przecinka
            //Zachowujemy nazwy zmiennych a dzieci ktore sa znakiem przecinka zamieniamy na znak srednika
            //Uwazamy by nie zamienic przecinkow ktore okreslaja wymiar tablicy
            if ((index % 2) == 0 || (index == 0))
            {
                //System.out.println(" dziecko: " + ctx.getChild(index).getText());
                wynik += ctx.getChild(index).getText();
            }
            else
            {
                wynik +=";";
            }
        }
        
        return wynik;
    }
    
//    public String visitTypeStatementName(fortran77Parser.TypeStatementNameContext ctx)
//    {
//        
//    }
    
    @Override
    public String visitSeos(fortran77Parser.SeosContext ctx)
    {
        //Znakien nowej lini nie przejmuje sie w tym miejscu.
        //Wiemy kiedy sie spodziewamy nowej lini i wstawiamy znak nowej lini tam
        String wynik = "";
        return wynik;
    }
    
    @Override
    public String visitEndStatement(fortran77Parser.EndStatementContext ctx)
    {
        //.. niema slowa kluczowego end wiec nie musimy zwracac na niego uwagi.
        //Zamiast niego sa klamry które są już uwzglednione w translatorze
        String wynik = "";
        return wynik;
    }
}

