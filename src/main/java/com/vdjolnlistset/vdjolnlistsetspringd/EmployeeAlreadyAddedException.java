package com.vdjolnlistset.vdjolnlistsetspringd;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class EmployeeAlreadyAddedException extends RuntimeException {
}
