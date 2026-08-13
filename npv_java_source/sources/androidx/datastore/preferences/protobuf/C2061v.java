package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2061v implements androidx.datastore.preferences.protobuf.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.C2061v f22222a = new androidx.datastore.preferences.protobuf.C2061v();

    private C2061v() {
    }

    public static androidx.datastore.preferences.protobuf.C2061v c() {
        return f22222a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public androidx.datastore.preferences.protobuf.M a(java.lang.Class cls) {
        if (!androidx.datastore.preferences.protobuf.AbstractC2062w.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (androidx.datastore.preferences.protobuf.M) androidx.datastore.preferences.protobuf.AbstractC2062w.t(cls.asSubclass(androidx.datastore.preferences.protobuf.AbstractC2062w.class)).i();
        } catch (java.lang.Exception e6) {
            throw new java.lang.RuntimeException("Unable to get message info for " + cls.getName(), e6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean b(java.lang.Class cls) {
        return androidx.datastore.preferences.protobuf.AbstractC2062w.class.isAssignableFrom(cls);
    }
}
