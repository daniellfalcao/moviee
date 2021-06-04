package br.danielfalcao.shared.infrastructure.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope

/**
 * A common dispatcher for android and ios.
 * - Android uses Dispatchers.Default as CoroutineDispatcher
 * - iOS uses dispatch_get_main_queue as CoroutineDispatcher
 *
 * */
expect val dispatcher: CoroutineDispatcher

/**
 * Defines a CoroutineScope that uses the [dispatcher] as default coroutine context.
 *
 * */
fun DefaultScope(): CoroutineScope = CoroutineScope(dispatcher)