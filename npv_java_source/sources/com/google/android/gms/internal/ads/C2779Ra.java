package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2779Ra extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C5359ub f31292i = new com.google.android.gms.internal.ads.C5359ub();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.content.Context f31293h;

    public C2779Ra(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, android.content.Context context) {
        super(c2262Da, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", c5316u8, i6, 29);
        this.f31293h = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        this.f38977d.y0("E");
        java.util.concurrent.atomic.AtomicReference atomicReferenceA = f31292i.a(this.f31293h.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                try {
                    if (atomicReferenceA.get() == null) {
                        atomicReferenceA.set((java.lang.String) this.f38978e.invoke(null, this.f31293h));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        java.lang.String str = (java.lang.String) atomicReferenceA.get();
        synchronized (this.f38977d) {
            this.f38977d.y0(com.google.android.gms.internal.ads.AbstractC4219k9.a(str.getBytes(), true));
        }
    }
}
