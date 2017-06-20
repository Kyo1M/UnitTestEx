/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koide
 */
public class CalculatorTest {
    
    /**
     * 2引数とも正整数の場合のテスト<br/>
     * 対象：multiply(int,int)<br/>
     * 条件：引数10,20<br/>
     * 期待する結果：戻り値200<br/>
     */
    
    @Test
    public void testMultiply01() throws Exception{
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        assertEquals(expected,actual);
    }
    
    /**
     * 引数の一方が正数、他方が負数場合のテスト<br/>
     * 対象：multiply(int,int)<br/>
     * 条件：引数-10,20<br/>
     * 期待する結果：戻り値-200<br/>
     */
    
    @Test
    public void testMultiply02() throws Exception{
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        assertEquals(expected,actual);
    }
    
    /**
     * 引数の一方が0、他方が負数の場合のテスト<br/>
     * 対象：multiply(int,int)<br/>
     * 条件：引数0,-20<br/>
     * 期待する結果：戻り値0<br/>
     */
    
    @Test
    public void testMultiply03() throws Exception{
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        assertEquals(expected,actual);
    }
    
    /**
     * 引数の一方が0、他方が正数の場合のテスト<br/>
     * 対象：multiply(int,int)<br/>
     * 条件：引数0,20<br/>
     * 期待する結果：戻り値0<br/>
     */
    
    @Test
    public void testMultiply04() throws Exception{
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, 20);
        assertEquals(expected,actual);
    }
    
    /**
     * c &gt; b &gt; aの場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(10,20,30)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax01() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        assertEquals(expected,actual);
    }
    
    /**
     * a &gt; b &gt; cの場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(30,20,10)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax02() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30,20,10);
        assertEquals(expected,actual);
    }
    
    /**
     * b &gt; a &gt; cの場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(20,30,10)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax03() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20,30,10);
        assertEquals(expected,actual);
    }
    
    /**
     * c &gt; a &gt; bの場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(20,10,30)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    
    @Test
    public void testMax04() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20,10,30);
    }
    
    /**
     * b &gt; c &gt; aの場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(10,30,20)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax05() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10,30,20);
    }
    
    /**
     * a &gt; c &gt; bの場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(30,10,20)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax06() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30,10,20);
    }
    
    /**
     * a &gt; b &eq c; の場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(30,10,10)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax07() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30,10,10);
        assertEquals(expected,actual);
    }
    
     /**
     * b &gt; a &eq c; の場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(10,30,10)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax08() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10,30,10);
        assertEquals(expected,actual);
    }
    
     /**
     * c &gt; a &eq b; の場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(10,10,30)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax09() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10,10,30);
        assertEquals(expected,actual);
    }
    
     /**
     * a &eq b &eq c; の場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(30,30,30)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax10() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30,30,30);
        assertEquals(expected,actual);
    }
    
     /**
     * a &eq b &gt c; 場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(30,30,10)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax11() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30,30,10);
        assertEquals(expected,actual);
    }
    
     /**
     * a &eq c &gt b; 場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(30,10,30)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax12() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30,10,30);
        assertEquals(expected,actual);
    }
    
     /**
     * b &eq c &gt a; 場合のテスト<br/>
     * 対象：max(int,int,int)<br/>
     * 条件：引数(10,30,30)<br/>
     * 期待する結果：戻り値30<br/>
     * 
     */
    
    @Test
    public void testMax13() throws Exception{
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10,30,30);
        assertEquals(expected,actual);
    }
    
    
}
