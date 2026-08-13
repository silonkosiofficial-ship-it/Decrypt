package Q1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f8764a;

        public a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            this.f8764a = str;
        }

        public final java.lang.String a() {
            return this.f8764a;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof Q1.f.a) {
                return p247y7.AbstractC7350t.b(this.f8764a, ((Q1.f.a) obj).f8764a);
            }
            return false;
        }

        public int hashCode() {
            return this.f8764a.hashCode();
        }

        public java.lang.String toString() {
            return this.f8764a;
        }
    }

    public static final class b {
    }

    public abstract java.util.Map a();

    public abstract java.lang.Object b(Q1.f.a aVar);

    public final Q1.c c() {
        return new Q1.c(p097j7.S.u(a()), false);
    }

    public final Q1.f d() {
        return new Q1.c(p097j7.S.u(a()), true);
    }
}
