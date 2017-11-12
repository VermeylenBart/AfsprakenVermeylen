package be.eaict.afsprakenvermeylen;

import java.util.ArrayList;
import java.util.List;

public class AppointmentDummyRepository implements IAppointmentsRepository {

    private static IAppointmentsRepository repo = null;

    public static IAppointmentsRepository getInstance() {
        if (repo == null) {
            repo = new AppointmentDummyRepository();
        }
        return repo;
    }

    public List<Appointment> getAppointments() {
        List<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment(1, 3, 4, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Knie doet lastig."));
        appointments.add(new Appointment(2, 4, 3, 2018, 9, 15, "Dr. Geneens", "AZ Monica 04.04", "Wijsheidstanden voorbereiding operatie."));
        appointments.add(new Appointment(3, 12, 3, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Knie doet lastiger."));
        appointments.add(new Appointment(4, 18, 4, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Eerste echo baby"));
        appointments.add(new Appointment(4, 25, 3, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "MRI scan knie."));
        appointments.add(new Appointment(5, 18, 4, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Tweede echo baby"));
        appointments.add(new Appointment(6, 30, 4, 2018, 9, 15, "Dr. Geneejnes", "AZ Monica 04.04", "Wijsheidstanden trekken"));
        appointments.add(new Appointment(7, 4, 5, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Evaluatie MRI scan knie."));
        appointments.add(new Appointment(8, 20, 5, 2018, 9, 15, "Dr. Geneens", "AZ Monica 04.04", "Controle wijsheidstanden operatie"));
        appointments.add(new Appointment(9, 1, 6, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Voorbereiding onderzoek knie prothese."));
        appointments.add(new Appointment(10, 21, 6, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Derde echo baby"));
        appointments.add(new Appointment(11, 23, 6, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Aanvaarding knie prothese tijdens zwangerschap"));
        appointments.add(new Appointment(13, 1, 8, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Vruchtwaterprik"));
        appointments.add(new Appointment(14, 4, 8, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Vragenlijst ingevuld operatie knie prothese"));
        appointments.add(new Appointment(15, 20, 8, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Operatie knie prothese"));
        appointments.add(new Appointment(16, 2, 9, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Evaluatie operatie knie prothese"));
        appointments.add(new Appointment(17, 5, 9, 2018, 9, 15, "Dr. Geneens", "AZ Monica 04.04", "Tweede controle wijsheidstanden operatie"));
        appointments.add(new Appointment(18, 6, 9, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Revalidatie knie prothese sessie 1"));
        appointments.add(new Appointment(20, 12, 10, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Vierde echo baby"));
        appointments.add(new Appointment(21, 18, 10, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Revalidatie knie prothese sessie 2"));
        appointments.add(new Appointment(22, 21, 10, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Tweede echo baby"));
        appointments.add(new Appointment(23, 27, 10, 2018, 9, 15, "Dr. Van Limburgen", "AZ Klina 02.04", "Ontslag evaluatie knie prothese "));
        appointments.add(new Appointment(24, 3, 11, 2018, 9, 15, "Dr. Geneens", "AZ Monica 04.04", "Afspraak gereserveerd voor moesten wijsheidstanden teruggroeien."));
        appointments.add(new Appointment(25, 12, 11, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Voorberiding keizersnede"));
        appointments.add(new Appointment(26, 19, 11, 2018, 9, 15, "Dr. Geneens", "AZ Monica 04.04", "Ontslag knie prothese"));
        appointments.add(new Appointment(27, 24, 12, 2018, 9, 15, "Dr. Cryns", "AZ Klina 03.04", "Kerstmis babydrink"));

        return appointments;
    }
}
