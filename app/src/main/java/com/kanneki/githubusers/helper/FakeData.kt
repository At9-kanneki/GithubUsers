package com.kanneki.githubusers.helper

import com.kanneki.githubusers.module.UserDetailModule
import com.kanneki.githubusers.module.UserModule

object FakeData {

    val mainList = arrayListOf(
        UserModule(
            login = "mojombo",
            id = 1,
            node_id = "MDQ6VXNlcjE=",
            avatar_url = "https://avatars0.githubusercontent.com/u/1?v=4",
            gravatar_id = "",
            url = "https://api.github.com/users/mojombo",
            html_url = "https://github.com/mojombo",
            followers_url = "https://api.github.com/users/mojombo/followers",
            following_url = "https://api.github.com/users/mojombo/following{/other_user}",
            gists_url = "https://api.github.com/users/mojombo/gists{/gist_id}",
            starred_url = "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
            subscriptions_url = "https://api.github.com/users/mojombo/subscriptions",
            organizations_url = "https://api.github.com/users/mojombo/orgs",
            repos_url = "https://api.github.com/users/mojombo/repos",
            events_url = "https://api.github.com/users/mojombo/events{/privacy}",
            received_events_url = "https://api.github.com/users/mojombo/received_events",
            type = "User",
            site_admin = false
        ),
        UserModule(
            login = "mojombo",
            id = 1,
            node_id = "MDQ6VXNlcjE=",
            avatar_url = "https://avatars0.githubusercontent.com/u/1?v=4",
            gravatar_id = "",
            url = "https://api.github.com/users/mojombo",
            html_url = "https://github.com/mojombo",
            followers_url = "https://api.github.com/users/mojombo/followers",
            following_url = "https://api.github.com/users/mojombo/following{/other_user}",
            gists_url = "https://api.github.com/users/mojombo/gists{/gist_id}",
            starred_url = "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
            subscriptions_url = "https://api.github.com/users/mojombo/subscriptions",
            organizations_url = "https://api.github.com/users/mojombo/orgs",
            repos_url = "https://api.github.com/users/mojombo/repos",
            events_url = "https://api.github.com/users/mojombo/events{/privacy}",
            received_events_url = "https://api.github.com/users/mojombo/received_events",
            type = "User",
            site_admin = true
        ),
        UserModule(
            login = "mojombo",
            id = 1,
            node_id = "MDQ6VXNlcjE=",
            avatar_url = "https://avatars0.githubusercontent.com/u/1?v=4",
            gravatar_id = "",
            url = "https://api.github.com/users/mojombo",
            html_url = "https://github.com/mojombo",
            followers_url = "https://api.github.com/users/mojombo/followers",
            following_url = "https://api.github.com/users/mojombo/following{/other_user}",
            gists_url = "https://api.github.com/users/mojombo/gists{/gist_id}",
            starred_url = "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
            subscriptions_url = "https://api.github.com/users/mojombo/subscriptions",
            organizations_url = "https://api.github.com/users/mojombo/orgs",
            repos_url = "https://api.github.com/users/mojombo/repos",
            events_url = "https://api.github.com/users/mojombo/events{/privacy}",
            received_events_url = "https://api.github.com/users/mojombo/received_events",
            type = "User",
            site_admin = false
        )
    )

    val detailData = UserDetailModule(
            login= "mojombo",
            id= 1,
            node_id= "MDQ6VXNlcjE=",
            avatar_url= "https://avatars0.githubusercontent.com/u/1?v=4",
            gravatar_id= "",
            url= "https://api.github.com/users/mojombo",
            html_url= "https://github.com/mojombo",
            followers_url= "https://api.github.com/users/mojombo/followers",
            following_url= "https://api.github.com/users/mojombo/following{/other_user}",
            gists_url= "https://api.github.com/users/mojombo/gists{/gist_id}",
            starred_url= "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
            subscriptions_url= "https://api.github.com/users/mojombo/subscriptions",
            organizations_url= "https://api.github.com/users/mojombo/orgs",
            repos_url= "https://api.github.com/users/mojombo/repos",
            events_url= "https://api.github.com/users/mojombo/events{/privacy}",
            received_events_url= "https://api.github.com/users/mojombo/received_events",
            type= "User",
            site_admin= true,
            name= "Tom Preston-Werner",
            company= null,
            blog= "http://tom.preston-werner.com",
            location= "San Francisco",
            email= null,
            hireable= null,
            bio= null,
            public_repos= 61,
            public_gists= 62,
            followers= 21962,
            following= 11,
            created_at= "2007-10-20T05:24:19Z",
            updated_at= "2020-04-09T02:14:24Z"

    )
}