package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4700ob extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile java.lang.Long f37837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.Object f37838i = new java.lang.Object();

    public C4700ob(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10) {
        super(c2262Da, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", c5316u8, i6, 33);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        if (f37837h == null) {
            synchronized (f37838i) {
                try {
                    if (f37837h == null) {
                        f37837h = (java.lang.Long) this.f38978e.invoke(null, null);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f38977d) {
            this.f38977d.X(f37837h.longValue());
        }
    }
}
