package principal;

import principal.controller.MedicamentoController;
import principal.controller.PacienteController;
import principal.model.Medicamento;
import principal.model.Paciente;

public class Programa {
	
	public static void main(String[] args) {

		//INSTANCIANDO CONTROLLERS
		PacienteController P_control = new PacienteController();
		MedicamentoController M_control = new MedicamentoController();

		//CRIANDO PACIENTES
		Paciente lucas = new Paciente(100, "Lucas");
		Paciente maria = new Paciente(200, "Maria");
		Paciente Geucimar = new Paciente(300, "Geucimar");
		P_control.create(lucas);
		P_control.create(maria);
		P_control.create(Geucimar);

		//CRIANDO MEDICAMENTOS
		Medicamento dipirona = new Medicamento("Dipirona", lucas);
		Medicamento dorflex = new Medicamento("Dorflex", lucas);
		Medicamento ritalina = new Medicamento("Ritalina",maria );
		Medicamento antialergico = new Medicamento("Antialergico", maria);
		Medicamento torsilax = new Medicamento("Torsilax", Geucimar );
		Medicamento troc = new Medicamento("T-Roc", Geucimar);

		//ADICIONANDO MEDICAMENTOS
		lucas.addMedicamento(dipirona);
		lucas.addMedicamento(dorflex);
		maria.addMedicamento(ritalina);
		maria.addMedicamento(antialergico);
		Geucimar.addMedicamento(torsilax);
		Geucimar.addMedicamento(troc);

		//CRIANDO NO BANCO
		M_control.create(dipirona);
		M_control.create(dorflex);
		M_control.create(ritalina);
		M_control.create(antialergico);
		M_control.create(torsilax);
		M_control.create(troc);

		//ATUALIZANDO
		P_control.update(lucas);
		P_control.update(maria);
		P_control.update(Geucimar);

		System.out.println("-----------------------------------------------");
		System.out.println("                   FIM DO PROGRAMA             ");
		System.out.println("-----------------------------------------------");
	}
}
