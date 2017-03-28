package com.netease.nim.HelloMe.common.infra;

public class TraceTaskScheduler extends WrapTaskScheduler {
	public TraceTaskScheduler(com.netease.nim.HelloMe.common.infra.TaskScheduler wrap) {
		super(wrap);
	}

	@Override
	public void reschedule(com.netease.nim.HelloMe.common.infra.Task task) {
		trace("reschedule " + task.dump(true));
		
		super.reschedule(task);
	}
	
	private final void trace(String msg) {

	}
}
