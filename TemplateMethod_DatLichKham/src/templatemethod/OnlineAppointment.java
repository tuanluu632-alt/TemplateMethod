
package templatemethod;

public class OnlineAppointment extends AppointmentProcessor {

    public OnlineAppointment(String appointmentId,String patientName,String doctorName,String appointmentTime) {
        super(appointmentId, patientName,doctorName, appointmentTime);
    }

    @Override
    protected boolean handleAppointment() {
        System.out.println("4. Xu ly dat lich tu van truc tuyen...");
        System.out.println("Tao phong tu van video truc tuyen.");
        System.out.println("Gui huong dan tham gia cho benh nhan.");
        return true;
    }
}
