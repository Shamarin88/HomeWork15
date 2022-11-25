public class Human {

    private int yearOfBirth;
    private final String name;
    private String town;
    private final String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.town = town;

        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
    public String getTown() {
        return town;
    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " \nЯ из города " + getTown() + " \nЯ родился в " + getYearOfBirth() + " году " + " \nЯ работаю на должности " + jobTitle + " \nБудем знакомы!";
    }
}
