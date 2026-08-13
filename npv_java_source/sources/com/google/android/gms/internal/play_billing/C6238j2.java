package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6238j2 extends com.google.android.gms.internal.play_billing.C6256m2 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f41571F;

    C6238j2(byte[] bArr, int i6, int i10) {
        super(bArr);
        com.google.android.gms.internal.play_billing.AbstractC6268o2.s(0, i10, bArr.length);
        this.f41571F = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.C6256m2
    protected final int D() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.C6256m2, com.google.android.gms.internal.play_billing.AbstractC6268o2
    public final byte d(int i6) {
        int i10 = this.f41571F;
        if (((i10 - (i6 + 1)) | i6) >= 0) {
            return this.f41590E[i6];
        }
        if (i6 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + i6);
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i6 + ", " + i10);
    }

    @Override // com.google.android.gms.internal.play_billing.C6256m2, com.google.android.gms.internal.play_billing.AbstractC6268o2
    final byte e(int i6) {
        return this.f41590E[i6];
    }

    @Override // com.google.android.gms.internal.play_billing.C6256m2, com.google.android.gms.internal.play_billing.AbstractC6268o2
    public final int f() {
        return this.f41571F;
    }
}
