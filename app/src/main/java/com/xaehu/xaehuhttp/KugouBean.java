package com.xaehu.xaehuhttp;

import java.util.List;

/**
 * author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/19 11:53
 * desc   :
 */
public class KugouBean {

    /**
     * status : 1
     * err_code : 0
     * data : {"hash":"CB7EE97F4CC11C4EA7A1FA4B516A5D97","timelength":199000,"filesize":3198974,"audio_name":"李玉刚 - 刚好遇见你","have_album":1,"album_name":"刚好遇见你 (单曲)","album_id":"1820033","img":"http://imge.kugou.com/stdmusic/20161109/20161109171040932108.jpg","have_mv":1,"video_id":"596892","author_name":"李玉刚","song_name":"刚好遇见你","lyrics":"﻿[id:$00000000]\r\n[ar:李玉刚]\r\n[ti:刚好遇见你]\r\n[by:]\r\n[hash:cb7ee97f4cc11c4ea7a1fa4b516a5d97]\r\n[al:]\r\n[sign:]\r\n[qq:]\r\n[total:0]\r\n[offset:0]\r\n[00:00.02]李玉刚 - 刚好遇见你\r\n[00:00.75]词：高进\r\n[00:00.85]曲：高进\r\n[00:00.94]编曲：关天天\r\n[00:13.13]我们哭了\r\n[00:15.79]我们笑着\r\n[00:18.83]我们抬头望天空\r\n[00:21.86]星星还亮着几颗\r\n[00:24.98]我们唱着\r\n[00:27.96]时间的歌\r\n[00:31.09]才懂得相互拥抱\r\n[00:33.98]到底是为了什么\r\n[00:37.30]因为我刚好遇见你\r\n[00:40.77]留下足迹才美丽\r\n[00:43.79]风吹花落泪如雨\r\n[00:46.80]因为不想分离\r\n[00:49.95]因为刚好遇见你\r\n[00:53.10]留下十年的期许\r\n[00:55.99]如果再相遇\r\n[00:59.21]我想我会记得你\r\n[01:14.32]我们哭了\r\n[01:17.23]我们笑着\r\n[01:20.34]我们抬头望天空\r\n[01:23.33]星星还亮着几颗\r\n[01:26.51]我们唱着\r\n[01:29.53]时间的歌\r\n[01:32.59]才懂得相互拥抱\r\n[01:35.59]到底是为了什么\r\n[01:38.73]因为我刚好遇见你\r\n[01:42.23]留下足迹才美丽\r\n[01:45.30]风吹花落泪如雨\r\n[01:48.39]因为不想分离\r\n[01:51.55]因为刚好遇见你\r\n[01:54.54]留下十年的期许\r\n[01:57.61]如果再相遇\r\n[02:00.81]我想我会记得你\r\n[02:03.99]因为刚好遇见你\r\n[02:06.86]留下足迹才美丽\r\n[02:09.94]风吹花落泪如雨\r\n[02:13.03]因为不想分离\r\n[02:16.06]因为刚好遇见你\r\n[02:19.16]留下十年的期许\r\n[02:22.21]如果再相遇\r\n[02:25.34]我想我会记得你\r\n[02:31.40]因为我刚好遇见你\r\n[02:34.51]留下足迹才美丽\r\n[02:37.59]风吹花落泪如雨\r\n[02:40.67]因为不想分离\r\n[02:43.77]因为刚好遇见你\r\n[02:46.84]留下十年的期许\r\n[02:49.94]如果再相遇\r\n[02:53.11]我想我会记得你\r\n","author_id":"2018","privilege":8,"privilege2":"1000","play_url":"https://webfs.yun.kugou.com/201909191146/07d6f525ffece19820d9fff6c4cb8dc5/G078/M08/18/17/jg0DAFgi6G-AKqsqADDP_nSW5F4051.mp3","authors":[{"author_id":"2018","sizable_avatar":"http://singerimg.kugou.com/uploadpic/softhead/{size}/20181224/20181224183453372.jpg","is_publish":"1","author_name":"李玉刚","avatar":"http://singerimg.kugou.com/uploadpic/softhead/400/20181224/20181224183453372.jpg"}],"bitrate":128,"audio_id":"23609415"}
     */

    private int status;
    private int err_code;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getErr_code() {
        return err_code;
    }

