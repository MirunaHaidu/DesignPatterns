package creationalPattern.builder.lazy;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .phoneNumber("124")
                .email("g@gmail.com")
                .name("Stefan")
                .cnp("3432")
                .build();

        System.out.println(student);
    }
}
