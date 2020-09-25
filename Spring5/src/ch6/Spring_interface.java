package ch6;

//빈 라이프사이클 초기화, 종류를 보여주는 코드입니다.
//자바 코드 규격에 맞지 않을 수 있습니다.

public interface ﻿InitializingBean{
    void afterPropertiesSet() throws Exception;
}

public interface DisposalbleBean{
    void destory() throws Exceptions;
}
