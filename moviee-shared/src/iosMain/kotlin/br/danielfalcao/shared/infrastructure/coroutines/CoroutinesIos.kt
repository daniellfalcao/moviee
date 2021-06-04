package br.danielfalcao.shared.infrastructure.coroutines

import kotlinx.coroutines.*
import platform.darwin.*
import kotlin.coroutines.CoroutineContext

actual val dispatcher: CoroutineDispatcher = IosDispatcher

@OptIn(ExperimentalCoroutinesApi::class, InternalCoroutinesApi::class)
private object IosDispatcher: CoroutineDispatcher(), Delay {

    private val queue = dispatch_get_main_queue()

    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(queue) { block.run() }
    }

    override fun scheduleResumeAfterDelay(timeMillis: Long, continuation: CancellableContinuation<Unit>) {
        val time = dispatch_time(DISPATCH_TIME_NOW, (timeMillis * NSEC_PER_MSEC.toLong()))
        dispatch_after(time, queue) { with(continuation) { resumeUndispatched(Unit) } }
    }
}