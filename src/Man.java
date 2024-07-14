class Man extends Person {
    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        return this.age > 65;
    }

    @Override
    public void registerPartnership(Person partner) {
        super.registerPartnership(partner);
    }
}








