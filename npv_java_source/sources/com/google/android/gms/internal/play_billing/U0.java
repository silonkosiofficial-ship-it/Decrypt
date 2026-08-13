package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class U0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.android.gms.internal.play_billing.AbstractC6183a1 f41487C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 f41488D;

    U0(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1) {
        this.f41487C = abstractC6183a1;
        this.f41488D = interfaceFutureC6320x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f41487C.f41513C != this) {
            return;
        }
        com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1 = this.f41488D;
        if (com.google.android.gms.internal.play_billing.AbstractC6183a1.f41511H.f(this.f41487C, this, com.google.android.gms.internal.play_billing.AbstractC6183a1.s(interfaceFutureC6320x1))) {
            com.google.android.gms.internal.play_billing.AbstractC6183a1.x(this.f41487C, false);
        }
    }
}
