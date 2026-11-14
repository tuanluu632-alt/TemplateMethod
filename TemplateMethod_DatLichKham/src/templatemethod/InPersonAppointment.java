
package templatemethod;

public class InPersonAppointment extends AppointmentProcessor {

    public InPersonAppointment(String appointmentId,String patientName,String doctorName,String appointmentTime) {
        super(appointmentId, patientName,doctorName, appointmentTime);
    }

    @Override
    protected boolean handleAppointment() {
        System.out.println("4. Xu ly dat lich kham truc tiep...");
        System.out.println("Sap xep phong kham tai co so y te.");
        System.out.println("Benh nhan den phong kham theo lich hen.");
        return true;
    }
}
