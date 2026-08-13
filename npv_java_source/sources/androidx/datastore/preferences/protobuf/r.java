package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.AbstractC2056p f22108a = new androidx.datastore.preferences.protobuf.C2057q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.AbstractC2056p f22109b = c();

    static androidx.datastore.preferences.protobuf.AbstractC2056p a() {
        androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p = f22109b;
        if (abstractC2056p != null) {
            return abstractC2056p;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static androidx.datastore.preferences.protobuf.AbstractC2056p b() {
        return f22108a;
    }

    private static androidx.datastore.preferences.protobuf.AbstractC2056p c() {
        try {
            return (androidx.datastore.preferences.protobuf.AbstractC2056p) java.lang.Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
