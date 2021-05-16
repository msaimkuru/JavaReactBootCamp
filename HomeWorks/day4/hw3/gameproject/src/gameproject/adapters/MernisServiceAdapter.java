package gameproject.adapters;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import gameproject.abstracts.IGamerCheckService;
import gameproject.entities.Gamer;

public class MernisServiceAdapter implements IGamerCheckService {
	@Override
	public boolean checkIfRealPerson(Gamer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}
}