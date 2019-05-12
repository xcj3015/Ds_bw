package www.com.bean;

import java.util.List;

/**
 * Name:  The.xue
 * Date  2019-05-11
 */
public class ListBean {

    /**
     * result : [{"commodityId":141,"commodityName":"AUXTUN港仔原宿男鞋秋季鞋子男潮鞋百搭韩版潮流男士休闲鞋板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/7/1.jpg","price":99,"saleNum":0},{"commodityId":136,"commodityName":"板鞋休闲鞋男男士休闲运动鞋男士鞋子休闲皮鞋男士休闲鞋男鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/2/1.jpg","price":99,"saleNum":0},{"commodityId":139,"commodityName":"秋季男鞋简约百搭男小白鞋韩版潮流男板鞋跑步鞋子ins超火的运动鞋学生时尚嘻哈潮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/5/1.jpg","price":109,"saleNum":0},{"commodityId":137,"commodityName":"唐狮冬季男士冬休闲鞋高帮男鞋男士板鞋休闲男鞋子高帮男鞋百搭休闲板鞋男","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/3/1.jpg","price":79,"saleNum":0},{"commodityId":35,"commodityName":"唐狮女款小白鞋百搭秋季新款女鞋女款板鞋休闲鞋子帆布鞋女","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/4/1.jpg","price":78,"saleNum":0},{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":0},{"commodityId":44,"commodityName":"新品女鞋秋冬水钻粗跟深口单鞋新款夏季网红同款高跟鞋仙女的鞋超火的鞋子婚鞋韩版百搭乖乖鞋温柔鞋尖头晚晚鞋一脚蹬","masterPic":"http://172.17.8.100/images/small/commodity/nx/ggx/6/1.jpg","price":146,"saleNum":0}]
     * message : 查询成功
     * status : 0000
     *
     *
     *
     *
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commodityId : 141
         * commodityName : AUXTUN港仔原宿男鞋秋季鞋子男潮鞋百搭韩版潮流男士休闲鞋板鞋
         * masterPic : http://172.17.8.100/images/small/commodity/nx/nbx/7/1.jpg
         * price : 99
         * saleNum : 0
         */

        private int commodityId;
        private String commodityName;
        private String masterPic;
        private int price;
        private int saleNum;

        public int getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(int commodityId) {
            this.commodityId = commodityId;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getMasterPic() {
            return masterPic;
        }

        public void setMasterPic(String masterPic) {
            this.masterPic = masterPic;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSaleNum() {
            return saleNum;
        }

        public void setSaleNum(int saleNum) {
            this.saleNum = saleNum;
        }
    }
}
