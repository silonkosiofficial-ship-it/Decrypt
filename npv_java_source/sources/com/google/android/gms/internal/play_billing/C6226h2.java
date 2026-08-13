package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6226h2 extends com.google.android.gms.internal.play_billing.AbstractC6232i2 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f41564C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f41565D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.play_billing.AbstractC6268o2 f41566E;

    C6226h2(com.google.android.gms.internal.play_billing.AbstractC6268o2 abstractC6268o2) {
        this.f41566E = abstractC6268o2;
        this.f41565D = abstractC6268o2.f();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6244k2
    public final byte a() {
        int i6 = this.f41564C;
        if (i6 >= this.f41565D) {
            throw new java.util.NoSuchElementException();
        }
        this.f41564C = i6 + 1;
        return this.f41566E.e(i6);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41564C < this.f41565D;
    }
}
