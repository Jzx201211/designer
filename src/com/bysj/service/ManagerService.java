package com.bysj.service;

import com.bysj.dao.ManagerDao;
import com.bysj.dto.Manager;

//用户实现和管理员相关的业务
public class ManagerService {

    public Manager checkLogin(String loginName,String loginPwd){
        ManagerDao managerDao = new ManagerDao();
        Manager manager = managerDao.selectManagerByLoginName(loginName);

        if (manager!=null){
            if (!loginPwd.equals(manager.getLoginPwd())){
                return null;
            }
        }
        return manager;
    }

    public Manager updataManager(Manager manager){
        ManagerDao managerDao = new ManagerDao();
        int i = managerDao.updataManager(manager);
        Manager manager1 = managerDao.selectManagerByMgrId(manager.getMgrId());
        return manager1;
    }
}
