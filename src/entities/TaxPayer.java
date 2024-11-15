
package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mr.Mendes
 */
public class TaxPayer {
  private List<Double> salaryIncome ;
  private List<Double> serviceIncome;
  private List<Double> capitalIncome ;
  private List<Double> healthSpending;
  private List<Double> educantionSpending ;
  private double impostoSalario;
  private double salarioMensal;
  private double impostoCapital;
  private double totalImposto;
  private double impostoBruto;
  private double impostoServico;
  private double impostoEduSau;
  
 
  

    public TaxPayer(List<Double> salaryIncome, List<Double> serviceIncome, List<Double> capitalIncome, List<Double> healthSpending, List<Double> educantionSpending) {
        this.salaryIncome = salaryIncome = new ArrayList<>();
        this.serviceIncome = serviceIncome = new ArrayList<>();
        this.capitalIncome = capitalIncome = new ArrayList<>();
        this.healthSpending = healthSpending = new ArrayList<>();
        this.educantionSpending = educantionSpending = new ArrayList<>();
    }
    

    public List<Double> getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(List<Double> salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public List<Double> getServiceIncome() {
        return serviceIncome;
    }

    public void setServiceIncome(List<Double> serviceIncome) {
        this.serviceIncome = serviceIncome;
    }

    public List<Double> getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(List<Double> capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public List<Double> getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(List<Double> healthSpending) {
        this.healthSpending = healthSpending;
    }

    public List<Double> getEducantionSpending() {
        return educantionSpending;
    }

    public double getImpostoSalario() {
        return impostoSalario;
    }

    public void setImpostoSalario(double impostoSalario) {
        this.impostoSalario = impostoSalario;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getImpostoCapital() {
        return impostoCapital;
    }

    public void setImpostoCapital(double impostoCapital) {
        this.impostoCapital = impostoCapital;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

    public void setTotalImposto(double totalImposto) {
        this.totalImposto = totalImposto;
    }

    public double getImpostoBruto() {
        return impostoBruto;
    }

    public void setImpostoBruto(double impostoBruto) {
        this.impostoBruto = impostoBruto;
    }
    
    
    

    public void setEducantionSpending(List<Double> educantionSpending) {
        this.educantionSpending = educantionSpending;
    }

    public double getImpostoServico() {
        return impostoServico;
    }

    public void setImpostoServico(double impostoServico) {
        this.impostoServico = impostoServico;
    }

    public double getImpostoEduSau() {
        return impostoEduSau;
    }

    public void setImpostoEduSau(double impostoEduSau) {
        this.impostoEduSau = impostoEduSau;
    }
  
  
  
  
  
    public void initialProgram (int x) {
    
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        
        for (int i = 0; i < x; i++){
            System.out.println("");
            System.out.println("Digite os dados do "+ (i+1) + "° contribuinte:");
            System.out.print("Renda Anaual com salário: ");
            getSalaryIncome().add(sc.nextDouble());
            System.out.print("Renda Anaual com prestação de serviço: ");
            getServiceIncome().add(sc.nextDouble());
            System.out.print("Renda Anaual com ganho de capital: ");
            getCapitalIncome().add(sc.nextDouble());
            System.out.print("Gastos méidcos: ");
            getHealthSpending().add(sc.nextDouble());
            System.out.print("Gastos educacionais: ");
            getEducantionSpending().add(sc.nextDouble());
        }
        sc.close();   
    }

    public void resumoContribuintes (){
        for (int i = 0; i < salaryIncome.size();i++){
            System.out.println("");
            System.out.println("Resumo do " + (i+1)+ "º contribuinte: ");
            System.out.println("Imposto bruto total: " + getImpostoBruto()   );
            System.out.println("Abatimento: " + getImpostoEduSau()  );
            System.out.println("Imposto devido: " + (getImpostoBruto() - getImpostoEduSau()) );    
           
        }
    }
    
    
 
  public void salaryTax(){ //imposto salarial
      
     for (int i = 0; i < getSalaryIncome().size(); i++){
         
          setSalarioMensal(getSalaryIncome().get(i)/12); 
          
          
         if (getSalarioMensal() < 3000.00){
         
             setImpostoSalario(0);
         
         
         }
         
         else if (getSalarioMensal() > 3000.00 && getSalarioMensal() < 5000.00){
         
             setImpostoSalario((getSalaryIncome().get(i)* 10)/100);
             
              
         
         }
         
         else {
         
             setImpostoSalario((getSalaryIncome().get(i)* 20)/100);
           
         }
         
     
     } 
     
      
  
  }
  
  public void servicesTax (){ //imposto sobre serviços
      
      for(int i = 0; i < getServiceIncome().size();i++){
          
          
          if (getServiceIncome().get(i) > 0){
              
          
          setImpostoServico((getServiceIncome().get(i)*15)/100);
      
          
                
          }else {
                
          setImpostoServico(0);
          }
      
  
  }
  
  }
  
public void capitalTax () {//Imposto sobre capital
    
    for (int i = 0; i < getCapitalIncome().size(); i++){
    
        if( getCapitalIncome().get(i) > 0){
        
            setImpostoCapital(((getCapitalIncome().get(i)*20) /100));
        
        }else{
            
            setImpostoCapital(0);
        }
       
    
    }
    
    
    
  
  }
  
  public void grossTax (){ //Imposto bruto
      
      setImpostoBruto(getImpostoCapital()+getImpostoSalario()+getImpostoServico());
      
      
  
  }
  
  public void taxRebate (){ //Desconto fiscal
     
      
      for (int i = 0; i < getEducantionSpending().size(); i++){
      
          setImpostoEduSau(((getEducantionSpending().get(i)+ getHealthSpending().get(i))* 30)/100);
          
          
      
        
  
  }
  
  }
  
  public void netTax(){ //Imposto líquido
      
      setTotalImposto( getImpostoBruto());
      
}
}