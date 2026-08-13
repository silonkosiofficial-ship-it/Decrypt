package B8;

/* JADX INFO: loaded from: classes2.dex */
public interface s {

    public static final class a implements B8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final B8.s.a f923a = new B8.s.a();

        private a() {
        }

        @Override // B8.s
        public F8.E a(p088i8.q qVar, java.lang.String str, F8.M m6, F8.M m10) {
            p247y7.AbstractC7350t.f(qVar, "proto");
            p247y7.AbstractC7350t.f(str, "flexibleId");
            p247y7.AbstractC7350t.f(m6, "lowerBound");
            p247y7.AbstractC7350t.f(m10, "upperBound");
            throw new java.lang.IllegalArgumentException("This method should not be used.");
        }
    }

    F8.E a(p088i8.q qVar, java.lang.String str, F8.M m6, F8.M m10);
}
