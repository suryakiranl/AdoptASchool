package cfi.edu.aas.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import cfi.edu.aas.data.dao.po.NamedPO;
import cfi.edu.aas.data.dao.util.EMF;

public class NamedDAOImpl<PO extends NamedPO> extends BaseDAOImpl<PO> implements
		INamedDAO<PO> {
	public NamedDAOImpl(Class<PO> po) {
		super(po);
	}

	@Override
	public List<PO> findByName(String name) {
		List<PO> pos = null;

		EntityManager em = EMF.get().createEntityManager();
		try {
			Query q = em.createQuery("select po from " + getPOClassName()
					+ " po where name = ?");
			q.setParameter(1, name);

			pos = q.getResultList();
		} finally {
			// em.close();
		}

		return pos;
	}
}
