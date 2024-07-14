class Woman extends Person {
    private String maidenName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.maidenName = lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    @Override
    public boolean isRetired() {
        return this.age > 60;
    }

    @Override
    public void registerPartnership(Person partner) {
        super.registerPartnership(partner);
        if (partner instanceof Man) {
            this.maidenName = this.lastName;
            this.lastName = partner.getLastName();
        }
    }

    @Override
    public void deregisterPartnership(boolean revertSurname) {
        if (revertSurname) {
            revertToMaidenName();
        }
        super.deregisterPartnership(revertSurname);
    }

    public void revertToMaidenName() {
        this.lastName = this.maidenName;
    }
}

