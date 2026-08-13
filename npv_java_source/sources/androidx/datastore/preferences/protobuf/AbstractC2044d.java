package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2044d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f21985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class f21986b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f21987c;

    static {
        f21987c = (f21985a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static java.lang.Class a(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static java.lang.Class b() {
        return f21986b;
    }

    static boolean c() {
        return f21985a || !(f21986b == null || f21987c);
    }
}
