package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5781yK0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40040c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40042e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5671xK0 f40038a = new com.google.android.gms.internal.ads.C5671xK0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5671xK0 f40039b = new com.google.android.gms.internal.ads.C5671xK0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f40041d = -9223372036854775807L;

    public final float a() {
        if (this.f40038a.f()) {
            return (float) (1.0E9d / this.f40038a.a());
        }
        return -1.0f;
    }

    public final int b() {
        return this.f40042e;
    }

    public final long c() {
        if (this.f40038a.f()) {
            return this.f40038a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.f40038a.f()) {
            return this.f40038a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j6) {
        this.f40038a.c(j6);
        if (this.f40038a.f()) {
            this.f40040c = false;
        } else if (this.f40041d != -9223372036854775807L) {
            if (!this.f40040c || this.f40039b.e()) {
                this.f40039b.d();
                this.f40039b.c(this.f40041d);
            }
            this.f40040c = true;
            this.f40039b.c(j6);
        }
        if (this.f40040c && this.f40039b.f()) {
            com.google.android.gms.internal.ads.C5671xK0 c5671xK0 = this.f40038a;
            this.f40038a = this.f40039b;
            this.f40039b = c5671xK0;
            this.f40040c = false;
        }
        this.f40041d = j6;
        this.f40042e = this.f40038a.f() ? 0 : this.f40042e + 1;
    }

    public final void f() {
        this.f40038a.d();
        this.f40039b.d();
        this.f40040c = false;
        this.f40041d = -9223372036854775807L;
        this.f40042e = 0;
    }

    public final boolean g() {
        return this.f40038a.f();
    }
}
