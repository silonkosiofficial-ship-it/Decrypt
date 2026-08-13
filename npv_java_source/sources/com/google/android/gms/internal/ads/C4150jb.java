package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4150jb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.List f36698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.content.Context f36699i;

    public C4150jb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, android.content.Context context) {
        super(c2262Da, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", c5316u8, i6, 31);
        this.f36698h = null;
        this.f36699i = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        this.f38977d.Y(-1L);
        this.f38977d.U(-1L);
        android.content.Context contextB = this.f36699i;
        if (contextB == null) {
            contextB = this.f38974a.b();
        }
        if (this.f36698h == null) {
            this.f36698h = (java.util.List) this.f38978e.invoke(null, contextB);
        }
        java.util.List list = this.f36698h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f38977d) {
            this.f38977d.Y(((java.lang.Long) this.f36698h.get(0)).longValue());
            this.f38977d.U(((java.lang.Long) this.f36698h.get(1)).longValue());
        }
    }
}
