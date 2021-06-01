package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Log.info("\n");
		Log.info(result.getMethod().getMethodName() + " Started");
		Log.info(result.getMethod().getDescription());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Log.info(result.getMethod().getMethodName() + " Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Log.info("Failed because of - " + result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Log.info("Skipped because of - " + result.getThrowable());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		Log.info("********** onStart: - " + context.getName() + "**********");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Log.info("********** onFinish: - " + context.getName() + "**********");
		
	}

}
