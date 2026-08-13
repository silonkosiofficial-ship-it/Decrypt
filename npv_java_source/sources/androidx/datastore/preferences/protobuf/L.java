package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.J f21942a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.J f21943b = new androidx.datastore.preferences.protobuf.K();

    static androidx.datastore.preferences.protobuf.J a() {
        return f21942a;
    }

    static androidx.datastore.preferences.protobuf.J b() {
        return f21943b;
    }

    private static androidx.datastore.preferences.protobuf.J c() {
        try {
            return (androidx.datastore.preferences.protobuf.J) java.lang.Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
