package com.company;

public class CourseRegister {

    public CustomList head;

    public static class CustomList{
        private int studentID;
        private int courseID;
        private CustomList next;

        public CustomList(int stdID,int couID){
            this.courseID = couID;
            this.studentID = stdID;
            this.next = null;
        }
    }


        public static void courseRegister(Course nameInput,Student student){
            if(Main.courses.contains(nameInput) == true && nameInput.availableSeat != 0){
                int courseIndex = Main.courses.indexOf(nameInput);
                nameInput.availableSeat--;

                int studentIndex = Main.courses.indexOf(student);
                //Main.COURSE_REGISTER.put(studentIndex,courseIndex);

               CourseRegister cr = new CourseRegister();
               if(cr.head == null){
                   cr.head = new CustomList(studentIndex, courseIndex);
               }else{
                   CustomList second = new CustomList(studentIndex, courseIndex);
                   cr.head.next = second;
               }


                student.showInfo();
                //this.showInfo();
            }else {
                System.out.println("Course Not Found!");
                System.out.println("Or there are no more available seat...");
            }
        }
}
