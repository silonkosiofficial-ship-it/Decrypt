package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3851gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.logging.Logger f35689a = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.AbstractC3851gp0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f35690b = new java.util.concurrent.atomic.AtomicBoolean(false);

    static java.lang.Boolean a() {
        try {
            return (java.lang.Boolean) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (java.lang.Exception unused) {
            f35689a.logp(java.util.logging.Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return java.lang.Boolean.FALSE;
        }
    }

    public static boolean b() {
        return f35690b.get();
    }
}
