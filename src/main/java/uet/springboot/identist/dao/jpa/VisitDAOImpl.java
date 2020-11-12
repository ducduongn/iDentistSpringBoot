package uet.springboot.identist.dao.jpa;

import org.springframework.stereotype.Repository;
import uet.springboot.identist.dao.VisitDAO;
import uet.springboot.identist.model.Visit;


import javax.persistence.EntityManager;

@Repository
public class VisitDAOImpl implements VisitDAO {
    private EntityManager entityManager;


    @Override
    public void saveVisit(Visit visit) {

    }
}
