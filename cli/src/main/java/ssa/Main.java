void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is JVM?");
    System.out.println("""
            1) Java Virtual Machine
            2) Java
            3) Java Platform
            4) Just Virtual Memory
            """);
    String resp = scan.nextLine();
    if (resp.equals("1") ) {
        System.out.println("Correct!");
    } else {
        System.out.println("Wrong!");
    }
}