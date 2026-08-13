package C9;

/* JADX INFO: loaded from: classes2.dex */
public interface B {

    public static final class a {
        public static boolean a(C9.B b6) {
            return false;
        }
    }

    public static final class b implements C9.B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C9.B.b f1385a = new C9.B.b();

        private b() {
        }

        @Override // C9.B
        public boolean a() {
            return C9.B.a.a(this);
        }
    }

    public static final class c implements C9.B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C9.B.c f1386a = new C9.B.c();

        private c() {
        }

        @Override // C9.B
        public boolean a() {
            return true;
        }
    }

    public static final class d implements C9.B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1388b;

        public d(java.lang.String str, boolean z6) {
            p247y7.AbstractC7350t.f(str, "route");
            this.f1387a = str;
            this.f1388b = z6;
        }

        @Override // C9.B
        public boolean a() {
            return this.f1388b;
        }

        public final java.lang.String b() {
            return this.f1387a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9.B.d)) {
                return false;
            }
            C9.B.d dVar = (C9.B.d) obj;
            return p247y7.AbstractC7350t.b(this.f1387a, dVar.f1387a) && this.f1388b == dVar.f1388b;
        }

        public int hashCode() {
            return (this.f1387a.hashCode() * 31) + p190t.h.a(this.f1388b);
        }

        public java.lang.String toString() {
            return "Route(route=" + this.f1387a + ", inclusive=" + this.f1388b + ")";
        }
    }

    boolean a();
}
