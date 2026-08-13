package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2668Oa extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.app.Activity f30521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.view.View f30522i;

    public C2668Oa(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, android.view.View view, android.app.Activity activity) {
        super(c2262Da, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", c5316u8, i6, 62);
        this.f30522i = view;
        this.f30521h = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        if (this.f30522i == null) {
            return;
        }
        java.lang.Boolean bool = (java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25308J2);
        boolean zBooleanValue = bool.booleanValue();
        java.lang.Object[] objArr = (java.lang.Object[]) this.f38978e.invoke(null, this.f30522i, this.f30521h, bool);
        synchronized (this.f38977d) {
            try {
                this.f38977d.n0(((java.lang.Long) objArr[0]).longValue());
                this.f38977d.p0(((java.lang.Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f38977d.o0((java.lang.String) objArr[2]);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
