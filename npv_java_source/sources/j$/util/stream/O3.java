package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class O3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f48308a = ((java.lang.Boolean) java.security.AccessController.doPrivileged(new j$.util.stream.N3())).booleanValue();

    static void a(java.lang.Class cls, java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
