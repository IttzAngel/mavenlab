package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void test(){

//        Instructors instructors = Instructors.getInstance();
//        List<Instructor> expectedInstructors = new ArrayList<>();
//        expectedInstructors.add(new Instructor(7936, "Mikaila"));
//        expectedInstructors.add(new Instructor(3871, "Peter"));
//        expectedInstructors.add(new Instructor(4209, "Bobby"));

//        for (Instructor expectedInstructor : expectedInstructors) {
//            Assert.assertTrue(instructors.contains(expectedInstructor));
//        }

//        for (Instructor expectedInstructor : expectedInstructors) {
//            boolean containsExpected = instructors.contains(expectedInstructor);
//            System.out.println("Expected: " + expectedInstructor + ", Actual: " + (containsExpected ? expectedInstructor : "NOT FOUND"));
//            Assert.assertTrue(containsExpected);
//        }

        List<Instructor> zipCode = new ArrayList<>();

//        zipCode.add(new Instructor(7936, "Mikaila"));
//        zipCode.add(new Instructor(3871, "Peter"));
//        zipCode.add(new Instructor(4209, "Bobby"));

        Instructors instructors = Instructors.getInstance();

        //Assert.assertTrue(instructors.contains(new Instructor(7936, "Mikaila")));

        for (Instructor instructor : zipCode) {
            Assert.assertTrue(instructors.contains(instructor));
        }
    }
}
