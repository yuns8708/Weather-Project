//package com.yuns.weather.repository;
//
//import com.yuns.weather.domain.Memo;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional // 테스트 코드를 실행해도 DB에 데이터를 변경시키지 않게 해주는 어노테이션
//class JdbcMemoRepositoryTest {
//    @Autowired
//    JdbcMemoRepository jdbcMemoRepository;
//
//    @Test
//    void insertMemoTest() {
//        // given
//        Memo memo = new Memo(2, "my memo");
//
//        // when
//        jdbcMemoRepository.save(memo);
//
//        // then
//        Optional<Memo> result = jdbcMemoRepository.findById(1);
//        assertEquals(result.get().getText(), "my memo");
//    }
//
//    @Test
//    void findAllMemoTest() {
//        // given
//        List<Memo> memoList = jdbcMemoRepository.findAll();
//        assertNotNull(memoList);
//        // when
//        // then
//    }
//
//}