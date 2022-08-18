package com.sparta.week03.service;

import com.sparta.week03.domain.OnlyPost;
import com.sparta.week03.domain.Post;
import com.sparta.week03.domain.PostRepository;
import com.sparta.week03.domain.PostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Long update(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        post.update(id, requestDto);
        return post.getId();
    }
    @Transactional
    public boolean password(Long id, PostRequestDto requestDto) {
        Post post = postRepository.getReferenceById((id));
        String password = post.getPassword();
        String in_password = requestDto.getPassword();

        return password.equals((in_password));
    }

    @Transactional
    public Post savepost(PostRequestDto requestDto){
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    @Transactional
    public List<OnlyPost>getpost(long id) {
        return postRepository.findById(id, OnlyPost.class);
    }

}