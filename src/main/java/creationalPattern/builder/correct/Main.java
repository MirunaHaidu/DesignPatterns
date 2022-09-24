package creationalPattern.builder.correct;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()  //sau new StudentBuilder()
                .setCnp("194")
                .setEmail("email@gmail.com")
                .setPhoneNumber("07432")
                .setName("Stefan")
                .build();

        System.out.println(student);
    }
}
