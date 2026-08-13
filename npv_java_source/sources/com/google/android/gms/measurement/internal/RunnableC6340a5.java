package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6340a5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42253C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42254D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42255E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42256F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42257G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ boolean f42258H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42259I;

    RunnableC6340a5(com.google.android.gms.measurement.internal.F4 f6, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.measurement.internal.M5 m6, boolean z6) {
        this.f42253C = atomicReference;
        this.f42254D = str;
        this.f42255E = str2;
        this.f42256F = str3;
        this.f42257G = m6;
        this.f42258H = z6;
        this.f42259I = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.util.List listW1;
        synchronized (this.f42253C) {
            try {
                try {
                    p085i4.InterfaceC6654f interfaceC6654f = this.f42259I.f41803d;
                    if (interfaceC6654f == null) {
                        this.f42259I.j().G().d("(legacy) Failed to get user properties; not connected to service", com.google.android.gms.measurement.internal.C6428n2.v(this.f42254D), this.f42255E, this.f42256F);
                        this.f42253C.set(java.util.Collections.emptyList());
                        this.f42253C.notify();
                        return;
                    }
                    if (android.text.TextUtils.isEmpty(this.f42254D)) {
                        Q3.AbstractC1477p.l(this.f42257G);
                        atomicReference2 = this.f42253C;
                        listW1 = interfaceC6654f.S4(this.f42255E, this.f42256F, this.f42258H, this.f42257G);
                    } else {
                        atomicReference2 = this.f42253C;
                        listW1 = interfaceC6654f.w1(this.f42254D, this.f42255E, this.f42256F, this.f42258H);
                    }
                    atomicReference2.set(listW1);
                    this.f42259I.m0();
                    atomicReference = this.f42253C;
                    atomicReference.notify();
                } catch (android.os.RemoteException e6) {
                    this.f42259I.j().G().d("(legacy) Failed to get user properties; remote exception", com.google.android.gms.measurement.internal.C6428n2.v(this.f42254D), this.f42255E, e6);
                    this.f42253C.set(java.util.Collections.emptyList());
                    atomicReference = this.f42253C;
                }
            } catch (java.lang.Throwable th) {
                this.f42253C.notify();
                throw th;
            }
        }
    }
}
