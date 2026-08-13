package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class L0 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.FM f29178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.FM f29179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29180c;

    public L0(long[] jArr, long[] jArr2, long j6) {
        int length = jArr.length;
        int length2 = jArr2.length;
        com.google.android.gms.internal.ads.LC.d(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f29178a = new com.google.android.gms.internal.ads.FM(length2);
            this.f29179b = new com.google.android.gms.internal.ads.FM(length2);
        } else {
            int i6 = length2 + 1;
            com.google.android.gms.internal.ads.FM fm = new com.google.android.gms.internal.ads.FM(i6);
            this.f29178a = fm;
            com.google.android.gms.internal.ads.FM fm2 = new com.google.android.gms.internal.ads.FM(i6);
            this.f29179b = fm2;
            fm.c(0L);
            fm2.c(0L);
        }
        this.f29178a.d(jArr);
        this.f29179b.d(jArr2);
        this.f29180c = j6;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f29180c;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        com.google.android.gms.internal.ads.FM fm = this.f29179b;
        if (fm.a() == 0) {
            com.google.android.gms.internal.ads.U0 u6 = com.google.android.gms.internal.ads.U0.f32077c;
            return new com.google.android.gms.internal.ads.R0(u6, u6);
        }
        int iT = com.google.android.gms.internal.ads.EW.t(fm, j6, true, true);
        com.google.android.gms.internal.ads.U0 u10 = new com.google.android.gms.internal.ads.U0(this.f29179b.b(iT), this.f29178a.b(iT));
        if (u10.f32078a != j6) {
            com.google.android.gms.internal.ads.FM fm2 = this.f29179b;
            if (iT != fm2.a() - 1) {
                int i6 = iT + 1;
                return new com.google.android.gms.internal.ads.R0(u10, new com.google.android.gms.internal.ads.U0(fm2.b(i6), this.f29178a.b(i6)));
            }
        }
        return new com.google.android.gms.internal.ads.R0(u10, u10);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return this.f29179b.a() > 0;
    }
}
