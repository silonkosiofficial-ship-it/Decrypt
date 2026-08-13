package U7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements p048e8.InterfaceC6536b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U7.f.a f14586b = new U7.f.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.f f14587a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final U7.f a(java.lang.Object obj, p138n8.f fVar) {
            p247y7.AbstractC7350t.f(obj, "value");
            if (U7.d.h(obj.getClass())) {
                return new U7.q(fVar, (java.lang.Enum) obj);
            }
            if (obj instanceof java.lang.annotation.Annotation) {
                return new U7.g(fVar, (java.lang.annotation.Annotation) obj);
            }
            if (obj instanceof java.lang.Object[]) {
                return new U7.j(fVar, (java.lang.Object[]) obj);
            }
            return obj instanceof java.lang.Class ? new U7.m(fVar, (java.lang.Class) obj) : new U7.s(fVar, obj);
        }
    }

    private f(p138n8.f fVar) {
        this.f14587a = fVar;
    }

    public /* synthetic */ f(p138n8.f fVar, p247y7.AbstractC7342k abstractC7342k) {
        this(fVar);
    }

    @Override // p048e8.InterfaceC6536b
    public p138n8.f getName() {
        return this.f14587a;
    }
}
