package io.ashdavies.rx.rxtasks.internal

import com.google.android.gms.tasks.Task
import io.reactivex.CompletableEmitter
import io.reactivex.CompletableOnSubscribe

internal class CompletableTaskOnSubscribe @JvmOverloads constructor(
    task: Task<Void>, factory: TaskListenerFactory<Void, CompletableEmitter> = CompletableTaskListenerFactory()
) : TaskOnSubscribe<Void, CompletableEmitter>(task, factory), CompletableOnSubscribe
