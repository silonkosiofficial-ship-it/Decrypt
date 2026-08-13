package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Zu0 extends com.google.android.gms.internal.ads.C3424cv0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f33712F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f33713G;

    Zu0(byte[] bArr, int i6, int i10) {
        super(bArr);
        com.google.android.gms.internal.ads.AbstractC3753fv0.O(i6, i6 + i10, bArr.length);
        this.f33712F = i6;
        this.f33713G = i10;
    }

    @Override // com.google.android.gms.internal.ads.C3424cv0
    protected final int Y() {
        return this.f33712F;
    }

    @Override // com.google.android.gms.internal.ads.C3424cv0, com.google.android.gms.internal.ads.AbstractC3753fv0
    public final byte e(int i6) {
        com.google.android.gms.internal.ads.AbstractC3753fv0.V(i6, this.f33713G);
        return this.f34597E[this.f33712F + i6];
    }

    @Override // com.google.android.gms.internal.ads.C3424cv0, com.google.android.gms.internal.ads.AbstractC3753fv0
    final byte f(int i6) {
        return this.f34597E[this.f33712F + i6];
    }

    @Override // com.google.android.gms.internal.ads.C3424cv0, com.google.android.gms.internal.ads.AbstractC3753fv0
    public final int n() {
        return this.f33713G;
    }

    @Override // com.google.android.gms.internal.ads.C3424cv0, com.google.android.gms.internal.ads.AbstractC3753fv0
    protected final void o(byte[] bArr, int i6, int i10, int i11) {
        java.lang.System.arraycopy(this.f34597E, this.f33712F + i6, bArr, i10, i11);
    }
}
