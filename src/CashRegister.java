class CashRegister {
    // Initializing variables that are part of the final receipt
    private double tipAmount;
    public double bill;
    public int numberOfPeople;
    public double tipPercentage;
    private double finalBill;
    private double tipPerPerson;
    private double finalPerPerson;

    // Class constructor that accepts the bill, tip percentage, and the number of people
    public CashRegister(double userBill, double usertipPercentage, int usernumberofPeople) {
        // Assigning Values
        this.bill = userBill;
        this.tipPercentage = usertipPercentage / 100;
        this.numberOfPeople = usernumberofPeople;
    }

    // Methods to calculate values
    public void calculateTipAmount() {
        this.tipAmount = tipPercentage * bill;
    }
    public void calculateFinalBill() {
        this.finalBill = tipAmount + bill;
    }
    public void calculateTipPerPerson() {
        this.tipPerPerson = tipAmount / numberOfPeople;
    }
    public void calculateFinalPerPerson() {
         this.finalPerPerson = finalBill / numberOfPeople;
    }

    // This function was made because calling separate functions in a certain order may not work.

    public void calculateAllValues() {
        calculateTipAmount();
        calculateFinalBill();
        calculateFinalPerPerson();
        calculateTipPerPerson();
    }

    // Methods to return values
    public double getTipAmount(){
        return tipAmount;
    }
    public double getFinalBill(){
        return finalBill;
    }
    public double getTipPerPerson(){
        return tipPerPerson;
    }
    public double getFinalPerPerson() {
        return finalPerPerson;
    }

    // Prints out the receipt
    public void printReceipt() {
        System.out.printf("""
                            --------------------------
                            Not Burger King
                            --------------------------
                            Total Tip Amount: $%.2f
                            Total Bill Cost: $%.2f
                            Tip Per Person: $%.2f
                            Final Bill Per Person: $%.2f""", getTipAmount(), getFinalBill(), getTipPerPerson(), getFinalPerPerson());
    }

}