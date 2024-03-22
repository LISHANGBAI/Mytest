import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discusszhiyuanzhefuwu from '@/views/modules/discusszhiyuanzhefuwu/list'
    import jinengpeixun from '@/views/modules/jinengpeixun/list'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import fuwuxinxi from '@/views/modules/fuwuxinxi/list'
    import shijianbitixian from '@/views/modules/shijianbitixian/list'
    import fuwupingjia from '@/views/modules/fuwupingjia/list'
    import forum from '@/views/modules/forum/list'
    import fuwufenlei from '@/views/modules/fuwufenlei/list'
    import zhiyuanzhefuwu from '@/views/modules/zhiyuanzhefuwu/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import fuwuwancheng from '@/views/modules/fuwuwancheng/list'
    import jiequxuqiu from '@/views/modules/jiequxuqiu/list'
    import config from '@/views/modules/config/list'
    import huodongrili from '@/views/modules/huodongrili/list'
    import zhiyuanzhe from '@/views/modules/zhiyuanzhe/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discusszhiyuanzhefuwu',
        name: '志愿者服务评论',
        component: discusszhiyuanzhefuwu
      }
      ,{
	path: '/jinengpeixun',
        name: '技能培训',
        component: jinengpeixun
      }
      ,{
	path: '/news',
        name: '志愿资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/fuwuxinxi',
        name: '服务信息',
        component: fuwuxinxi
      }
      ,{
	path: '/shijianbitixian',
        name: '时间币提现',
        component: shijianbitixian
      }
      ,{
	path: '/fuwupingjia',
        name: '服务评价',
        component: fuwupingjia
      }
      ,{
	path: '/forum',
        name: '志愿者交流',
        component: forum
      }
      ,{
	path: '/fuwufenlei',
        name: '服务分类',
        component: fuwufenlei
      }
      ,{
	path: '/zhiyuanzhefuwu',
        name: '志愿者服务',
        component: zhiyuanzhefuwu
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/messages',
        name: '反馈投诉',
        component: messages
      }
      ,{
	path: '/fuwuwancheng',
        name: '服务完成',
        component: fuwuwancheng
      }
      ,{
	path: '/jiequxuqiu',
        name: '接取需求',
        component: jiequxuqiu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/huodongrili',
        name: '活动日历',
        component: huodongrili
      }
      ,{
	path: '/zhiyuanzhe',
        name: '志愿者',
        component: zhiyuanzhe
      }
      ,{
	path: '/newstype',
        name: '志愿资讯分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
