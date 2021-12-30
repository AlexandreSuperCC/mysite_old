package cn.luischen.service.relation.impl;

import cn.luischen.dao.RelationShipDao;
import cn.luischen.service.relation.RelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Yuan Cao on 8/2021.
 */
@Service
public class RelationShipServiceImpl implements RelationShipService {

    @Autowired
    private RelationShipDao relationShipDao;


}