    public void setErr_code(int err_code) {
        this.err_code = err_code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * hash : CB7EE97F4CC11C4EA7A1FA4B516A5D97
         * timelength : 199000
         * filesize : 3198974
         * audio_name : 李玉刚 - 刚好遇见你
         * have_album : 1
         * album_name : 刚好遇见你 (单曲)
         * album_id : 1820033
         * img : http://imge.kugou.com/stdmusic/20161109/20161109171040932108.jpg
         * have_mv : 1
         * video_id : 596892
         * author_name : 李玉刚
         * song_name : 刚好遇见你
         * lyrics : ﻿[id:$00000000]
         [ar:李玉刚]
         [ti:刚好遇见你]
         [by:]
         [hash:cb7ee97f4cc11c4ea7a1fa4b516a5d97]
         [al:]
         [sign:]
         [qq:]
         [total:0]
         [offset:0]
         [00:00.02]李玉刚 - 刚好遇见你
         [00:00.75]词：高进
         [00:00.85]曲：高进
         [00:00.94]编曲：关天天
         [00:13.13]我们哭了
         [00:15.79]我们笑着
         [00:18.83]我们抬头望天空
         [00:21.86]星星还亮着几颗
         [00:24.98]我们唱着
         [00:27.96]时间的歌
         [00:31.09]才懂得相互拥抱
         [00:33.98]到底是为了什么
         [00:37.30]因为我刚好遇见你
         [00:40.77]留下足迹才美丽
         [00:43.79]风吹花落泪如雨
         [00:46.80]因为不想分离
         [00:49.95]因为刚好遇见你
         [00:53.10]留下十年的期许
         [00:55.99]如果再相遇
         [00:59.21]我想我会记得你
         [01:14.32]我们哭了
         [01:17.23]我们笑着
         [01:20.34]我们抬头望天空
         [01:23.33]星星还亮着几颗
         [01:26.51]我们唱着
         [01:29.53]时间的歌
         [01:32.59]才懂得相互拥抱
         [01:35.59]到底是为了什么
         [01:38.73]因为我刚好遇见你
         [01:42.23]留下足迹才美丽
         [01:45.30]风吹花落泪如雨
         [01:48.39]因为不想分离
         [01:51.55]因为刚好遇见你
         [01:54.54]留下十年的期许
         [01:57.61]如果再相遇
         [02:00.81]我想我会记得你
         [02:03.99]因为刚好遇见你
         [02:06.86]留下足迹才美丽
         [02:09.94]风吹花落泪如雨
         [02:13.03]因为不想分离
         [02:16.06]因为刚好遇见你
         [02:19.16]留下十年的期许
         [02:22.21]如果再相遇
         [02:25.34]我想我会记得你
         [02:31.40]因为我刚好遇见你
         [02:34.51]留下足迹才美丽
         [02:37.59]风吹花落泪如雨
         [02:40.67]因为不想分离
         [02:43.77]因为刚好遇见你
         [02:46.84]留下十年的期许
         [02:49.94]如果再相遇
         [02:53.11]我想我会记得你
         * author_id : 2018
         * privilege : 8
         * privilege2 : 1000
         * play_url : https://webfs.yun.kugou.com/201909191146/07d6f525ffece19820d9fff6c4cb8dc5/G078/M08/18/17/jg0DAFgi6G-AKqsqADDP_nSW5F4051.mp3
         * authors : [{"author_id":"2018","sizable_avatar":"http://singerimg.kugou.com/uploadpic/softhead/{size}/20181224/20181224183453372.jpg","is_publish":"1","author_name":"李玉刚","avatar":"http://singerimg.kugou.com/uploadpic/softhead/400/20181224/20181224183453372.jpg"}]
         * bitrate : 128
         * audio_id : 23609415
         */

        private String hash;
        private int timelength;
        private int filesize;
        private String audio_name;
        private int have_album;
        private String album_name;
        private String album_id;
        private String img;
        private int have_mv;
        private String video_id;
        private String author_name;
        private String song_name;
        private String lyrics;
        private String author_id;
        private int privilege;
        private String privilege2;
        private String play_url;
        private int bitrate;
        private String audio_id;
        private List<AuthorsBean> authors;

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public int getTimelength() {
            return timelength;
        }

        public void setTimelength(int timelength) {
            this.timelength = timelength;
        }

        public int getFilesize() {
            return filesize;
        }

        public void setFilesize(int filesize) {
            this.filesize = filesize;
        }

        public String getAudio_name() {
            return audio_name;
        }

        public void setAudio_name(String audio_name) {
            this.audio_name = audio_name;
        }

        public int getHave_album() {
            return have_album;
        }

        public void setHave_album(int have_album) {
            this.have_album = have_album;
        }

        public String getAlbum_name() {
            return album_name;
        }

        public void setAlbum_name(String album_name) {
            this.album_name = album_name;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getHave_mv() {
            return have_mv;
        }

        public void setHave_mv(int have_mv) {
            this.have_mv = have_mv;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getSong_name() {
            return song_name;
        }

        public void setSong_name(String song_name) {
            this.song_name = song_name;
        }

        public String getLyrics() {
            return lyrics;
        }

        public void setLyrics(String lyrics) {
            this.lyrics = lyrics;
        }

        public String getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(String author_id) {
            this.author_id = author_id;
        }

        public int getPrivilege() {
            return privilege;
        }

        public void setPrivilege(int privilege) {
            this.privilege = privilege;
        }

        public String getPrivilege2() {
            return privilege2;
        }

        public void setPrivilege2(String privilege2) {
            this.privilege2 = privilege2;
        }

        public String getPlay_url() {
            return play_url;
        }

        public void setPlay_url(String play_url) {
            this.play_url = play_url;
        }

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public String getAudio_id() {
            return audio_id;
        }

        public void setAudio_id(String audio_id) {
            this.audio_id = audio_id;
        }

        public List<AuthorsBean> getAuthors() {
            return authors;
        }

        public void setAuthors(List<AuthorsBean> authors) {
            this.authors = authors;
        }

        public static class AuthorsBean {
            /**
             * author_id : 2018
             * sizable_avatar : http://singerimg.kugou.com/uploadpic/softhead/{size}/20181224/20181224183453372.jpg
             * is_publish : 1
             * author_name : 李玉刚
             * avatar : http://singerimg.kugou.com/uploadpic/softhead/400/20181224/20181224183453372.jpg
             */

            private String author_id;
            private String sizable_avatar;
            private String is_publish;
            private String author_name;
            private String avatar;

            public String getAuthor_id() {
                return author_id;
            }

            public void setAuthor_id(String author_id) {
                this.author_id = author_id;
            }

            public String getSizable_avatar() {
                return sizable_avatar;
            }

            public void setSizable_avatar(String sizable_avatar) {
                this.sizable_avatar = sizable_avatar;
            }

            public String getIs_publish() {
                return is_publish;
            }

            public void setIs_publish(String is_publish) {
                this.is_publish = is_publish;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }
        }
    }
}
