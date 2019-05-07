package org.alie.itemtouchhelper;

import org.alie.itemtouchhelper.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alie on 2019/5/6.
 * 类描述
 * 版本
 */
public class Const {


    public static final List<Student> GET_STUDENT() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(R.drawable.img_app_icon_act_mgr,"开开心心","开心每一天，快乐每一天");
        Student student2 = new Student(R.drawable.img_app_icon_announce,"快快乐乐","每天都要有新收获");
        Student student3 = new Student(R.drawable.img_app_icon_approve,"勤勤恳恳","不要忘记总结");
        Student student4 = new Student(R.drawable.img_app_icon_bussiness_trip,"哭哭啼啼","调整好到最佳状态");
        Student student5 = new Student(R.drawable.img_app_icon_check_in,"生生世世","不怕困难，努力拼搏");
        Student student6 = new Student(R.drawable.img_app_icon_check_in_reissue,"热热闹闹","日子越过越红火");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        return students;
    }
}
