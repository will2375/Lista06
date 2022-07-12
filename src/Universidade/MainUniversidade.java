package Universidade;

import java.util.Scanner;

public class MainUniversidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Professores professores = new Professores();
        professores.setNome("Alberto da Silva");
        professores.setCpf("65355297-0");
        professores.setNumRegistro("213");
        professores.setOrgaoLotaçao("sp");
        professores.setSalario(3500);
        professores.setNivelGraduaçao("pos");
        professores.setDiscMinistrada("Matematica");
        professores.setQntTurmas(5);

        professores.status();
        professores.aumento10();

        System.out.println("-----------------------------");

        Coordenadores coordenadores = new Coordenadores();

        coordenadores.setNome("Maria das flores");
        coordenadores.setCpf("12345678-9");
        coordenadores.setNumRegistro("123");
        coordenadores.setOrgaoLotaçao("SP");
        coordenadores.setSalario(4500);
        coordenadores.setProfSurpervisor(6);

        coordenadores.status();
        coordenadores.aumento05();

        System.out.println("-----------------------------");

        FuncionariosAdm fAdm = new FuncionariosAdm();

        fAdm.setNome("Rogerio Benicio");
        fAdm.setCpf("759034867-9");
        fAdm.setNumRegistro("432");
        fAdm.setOrgaoLotaçao("sp");
        fAdm.setSalario(2700);
        fAdm.setFuncao("contador");
        fAdm.setSenioridade("Lider");

        fAdm.status();
        fAdm.aumento10();

    }
}
