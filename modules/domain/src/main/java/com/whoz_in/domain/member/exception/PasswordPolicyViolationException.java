package com.whoz_in.domain.member.exception;

import com.whoz_in.domain.shared.BusinessException;

public class PasswordPolicyViolationException extends BusinessException {
    public static final PasswordPolicyViolationException EXCEPTION = new PasswordPolicyViolationException();
    private PasswordPolicyViolationException() {
        super("2011", "비밀번호는 알파벳 소문자, 숫자로 6자리 이상 16자리 이하여야 합니다.");
    }
}
