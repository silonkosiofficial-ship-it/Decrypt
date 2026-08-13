package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p143o2.l f52434a = new p143o2.l();

    private l() {
    }

    public static final o2.n.a a(android.content.Context context, java.lang.Class cls, java.lang.String str) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(cls, "klass");
        if (!(!(str == null || S8.r.s0(str)))) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
        }
        if (true ^ p247y7.AbstractC7350t.b(str, ":memory:")) {
            return new o2.n.a(context, cls, str);
        }
        throw new java.lang.IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final o2.n.a b(android.content.Context context, java.lang.Class cls) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(cls, "klass");
        return new o2.n.a(context, cls, null);
    }
}
