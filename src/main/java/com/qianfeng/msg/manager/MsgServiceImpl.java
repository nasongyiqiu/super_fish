package com.qianfeng.msg.manager;


import com.qianfeng.msg.domain.Msg;
import com.qianfeng.msg.mapper.MsgMapper;
import com.qianfeng.msg.service.MsgService;
import com.qianfeng.msg.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/10/11 14:50
 */
@Service
public class MsgServiceImpl implements MsgService {
    @Autowired
    private MsgMapper msgMapper;
    @Override
    public R save(Msg record) {
        if(msgMapper.insert(record)>0){
            return R.setOK();
        }else {
            return R.setERROR();
        }
    }

    @Override
    public List<Msg> queryAll() {
        return msgMapper.selectAll();
    }
}
