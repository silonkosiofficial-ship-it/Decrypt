package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2550Ks extends p214v3.B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.android.gms.internal.ads.InterfaceC3746fs f29016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.google.android.gms.internal.ads.AbstractC2880Ts f29017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f29018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String[] f29019f;

    C2550Ks(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.lang.String[] strArr) {
        this.f29016c = interfaceC3746fs;
        this.f29017d = abstractC2880Ts;
        this.f29018e = str;
        this.f29019f = strArr;
        p174r3.v.C().e(this);
    }

    @Override // p214v3.B
    public final void a() {
        try {
            this.f29017d.r(this.f29018e, this.f29019f);
        } finally {
            p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2513Js(this));
        }
    }

    @Override // p214v3.B
    public final P4.d b() {
        return (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25538e2)).booleanValue() && (this.f29017d instanceof com.google.android.gms.internal.ads.C3419ct)) ? com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.Is
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f28519a.d();
            }
        }) : super.b();
    }

    final /* synthetic */ java.lang.Boolean d() {
        return java.lang.Boolean.valueOf(this.f29017d.s(this.f29018e, this.f29019f, this));
    }

    public final java.lang.String e() {
        return this.f29018e;
    }
}
