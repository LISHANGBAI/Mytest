<template>
<div :style='{"width":"100%","padding":"30px 7% 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"1px solid #f0f0f0","width":"100%","padding":"30px 20%","position":"relative","background":"#fcfcfc"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="服务编号" prop="fuwubianhao">
            <el-input v-model="ruleForm.fuwubianhao" 
                placeholder="服务编号" clearable :disabled=" false  ||ro.fuwubianhao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="服务名称" prop="fuwumingcheng">
            <el-input v-model="ruleForm.fuwumingcheng" 
                placeholder="服务名称" clearable :disabled=" false  ||ro.fuwumingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="服务分类" prop="fuwufenlei">
            <el-input v-model="ruleForm.fuwufenlei" 
                placeholder="服务分类" clearable :disabled=" false  ||ro.fuwufenlei"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="服务照片" v-if="type!='cross' || (type=='cross' && !ro.fuwuzhaopian)" prop="fuwuzhaopian">
            <file-upload
            tip="点击上传服务照片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.fuwuzhaopian?ruleForm.fuwuzhaopian:''"
            @change="fuwuzhaopianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' class="upload" v-else label="服务照片" prop="fuwuzhaopian">
                <img v-if="ruleForm.fuwuzhaopian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fuwuzhaopian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fuwuzhaopian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="服务时长" prop="fuwushizhang">
            <el-input v-model="ruleForm.fuwushizhang" 
                placeholder="服务时长" clearable :disabled=" false  ||ro.fuwushizhang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="时间币" prop="shijianbi">
            <el-input v-model.number="ruleForm.shijianbi" 
                placeholder="时间币" clearable :disabled=" false  ||ro.shijianbi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="具体地点" prop="jutididian">
            <el-input v-model="ruleForm.jutididian" 
                placeholder="具体地点" clearable :disabled=" false  ||ro.jutididian"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="状态" prop="zhuangtai">
            <el-input v-model="ruleForm.zhuangtai" 
                placeholder="状态" clearable :disabled=" false  ||ro.zhuangtai"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="完成时间" prop="wanchengshijian">
              <el-date-picker
				  :disabled=" false  ||ro.wanchengshijian"
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.wanchengshijian" 
                  type="date"
                  placeholder="完成时间">
              </el-date-picker> 
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" clearable :disabled=" false  ||ro.yonghuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="用户姓名" prop="yonghuxingming">
            <el-input v-model="ruleForm.yonghuxingming" 
                placeholder="用户姓名" clearable :disabled=" false  ||ro.yonghuxingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="志愿者账号" prop="zhiyuanzhezhanghao">
            <el-input v-model="ruleForm.zhiyuanzhezhanghao" 
                placeholder="志愿者账号" clearable :disabled=" false  ||ro.zhiyuanzhezhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="志愿者姓名" prop="zhiyuanzhexingming">
            <el-input v-model="ruleForm.zhiyuanzhexingming" 
                placeholder="志愿者姓名" clearable :disabled=" false  ||ro.zhiyuanzhexingming"></el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","textAlign":"center","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"0px","background":"#1abc9e","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"0px","background":"#fcfcfc","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				fuwubianhao : false,
				fuwumingcheng : false,
				fuwufenlei : false,
				fuwuzhaopian : false,
				fuwushizhang : false,
				shijianbi : false,
				jutididian : false,
				zhuangtai : false,
				wanchengshijian : false,
				yonghuzhanghao : false,
				yonghuxingming : false,
				zhiyuanzhezhanghao : false,
				zhiyuanzhexingming : false,
				sfsh : false,
				shhf : false,
				ispay : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          fuwubianhao: '',
          fuwumingcheng: '',
          fuwufenlei: '',
          fuwuzhaopian: '',
          fuwushizhang: '',
          shijianbi: '',
          jutididian: '',
          zhuangtai: '已完成服务' ,
          wanchengshijian: '',
          yonghuzhanghao: '',
          yonghuxingming: '',
          zhiyuanzhezhanghao: '',
          zhiyuanzhexingming: '',
          ispay: '',
        },


        rules: {
          fuwubianhao: [
          ],
          fuwumingcheng: [
          ],
          fuwufenlei: [
          ],
          fuwuzhaopian: [
          ],
          fuwushizhang: [
          ],
          shijianbi: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          jutididian: [
          ],
          zhuangtai: [
          ],
          wanchengshijian: [
          ],
          yonghuzhanghao: [
          ],
          yonghuxingming: [
          ],
          zhiyuanzhezhanghao: [
          ],
          zhiyuanzhexingming: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
          ispay: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.wanchengshijian = this.getCurDate()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='fuwubianhao'){
              this.ruleForm.fuwubianhao = obj[o];
              this.ro.fuwubianhao = true;
              continue;
            }
            if(o=='fuwumingcheng'){
              this.ruleForm.fuwumingcheng = obj[o];
              this.ro.fuwumingcheng = true;
              continue;
            }
            if(o=='fuwufenlei'){
              this.ruleForm.fuwufenlei = obj[o];
              this.ro.fuwufenlei = true;
              continue;
            }
            if(o=='fuwuzhaopian'){
              this.ruleForm.fuwuzhaopian = obj[o].split(",")[0];
              this.ro.fuwuzhaopian = true;
              continue;
            }
            if(o=='fuwushizhang'){
              this.ruleForm.fuwushizhang = obj[o];
              this.ro.fuwushizhang = true;
              continue;
            }
            if(o=='shijianbi'){
              this.ruleForm.shijianbi = obj[o];
              this.ro.shijianbi = true;
              continue;
            }
            if(o=='jutididian'){
              this.ruleForm.jutididian = obj[o];
              this.ro.jutididian = true;
              continue;
            }
            if(o=='zhuangtai'){
              this.ruleForm.zhuangtai = obj[o];
              this.ro.zhuangtai = true;
              continue;
            }
            if(o=='wanchengshijian'){
              this.ruleForm.wanchengshijian = obj[o];
              this.ro.wanchengshijian = true;
              continue;
            }
            if(o=='yonghuzhanghao'){
              this.ruleForm.yonghuzhanghao = obj[o];
              this.ro.yonghuzhanghao = true;
              continue;
            }
            if(o=='yonghuxingming'){
              this.ruleForm.yonghuxingming = obj[o];
              this.ro.yonghuxingming = true;
              continue;
            }
            if(o=='zhiyuanzhezhanghao'){
              this.ruleForm.zhiyuanzhezhanghao = obj[o];
              this.ro.zhiyuanzhezhanghao = true;
              continue;
            }
            if(o=='zhiyuanzhexingming'){
              this.ruleForm.zhiyuanzhexingming = obj[o];
              this.ro.zhiyuanzhexingming = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.zhiyuanzhezhanghao!=''&&json.zhiyuanzhezhanghao) || json.zhiyuanzhezhanghao==0){
                this.ruleForm.zhiyuanzhezhanghao = json.zhiyuanzhezhanghao
            }
            if((json.zhiyuanzhexingming!=''&&json.zhiyuanzhexingming) || json.zhiyuanzhexingming==0){
                this.ruleForm.zhiyuanzhexingming = json.zhiyuanzhexingming
            }
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`fuwuwancheng/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('fuwuwancheng/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`fuwuwancheng/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`fuwuwancheng/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      fuwuzhaopianUploadChange(fileUrls) {
          this.ruleForm.fuwuzhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #1abc9e30;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: 400px;
	  border-width: 0 0 1px;
	  border-style: solid;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  border: 1px solid #ddd;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #1abc9e30;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: 400px;
	  border-width: 0 0 1px;
	  border-style: solid;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: none;
	  width: 200px;
	  font-size: 14px;
	  border-color: #1abc9e30;
	  border-width: 0 0 1px;
	  border-style: solid;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: none;
	  width: 200px;
	  font-size: 14px;
	  border-color: #1abc9e30;
	  border-width: 0 0 1px;
	  border-style: solid;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  cursor: pointer;
	  border-radius: 0px;
	  color: #1abc9e60;
	  background: none;
	  width: 200px;
	  font-size: 32px;
	  border-color: #1abc9e30;
	  border-width: 0 0 1px;
	  line-height: 100px;
	  border-style: solid;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  border-radius: 0px;
	  color: #1abc9e60;
	  background: none;
	  width: 200px;
	  font-size: 32px;
	  border-color: #1abc9e30;
	  border-width: 0 0 1px;
	  line-height: 100px;
	  border-style: solid;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  border-radius: 0px;
	  color: #1abc9e60;
	  background: none;
	  width: 200px;
	  font-size: 32px;
	  border-color: #1abc9e30;
	  border-width: 0 0 1px;
	  line-height: 100px;
	  border-style: solid;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #1abc9e30;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: none;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
