package com.whoz_in.domain.member.exception;

import com.whoz_in.domain.shared.BusinessException;

public class LoginIdPolicyViolationException extends BusinessException {
    public static final LoginIdPolicyViolationException EXCEPTION = new LoginIdPolicyViolationException();
    private LoginIdPolicyViolationException() {
        super("2010", "아이디는 알파벳 소문자, 숫자로 6자리 이상 16자리 이하여야 합니다.");
    }
}
