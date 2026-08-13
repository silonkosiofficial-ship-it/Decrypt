package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5543wB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5433vB0 f39553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5323uB0 f39554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4942qm f39555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Object f39557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.os.Looper f39558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f39559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39561i;

    public C5543wB0(com.google.android.gms.internal.ads.InterfaceC5323uB0 interfaceC5323uB0, com.google.android.gms.internal.ads.InterfaceC5433vB0 interfaceC5433vB0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, int i6, com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD, android.os.Looper looper) {
        this.f39554b = interfaceC5323uB0;
        this.f39553a = interfaceC5433vB0;
        this.f39555c = abstractC4942qm;
        this.f39558f = looper;
        this.f39559g = i6;
    }

    public final int a() {
        return this.f39556d;
    }

    public final android.os.Looper b() {
        return this.f39558f;
    }

    public final com.google.android.gms.internal.ads.InterfaceC5433vB0 c() {
        return this.f39553a;
    }

    public final com.google.android.gms.internal.ads.C5543wB0 d() {
        com.google.android.gms.internal.ads.LC.f(!this.f39560h);
        this.f39560h = true;
        this.f39554b.b(this);
        return this;
    }

    public final com.google.android.gms.internal.ads.C5543wB0 e(java.lang.Object obj) {
        com.google.android.gms.internal.ads.LC.f(!this.f39560h);
        this.f39557e = obj;
        return this;
    }

    public final com.google.android.gms.internal.ads.C5543wB0 f(int i6) {
        com.google.android.gms.internal.ads.LC.f(!this.f39560h);
        this.f39556d = i6;
        return this;
    }

    public final java.lang.Object g() {
        return this.f39557e;
    }

    public final synchronized void h(boolean z6) {
        this.f39561i = z6 | this.f39561i;
        notifyAll();
    }

    public final synchronized boolean i() {
        return false;
    }
}
