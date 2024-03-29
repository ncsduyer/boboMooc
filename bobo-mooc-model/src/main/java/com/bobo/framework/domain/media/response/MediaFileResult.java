package com.bobo.framework.domain.media.response;

import com.bobo.framework.domain.media.MediaFile;
import com.bobo.framework.model.response.ResponseResult;
import com.bobo.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
@NoArgsConstructor
public class MediaFileResult extends ResponseResult {
    MediaFile mediaFile;
    public MediaFileResult(ResultCode resultCode, MediaFile mediaFile) {
        super(resultCode);
        this.mediaFile = mediaFile;
    }
}
