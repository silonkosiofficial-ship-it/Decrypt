package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6274p2 extends com.google.android.gms.internal.play_billing.AbstractC6285r2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41613d;

    /* synthetic */ C6274p2(byte[] bArr, int i6, int i10, boolean z6, com.google.android.gms.internal.play_billing.AbstractC6280q2 abstractC6280q2) {
        super(null);
        this.f41613d = Integer.MAX_VALUE;
        this.f41611b = 0;
    }

    public final int c(int i6) {
        int i10 = this.f41613d;
        this.f41613d = 0;
        int i11 = this.f41611b + this.f41612c;
        this.f41611b = i11;
        if (i11 > 0) {
            this.f41612c = i11;
            this.f41611b = 0;
        } else {
            this.f41612c = 0;
        }
        return i10;
    }
}
