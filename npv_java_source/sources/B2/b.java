package B2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p243y2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final B2.b.a f517a = new B2.b.a(null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        B2.d.f522a.a("sqliteJni");
    }

    @Override // p243y2.c
    public p243y2.b a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "fileName");
        return b(str, 6);
    }

    public final p243y2.b b(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "fileName");
        return new B2.a(androidx.sqlite.driver.bundled.BundledSQLiteDriverKt.nativeOpen(str, i6));
    }
}
