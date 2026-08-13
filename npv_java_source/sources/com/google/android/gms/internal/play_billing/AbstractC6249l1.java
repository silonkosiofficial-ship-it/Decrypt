package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6249l1 extends com.google.android.gms.internal.play_billing.AbstractFutureC6237j1 implements com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 {
    protected AbstractC6249l1() {
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1
    public final void g(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        n().g(runnable, executor);
    }

    protected abstract com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 n();
}
