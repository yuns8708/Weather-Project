package com.yuns.weather.repository;

import com.yuns.weather.domain.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JpaMemoRepositoryTest {
    @Autowired
    JpaMemoRepository jpaMemoRepository;

    @Test
    void insertMemoTest() {
        // given
        Memo memo2 = new Memo(2, "hello memo");

        // when
        jpaMemoRepository.save(memo2);

        // then
        List<Memo> memoList = jpaMemoRepository.findAll();
        assertTrue(!memoList.isEmpty());
    }

    @Test
    void findByIdTest() {
        // given
        Memo memo = new Memo(3, "hihihi");

        // when
        jpaMemoRepository.save(memo);

        // then
        Optional<Memo> result = jpaMemoRepository.findById(memo.getId());
        assertEquals(result.get().getText(), "hihihi");
    }

}