package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4830pl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f38058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f38059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C2229Cc f38064g = com.google.android.gms.internal.ads.C2229Cc.f26255e;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    public final int a(int i6) {
        return this.f38064g.a(i6).f33976b;
    }

    public final int b() {
        int i6 = this.f38064g.f26257a;
        return 0;
    }

    public final int c(long j6) {
        return -1;
    }

    public final int d(long j6) {
        this.f38064g.b(-1);
        return -1;
    }

    public final int e(int i6) {
        return this.f38064g.a(i6).a(-1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C4830pl.class.equals(obj.getClass())) {
            com.google.android.gms.internal.ads.C4830pl c4830pl = (com.google.android.gms.internal.ads.C4830pl) obj;
            if (j$.util.Objects.equals(this.f38058a, c4830pl.f38058a) && j$.util.Objects.equals(this.f38059b, c4830pl.f38059b) && this.f38060c == c4830pl.f38060c && this.f38061d == c4830pl.f38061d && this.f38063f == c4830pl.f38063f && j$.util.Objects.equals(this.f38064g, c4830pl.f38064g)) {
                return true;
            }
        }
        return false;
    }

    public final long f(int i6, int i10) {
        com.google.android.gms.internal.ads.C3104a c3104aA = this.f38064g.a(i6);
        if (c3104aA.f33976b != -1) {
            return c3104aA.f33980f[i10];
        }
        return -9223372036854775807L;
    }

    public final long g(int i6) {
        long j6 = this.f38064g.a(i6).f33975a;
        return 0L;
    }

    public final long h() {
        long j6 = this.f38064g.f26258b;
        return 0L;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f38058a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f38059b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f38060c;
        long j6 = this.f38061d;
        return (((((iHashCode2 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 961) + (this.f38063f ? 1 : 0)) * 31) + this.f38064g.hashCode();
    }

    public final com.google.android.gms.internal.ads.C4830pl i(java.lang.Object obj, java.lang.Object obj2, int i6, long j6, long j10, com.google.android.gms.internal.ads.C2229Cc c2229Cc, boolean z6) {
        this.f38058a = obj;
        this.f38059b = obj2;
        this.f38060c = i6;
        this.f38061d = j6;
        this.f38062e = 0L;
        this.f38064g = c2229Cc;
        this.f38063f = z6;
        return this;
    }

    public final boolean j(int i6) {
        b();
        if (i6 != -1) {
            return false;
        }
        this.f38064g.b(-1);
        return false;
    }

    public final boolean k(int i6) {
        boolean z6 = this.f38064g.a(i6).f33982h;
        return false;
    }
}
