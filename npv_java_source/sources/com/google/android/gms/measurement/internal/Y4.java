package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Y4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f42223C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42224D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42225E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42226F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.M5 f42227G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F4 f42228H;

    Y4(com.google.android.gms.measurement.internal.F4 f6, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42223C = atomicReference;
        this.f42224D = str;
        this.f42225E = str2;
        this.f42226F = str3;
        this.f42227G = m6;
        this.f42228H = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.util.List listZ2;
        synchronized (this.f42223C) {
            try {
                try {
                    p085i4.InterfaceC6654f interfaceC6654f = this.f42228H.f41803d;
                    if (interfaceC6654f == null) {
                        this.f42228H.j().G().d("(legacy) Failed to get conditional properties; not connected to service", com.google.android.gms.measurement.internal.C6428n2.v(this.f42224D), this.f42225E, this.f42226F);
                        this.f42223C.set(java.util.Collections.emptyList());
                        this.f42223C.notify();
                        return;
                    }
                    if (android.text.TextUtils.isEmpty(this.f42224D)) {
                        Q3.AbstractC1477p.l(this.f42227G);
                        atomicReference2 = this.f42223C;
                        listZ2 = interfaceC6654f.N0(this.f42225E, this.f42226F, this.f42227G);
                    } else {
                        atomicReference2 = this.f42223C;
                        listZ2 = interfaceC6654f.Z2(this.f42224D, this.f42225E, this.f42226F);
                    }
                    atomicReference2.set(listZ2);
                    this.f42228H.m0();
                    atomicReference = this.f42223C;
                    atomicReference.notify();
                } catch (android.os.RemoteException e6) {
                    this.f42228H.j().G().d("(legacy) Failed to get conditional properties; remote exception", com.google.android.gms.measurement.internal.C6428n2.v(this.f42224D), this.f42225E, e6);
                    this.f42223C.set(java.util.Collections.emptyList());
                    atomicReference = this.f42223C;
                }
            } catch (java.lang.Throwable th) {
                this.f42223C.notify();
                throw th;
            }
        }
    }
}
