package com.qianfeng.msg.mapper;




import com.qianfeng.msg.domain.Msg;

import java.util.List;

public interface MsgMapper {

    int insert(Msg record);

    List<Msg> selectAll();
}