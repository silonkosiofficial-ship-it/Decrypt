package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4511mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f37422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f37423b;

    /* synthetic */ AbstractC4511mq0(java.lang.Class cls, java.lang.Class cls2, com.google.android.gms.internal.ads.AbstractC4401lq0 abstractC4401lq0) {
        this.f37422a = cls;
        this.f37423b = cls2;
    }

    public static com.google.android.gms.internal.ads.AbstractC4511mq0 b(com.google.android.gms.internal.ads.InterfaceC4291kq0 interfaceC4291kq0, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.C4181jq0(cls, cls2, interfaceC4291kq0);
    }

    public abstract java.lang.Object a(com.google.android.gms.internal.ads.El0 el0);

    public final java.lang.Class c() {
        return this.f37422a;
    }

    public final java.lang.Class d() {
        return this.f37423b;
    }
}
