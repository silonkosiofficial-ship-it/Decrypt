package M0;

/* JADX INFO: loaded from: classes.dex */
public interface I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M0.I.a f6638a = M0.I.a.f6639a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ M0.I.a f6639a = new M0.I.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final M0.I f6640b = new M0.I() { // from class: M0.F
            @Override // M0.I
            public final boolean a(p131n0.i iVar, p131n0.i iVar2) {
                return M0.I.a.d(iVar, iVar2);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final M0.I f6641c = new M0.I() { // from class: M0.G
            @Override // M0.I
            public final boolean a(p131n0.i iVar, p131n0.i iVar2) {
                return M0.I.a.e(iVar, iVar2);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final M0.I f6642d = new M0.I() { // from class: M0.H
            @Override // M0.I
            public final boolean a(p131n0.i iVar, p131n0.i iVar2) {
                return M0.I.a.f(iVar, iVar2);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(p131n0.i iVar, p131n0.i iVar2) {
            return iVar.r(iVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(p131n0.i iVar, p131n0.i iVar2) {
            return !iVar2.q() && iVar.i() >= iVar2.i() && iVar.j() <= iVar2.j() && iVar.l() >= iVar2.l() && iVar.e() <= iVar2.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(p131n0.i iVar, p131n0.i iVar2) {
            return iVar2.b(iVar.g());
        }

        public final M0.I g() {
            return f6640b;
        }

        public final M0.I h() {
            return f6642d;
        }
    }

    boolean a(p131n0.i iVar, p131n0.i iVar2);
}
