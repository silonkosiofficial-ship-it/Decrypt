package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3602eb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3710fa f35006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f35007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f35008j;

    public C3602eb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, com.google.android.gms.internal.ads.C3710fa c3710fa, long j6, long j10) {
        super(c2262Da, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", c5316u8, i6, 11);
        this.f35006h = c3710fa;
        this.f35007i = j6;
        this.f35008j = j10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        com.google.android.gms.internal.ads.C3710fa c3710fa = this.f35006h;
        if (c3710fa != null) {
            com.google.android.gms.internal.ads.C3491da c3491da = new com.google.android.gms.internal.ads.C3491da((java.lang.String) this.f38978e.invoke(null, c3710fa.b(), java.lang.Long.valueOf(this.f35007i), java.lang.Long.valueOf(this.f35008j)));
            synchronized (this.f38977d) {
                try {
                    this.f38977d.K0(c3491da.f34750b.longValue());
                    if (c3491da.f34751c.longValue() >= 0) {
                        this.f38977d.S(c3491da.f34751c.longValue());
                    }
                    if (c3491da.f34752d.longValue() >= 0) {
                        this.f38977d.q0(c3491da.f34752d.longValue());
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
