package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.a0 f21973c = new androidx.datastore.preferences.protobuf.a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f21975b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.f0 f21974a = new androidx.datastore.preferences.protobuf.G();

    private a0() {
    }

    public static androidx.datastore.preferences.protobuf.a0 a() {
        return f21973c;
    }

    public androidx.datastore.preferences.protobuf.e0 b(java.lang.Class cls, androidx.datastore.preferences.protobuf.e0 e0Var) {
        androidx.datastore.preferences.protobuf.AbstractC2064y.b(cls, "messageType");
        androidx.datastore.preferences.protobuf.AbstractC2064y.b(e0Var, "schema");
        return (androidx.datastore.preferences.protobuf.e0) this.f21975b.putIfAbsent(cls, e0Var);
    }

    public androidx.datastore.preferences.protobuf.e0 c(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.AbstractC2064y.b(cls, "messageType");
        androidx.datastore.preferences.protobuf.e0 e0Var = (androidx.datastore.preferences.protobuf.e0) this.f21975b.get(cls);
        if (e0Var != null) {
            return e0Var;
        }
        androidx.datastore.preferences.protobuf.e0 e0VarA = this.f21974a.a(cls);
        androidx.datastore.preferences.protobuf.e0 e0VarB = b(cls, e0VarA);
        return e0VarB != null ? e0VarB : e0VarA;
    }

    public androidx.datastore.preferences.protobuf.e0 d(java.lang.Object obj) {
        return c(obj.getClass());
    }
}
