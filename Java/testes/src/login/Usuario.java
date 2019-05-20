package login;

public class Usuario {
		private String login;
		private String senha;
		private Integer nivelDeAcesso;
		public void setLogin(String login) {
			this.login = login;
		}
		public String getLogin() {
			return login;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getSenha() {
			return senha;
		}
		public void setNivelDeAcesso(Integer nivelDeAcesso) {
			this.nivelDeAcesso = nivelDeAcesso;
		}
		public Integer getIntegerNivelDeAcesso() {
			return nivelDeAcesso;
		}
		public int getNivelDeAcesso() {
			// TODO Auto-generated method stub
			return 0;
		}
	}