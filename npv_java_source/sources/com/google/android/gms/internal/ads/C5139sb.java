package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5139sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2262Da f38771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f38772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f38773c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Class[] f38775e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile java.lang.reflect.Method f38774d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f38776f = new java.util.concurrent.CountDownLatch(1);

    public C5139sb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, java.lang.Class... clsArr) {
        this.f38771a = c2262Da;
        this.f38772b = str;
        this.f38773c = str2;
        this.f38775e = clsArr;
        c2262Da.k().submit(new com.google.android.gms.internal.ads.RunnableC5029rb(this));
    }

    static /* bridge */ /* synthetic */ void b(com.google.android.gms.internal.ads.C5139sb c5139sb) {
        try {
            com.google.android.gms.internal.ads.C2262Da c2262Da = c5139sb.f38771a;
            java.lang.Class<?> clsLoadClass = c2262Da.i().loadClass(c5139sb.c(c2262Da.u(), c5139sb.f38772b));
            if (clsLoadClass != null) {
                c5139sb.f38774d = clsLoadClass.getMethod(c5139sb.c(c5139sb.f38771a.u(), c5139sb.f38773c), c5139sb.f38775e);
            }
        } catch (com.google.android.gms.internal.ads.C3820ga | java.io.UnsupportedEncodingException | java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused) {
        } finally {
            c5139sb.f38776f.countDown();
        }
    }

    private final java.lang.String c(byte[] bArr, java.lang.String str) {
        return new java.lang.String(this.f38771a.e().b(bArr, str), "UTF-8");
    }

    public final java.lang.reflect.Method a() {
        if (this.f38774d != null) {
            return this.f38774d;
        }
        try {
            if (this.f38776f.await(2L, java.util.concurrent.TimeUnit.SECONDS)) {
                return this.f38774d;
            }
            return null;
        } catch (java.lang.InterruptedException unused) {
            return null;
        }
    }
}
