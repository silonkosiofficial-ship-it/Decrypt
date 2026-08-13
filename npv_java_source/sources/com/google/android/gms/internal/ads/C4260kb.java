package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4260kb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f36982h;

    public C4260kb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c5316u8, i6, 61);
        this.f36982h = c2262Da.s();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        long jLongValue = ((java.lang.Long) this.f38978e.invoke(null, this.f38974a.b(), java.lang.Boolean.valueOf(this.f36982h))).longValue();
        synchronized (this.f38977d) {
            this.f38977d.E(jLongValue);
        }
    }
}
