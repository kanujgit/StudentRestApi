package com.algoworks.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.algoworks.student.api.respose.Response;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public Response<Object> handleEntityNotFoundException(EntityNotFoundException exception) {

		Response<Object> response = new Response(exception.getMessage(), HttpStatus.OK.value());
		return response;
	}

//	@Override
//	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//
//	}

//	@ExceptionHandler(ResourceNotFoundException.class)
//	@ResponseStatus(value = HttpStatus.NOT_FOUND)
//	public @ResponseBody Response<T> handleResourceNotFound(final ResourceNotFoundException exception
//			) {
//
////		ExceptionResponse error = new ExceptionResponse();
////		error.setErrorMessage(exception.getMessage());
//		
//
//		return null;
//	}
//
//	@ExceptionHandler(Exception.class)
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	public @ResponseBody Response<T> handleException(final Exception exception,
//			final HttpServletRequest request) {
//
////		ExceptionResponse error = new ExceptionResponse();
////		error.setErrorMessage(exception.getMessage());
////		error.callerURL(request.getRequestURI());
//
//		//return error;
//		return null;
//	}
}
