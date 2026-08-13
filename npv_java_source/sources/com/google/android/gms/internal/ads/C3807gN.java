package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3807gN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f35596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35597d;

    public C3807gN(int i6) {
        int i10 = 16;
        if (java.lang.Integer.bitCount(16) != 1) {
            int iHighestOneBit = java.lang.Integer.highestOneBit(15);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        this.f35594a = 0;
        this.f35595b = 0;
        long[] jArr = new long[i10];
        this.f35596c = jArr;
        this.f35597d = jArr.length - 1;
    }

    public final long a() {
        if (this.f35595b != 0) {
            return this.f35596c[this.f35594a];
        }
        throw new java.util.NoSuchElementException();
    }

    public final long b() {
        int i6 = this.f35595b;
        if (i6 == 0) {
            throw new java.util.NoSuchElementException();
        }
        long[] jArr = this.f35596c;
        int i10 = this.f35594a;
        long j6 = jArr[i10];
        this.f35594a = this.f35597d & (i10 + 1);
        this.f35595b = i6 - 1;
        return j6;
    }

    public final void c() {
        this.f35594a = 0;
        this.f35595b = 0;
    }

    public final boolean d() {
        return this.f35595b == 0;
    }
}
