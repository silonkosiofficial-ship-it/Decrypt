package j$.util;

/* JADX INFO: loaded from: classes4.dex */
abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f48607a = ((java.lang.Boolean) java.security.AccessController.doPrivileged(new j$.util.s0())).booleanValue();

    static void a(java.lang.Class cls, java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
