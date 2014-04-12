package cfi.edu.aas.data.dao;

import java.util.List;

import cfi.edu.aas.data.dao.po.NamedPO;

public interface INamedDAO<PO extends NamedPO> extends IBaseDAO<PO> {
	List<PO> findByName(String name);
}
