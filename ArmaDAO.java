package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Arma;

public class ArmaDAO {
	
	DataBase bd = new DataBase();
	Connection conex = bd.Conectar();

	public ResultSet buscarArma(String snome) {
		// iop =1 mostra, 2 = nao
		conex = bd.Conectar();
		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM arma";
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				String nome = rs.getString("nome");

				if (snome.toLowerCase().equals(nome.toLowerCase())) {
					return rs;
				}

			}

			rs.close();
			stmt.close();

		} catch (java.lang.Exception ex) {
			System.out.println("que bosta deu ruim aqui");
			ex.printStackTrace();

		} finally {
			bd.Desconectar(conex);
		}
		return null;
	}
	
	public ArrayList<String> buscaArma (){		
		conex = bd.Conectar();
		
		try {
			ArrayList<String> selArma = new ArrayList<>();
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM arma ORDER BY nome";
			ResultSet rs = stmt.executeQuery(SQL);
			
			
			while (rs.next()) {
				String nome = rs.getString("nome");	
				selArma.add(nome);
				
			}
			rs.close();
			stmt.close();
			return selArma;

		} catch (java.lang.Exception ex) {
			System.out.println("erro conexao");
			ex.printStackTrace();

		} finally {
			bd.Desconectar(conex);
		}
		return null;
		
		
	}

	public boolean gravarArma(Arma a) {
		conex = bd.Conectar();
		try {
			Statement stmt = conex.createStatement();
			stmt.execute(
					"INSERT INTO arma(nome, tipo, acessorio, dano, alcance, precisao, tiroSemVisada, estabilidade, cadencia, capacidadeDoPente)VALUES ('"
							+ a.getNome() + "','" + a.getTipo() + "','" + a.getAcessorio() + "','" + a.getDano() + "','"
							+ a.getAlcance() + "','" + a.getPrecisao() + "','" + a.getTiroSemVisada() + "','"
							+ a.getEstabilidade() + "','" + a.getCadencia() + "','" + a.getCapacidadeDoPente() + "') ");
			return true;
		} catch (SQLException sqle) {
			System.out.println("Erro ao inserir..." + sqle.getMessage());
			return false;
		} finally {
			bd.Desconectar(conex);
		}

	}
	
	public boolean editarArmaSQL(Arma a, int iid) {
		conex = bd.Conectar();
		//System.out.println(id);
		try {
			Statement stmt = conex.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from arma WHERE nome ='" + a.getNome() + "'");
			while(rs.next()){
			if (iid != rs.getInt("id")) {
				return false;
			}
			//System.out.println(iid);
			}
			//System.out.println(id);
			stmt.execute("UPDATE Arma SET nome='" + a.getNome() + "', tipo='" + a.getTipo() + "', acessorio='"
					+ a.getAcessorio() + "', dano='" + a.getDano() + "', alcance='" + a.getAlcance() + "', precisao='"
					+ a.getPrecisao() + "', tiroSemVisada='" + a.getTiroSemVisada() + "', estabilidade ='"
					+ a.getEstabilidade() + "', cadencia='" + a.getCadencia() + "', capacidadeDoPente='"
					+ a.getCapacidadeDoPente() + "'  WHERE id='" + iid + "' ");
			
			rs.close();
			stmt.close();
			return true;
			// System.out.println("Alteração feita com sucesso!!!");
		} catch (SQLException sqle) {
			System.out.println("Erro ao inserir PORRRAAAA..." + sqle.getMessage());
		} finally {
			bd.Desconectar(conex);
		}
		return false;
	}

}
