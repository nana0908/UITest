package homework223.read_xml;

public class people {
		private String sName;
		private String sAge;
		private String sColle;
		public people(String sName,String sAge,String sColle)
		{
			this.sName = sName;
			this.sAge = sAge;
			this.sColle = sColle;
		}
		public String getsColle() {
			return sColle;
		}
		public void setsColle(String sColle) {
			this.sColle = sColle;
		}
		public String getsName() {
			return sName;
		}
		public String getsAge() {
			return sAge;
		}
	}



