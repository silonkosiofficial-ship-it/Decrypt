package M7;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;


    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f7060J = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final M7.c.a f7053C = new M7.c.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final M7.c a(M7.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "functionTypeKind");
            if (p247y7.AbstractC7350t.b(fVar, M7.f.a.f7066e)) {
                return M7.c.Function;
            }
            if (p247y7.AbstractC7350t.b(fVar, M7.f.d.f7069e)) {
                return M7.c.SuspendFunction;
            }
            if (p247y7.AbstractC7350t.b(fVar, M7.f.b.f7067e)) {
                return M7.c.KFunction;
            }
            return p247y7.AbstractC7350t.b(fVar, M7.f.c.f7068e) ? M7.c.KSuspendFunction : M7.c.UNKNOWN;
        }
    }
}
