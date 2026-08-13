package androidx.compose.ui;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.d.a f19586a = androidx.compose.ui.d.a.f19587b;

    public static final class a implements androidx.compose.ui.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ androidx.compose.ui.d.a f19587b = new androidx.compose.ui.d.a();

        private a() {
        }

        @Override // androidx.compose.ui.d
        public androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
            return dVar;
        }

        @Override // androidx.compose.ui.d
        public java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
            return obj;
        }

        @Override // androidx.compose.ui.d
        public boolean d(p237x7.l lVar) {
            return true;
        }

        public java.lang.String toString() {
            return "Modifier";
        }
    }

    public interface b extends androidx.compose.ui.d {
    }

    public static abstract class c implements F0.InterfaceC0924j {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private W8.N f19589D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f19590E;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private androidx.compose.ui.d.c f19592G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private androidx.compose.ui.d.c f19593H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private F0.k0 f19594I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private F0.AbstractC0914d0 f19595J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private boolean f19596K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private boolean f19597L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private boolean f19598M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private boolean f19599N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f19600O;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private androidx.compose.ui.d.c f19588C = this;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f19591F = -1;

        public final boolean A1() {
            return this.f19600O;
        }

        public void B1() {
            if (!(!this.f19600O)) {
                C0.a.b("node attached multiple times");
            }
            if (!(this.f19595J != null)) {
                C0.a.b("attach invoked on a node without a coordinator");
            }
            this.f19600O = true;
            this.f19598M = true;
        }

        public void C1() {
            if (!this.f19600O) {
                C0.a.b("Cannot detach a node that is not attached");
            }
            if (!(!this.f19598M)) {
                C0.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (!(!this.f19599N)) {
                C0.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f19600O = false;
            W8.N n6 = this.f19589D;
            if (n6 != null) {
                W8.O.d(n6, new p071h0.h());
                this.f19589D = null;
            }
        }

        public void D1() {
        }

        @Override // F0.InterfaceC0924j
        public final androidx.compose.ui.d.c E0() {
            return this.f19588C;
        }

        public void E1() {
        }

        public void F1() {
        }

        public void G1() {
            if (!this.f19600O) {
                C0.a.b("reset() called on an unattached node");
            }
            F1();
        }

        public void H1() {
            if (!this.f19600O) {
                C0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f19598M) {
                C0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f19598M = false;
            D1();
            this.f19599N = true;
        }

        public void I1() {
            if (!this.f19600O) {
                C0.a.b("node detached multiple times");
            }
            if (!(this.f19595J != null)) {
                C0.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f19599N) {
                C0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f19599N = false;
            E1();
        }

        public final void J1(int i6) {
            this.f19591F = i6;
        }

        public void K1(androidx.compose.ui.d.c cVar) {
            this.f19588C = cVar;
        }

        public final void L1(androidx.compose.ui.d.c cVar) {
            this.f19593H = cVar;
        }

        public final void M1(boolean z6) {
            this.f19596K = z6;
        }

        public final void N1(int i6) {
            this.f19590E = i6;
        }

        public final void O1(F0.k0 k0Var) {
            this.f19594I = k0Var;
        }

        public final void P1(androidx.compose.ui.d.c cVar) {
            this.f19592G = cVar;
        }

        public final void Q1(boolean z6) {
            this.f19597L = z6;
        }

        public final void R1(p237x7.a aVar) {
            F0.AbstractC0925k.n(this).x(aVar);
        }

        public void S1(F0.AbstractC0914d0 abstractC0914d0) {
            this.f19595J = abstractC0914d0;
        }

        public final int q1() {
            return this.f19591F;
        }

        public final androidx.compose.ui.d.c r1() {
            return this.f19593H;
        }

        public final F0.AbstractC0914d0 s1() {
            return this.f19595J;
        }

        public final W8.N t1() {
            W8.N n6 = this.f19589D;
            if (n6 != null) {
                return n6;
            }
            W8.N nA = W8.O.a(F0.AbstractC0925k.n(this).getCoroutineContext().o0(W8.C0.a((W8.InterfaceC1822z0) F0.AbstractC0925k.n(this).getCoroutineContext().i(W8.InterfaceC1822z0.f15544h))));
            this.f19589D = nA;
            return nA;
        }

        public final boolean u1() {
            return this.f19596K;
        }

        public final int v1() {
            return this.f19590E;
        }

        public final F0.k0 w1() {
            return this.f19594I;
        }

        public final androidx.compose.ui.d.c x1() {
            return this.f19592G;
        }

        public boolean y1() {
            return true;
        }

        public final boolean z1() {
            return this.f19597L;
        }
    }

    androidx.compose.ui.d b(androidx.compose.ui.d dVar);

    java.lang.Object c(java.lang.Object obj, p237x7.p pVar);

    boolean d(p237x7.l lVar);
}
