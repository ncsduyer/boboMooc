package com.bobo.framework.domain.ucenter.ext;

import com.bobo.framework.domain.course.ext.CategoryNode;
import com.bobo.framework.domain.ucenter.XcMenu;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcMenuExt extends XcMenu {

    List<CategoryNode> children;
}
