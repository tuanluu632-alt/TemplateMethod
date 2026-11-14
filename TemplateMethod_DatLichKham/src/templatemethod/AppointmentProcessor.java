
package templatemethod;

public abstract class AppointmentProcessor {

    protected String appointmentId;
    protected String patientName;
    protected String doctorName;
    protected String appointmentTime;

    public AppointmentProcessor(String appointmentId,String patientName,String doctorName,String appointmentTime) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentTime = appointmentTime;
    }

    public final void processAppointment() {

        System.out.println("\n===== XU LY DAT LICH KHAM =====");
        receiveRequest();

        if (!validateInformation()) {
            System.out.println("Thong tin khong hop le!");
            return;
        }

        if (!checkDoctorSchedule()) {
            System.out.println("Bac si khong con lich trong!");
            return;
        }

        if (handleAppointment()) {
            confirmAppointment();
            sendNotification();
        } else {
            System.out.println("Dat lich that bai!");
        }

        System.out.println("===== KET THUC =====");
    }

    protected void receiveRequest() {
        System.out.println("1. Tiep nhan yeu cau dat lich");
        System.out.println("Ma lich hen: " + appointmentId);
    }

    protected boolean validateInformation() {

        System.out.println("2. Kiem tra thong tin benh nhan");

        if (patientName == null || patientName.isBlank()
                || doctorName == null || doctorName.isBlank()
                || appointmentTime == null || appointmentTime.isBlank()
                || appointmentId == null || appointmentId.isBlank()) {
            return false;
        }

        System.out.println("Thong tin hop le!");
        return true;
    }

    protected boolean checkDoctorSchedule() {

        System.out.println("3. Kiem tra lich trong cua bac si");
        System.out.println("Bac si " + doctorName + " con lich trong.");

        return true;
    }

    protected abstract boolean handleAppointment();

    protected void confirmAppointment() {

        System.out.println("5. Xac nhan dat lich thanh cong!");
        System.out.println("Thoi gian: " + appointmentTime);
    }

    protected void sendNotification() {

        System.out.println("6. Gui thong bao cho benh nhan: "
                + patientName);
    }
}
