// 範囲外例外	(非検査例外にするためにRuntimeExceptionから派生)
class RangeError extends RuntimeException {
	RangeError(int n) {super("入力値が不正です：" + n); }
}


// 範囲外例外（仮引数）
class ParameterRangeError extends RangeError {
	ParameterRangeError(int n) {super(n); }
}

//範囲外例外（返却値）
class ResultRangeError extends RangeError {
	ResultRangeError(int n) {super(n); }
}