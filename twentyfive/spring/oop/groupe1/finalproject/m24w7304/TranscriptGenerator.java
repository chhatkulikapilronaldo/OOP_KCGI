package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TranscriptGenerator {

    public static void generateTranscript(int studentId) {
        try {
            String sql = "SELECT c.title, c.credit_hours, e.grade " +
                    "FROM enrollments e " +
                    "JOIN courses c ON e.course_id = c.course_id " +
                    "WHERE e.student_id = ? AND e.deleted=0";

            PreparedStatement stmt = DatabaseManager.getConnection().prepareStatement(sql);
            stmt.setInt(1, studentId);
            ResultSet rs = stmt.executeQuery();

            StringBuilder transcriptBuilder = new StringBuilder();
            transcriptBuilder.append("\n--- Transcript ---\n");

            boolean hasCourses = false;
            while (rs.next()) {
                hasCourses = true;
                String courseTitle = rs.getString("title");
                int creditHours = rs.getInt("credit_hours");
                String grade = rs.getString("grade");
                if (grade == null) {
                    grade = "Not assigned";
                }

                String record = "Course: " + courseTitle + ", Credit Hours: " + creditHours + ", Grade: " + grade;
                transcriptBuilder.append(record).append("\n");
            }

            if (!hasCourses) {
                transcriptBuilder.append("No courses found.\n");
            }

            transcriptBuilder.append("--- End of Transcript ---\n");

            // Print to console
            System.out.println(transcriptBuilder.toString());

            // Save to file
            String filename = "transcript_student_" + studentId + ".txt";
            try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                writer.print(transcriptBuilder.toString());
                System.out.println("Transcript successfully saved to " + filename);
            }

        } catch (Exception e) {
            System.out.println("Error generating transcript: " + e.getMessage());
        }
    }
}
