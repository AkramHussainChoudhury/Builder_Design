public class Client {
    public static void main(String[] args) {
        //Builder builder = new Builder();
        // Builder builder = Student.getBuilder();
        //builder.setAge(12);
        //builder.setName("Akram");
        //builder.setGradYear(2022);


        //Student st = new Student(builder);
        //Student st = builder.build();


        Student st1 = Student.getBuilder()
                .setAge(12)
                .setName("Akram")
                .setGradYear(2022)
                .build();
        System.out.println("DEBUG");
    }

}
