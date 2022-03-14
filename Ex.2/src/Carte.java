import java.util.Objects;

public class Carte {
	
	private int nrpagini;

	public Carte(int nrpagini) {
		this.nrpagini = nrpagini;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nrpagini);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		return nrpagini == other.nrpagini;
	}

	@Override
	public String toString() {
		return "Carte [nrpagini=" + nrpagini + "]";
	}
	
	
	
	

}
