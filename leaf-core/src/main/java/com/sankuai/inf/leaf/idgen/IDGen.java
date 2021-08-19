package com.sankuai.inf.leaf.idgen;

import com.sankuai.inf.leaf.common.Result;

public interface IDGen {

    Result get(String key);

    boolean init();
}
