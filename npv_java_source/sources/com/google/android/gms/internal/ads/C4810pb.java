package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4810pb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {
    public C4810pb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c5316u8, i6, 48);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        this.f38977d.l0(3);
        boolean zBooleanValue = ((java.lang.Boolean) this.f38978e.invoke(null, this.f38974a.b())).booleanValue();
        synchronized (this.f38977d) {
            try {
                if (zBooleanValue) {
                    this.f38977d.l0(2);
                } else {
                    this.f38977d.l0(1);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
