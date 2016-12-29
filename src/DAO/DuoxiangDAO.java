package DAO;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for Duoxiang entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see DAO.Duoxiang
  * @author MyEclipse Persistence Tools 
 */
public class DuoxiangDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(DuoxiangDAO.class);
		//property constants
	public static final String _QCONTENT = "QContent";
	public static final String _QANSWER = "QAnswer";
	public static final String _QA = "QA";
	public static final String _QB = "QB";
	public static final String _QC = "QC";
	public static final String _QD = "QD";



	protected void initDao() {
		//do nothing
	}
    
    public void save(Duoxiang transientInstance) {
        log.debug("saving Duoxiang instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Duoxiang persistentInstance) {
        log.debug("deleting Duoxiang instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Duoxiang findById( java.lang.Integer id) {
        log.debug("getting Duoxiang instance with id: " + id);
        try {
            Duoxiang instance = (Duoxiang) getHibernateTemplate()
                    .get("DAO.Duoxiang", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Duoxiang instance) {
        log.debug("finding Duoxiang instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Duoxiang instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Duoxiang as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByQContent(Object QContent
	) {
		return findByProperty(_QCONTENT, QContent
		);
	}
	
	public List findByQAnswer(Object QAnswer
	) {
		return findByProperty(_QANSWER, QAnswer
		);
	}
	
	public List findByQA(Object QA
	) {
		return findByProperty(_QA, QA
		);
	}
	
	public List findByQB(Object QB
	) {
		return findByProperty(_QB, QB
		);
	}
	
	public List findByQC(Object QC
	) {
		return findByProperty(_QC, QC
		);
	}
	
	public List findByQD(Object QD
	) {
		return findByProperty(_QD, QD
		);
	}
	

	public List findAll() {
		log.debug("finding all Duoxiang instances");
		try {
			String queryString = "from Duoxiang";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Duoxiang merge(Duoxiang detachedInstance) {
        log.debug("merging Duoxiang instance");
        try {
            Duoxiang result = (Duoxiang) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Duoxiang instance) {
        log.debug("attaching dirty Duoxiang instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Duoxiang instance) {
        log.debug("attaching clean Duoxiang instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static DuoxiangDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (DuoxiangDAO) ctx.getBean("DuoxiangDAO");
	}
}