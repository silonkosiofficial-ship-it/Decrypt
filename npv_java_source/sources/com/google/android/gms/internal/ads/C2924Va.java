package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2924Va extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32520h;

    public C2924Va(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, long j6, int i6, int i10) {
        super(c2262Da, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c5316u8, i6, 25);
        this.f32520h = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        long jLongValue = ((java.lang.Long) this.f38978e.invoke(null, null)).longValue();
        synchronized (this.f38977d) {
            try {
                this.f38977d.E0(jLongValue);
                long j6 = this.f32520h;
                if (j6 != 0) {
                    this.f38977d.V(jLongValue - j6);
                    this.f38977d.W(this.f32520h);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
