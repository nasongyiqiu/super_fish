package com.qianfeng.msg.service;




import com.qianfeng.msg.domain.Msg;
import com.qianfeng.msg.vo.R;

import java.util.List;

public interface MsgService {

    R save(Msg record);

    List<Msg> queryAll();
}