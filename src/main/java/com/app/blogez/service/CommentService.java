package com.app.blogez.service;

import java.util.List;

import com.app.blogez.dto.CommentDto;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);

    List<CommentDto> findAllComments();

    void deleteComment(Long commentId);

    List<CommentDto> findCommentsByPost();
}
