package T5;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* JADX INFO: renamed from: T5.b$b, reason: collision with other inner class name */
    public static final class C0278b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f12974a;

        public C0278b(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "sessionId");
            this.f12974a = str;
        }

        public final java.lang.String a() {
            return this.f12974a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof T5.b.C0278b) && p247y7.AbstractC7350t.b(this.f12974a, ((T5.b.C0278b) obj).f12974a);
        }

        public int hashCode() {
            return this.f12974a.hashCode();
        }

        public java.lang.String toString() {
            return "SessionDetails(sessionId=" + this.f12974a + ')';
        }
    }

    boolean a();

    T5.b.a b();

    void c(T5.b.C0278b c0278b);
}
