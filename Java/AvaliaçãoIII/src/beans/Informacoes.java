package beans;

import java.awt.Checkbox;


public class Informacoes {
	
	//Atributor
	
	private String colaborador, cargo;
	private int faltas, VT;
	private double IRRF, SalarioL, SalaraioB;
	private Checkbox VT2, PS, CF;
	
	//Set & Get
	
	public String getColaborador() {
		return colaborador;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	public double getSalaraioB() {
		return SalaraioB;
	}
	public void setSalaraioB(double salaraioB) {
		SalaraioB = salaraioB;
	}
	public Checkbox getVT2() {
		return VT2;
	}
	public void setVT2(Checkbox vT2) {
		VT2 = vT2;
	}
	public Checkbox getPS() {
		return PS;
	}
	public void setPS(Checkbox pS) {
		PS = pS;
	}
	public Checkbox getCF() {
		return CF;
	}
	public void setCF(Checkbox cF) {
		CF = cF;
	}
	public int getVT() {
		return VT;
	}
	public void setVT(int vT) {
		this.VT = vT;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public double getIRRF() {
		return IRRF;
	}
	public void setIRRF(double iRRF) {
		IRRF = iRRF;
	}
	public double getSalarioL() {
		return SalarioL;
	}
	public void setSalarioL(double salarioL) {
		SalarioL = salarioL;
	}
	}