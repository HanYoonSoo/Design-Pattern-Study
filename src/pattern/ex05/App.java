package pattern.ex05;

import pattern.ex05.teacher.JavaTeacher;
import pattern.ex05.teacher.PythonTeacher;
import pattern.ex05.teacher.Teacher;

public class App {
    public static void start(Teacher t){
        t.수업시작();
    }

    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher();
        start(javaTeacher);

        PythonTeacher pythonTeacher = new PythonTeacher();
        start(pythonTeacher);
    }
}
