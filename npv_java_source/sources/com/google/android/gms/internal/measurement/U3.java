package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.AbstractC5982c4 f40669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f40670b;

    private U3(int i6) {
        byte[] bArr = new byte[i6];
        this.f40670b = bArr;
        this.f40669a = com.google.android.gms.internal.measurement.AbstractC5982c4.D(bArr);
    }

    public final com.google.android.gms.internal.measurement.L3 a() {
        this.f40669a.E();
        return new com.google.android.gms.internal.measurement.W3(this.f40670b);
    }

    public final com.google.android.gms.internal.measurement.AbstractC5982c4 b() {
        return this.f40669a;
    }
}
