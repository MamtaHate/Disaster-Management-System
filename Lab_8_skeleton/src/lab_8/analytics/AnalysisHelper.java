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
}