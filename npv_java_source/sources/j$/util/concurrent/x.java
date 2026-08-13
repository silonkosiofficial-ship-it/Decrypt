package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class x implements java.security.PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        return java.lang.Boolean.valueOf(java.lang.Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
