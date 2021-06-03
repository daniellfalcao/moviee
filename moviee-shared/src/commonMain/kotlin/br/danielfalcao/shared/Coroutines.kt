package br.danielfalcao.shared

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope

/**
 * A common dispatcher between android and ios.
 * - Android uses Dispatchers.Default as CoroutineDispatcher
 * - iOS uses dispatch_get_main_queue as CoroutineDispatcher
 *
 * */
expect val dispatcher: CoroutineDispatcher

/**
 * Defines a CoroutineScope that uses the [dispatcher] as coroutine context.
 *
 * */
fun DefaultScope(): CoroutineScope = CoroutineScope(dispatcher)