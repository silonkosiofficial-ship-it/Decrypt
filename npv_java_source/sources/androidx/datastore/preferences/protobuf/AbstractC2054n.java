package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2054n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.Class f22070a = c();

    public static androidx.datastore.preferences.protobuf.C2055o a() {
        androidx.datastore.preferences.protobuf.C2055o c2055oB = b("getEmptyRegistry");
        return c2055oB != null ? c2055oB : androidx.datastore.preferences.protobuf.C2055o.f22073d;
    }

    private static final androidx.datastore.preferences.protobuf.C2055o b(java.lang.String str) {
        java.lang.Class cls = f22070a;
        if (cls == null) {
            return null;
        }
        try {
            return (androidx.datastore.preferences.protobuf.C2055o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static java.lang.Class c() {
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
