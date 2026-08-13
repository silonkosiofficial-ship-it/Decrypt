package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4509mp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.logging.Logger f37418c = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.C4509mp0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C4509mp0 f37419d = new com.google.android.gms.internal.ads.C4509mp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f37420a = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f37421b = new j$.util.concurrent.ConcurrentHashMap();

    public static com.google.android.gms.internal.ads.C4509mp0 c() {
        return f37419d;
    }

    private final synchronized com.google.android.gms.internal.ads.Fl0 g(java.lang.String str) {
        if (!this.f37420a.containsKey(str)) {
            throw new java.security.GeneralSecurityException("No key manager found for key type ".concat(java.lang.String.valueOf(str)));
        }
        return (com.google.android.gms.internal.ads.Fl0) this.f37420a.get(str);
    }

    private final synchronized void h(com.google.android.gms.internal.ads.Fl0 fl0, boolean z6, boolean z10) {
        try {
            java.lang.String str = ((com.google.android.gms.internal.ads.C5608wp0) fl0).f39687a;
            if (this.f37421b.containsKey(str) && !((java.lang.Boolean) this.f37421b.get(str)).booleanValue()) {
                throw new java.security.GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            com.google.android.gms.internal.ads.Fl0 fl1 = (com.google.android.gms.internal.ads.Fl0) this.f37420a.get(str);
            if (fl1 != null && !fl1.getClass().equals(fl0.getClass())) {
                f37418c.logp(java.util.logging.Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new java.security.GeneralSecurityException(java.lang.String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, fl1.getClass().getName(), fl0.getClass().getName()));
            }
            this.f37420a.putIfAbsent(str, fl0);
            this.f37421b.put(str, java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final com.google.android.gms.internal.ads.Fl0 a(java.lang.String str, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Fl0 fl0G = g(str);
        if (fl0G.b().equals(cls)) {
            return fl0G;
        }
        throw new java.security.GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + java.lang.String.valueOf(fl0G.getClass()) + ", which only supports: " + fl0G.b().toString());
    }

    public final com.google.android.gms.internal.ads.Fl0 b(java.lang.String str) {
        return g(str);
    }

    public final synchronized void d(com.google.android.gms.internal.ads.Fl0 fl0, boolean z6) {
        f(fl0, 1, true);
    }

    public final boolean e(java.lang.String str) {
        return ((java.lang.Boolean) this.f37421b.get(str)).booleanValue();
    }

    public final synchronized void f(com.google.android.gms.internal.ads.Fl0 fl0, int i6, boolean z6) {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(i6)) {
            throw new java.security.GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(fl0, false, true);
    }
}
