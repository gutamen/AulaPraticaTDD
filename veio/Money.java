class Money  {
    protected int amount;
   
  

    public void testEquality() {
      assertTrue(new Dollar(5).equals(new Dollar(5)));
      assertFalse(new Dollar(5).equals(new Dollar(6)));
      assertTrue(new Franc(5).equals(new Franc(5)));
      assertFalse(new Franc(5).equals(new Franc(6)));
      assertFalse(new Franc(5).equals(new Dollar(5)));
    }
    public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
    }
}
