package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5671xK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f39829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f39830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f39834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f39835g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39836h;

    public final long a() {
        long j6 = this.f39833e;
        if (j6 == 0) {
            return 0L;
        }
        return this.f39834f / j6;
    }

    public final long b() {
        return this.f39834f;
    }

    public final void c(long j6) {
        int i6;
        long j10 = this.f39832d;
        if (j10 == 0) {
            this.f39829a = j6;
        } else if (j10 == 1) {
            long j11 = j6 - this.f39829a;
            this.f39830b = j11;
            this.f39834f = j11;
            this.f39833e = 1L;
        } else {
            long j12 = j6 - this.f39831c;
            int i10 = (int) (j10 % 15);
            if (java.lang.Math.abs(j12 - this.f39830b) <= 1000000) {
                this.f39833e++;
                this.f39834f += j12;
                boolean[] zArr = this.f39835g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    i6 = this.f39836h - 1;
                    this.f39836h = i6;
                }
            } else {
                boolean[] zArr2 = this.f39835g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    i6 = this.f39836h + 1;
                    this.f39836h = i6;
                }
            }
        }
        this.f39832d++;
        this.f39831c = j6;
    }

    public final void d() {
        this.f39832d = 0L;
        this.f39833e = 0L;
        this.f39834f = 0L;
        this.f39836h = 0;
        java.util.Arrays.fill(this.f39835g, false);
    }

    public final boolean e() {
        long j6 = this.f39832d;
        if (j6 == 0) {
            return false;
        }
        return this.f39835g[(int) ((j6 - 1) % 15)];
    }

    public final boolean f() {
        return this.f39832d > 15 && this.f39836h == 0;
    }
}
