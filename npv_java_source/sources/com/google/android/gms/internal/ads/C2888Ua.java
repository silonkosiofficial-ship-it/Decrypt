package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2888Ua extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile java.lang.Long f32234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.Object f32235i = new java.lang.Object();

    public C2888Ua(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c5316u8, i6, 44);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        if (f32234h == null) {
            synchronized (f32235i) {
                try {
                    if (f32234h == null) {
                        f32234h = (java.lang.Long) this.f38978e.invoke(null, null);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f38977d) {
            this.f38977d.z0(f32234h.longValue());
        }
    }
}
