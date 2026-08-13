package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3032Ya extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2299Ea f33372h;

    public C3032Ya(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, com.google.android.gms.internal.ads.C2299Ea c2299Ea) {
        super(c2262Da, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", c5316u8, i6, 85);
        this.f33372h = c2299Ea;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        long[] jArr = (long[]) this.f38978e.invoke(null, java.lang.Long.valueOf(this.f33372h.d()), java.lang.Long.valueOf(this.f33372h.h()), java.lang.Long.valueOf(this.f33372h.b()), java.lang.Long.valueOf(this.f33372h.f()));
        synchronized (this.f38977d) {
            this.f38977d.G0(jArr[0]);
            this.f38977d.F0(jArr[1]);
        }
    }
}
