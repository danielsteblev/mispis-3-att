public class Main {
    public static void main(String[] args) {
        University univ = new University();

        Faculty facultyOfMathematics = new Faculty("Faculty of Mathematics",
                new Employee(1, "Danila Steblev", "groupnice@bk.ru") {
        });

        Institute institute = new Institute("ISIT", "Universitetskaya 1");

        facultyOfMathematics.addInstitute(institute);

        univ.addFaculty(facultyOfMathematics);

        System.out.println(univ);
    }
}
