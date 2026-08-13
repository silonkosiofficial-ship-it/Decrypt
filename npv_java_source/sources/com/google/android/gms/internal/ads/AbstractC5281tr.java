package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5281tr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4512mr f39040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f39041b;

    public AbstractC5281tr() {
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        this.f39040a = c4512mr;
        this.f39041b = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(c4512mr, new com.google.android.gms.internal.ads.C5061rr(this), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    public final int a() {
        return this.f39041b.get();
    }

    public final void c() {
        this.f39040a.d(new java.lang.Exception());
    }

    public final void d(java.lang.Throwable th, java.lang.String str) {
        this.f39040a.d(th);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25225B7)).booleanValue()) {
            p174r3.v.s().w(th, str);
        }
    }

    public final void e(java.lang.Object obj) {
        this.f39040a.c(obj);
    }

    public final void f(com.google.android.gms.internal.ads.InterfaceC4952qr interfaceC4952qr, com.google.android.gms.internal.ads.InterfaceC4732or interfaceC4732or) {
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f39040a, new com.google.android.gms.internal.ads.C5171sr(this, interfaceC4952qr, interfaceC4732or), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }
}
