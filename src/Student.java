
class Student extends Person {
     String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student [name=" + getName() + ", yearOfBirth=" + getYearOfBirth() + ", major=" + major + "]";
    }
}

