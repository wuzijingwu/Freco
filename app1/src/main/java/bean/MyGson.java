package bean;

import java.util.List;

/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：9:50
 * 用途：
 */
public class MyGson {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-11-04","title":"养眼玉雕，价值连城","description":"晒石会","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57449730.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509771621&signature=8f9wcfdAMXnjj5L2zSpeCqoi3dTHx*6lMBDcOkJ5Z8BQY2rQXMWESwG6DMMjSsW8z*AYFcuhbOk9m6CkuIxsakRHG8tIldmnEIcLI1gNUJ0="},{"ctime":"2017-11-04","title":"【问答】落地5万块内的代步小型车，能跑毛病少就行，求荐","description":"新车评","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-43365737.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509771620&signature=Acu11TI*660ILem2VhrJANEnTSM0Je828DvmcKUFJ72jl4PlVZ6r0uidqktrI5TN-cm25jg13X86vw8wk4CQMjNxlCVdE*zEHxzDmlgW3h8="},{"ctime":"2017-11-04","title":"不用钥匙就能把车开走！这些装X配置一个迷倒一片！","description":"车一百","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-22485797.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509771620&signature=KZw5*1u8HKojNPsoL9Rw0UphO4YR*MTnUo-5Haw9LsjdL8pd53szUkck637Vg6OHAOTE0juvAYIoc1yBT1WPiTz05sY5Wqm5A3ppFJMvil0="},{"ctime":"2017-11-04","title":"富民白石岩：又到冬桃成熟季 采桃看戏拿大奖","description":"掌阅富民","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57459442.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509771620&signature=zg6wjOGIh-eahzX-RgjzmBGQuzcAtSzgwfnFOTRtaPsjc3i-dIzSeZDstRZGcetHl3uayfujpyVGJuPrY4b*900KMqXoceLM-f*2j0Q7OIc="},{"ctime":"2017-11-04","title":"关注 | 从轻处罚≠不予处罚！北京5名未成年少女因欺凌同学获刑","description":"深圳新闻网","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57013820.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509771618&signature=0rQ19CR4AxikCCPmsoUYvPRiLEDqNk35Zd9n*9oc15*OJkEw09rbzLWYa27hNkPfwZ09aKlYNjs5ZVDEh6e3cvv78f2LEPrWoDl0S4N55dI="},{"ctime":"2017-11-04","title":"每个闪耀的时代icon背后都有一件传奇珠宝，这一次你也能感受！","description":"成都范儿","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448432.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768038&signature=NQOVtHJWqjaUCJjjDKH3MQx1-jfhMQoWyYkAjMHy0a52E8bChjpWbs0F-goUdMW9K5e5I7ozhRI1RqtNG1x2HkzA71PJIYAR-MMDSLZ9dD8="},{"ctime":"2017-11-04","title":"孕期危害宝宝的这几件事不要再做了！提前打好预防针","description":"好孕社区","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57447789.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768037&signature=K6Y*Eb4SaupXf6JF8ojST5-MpZsRP2bWb1szb3Wkp57GsCzy8lKVN0qmJ-N87-62B-mwxXZ74XeD3*4YhU2jKH1f33QfHxZcwj3uTj2S9KI="},{"ctime":"2017-11-04","title":"为什么叫\u201c羊水\u201d而不叫牛水、马水？这些解释真有趣","description":"好孕社区","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448333.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768037&signature=sK1Aa-KXW5qt*0Yhr*y8RtDFprWjg*SJPVVjzLKgBeKemgI3vFuW5k0evpkJdJF9M6S5jSkfstz9ouJ2JNGT74SEsE*rnjsPCJ0iJIvEbMs="},{"ctime":"2017-11-04","title":"胎宝宝在孕妈腹中都做些什么？小家伙活动丰富顽皮的很","description":"好孕社区","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448335.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768037&signature=vwBZPtsu6IOMQlZ8tngyji4maSGKsNpk-t5xd5ldfX5gEDL8IGmdLwDCK4XrvTAEWNJIfuR6J-BckVmsf-e1arRMMP3*tz86hrtN3KeJEuM="},{"ctime":"2017-11-04","title":"【肥你一笑】第1229","description":"肥西论坛","picUrl":"https://t1.qpic.cn/mblogpic/48da2c609d0a7f9d083e/2000","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768037&signature=K40GdtzleExBYcfRPd8rXa8Nq57ACeTPnEWZkxlKJnh4oi-aCRSOpix5fgmL12kWG0oVmS*uFm2dtvt0wPUtCoqKu*Tn8qp-bl2py6L3tXk="},{"ctime":"2017-11-04","title":"紧急｜母亲患病急需血小板，女儿心急发出求助！","description":"直播海南","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448410.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768036&signature=3Oe6U-VaYCWNVIq9ani1qOKllUyFUdxAgUC4ykMR02W1r3UAwUgD1ecaGgfuSHzuXrNhOO9DA1XmO8*f4*FN5WCUT8tsA82IZtA2FM2NvVA="},{"ctime":"2017-11-04","title":"3张信用卡莫名被刷爆，母亲怀疑\u201c内鬼\u201d是儿子！？做家长的都该看看！","description":"直播海南","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448352.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768036&signature=krixsuNr1Kzzl-OA3r1kWFk9DNCG0rdHuikoZbC3oUvgN*yHPdfBIOXvLZt2zqMWoIlIVfcDbbHlDp4n55FY9ulIJO7R0NAqmUkhviopo0Y="},{"ctime":"2017-11-04","title":"月子后带娃出门太艰难？那是你没get到这些技巧","description":"好孕社区","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448372.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768036&signature=-4uSZ*6iL6PQx4Fsysob8n3VCIzgphY6PuqZ49F2zfvL9oG1hBn3G5teA0oqJo8QvMYijXKnu6c2krJXuiibTe6MAoyab1Gu52*HNaipsDE="},{"ctime":"2017-11-04","title":"这大概是史上出土最早的景泰蓝器！","description":"收藏马未都","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-6162830.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768035&signature=DU0KwLuItlMT9f4Ho66M56pT56Jp*RIRHCt5Y8Vf*00MXJCMr2zTop1bs-4tgnbtAPaU*BctfnSoux*COUxUK6KPWFf-m39g6lH7SPpvGOI="},{"ctime":"2017-11-04","title":"千万不要在男人面前做这件事，无论他有多爱你！","description":"福州全接触","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-51013593.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768035&signature=y09UZ8zM8*LueJRrUx573MBUuEir3UKweexHW9vPbeiXh2oo2wwGssKxWGfPogR32pzSsUjuIURIHO3JmVerL01fcKWQBuwzxi6Ihu39i44="},{"ctime":"2017-11-04","title":"点赞 | 外国游客遗失钱包，环卫工人的一个举动亮了！","description":"直播海南","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448354.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768035&signature=IcK0mX-b5q4j*ze2DouU89V9GqKGQwrnA3UYuqbASTpoWxV0A09XFmxJ2EKtqcrWNwrbBqyQ8WweN3QvxA9YHV0VmonF3psUEPqb0q0ukkI="},{"ctime":"2017-11-04","title":"怀孕期间腰背腿酸痛感觉身体被掏空？你可能用了\u201c假姿势\u201d","description":"好孕社区","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448420.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768034&signature=zmpcCeFEwP4rLybZOHoqFBWQYqhrlvCUbKlZKrhU-R-1nchng*68zogNRoL3tw1rixfdlMm4moBCVOUzKmgRTB8Z3u0bnO21UaMdMHBm1mk="},{"ctime":"2017-11-04","title":"这个学校的新运动场启用了，靓！","description":"云浮广播电视台","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-28238155.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768034&signature=CplKv2DIeDL5scEJ8dDFuYHLiciDgI6*tcPdf7M9JSiDxPPMOjeDNxUkh3y-71zVEcOpIaC8LTKPnQ0zJm7bDPTaqouIjai*g1YhGXqnmHk="},{"ctime":"2017-11-04","title":"惊险 | 大狗突然对12岁男孩撕咬，狗主人却...众人怒了！","description":"直播海南","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-57448367.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768034&signature=Pj2yEPBYjTZoanPme4knBhzU*t0e7sd006gayp380K73VJmQawNmYk5c2qQOtSu*HjK3C5i5gicnN9YkGzVZ0CDuSzWbZyJR6KrBSIiliVE="},{"ctime":"2017-11-04","title":"这10种孩子以后最有出息，你家孩子在里面吗？","description":"福州全接触","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-51013593.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509768034&signature=*4tU8bnKUopcKFtcUaMX4RLkluA8-YqIpuceuiPUROSdgx2olDsOEV8L6PeD5ovArLsI7cvAjSzly-XJKI5QLqATmqLol8Oqq9mpezhfilw="}]
     */

    private int code;
    private String msg;
    private List<NewslistEntity> newslist;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setNewslist(List<NewslistEntity> newslist) {
        this.newslist = newslist;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public List<NewslistEntity> getNewslist() {
        return newslist;
    }

    public static class NewslistEntity {
        /**
         * ctime : 2017-11-04
         * title : 养眼玉雕，价值连城
         * description : 晒石会
         * picUrl : https://zxpic.gtimg.com/infonew/0/wechat_pics_-57449730.jpg/640
         * url : https://mp.weixin.qq.com/s?src=16&ver=468&timestamp=1509771621&signature=8f9wcfdAMXnjj5L2zSpeCqoi3dTHx*6lMBDcOkJ5Z8BQY2rQXMWESwG6DMMjSsW8z*AYFcuhbOk9m6CkuIxsakRHG8tIldmnEIcLI1gNUJ0=
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCtime() {
            return ctime;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public String getUrl() {
            return url;
        }
    }
}
