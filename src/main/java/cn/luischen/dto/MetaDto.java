package cn.luischen.dto;

import cn.luischen.model.MetaDomain;

/**
 * 标签、分类列表
 * Created by Yuan Cao on 8/2021.
 */
public class MetaDto extends MetaDomain {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
