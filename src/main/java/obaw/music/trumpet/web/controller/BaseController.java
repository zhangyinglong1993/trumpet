package obaw.music.trumpet.web.controller;

import obaw.music.trumpet.channel.netease.NeteaseAPI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiaowei
 * @time 17-5-4 下午3:26
 * @describe
 */
public class BaseController {
  @Autowired protected NeteaseAPI neteaseAPI;
}
