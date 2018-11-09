/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {

    Map<Integer, User> userList = DataStore.getInstance().getUsers();
    Map<Integer, Comment> commentsList = DataStore.getInstance().getComments();
    Map<Integer, Post> postsList = DataStore.getInstance().getPosts();

    Map<Integer, Integer> userLikeCount = new HashMap<Integer, Integer>();
    Map<Integer, Integer> usersCommentCount = new HashMap<Integer, Integer>();
    Map<Integer, Integer> userPostCount = new HashMap<Integer, Integer>();
    Map<Integer, Integer> postLikesCount = new HashMap<Integer, Integer>();
    Map<Integer, Integer> postCommentCount = new HashMap<Integer, Integer>();

    public void userWithMostLikes() {
        for (User user : userList.values()) {
            for (Comment comment : user.getComments()) {
                int likes = 0;
                if (userLikeCount.containsKey(user.getId())) {
                    likes = userLikeCount.get(user.getId());
                }
                likes += comment.getLikes();
                userLikeCount.put(user.getId(), likes);
            }
        }

        int max = 0;
        int maxId = 0;

        for (int id : userLikeCount.keySet()) {
            if (userLikeCount.get(id) > max) {
                max = userLikeCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" + userList.get(maxId));
    }

    public void getFiveMostLikedComment() {
        List<Comment> comments = new ArrayList<>(commentsList.values());

        Collections.sort(comments, new Comparator<Comment>() {

            @Override
            public int compare(Comment t, Comment t1) {
                return t1.getLikes() - t.getLikes();
            }

        });
        System.out.println("5 most liked comments : ");
        for (int i = 0; i < comments.size() && i < 5; i++) {
            System.out.println(comments.get(i));
        }

    }
    
    /* 3) Post with most comments. */
    public void postWithMostComments() {

        int maxComments = 0;
        int maxId = 0;

        List<Comment> commentList;
        for (Post post : postsList.values()) {
            commentList = post.getComments();
            if (commentList.size() >= maxComments) {
                maxComments = commentList.size();
                maxId = post.getPostId();
                postCommentCount.put(maxId, maxComments);
            }
        }
        System.out.println("3) Posts with most number of comments: ");
        if (postCommentCount.size() > 0) {
            for (int postId : postCommentCount.keySet()) {
                if (maxComments == postCommentCount.get(postId)) {
                    System.out.println("Post{" + "id = " + postsList.get(postId).getPostId() + ", userId = " + postsList.get(postId).getUserId() + ", no. of comments = " + postCommentCount.get(postId) + "}");
                }

            }
        }
    }
    
    /* 4) Top 5 inactive users based on posts. */
    public void top5InactiveUsersBasedOnPost() {

        int noOfPosts = 0;

        for (User user : userList.values()) {
            noOfPosts = 0;
            for (Post post : postsList.values()) {
                if (post.getUserId() == user.getId()) {
                    noOfPosts++;
                }
            }
            userPostCount.put(user.getId(), noOfPosts);
        }

        Set<Entry<Integer, Integer>> entries = userPostCount.entrySet();
        List<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(entries);

        Collections.sort(listOfEntries, new Comparator<Entry<Integer, Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> t, Entry<Integer, Integer> t1) {
                return t.getValue() - t1.getValue();

            }
        });

        System.out.println("4) Top 5 inactive users based on Posts: ");
        System.out.println("Data Set: " + userPostCount);
        int i = 0;
        for (Entry<Integer, Integer> mapping : listOfEntries) {
            if (i == 5) {
                break;
            }
            System.out.println("{User id:" + mapping.getKey() + ", No. of Posts " + mapping.getValue() + "}");
            i++;
        }

    }
    
    /* 5) Top 5 inactive users based on comments. */
    public void top5InactiveUsersBasedOnComments() {

        for (User user : userList.values()) {
            usersCommentCount.put(user.getId(), user.getComments().size());
        }

        Set<Entry<Integer, Integer>> entries = usersCommentCount.entrySet();
        List<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(entries);

        Collections.sort(listOfEntries, new Comparator<Entry<Integer, Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> t, Entry<Integer, Integer> t1) {
                return t.getValue() - t1.getValue();

            }
        });

        System.out.println("5) Top 5 inactive users based on Comments: ");
        System.out.println("Data Set: " +usersCommentCount);
        int i = 0;
        for (Entry<Integer, Integer> mapping : listOfEntries) {
            if (i == 5) {
                break;
            }
            System.out.println("{User id:" + mapping.getKey() + ", No. of Comments " + mapping.getValue() + "}");
            i++;
        }

    }
    
     /*
     6) Top 5 inactive users overall (comments, posts)
     7) Top 5 proactive users overall (comments, posts)
     */
    public void top5ActiveInactiveUsersOverall(Boolean isInActive) {
        Map<Integer, Integer> userActivityCount = new HashMap<Integer, Integer>();

        int commentsCount = 0;
        int postsCount = 0;
        int total = 0;

        for (User user : userList.values()) {
            commentsCount = user.getComments().size();
            postsCount = 0;
            for (Post post : postsList.values()) {
                if (post.getUserId() == user.getId()) {
                    postsCount++;
                }
            }
            total = commentsCount + postsCount;
            userActivityCount.put(user.getId(), total);
        }

        Set<Entry<Integer, Integer>> entries = userActivityCount.entrySet();
        List<Entry<Integer, Integer>> listOfEntries = new ArrayList<Entry<Integer, Integer>>(entries);

        if (isInActive) {
            Collections.sort(listOfEntries, new Comparator<Entry<Integer, Integer>>() {

                @Override
                public int compare(Entry<Integer, Integer> t, Entry<Integer, Integer> t1) {
                    return t.getValue() - t1.getValue();

                }
            });
            System.out.println("6) Top 5 inactive users based on Comments and Posts: ");
        } else {
            Collections.sort(listOfEntries, new Comparator<Entry<Integer, Integer>>() {

                @Override
                public int compare(Entry<Integer, Integer> t, Entry<Integer, Integer> t1) {
                    return t1.getValue() - t.getValue();

                }
            });
             System.out.println("7) Top 5 active users based on Comments and Posts: ");
        }

      
        System.out.println("Data Set: " + userActivityCount);
        int i = 0;
        for (Entry<Integer, Integer> mapping : listOfEntries) {
            if (i == 5) {
                break;
            }
            System.out.println("{User id:" + mapping.getKey() + ", No. of Comments and Posts: " + mapping.getValue() + "}");
            i++;
        }

    }
}