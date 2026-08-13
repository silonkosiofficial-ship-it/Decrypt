package T2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12925a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f12926a;

        /* synthetic */ a(T2.x xVar) {
        }

        public T2.f a() {
            if (this.f12926a != null) {
                return new T2.f(this, null);
            }
            throw new java.lang.IllegalArgumentException("Product type must be set");
        }

        public T2.f.a b(java.lang.String str) {
            this.f12926a = str;
            return this;
        }
    }

    /* synthetic */ f(T2.f.a aVar, T2.x xVar) {
        this.f12925a = aVar.f12926a;
    }

    public static T2.f.a a() {
        return new T2.f.a(null);
    }

    public final java.lang.String b() {
        return this.f12925a;
    }
}
