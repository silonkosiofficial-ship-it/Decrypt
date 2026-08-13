package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class BA implements p204u3.z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4557nD f25909C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f25910D = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f25911E = new java.util.concurrent.atomic.AtomicBoolean(false);

    public BA(com.google.android.gms.internal.ads.C4557nD c4557nD) {
        this.f25909C = c4557nD;
    }

    private final void b() {
        if (this.f25911E.get()) {
            return;
        }
        this.f25911E.set(true);
        this.f25909C.a();
    }

    @Override // p204u3.z
    public final void T2() {
        this.f25909C.c();
    }

    public final boolean a() {
        return this.f25910D.get();
    }

    @Override // p204u3.z
    public final void d2() {
        b();
    }

    @Override // p204u3.z
    public final void f3() {
    }

    @Override // p204u3.z
    public final void p4(int i6) {
        this.f25910D.set(true);
        b();
    }

    @Override // p204u3.z
    public final void q0() {
    }

    @Override // p204u3.z
    public final void y0() {
    }
}
