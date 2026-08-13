package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3822gb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile java.lang.String f35628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.Object f35629i = new java.lang.Object();

    public C3822gb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c5316u8, i6, 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        this.f38977d.A("E");
        if (f35628h == null) {
            synchronized (f35629i) {
                try {
                    if (f35628h == null) {
                        f35628h = (java.lang.String) this.f38978e.invoke(null, null);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f38977d) {
            this.f38977d.A(f35628h);
        }
    }
}
