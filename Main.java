package control;

import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class Main {
	
	static int procurarJogador(ArrayList<Jogador> contas, String nome){
		int i=0;
		for(Jogador j: contas){
			if(j.getId().compareTo(nome)==0) return i;
			i++;
		}
		return -1;
	}
	
	static int procurarClasse(ArrayList<Classe> classes, String nome){
		int i=0;
		for(Classe c: classes){
			if(c.getNome().compareTo(nome)==0) return i;
			i++;
		}
		return -1;
	}
	
	static int procurarPersonagem(ArrayList<Personagem> personagens, String nome){
		int i=0;
		for(Personagem p: personagens){
			if(p.getNome().compareTo(nome)==0) return i;
			i++;
		}
		return -1;
	}
	
	static int procurarArma(ArrayList<Arma> armas, String nome){
		int i=0;
		for(Arma a: armas){
			if(a.getNome().compareTo(nome)==0) return i;
			i++;
		}
		return -1;
	}
	
	static int procurarVeiculo(ArrayList<Veiculo> veiculos, String nome){
		int i=0;
		for(Veiculo v: veiculos){
			if(v.getNome().compareTo(nome)==0) return i;
			i++;
		}
		return -1;
	}
	
	static Jogador novaConta(){
		Scanner inp = new Scanner(System.in);
		Jogador novaConta = new Jogador();
		System.out.println("// Novo jogador //\n\nNome de usuário: ");
		novaConta.setNomeDeUsuario(inp.next()+inp.nextLine()); 
		System.out.println("Id: ");
		novaConta.setId(inp.next()+inp.nextLine());
		System.out.println("E-mail: ");
		novaConta.setEmail(inp.next()+inp.nextLine());
		System.out.println("Patente: ");
		novaConta.setPatente(inp.nextInt());
		System.out.println("K.D.: ");
		novaConta.setKd(inp.nextDouble());
		System.out.println("Score: ");
		novaConta.setScore(inp.nextInt());
		System.out.println("Temp de jogo: ");
		novaConta.setTempoJogo(inp.nextInt());
		System.out.println("Senha: ");
		novaConta.setSenha(inp.next()+inp.nextLine());
		
		inp.close();
		return novaConta;
	}
	
	static Jogador editarJogador(){
		Jogador jogador = new Jogador();
		Scanner inp = new Scanner(System.in);
		System.out.println("// Editar jogador //\n\nNome de usuário: ");
		jogador.setNomeDeUsuario(inp.next()+inp.nextLine()); 
		System.out.println("Id: ");
		jogador.setId(inp.next()+inp.nextLine());
		System.out.println("E-mail: ");
		jogador.setEmail(inp.next()+inp.nextLine());
		System.out.println("Patente: ");
		jogador.setPatente(inp.nextInt());
		System.out.println("K.D.: ");
		jogador.setKd(inp.nextDouble());
		System.out.println("Score: ");
		jogador.setScore(inp.nextInt());
		System.out.println("Temp de jogo: ");
		jogador.setTempoJogo(inp.nextInt());
		
		inp.close();
		return jogador;
	}
	
	static void listarJogador(Jogador jogador){
		
		System.out.println("// Listar jogador //\n\nNome de usuário: " + jogador.getNomeDeUsuario());
		System.out.println("\nId: " + jogador.getId());
		System.out.println("\nE-mail: " + jogador.getEmail());
		System.out.println("\nPatente: " + jogador.getPatente());
		System.out.println("\nK.D.: " + jogador.getKd());
		System.out.println("\nScore: " + jogador.getScore());
		System.out.println("\nTemp de jogo: " + jogador.getTempoJogo() + "\n\n");
	}
	
	static Arma novaArma(){
		Scanner inp = new Scanner(System.in);
		Arma novaArma = new Arma();
		System.out.println("// Nova arma //\n\nNome: ");
		novaArma.setNome(inp.next()+inp.nextLine()); 
		System.out.println("Tipo: ");
		novaArma.setTipo(inp.next()+inp.nextLine());
		
		int op;
		System.out.println("Acessório? (1-Sim / 0-Não): ");
		op = inp.nextInt();
		if(op==0){
			System.out.println("Dano: ");
			novaArma.setDano(inp.nextInt());
			System.out.println("Alcance: ");
			novaArma.setAlcance(inp.nextInt());
			System.out.println("Precisão: ");
			novaArma.setPrecisao(inp.nextInt());
			System.out.println("Tiro sem visada: ");
			novaArma.setTiroSemVisada(inp.nextInt());
			System.out.println("Estabilidade: ");
			novaArma.setEstabilidade(inp.nextInt());
			System.out.println("Cadência: ");
			novaArma.setCadencia(inp.nextInt());
			System.out.println("Capacidade do pente: ");
			novaArma.setCapacidadeDoPente(inp.nextInt());
		}
		else novaArma.setAcessorio(true);
		inp.close();
		return novaArma;
	}
	
	static Arma editarArma(){
		Arma arma = new Arma();
		Scanner inp = new Scanner(System.in);
		System.out.println("// Editar arma //\n\nNome: ");
		arma.setNome(inp.next()+inp.nextLine()); 
		System.out.println("Tipo: ");
		arma.setTipo(inp.next()+inp.nextLine());
		if(!arma.isAcessorio()){
			System.out.println("Dano: ");
			arma.setDano(inp.nextInt());
			System.out.println("Alcance: ");
			arma.setAlcance(inp.nextInt());
			System.out.println("Precisão: ");
			arma.setPrecisao(inp.nextInt());
			System.out.println("Tiro sem visada: ");
			arma.setTiroSemVisada(inp.nextInt());
			System.out.println("Estabilidade: ");
			arma.setEstabilidade(inp.nextInt());
			System.out.println("Cadência: ");
			arma.setCadencia(inp.nextInt());
			System.out.println("Capacidade do pente: ");
			arma.setCapacidadeDoPente(inp.nextInt());
		}
		
		inp.close();
		return arma;
	}
	
	static void listarArma(Arma arma){
		
		System.out.println("// Listar arma //\n\nNome: " + arma.getNome());
		System.out.println("\nTipo: " + arma.getTipo());
		if(!arma.isAcessorio()){
			System.out.println("\nDano: " + arma.getDano());
			System.out.println("\nAlcance: " + arma.getAlcance());
			System.out.println("\nPrecisao: " + arma.getPrecisao());
			System.out.println("\nTiro sem visada: " + arma.getTiroSemVisada());
			System.out.println("\nEstabilidade: " + arma.getEstabilidade());
			System.out.println("\nCadência: " + arma.getCadencia());
			System.out.println("\nCapaciade do pente: " + arma.getCapacidadeDoPente()+"\n\n");
		}
	}
	
	static Classe novaClasse(){
		Scanner inp = new Scanner(System.in);
		Classe novaClasse = new Classe();
		System.out.println("// Nova classe //\n\nNome: ");
		novaClasse.setNome(inp.next()+inp.nextLine()); 
		System.out.println("Tipo: ");
		novaClasse.setTipo(inp.next()+inp.nextLine());
		
		inp.close();
		return novaClasse;
	}
	
	static Classe editarClasse(){
		Classe classe = new Classe();
		Scanner inp = new Scanner(System.in);
		System.out.println("// Editar classe //\n\nNome: ");
		classe.setNome(inp.next()+inp.nextLine()); 
		System.out.println("Tipo: ");
		classe.setTipo(inp.next()+inp.nextLine());
		inp.close();
		return classe;
	}
	
	static void listarClasse(Classe classe){
		System.out.println("// Listar arma //\n\nNome: " + classe.getNome());
		System.out.println("\nTipo: " + classe.getTipo()+ "\n\n");
	}
	
	static Personagem novoPersonagem(){
		Personagem novoPersonagem = new Personagem();
		Classe classe = new Classe();
		Arma arma  = new Arma();
		Scanner inpu = new Scanner(System.in);
		
		System.out.println("Nome: ");
		novoPersonagem.setNome(inpu.next()+inpu.nextLine());
		novoPersonagem.setClasse(classe);
		novoPersonagem.setArmaPrimaria(arma);
		novoPersonagem.setArmaSecundaria(arma);
		novoPersonagem.setItemUm(arma);
		novoPersonagem.setItemDois(arma);
		
		inpu.close();
		return novoPersonagem;
	}
	
	static Personagem editarPersonagem(){
		Personagem personagem = new Personagem();
		Classe classe = new Classe();
		Arma arma  = new Arma();
		Scanner inpu = new Scanner(System.in);
	
		System.out.println("Nome: ");
		personagem.setNome(inpu.next()+inpu.nextLine());
		personagem.setClasse(classe);
		personagem.setArmaPrimaria(arma);
		personagem.setArmaSecundaria(arma);
		personagem.setItemUm(arma);
		personagem.setItemDois(arma);
		
		inpu.close();
		return personagem;
	}
	
	static void listarPersonagem(Personagem personagem){
		System.out.println("// Listar personagem //\n\nNome: " + personagem.getNome());
		System.out.println("\nClasse: " + personagem.getClasse().getNome());
		System.out.println("\nArma primária: " + personagem.getArmaPrimaria().getNome());
		System.out.println("\nArma secundária: " + personagem.getArmaSecundaria().getNome());
		System.out.println("\nItem 1: " + personagem.getItemUm().getNome());
		System.out.println("\nItem 2: " + personagem.getItemDois().getNome() + "\n\n");
	}
	
	static Veiculo novoVeiculo(){
		Veiculo novoVeiculo = new Veiculo();
		Scanner inp = new Scanner(System.in);
		
		System.out.println("// Novo veiculo //\n\nNome: ");
		novoVeiculo.setNome(inp.next()+inp.nextLine()); 
		System.out.println("Tipo: ");
		novoVeiculo.setTipo(inp.next()+inp.nextLine());
		
		int op;
		System.out.println("Possui armamento? (1-Sim / 0-Não): ");
		op = inp.nextInt();
		if(op==1){
			novoVeiculo.setPossuiArmamento(true);
			System.out.println("Arma primária: ");
			novoVeiculo.setArmaPrimaria(inp.next()+inp.nextLine());
			System.out.println("Arma Secundária: ");
			novoVeiculo.setArmaSecundaria(inp.next()+inp.nextLine());
		}
		
		inp.close();	
		return novoVeiculo;
	}
	
	static Veiculo editarVeiculo(){
		Veiculo veiculo = new Veiculo();
		Scanner inp = new Scanner(System.in);
		
		System.out.println("// Editar veiculo //\n\nNome: ");
		veiculo.setNome(inp.next()+inp.nextLine()); 
		System.out.println("Tipo: ");
		veiculo.setTipo(inp.next()+inp.nextLine());
		if(veiculo.isPossuiArmamento()){
			System.out.println("Arma primária: ");
			veiculo.setArmaPrimaria(inp.next()+inp.nextLine());
			System.out.println("Arma Secundária: ");
			veiculo.setArmaSecundaria(inp.next()+inp.nextLine());
		}
		
		inp.close();	
		return veiculo;
	}
	
	static void listarVeiculo(Veiculo veiculo){
		System.out.println("// Listar veiculo //\n\nNome: " + veiculo.getNome());
		System.out.println("\nTipo: " + veiculo.getTipo());
		if(veiculo.isPossuiArmamento()){
			System.out.println("\nArma primária: " + veiculo.getArmaPrimaria());
			System.out.println("\nArma secundária: " + veiculo.getArmaSecundaria() + "\n\n");
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Jogador> contas = new ArrayList<>();
		ArrayList<Arma> armas = new ArrayList<>();
		ArrayList<Classe> classes = new ArrayList<>();
		ArrayList<Personagem> personagens = new ArrayList<>();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		Scanner inpt = new Scanner(System.in);
		int op1, op2, pos;
		String nome, id;
		
		System.out.println("///////// BATTLE STATS /////////\n\n[1] Cadastro\n[2] Edição\n[3] Listagem\n[4] Remoção\n[5] Sair\n\nDigite uma opção: ");
		op1 = inpt.nextInt();
		
		switch(op1){
		case 1:
			System.out.println("\n// Cadastrar //\n\n[1] Jogador\n[2] Classe\n[3] Arma\n[4] Veículo\n[5] Personagem\n[6] Sair\n\nDigite uma opção: ");
			op2 = inpt.nextInt();
			switch(op2){
			case 1:
				Jogador novoJog = new Jogador();
				novoJog = novaConta();
				contas.add(novoJog);
				break;
			case 2:
				Classe novaCl= new Classe();
				novaCl = novaClasse();
				classes.add(novaCl);
				break;
			case 3:
				Arma novaArm = new Arma();
				novaArm = novaArma();
				armas.add(novaArm);
				break;
			case 4:
				Veiculo novoVe = new Veiculo();
				novoVe = novoVeiculo();
				veiculos.add(novoVe);
				break;
			case 5:
				Personagem novoPe = new Personagem();
				novoPe = novoPersonagem();
				personagens.add(novoPe);
				break;
			case 6:
				break;
			}
			break;
			
		case 2:
			System.out.println("\n// Editar //\n\n[1] Jogador\n[2] Classe\n[3] Arma\n[4] Veículo\n[5] Personagem\n[6] Sair\n\nDigite uma opção: ");
			op2 = inpt.nextInt();
			switch(op2){
			case 1:
				System.out.print("ID do jogador: ");
				id = inpt.next()+inpt.nextLine();
				pos = procurarJogador(contas, id);
				if(pos==-1) System.out.println("Jogador não encontrado!\n");
				else{
					listarJogador(contas.get(pos));
					Jogador newJogador = new Jogador();
					newJogador = editarJogador();
					contas.set(pos, newJogador);
				}
				break;
			case 2:
				System.out.print("Nome da classe: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarClasse(classes, nome);
				if(pos==-1) System.out.println("Classe não encontrada!\n");
				else{
					listarClasse(classes.get(pos));
					Classe newClasse = new Classe();
					newClasse = editarClasse();
					classes.set(pos, newClasse);
				}
				break;
			case 3:
				System.out.print("Nome da arma: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarArma(armas, nome);
				if(pos==-1) System.out.println("Arma não encontrada!\n");
				else{
					listarArma(armas.get(pos));
					Arma newArma = new Arma();
					newArma = editarArma();
					armas.set(pos, newArma);
				}
				break;
			case 4:
				System.out.print("Nome do veiculo: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarVeiculo(veiculos, nome);
				if(pos==-1) System.out.println("Veiculo não encontrado!\n");
				else{
					listarVeiculo(veiculos.get(pos));
					Veiculo newVeiculo = new Veiculo();
					newVeiculo = editarVeiculo();
					veiculos.set(pos, newVeiculo);
				}
				break;
			case 5:
				System.out.print("Nome do personagem: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarPersonagem(personagens, nome);
				if(pos==-1) System.out.println("Personagem não encontrado!\n");
				else{
					listarPersonagem(personagens.get(pos));
					Personagem newPersonagem = new Personagem();
					newPersonagem = editarPersonagem();
					personagens.set(pos, newPersonagem);
				}
				break;
			case 6:
				break;
			}
			break;
			
		case 3:
			System.out.println("\n// Listar //\n\n[1] Jogador\n[2] Classe\n[3] Arma\n[4] Veículo\n[5] Personagem\n[6] Sair\n\nDigite uma opção: ");
			op2 = inpt.nextInt();
			switch(op2){
			case 1:
				for(Jogador j: contas) listarJogador(j);
				break;
			case 2:
				for(Classe c: classes) listarClasse(c);
				break;
			case 3:
				for(Arma a: armas) listarArma(a);
				break;
			case 4:
				for(Veiculo v: veiculos) listarVeiculo(v);
				break;
			case 5:
				for(Personagem p: personagens) listarPersonagem(p);
				break;
			case 6:
				break;
			}
			break;
			
		case 4:
			System.out.println("\n// Remover //\n\n[1] Jogador\n[2] Classe\n[3] Arma\n[4] Veículo\n[5] Personagem\n[6] Sair\n\nDigite uma opção: ");
			op2 = inpt.nextInt();
			switch(op2){
			case 1:
				System.out.print("ID do jogador: ");
				id = inpt.next()+inpt.nextLine();
				pos = procurarJogador(contas, id);
				if(pos==-1) System.out.println("Jogador não encontrado!\n");
				else{
					contas.remove(pos);
					System.out.println("Jogador removido!\n");
				}
				break;
			case 2:
				System.out.print("Nome da classe: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarClasse(classes, nome);
				if(pos==-1) System.out.println("Classe não encontrada!\n");
				else{
					classes.remove(pos);
					System.out.println("Classe removida!\n");
				}
				break;
			case 3:
				System.out.print("Nome da arma: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarArma(armas, nome);
				if(pos==-1) System.out.println("Arma não encontrada!\n");
				else{
					armas.remove(pos);
					System.out.println("Arma removido!\n");
				}
				break;
			case 4:
				System.out.print("Nome do veiculo: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarVeiculo(veiculos, nome);
				if(pos==-1) System.out.println("Veiculo não encontrado!\n");
				else{
					veiculos.remove(pos);
					System.out.println("Veiculo removido!\n");
				}
				break;
			case 5:
				System.out.print("Nome do personagem: ");
				nome = inpt.next()+inpt.nextLine();
				pos = procurarPersonagem(personagens, nome);
				if(pos==-1) System.out.println("Persgonagem não encontrado!\n");
				else{
					personagens.remove(pos);
					System.out.println("Personagem removido!\n");
				}
				break;
			case 6:
				break;
			}
			break;
			
		case 5:
			break;
			
		}
		
		inpt.close();
	}
}
