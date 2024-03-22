import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import zhiyuanzheList from '../pages/zhiyuanzhe/list'
import zhiyuanzheDetail from '../pages/zhiyuanzhe/detail'
import zhiyuanzheAdd from '../pages/zhiyuanzhe/add'
import fuwufenleiList from '../pages/fuwufenlei/list'
import fuwufenleiDetail from '../pages/fuwufenlei/detail'
import fuwufenleiAdd from '../pages/fuwufenlei/add'
import zhiyuanzhefuwuList from '../pages/zhiyuanzhefuwu/list'
import zhiyuanzhefuwuDetail from '../pages/zhiyuanzhefuwu/detail'
import zhiyuanzhefuwuAdd from '../pages/zhiyuanzhefuwu/add'
import jiequxuqiuList from '../pages/jiequxuqiu/list'
import jiequxuqiuDetail from '../pages/jiequxuqiu/detail'
import jiequxuqiuAdd from '../pages/jiequxuqiu/add'
import fuwuxinxiList from '../pages/fuwuxinxi/list'
import fuwuxinxiDetail from '../pages/fuwuxinxi/detail'
import fuwuxinxiAdd from '../pages/fuwuxinxi/add'
import fuwuwanchengList from '../pages/fuwuwancheng/list'
import fuwuwanchengDetail from '../pages/fuwuwancheng/detail'
import fuwuwanchengAdd from '../pages/fuwuwancheng/add'
import shijianbitixianList from '../pages/shijianbitixian/list'
import shijianbitixianDetail from '../pages/shijianbitixian/detail'
import shijianbitixianAdd from '../pages/shijianbitixian/add'
import fuwupingjiaList from '../pages/fuwupingjia/list'
import fuwupingjiaDetail from '../pages/fuwupingjia/detail'
import fuwupingjiaAdd from '../pages/fuwupingjia/add'
import jinengpeixunList from '../pages/jinengpeixun/list'
import jinengpeixunDetail from '../pages/jinengpeixun/detail'
import jinengpeixunAdd from '../pages/jinengpeixun/add'
import huodongriliList from '../pages/huodongrili/list'
import huodongriliDetail from '../pages/huodongrili/detail'
import huodongriliAdd from '../pages/huodongrili/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discusszhiyuanzhefuwuList from '../pages/discusszhiyuanzhefuwu/list'
import discusszhiyuanzhefuwuDetail from '../pages/discusszhiyuanzhefuwu/detail'
import discusszhiyuanzhefuwuAdd from '../pages/discusszhiyuanzhefuwu/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'zhiyuanzhe',
					component: zhiyuanzheList
				},
				{
					path: 'zhiyuanzheDetail',
					component: zhiyuanzheDetail
				},
				{
					path: 'zhiyuanzheAdd',
					component: zhiyuanzheAdd
				},
				{
					path: 'fuwufenlei',
					component: fuwufenleiList
				},
				{
					path: 'fuwufenleiDetail',
					component: fuwufenleiDetail
				},
				{
					path: 'fuwufenleiAdd',
					component: fuwufenleiAdd
				},
				{
					path: 'zhiyuanzhefuwu',
					component: zhiyuanzhefuwuList
				},
				{
					path: 'zhiyuanzhefuwuDetail',
					component: zhiyuanzhefuwuDetail
				},
				{
					path: 'zhiyuanzhefuwuAdd',
					component: zhiyuanzhefuwuAdd
				},
				{
					path: 'jiequxuqiu',
					component: jiequxuqiuList
				},
				{
					path: 'jiequxuqiuDetail',
					component: jiequxuqiuDetail
				},
				{
					path: 'jiequxuqiuAdd',
					component: jiequxuqiuAdd
				},
				{
					path: 'fuwuxinxi',
					component: fuwuxinxiList
				},
				{
					path: 'fuwuxinxiDetail',
					component: fuwuxinxiDetail
				},
				{
					path: 'fuwuxinxiAdd',
					component: fuwuxinxiAdd
				},
				{
					path: 'fuwuwancheng',
					component: fuwuwanchengList
				},
				{
					path: 'fuwuwanchengDetail',
					component: fuwuwanchengDetail
				},
				{
					path: 'fuwuwanchengAdd',
					component: fuwuwanchengAdd
				},
				{
					path: 'shijianbitixian',
					component: shijianbitixianList
				},
				{
					path: 'shijianbitixianDetail',
					component: shijianbitixianDetail
				},
				{
					path: 'shijianbitixianAdd',
					component: shijianbitixianAdd
				},
				{
					path: 'fuwupingjia',
					component: fuwupingjiaList
				},
				{
					path: 'fuwupingjiaDetail',
					component: fuwupingjiaDetail
				},
				{
					path: 'fuwupingjiaAdd',
					component: fuwupingjiaAdd
				},
				{
					path: 'jinengpeixun',
					component: jinengpeixunList
				},
				{
					path: 'jinengpeixunDetail',
					component: jinengpeixunDetail
				},
				{
					path: 'jinengpeixunAdd',
					component: jinengpeixunAdd
				},
				{
					path: 'huodongrili',
					component: huodongriliList
				},
				{
					path: 'huodongriliDetail',
					component: huodongriliDetail
				},
				{
					path: 'huodongriliAdd',
					component: huodongriliAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discusszhiyuanzhefuwu',
					component: discusszhiyuanzhefuwuList
				},
				{
					path: 'discusszhiyuanzhefuwuDetail',
					component: discusszhiyuanzhefuwuDetail
				},
				{
					path: 'discusszhiyuanzhefuwuAdd',
					component: discusszhiyuanzhefuwuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
