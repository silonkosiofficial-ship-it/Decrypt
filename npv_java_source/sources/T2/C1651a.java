package T2;

/* JADX INFO: renamed from: T2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1651a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f12923a;

    /* JADX INFO: renamed from: T2.a$a, reason: collision with other inner class name */
    public static final class C0275a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f12924a;

        /* synthetic */ C0275a(T2.i iVar) {
        }

        public T2.C1651a a() {
            java.lang.String str = this.f12924a;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Purchase token must be set");
            }
            T2.C1651a c1651a = new T2.C1651a(null);
            c1651a.f12923a = str;
            return c1651a;
        }

        public T2.C1651a.C0275a b(java.lang.String str) {
            this.f12924a = str;
            return this;
        }
    }

    /* synthetic */ C1651a(T2.i iVar) {
    }

    public static T2.C1651a.C0275a b() {
        return new T2.C1651a.C0275a(null);
    }

    public java.lang.String a() {
        return this.f12923a;
    }
}
