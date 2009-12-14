package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.forms.AlunoForm;
import org.fpij.jitakyoei.view.gui.AlunoAtualizarPanel;
@Form
public class AlunoAtualizarView implements AlunoView, ViewComponent{
	AlunoAtualizarPanel gui;
	private AlunoForm alunoForm;
	private AppFacade facade;
	private SwingBinder binder;
	
	public AlunoAtualizarView(Aluno aluno){
		gui = new AlunoAtualizarPanel();
		alunoForm = new AlunoForm(gui.getAlunoPanel());
		alunoForm.setEntidade(aluno.getEntidade());
		alunoForm.setProfessor(aluno.getProfessor());
		new SwingBinder(gui , this).bind();
		gui.setVisible(true);
	}
	public SwingBinder getBinder() {
		return binder;
	}
	
	@Action
	public void atualizar(){
		Aluno aluno = alunoForm.pegarBean();
		System.out.println(aluno.toString());
	}
	
	@Override
	public JPanel getGui(){
		return gui;
	}

	@Override
	public void displayResult(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(List<Aluno> searchResult) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;		
	}
}
