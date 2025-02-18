

class Dollar extends Money { 
    private int amount;

    Dollar(int amount){
        this.amount= amount;
    }
    //void times(int multiplier) {
      //  amount= amount * multiplier;
    //}
    Dollar times(int multiplier) {
      return new Dollar(amount * multiplier);
    }
  
	
    public void testMultiplication() {
      Dollar five = new Dollar(5);
      assertEquals(new Dollar(10), five.times(2));
      assertEquals(new Dollar(15), five.times(3));
    }

    public void testEquality() {
      assertTrue(new Dollar(5).equals(new Dollar(5)));
      assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    public boolean equals(Object object)  {
      Dollar dollar = (Dollar) object;
      return amount == dollar.amount;
    }
}
