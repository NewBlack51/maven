package com.cch.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.cch.dao.UserDao;
import com.cch.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午7:07:45 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

    @Override
    public User findById(Integer id) {
          
        return getHibernateTemplate().get(User.class, id);
    }

}
  
