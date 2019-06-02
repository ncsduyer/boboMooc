package com.bobo.framework.domain.filesystem.response;

import com.bobo.framework.domain.filesystem.FileSystem;
import com.bobo.framework.model.response.ResponseResult;
import com.bobo.framework.model.response.ResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * Created by admin on 2018/3/5.
 */
@Data
@ToString
public class UploadFileResult extends ResponseResult{
    @ApiModelProperty(value = "文件信息", example = "true", required = true)
    FileSystem fileSystem;
    public UploadFileResult(ResultCode resultCode, FileSystem fileSystem) {
        super(resultCode);
        this.fileSystem = fileSystem;
    }

}
