package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3164ab extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile java.lang.Long f34109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.Object f34110i = new java.lang.Object();

    public C3164ab(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c5316u8, i6, 22);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        if (f34109h == null) {
            synchronized (f34110i) {
                try {
                    if (f34109h == null) {
                        f34109h = (java.lang.Long) this.f38978e.invoke(null, null);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f38977d) {
            this.f38977d.J0(f34109h.longValue());
        }
    }
}
