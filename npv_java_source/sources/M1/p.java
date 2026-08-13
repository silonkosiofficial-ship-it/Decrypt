package M1;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static final class a extends M1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p237x7.p f6945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final W8.InterfaceC1813v f6946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final M1.v f6947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p127m7.i f6948d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p237x7.p pVar, W8.InterfaceC1813v interfaceC1813v, M1.v vVar, p127m7.i iVar) {
            super(null);
            p247y7.AbstractC7350t.f(pVar, "transform");
            p247y7.AbstractC7350t.f(interfaceC1813v, "ack");
            p247y7.AbstractC7350t.f(iVar, "callerContext");
            this.f6945a = pVar;
            this.f6946b = interfaceC1813v;
            this.f6947c = vVar;
            this.f6948d = iVar;
        }

        public final W8.InterfaceC1813v a() {
            return this.f6946b;
        }

        public final p127m7.i b() {
            return this.f6948d;
        }

        public M1.v c() {
            return this.f6947c;
        }

        public final p237x7.p d() {
            return this.f6945a;
        }
    }

    private p() {
    }

    public /* synthetic */ p(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }
}
