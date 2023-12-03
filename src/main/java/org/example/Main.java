package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       var cs1 = context.getBean(CommentService.class);
       var cs2 = context.getBean(UserService.class);

       boolean b1 = cs1.getCommentRepository() == cs2.getCommentRepository();
        System.out.println(b1);
        System.out.println(cs1.getCommentRepository());
        System.out.println(cs2.getCommentRepository());

    }
}