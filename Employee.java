public class Employee {
    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return String.format("���: %s \t���������: %s \nEmail: %s \t ����� ��������: %s \n ��������: %d \t �������: %d \n",
                name, position, email, phone_number, salary, age);}

    public void print(){
        System.out.println(this);
    }

    public static void main(String[] args)  {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("�������� ������", "����������� ��������", "vk@primer,ru", "+79996665544", 250000, 30);
        persArray[1] = new Employee("���� ������", "�������� ��", "vz@primer,ru", "+79998884455", 127000, 42);
        persArray[2] = new Employee("������� ��������", "��������", "dm@primer,ru", "+79997771234", 19000, 21);
        persArray[3] = new Employee("���� ������", "������� �������", "ol@primer,ru", "+79995554789", 120000, 28);
        persArray[4] = new Employee("�������� �������", "�������� ���", "kv@primer,ru", "+79994445896", 138000, 48);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}
//������