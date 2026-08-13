package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.U f21968a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.U f21969b = new androidx.datastore.preferences.protobuf.V();

    static androidx.datastore.preferences.protobuf.U a() {
        return f21968a;
    }

    static androidx.datastore.preferences.protobuf.U b() {
        return f21969b;
    }

    private static androidx.datastore.preferences.protobuf.U c() {
        try {
            return (androidx.datastore.preferences.protobuf.U) java.lang.Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
