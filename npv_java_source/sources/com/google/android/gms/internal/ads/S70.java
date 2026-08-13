package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static p115l4.AbstractC6931l f31557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static H3.b f31558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f31559c = new java.lang.Object();

    public static p115l4.AbstractC6931l a(android.content.Context context) {
        p115l4.AbstractC6931l abstractC6931l;
        b(context, false);
        synchronized (f31559c) {
            abstractC6931l = f31557a;
        }
        return abstractC6931l;
    }

    public static void b(android.content.Context context, boolean z6) {
        synchronized (f31559c) {
            try {
                if (f31558b == null) {
                    f31558b = H3.a.a(context);
                }
                p115l4.AbstractC6931l abstractC6931l = f31557a;
                if (abstractC6931l == null || ((abstractC6931l.n() && !f31557a.o()) || (z6 && f31557a.n()))) {
                    f31557a = ((H3.b) Q3.AbstractC1477p.m(f31558b, "the appSetIdClient shouldn't be null")).a();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
