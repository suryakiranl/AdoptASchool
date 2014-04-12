package cfi.edu.aas.data.dao;

import java.util.List;

import cfi.edu.aas.data.dao.po.BasePO;

public interface IBaseDAO<PO extends BasePO> {
	PO save(PO po);
	PO findById(long id);
	List<PO> findAll();
}
