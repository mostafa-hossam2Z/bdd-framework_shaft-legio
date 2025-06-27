package pages.JudicialSessionsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddNewJudicialSessionPopUp {
    public static String JudicialCircuit;
    public static String Judgename;
    public static String SessionNumber;
    public static String TaskAddress;
    public static String TaskContent;
    By CaseList= By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    By ChooseCase= By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[6]");
    By SessionNumberTextField = By.xpath("//input[@placeholder='اكتب رقم الجلسة']");
    By AssignedLawyersLists = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]");
    By EnterAssignedLawyer = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By SessionTypeList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]");
    By SessionType = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/div[1]/div[4]");
    By JudicialCircuitTextField = By.xpath("//input[@placeholder='اكتب الدائرة القضائية']");
    By SessionSubtype=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]");
    By EnterSessionType=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/div[1]/div[1]");
    By CourtList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]");
    By EnterCourt = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/div[1]/div[5]");
    By JudgeNameTextField = By.xpath("//input[@placeholder='اكتب اسم القاضي']");
    By Datelist = By.xpath("//input[@placeholder='اختر التاريخ']");
    By DateTime = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[3]");
    By DateListOptional = By.xpath("//input[@placeholder='اختر الوقت']");
    By ProcedureTypeList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[12]/div[1]/div[1]/div[1]/div[2]");
    By ChooseProcedureType = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[12]/div[1]/div[2]/div[1]/div[5]");
    By AttachmentButton = By.xpath("//button[contains(text(),'اضافة مرفق')]");
    By AddAttachment = By.xpath("(//input[@name='attachments.0.file'])[1]");
    String AttachmentLocation = "C:\\Users\\mostafa.hossam\\Downloads\\Competencies Template (2).xlsx";
    By DocumentButton=By.xpath("//button[contains(text(),'اضافة مستند')]");
    By DocumentTextBox=By.xpath("//input[@placeholder='ادخل المستندات المطلوبة']");
    By CheckAddedNewSession = By.xpath("//div[contains(text(),'تم اضافة الجلسة بنجاح')]");
    By AddTaskBtn=By.xpath("//button[contains(text(),'اضافة مهمة')]");
    By TaskAddressTextField = By.xpath("//input[@placeholder='ادخل عنوان المهمة']");
    By TaskContentTextField=By.xpath("//textarea[@placeholder='ادخل محتوى المهمة']");
    By PriorityLevelList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[15]/div[2]/div[1]/div[1]/div[3]/select[1]");
    By DateeList = By.xpath("(//input[@name='todos.0.deadline'])[1]");
    By EnterDateList = By.xpath("//span[normalize-space()='29']");
    By LawyerList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[15]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]");
    By ChooseLawyer = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[15]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]");
    By SaveAddNewJudicialSessionBtn = By.xpath("//button[contains(text(),'حفظ')]");
    By CheckAddedNewJudicialSession=By.xpath("//div[contains(text(),'تم اضافة الجلسة بنجاح')]");
    By SessionNumberSearch=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
    By DeleteSessionBtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/button[2]");
    By ConfirmDeleteSessionBtn = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    public void ChooseCase(){
        driver.element().click(CaseList);
        driver.element().click(ChooseCase);}
    public void AddSessionNumber () {
        SessionNumber = faker.number().digits(12);
        driver.element().type(SessionNumberTextField, SessionNumber);}
    public void AddLawyer () {
        driver.element().click(AssignedLawyersLists);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EnterAssignedLawyer);}
    public void ChooseSessionType () {
        driver.element().click(SessionTypeList);
        driver.element().click(SessionType);}
    public void AddDateAndTime() {
        driver.element().click(Datelist);
        driver.element().click(DateTime);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(DateListOptional,"02:29PM");}
    public void EnterJudicialCircuit() {
        JudicialCircuit = faker.name().title();
        driver.element().type(JudicialCircuitTextField, JudicialCircuit);}
    public void ChooseCourt () {
        driver.element().click(CourtList);
        driver.element().click(EnterCourt);}
    public void ChooseSessionSubtype () {
        driver.element().click(SessionSubtype);
        driver.element().click(EnterSessionType);}
    public void EnterJudgeName () {
        Judgename = faker.name().title();
        driver.element().type(JudgeNameTextField, Judgename);}
    public void SelectProcedure () {
        driver.element().click(ProcedureTypeList);
        driver.element().click(ChooseProcedureType);
        driver.element().click(ProcedureTypeList);}
    public void UploadDocuments() {
        driver.element().click(DocumentButton);
        driver.element().typeFileLocationForUpload(DocumentTextBox, "Document");}
    public void UploadAttachment() {
        driver.element().click(AttachmentButton);
        driver.element().typeFileLocationForUpload(AddAttachment, AttachmentLocation);}
    public void AddTask() {

        driver.element().click(AddTaskBtn);
            TaskAddress = faker.number().digits(12);
            driver.element().type(TaskAddressTextField,TaskAddress );
            TaskContent=faker.name().toString();
            driver.element().type(TaskContentTextField,TaskContent);
            driver.element().select(PriorityLevelList,"متوسط");
            driver.element().click(DateeList);
            driver.element().click(EnterDateList);

            driver.element().click(LawyerList);
            driver.element().click(ChooseLawyer);
            driver.element().click(LawyerList);
        }


    public void ClickOnTheSaveAddNewJudicialSessionBtn() {
        driver.element().click(SaveAddNewJudicialSessionBtn);}

    public String CheckAddedNewJudicialSession() {
        return driver.element().getText(CheckAddedNewJudicialSession);
    }
    public void ClickOnTheDeleteSessionBtn () {
        try {Thread.sleep(1400);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(SessionNumberSearch,SessionNumber);
        driver.element().click(DeleteSessionBtn);
        driver.element().click(ConfirmDeleteSessionBtn);

    }



}
