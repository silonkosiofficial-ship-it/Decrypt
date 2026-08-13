package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4543n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f37499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f37503e;

    public C4543n6(int i6, int i10, int i11) {
        java.lang.String str;
        if (i6 != Integer.MIN_VALUE) {
            str = i6 + "/";
        } else {
            str = "";
        }
        this.f37499a = str;
        this.f37500b = i10;
        this.f37501c = i11;
        this.f37502d = Integer.MIN_VALUE;
        this.f37503e = "";
    }

    private final void d() {
        if (this.f37502d == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.f37502d;
    }

    public final java.lang.String b() {
        d();
        return this.f37503e;
    }

    public final void c() {
        int i6 = this.f37502d;
        int i10 = i6 == Integer.MIN_VALUE ? this.f37500b : i6 + this.f37501c;
        this.f37502d = i10;
        this.f37503e = this.f37499a + i10;
    }
}
