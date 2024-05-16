package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StatisticsTestSuite {

    private List<String> generateListOfUsers(int userQuantity) {
            List<String> resultList = new ArrayList<String>();
        for (int n = 1; n <= userQuantity; n++) {
            String theUser = "Name " + n;
            resultList.add(theUser);
        }
        return resultList;
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Mock
    private Statistics statisticsMock;

    @DisplayName("Tests for Method calculateAdvStatistics - Suite no 1")
    @Test
    void testCalculateAdvStatistics() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(5, forumStatistics.getCommentsCount());
        assertEquals(10, forumStatistics.getAveragePostsByUser());
        assertEquals(0, forumStatistics.getAverageCommentsByUser());
        assertEquals(200, forumStatistics.getAveragePostsByComment());
    }
    @DisplayName("Test Suite no 2")
    @Test
    void testCalculateAdvStatistics2() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(0));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getAveragePostsByUser());
        assertEquals(0, forumStatistics.getAverageCommentsByUser());
        assertEquals(0, forumStatistics.getAveragePostsByComment());
    }
    @DisplayName("Test More Posts Than Comments")
    @Test
    void testMorePostsThanComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(10));
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, forumStatistics.getAveragePostsByComment());
    }
    @DisplayName("Test More Comments Than Posts")
    @Test
    void testMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(10));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getAveragePostsByComment());
    }
}
