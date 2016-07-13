package com.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IUsersDAO;
import com.entity.Album;
import com.entity.Sing;
import com.entity.User;

public class SingsDAOImpl extends HibernateDaoSupport implements ISingsDAO {
	private static final Log log = LogFactory.getLog(SingsDAOImpl.class);
	// property constants

	protected void initDao() {
		
	}

	public void save(Sing transientInstance) {
		log.debug("saving Sing instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sing persistentInstance) {
		log.debug("deleting Sing instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	public void delete(java.lang.Integer id) {
		log.debug("deleting Sing instance");
		try {
			Sing sing = (Sing) getHibernateTemplate().get(
					"com.entity.Sing", id);
			getHibernateTemplate().delete(sing);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}



	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Sing instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sing as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
    //通过用户名和密码查询用户是否存在
	public User findByUsername(String name,String pwd)throws IOException{
		log.debug("查询失败！");
		try{
			String hql="from Sing t where t.name=:name and t.pwd=:pwd ";
			Query query=this.getSession().createQuery(hql);
			query.setString("name", name);
			query.setString("pwd", pwd);
			List<User> lists=query.list();
			if(lists.size()>0){
				return lists.get(0);
			}else {
				return null;
			}
		}catch(RuntimeException re){
			log.error("查询人员信息失败！", re);
			throw re;
		}
	}
	 //通过用户名和密码查询用户是否存在
	
	/**public TTm1PlanProduce findPlanProducesByMouldIds(Long mouldId,Long produceId){
	  	   log.debug("getting TTm1PlanProduce instance with id: " + mouldId);
	  	   try{
	  		 String hql="from TTm1PlanProduce plan where  plan.TTm1MouldProject.id=:mouldId and plan.id=:produceId";	
	  		 Query query = this.getSession().createQuery(hql);
	  		 query.setLong("mouldId", mouldId);
	  		 query.setLong("produceId", produceId);
	  		 List<TTm1PlanProduce> list=query.list();
	  		 if(list.isEmpty()){
	  			 return null;
	  		 }else {
	  			return list.get(0);
	  		 }
	  		 //return (TTm1PlanProduce) list.get(0); 
	  	   }catch(RuntimeException re){
	  		   log.error("get failed", re);
	             throw re;  
	  	   }**/
	


	public List findAll() {
		log.debug("finding all Sing instances");
		try {
			String queryString = "from Sing";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	

	public void attachDirty(Sing instance) {
		log.debug("attaching dirty Sing instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sing instance) {
		log.debug("attaching clean Sing instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SingsDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (SingsDAOImpl) ctx.getBean("ISingsDAO");
	}
}