package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3068Za extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.Map f33608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.view.View f33609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.content.Context f33610j;

    public C3068Za(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, java.util.Map map, android.view.View view, android.content.Context context) {
        super(c2262Da, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", c5316u8, i6, 85);
        this.f33608h = map;
        this.f33609i = view;
        this.f33610j = context;
    }

    private final long c(int i6) {
        java.util.Map map = this.f33608h;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i6);
        if (map.containsKey(numValueOf)) {
            return ((java.lang.Long) this.f33608h.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        long[] jArr = {c(1), c(2)};
        android.content.Context contextB = this.f33610j;
        if (contextB == null) {
            contextB = this.f38974a.b();
        }
        long[] jArr2 = (long[]) this.f38978e.invoke(null, jArr, contextB, this.f33609i);
        long j6 = jArr2[0];
        this.f33608h.put(1, java.lang.Long.valueOf(jArr2[1]));
        long j10 = jArr2[2];
        this.f33608h.put(2, java.lang.Long.valueOf(jArr2[3]));
        synchronized (this.f38977d) {
            this.f38977d.G0(j6);
            this.f38977d.F0(j10);
        }
    }
}
