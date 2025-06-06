package help;

import com.shaft.db.DatabaseActions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DatabaseQueries {

    List<UUID> randomBanksIDs = new ArrayList<>();


    public void insertQuestionBanksIntoDatabase(){

        // Generate and add 4 UUIDs
        for (int i = 0; i < 4; i++) {
            UUID randomBankID = UUID.randomUUID();
            randomBanksIDs.add(randomBankID);
        }
        DatabaseActions databaseObject = DataBaseReader.dataBaseConnection(DataBaseReader.Environment.Staging);
        String q="INSERT INTO [qb].[Bank] (Id,Title, OrganizationId, Privacy,CreatedBy,Source,Level,Type,IsDeleted,CreationDate,LastModificationDate)\n" +
                "VALUES ('"+randomBanksIDs.get(0).toString()+"','Aware of the needs of others and responds flexibly - Beginner',\n" +
                "'56E5FBD2-6F74-432E-871D-A0EB62DBA993', 1,10334,'ChatGPT',1,0,0,SYSDATETIME(),SYSDATETIME()),\n" +
                "('"+randomBanksIDs.get(1).toString()+"','Aware of the needs of others and responds flexibly - Advanced',\n" +
                "'56E5FBD2-6F74-432E-871D-A0EB62DBA993', 1,10334,'ChatGPT',3,0,0,SYSDATETIME(),SYSDATETIME()),\n" +
                "('"+randomBanksIDs.get(2).toString()+"','Shares information and supports other team members - Beginner',\n" +
                "'56E5FBD2-6F74-432E-871D-A0EB62DBA993', 1,10334,'ChatGPT',1,0,0,SYSDATETIME(),SYSDATETIME()),\n" +
                "('"+randomBanksIDs.get(3).toString()+"','Shares information and supports other team members - Advanced',\n" +
                "'56E5FBD2-6F74-432E-871D-A0EB62DBA993', 1,10334,'ChatGPT',3,0,0,SYSDATETIME(),SYSDATETIME());";
        int rowCount=databaseObject.executeInsertQuery(q);

    }
    public void deleteAllQuestionsBanksFromDatabaseForASpecificUser(){
        DatabaseActions databaseObject = DataBaseReader.dataBaseConnection(DataBaseReader.Environment.Staging);
        String q="delete from [qb].[Bank] where CreatedBy=10334";
        databaseObject.executeDeleteQuery(q);

    }
    public void deleteTheLastCreatedCourse(){
        DatabaseActions databaseObject = DataBaseReader.dataBaseConnection(DataBaseReader.Environment.Staging);
        String q="DELETE ucp\n" +
                "FROM dbo.UserCourseProgress ucp\n" +
                "JOIN dbo.UserCourses uc ON ucp.CourseId = uc.CourseId\n" +
                "\n" +
                "-- Delete from UserCourses\n" +
                "DELETE FROM dbo.UserCourses\n" +
                "WHERE CourseId IN (\n" +
                "    SELECT Id FROM dbo.Courses\n" +
                "    WHERE ParentId = (SELECT TOP 1 Id FROM dbo.CourseGroup ORDER BY CreationDate DESC)\n" +
                ");\n" +
                "\n" +
                "-- Delete from Courses\n" +
                "DELETE FROM dbo.Courses\n" +
                "WHERE ParentId = (SELECT TOP 1 Id FROM dbo.CourseGroup  \n" +
                "ORDER BY CreationDate DESC);\n" +
                "\n" +
                "-- Finally delete from CourseGroup\n" +
                "WITH ToDelete AS (\n" +
                "    SELECT TOP (1) *\n" +
                "    FROM [dbo].[CourseGroup]\n" +
                "    ORDER BY CreationDate DESC\n" +
                ")\n" +
                "DELETE FROM ToDelete;";

        databaseObject.executeDeleteQuery(q);}
}
