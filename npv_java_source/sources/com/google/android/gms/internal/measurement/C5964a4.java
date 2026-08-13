package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5964a4 extends com.google.android.gms.internal.measurement.X3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f40790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40795h;

    private C5964a4(byte[] bArr, int i6, int i10, boolean z6) {
        super();
        this.f40795h = Integer.MAX_VALUE;
        this.f40790c = bArr;
        this.f40791d = i10 + i6;
        this.f40793f = i6;
        this.f40794g = i6;
    }

    private final void f() {
        int i6 = this.f40791d + this.f40792e;
        this.f40791d = i6;
        int i10 = i6 - this.f40794g;
        int i11 = this.f40795h;
        if (i10 <= i11) {
            this.f40792e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f40792e = i12;
        this.f40791d = i6 - i12;
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public final int d(int i6) throws com.google.android.gms.internal.measurement.C4 {
        if (i6 < 0) {
            throw com.google.android.gms.internal.measurement.C4.d();
        }
        int iE = i6 + e();
        if (iE < 0) {
            throw com.google.android.gms.internal.measurement.C4.e();
        }
        int i10 = this.f40795h;
        if (iE > i10) {
            throw com.google.android.gms.internal.measurement.C4.g();
        }
        this.f40795h = iE;
        f();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.X3
    public final int e() {
        return this.f40793f - this.f40794g;
    }
}
