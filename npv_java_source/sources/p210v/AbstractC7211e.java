package p210v;

/* JADX INFO: renamed from: v.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7211e {

    /* JADX INFO: renamed from: v.e$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p210v.AbstractC7211e.a f55684D = new p210v.AbstractC7211e.a();

        a() {
            super(1);
        }

        public final void a(p161q0.c cVar) {
            cVar.l1();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: v.e$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p141o0.AbstractC6984n0 f55685D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f55686E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f55687F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p161q0.h f55688G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, p161q0.h hVar) {
            super(1);
            this.f55685D = abstractC6984n0;
            this.f55686E = j6;
            this.f55687F = j10;
            this.f55688G = hVar;
        }

        public final void a(p161q0.c cVar) {
            cVar.l1();
            p161q0.f.l(cVar, this.f55685D, this.f55686E, this.f55687F, 0.0f, this.f55688G, null, 0, 104, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.c) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, p210v.C7213g c7213g, p141o0.e2 e2Var) {
        return f(dVar, c7213g.b(), c7213g.a(), e2Var);
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, float f6, p141o0.AbstractC6984n0 abstractC6984n0, p141o0.e2 e2Var) {
        return dVar.b(new androidx.compose.foundation.BorderModifierNodeElement(f6, abstractC6984n0, e2Var, null));
    }

    private static final p131n0.k g(float f6, p131n0.k kVar) {
        return new p131n0.k(f6, f6, kVar.j() - f6, kVar.d() - f6, k(kVar.h(), f6), k(kVar.i(), f6), k(kVar.c(), f6), k(kVar.b(), f6), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p141o0.Q1 h(p141o0.Q1 q6, p131n0.k kVar, float f6, boolean z6) {
        q6.a();
        p141o0.P1.c(q6, kVar, null, 2, null);
        if (!z6) {
            p141o0.Q1 q1A = p141o0.Y.a();
            p141o0.P1.c(q1A, g(f6, kVar), null, 2, null);
            q6.j(q6, q1A, p141o0.U1.f52166a.a());
        }
        return q6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p111l0.h i(p111l0.d dVar) {
        return dVar.s(p210v.AbstractC7211e.a.f55684D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p111l0.h j(p111l0.d dVar, p141o0.AbstractC6984n0 abstractC6984n0, long j6, long j10, boolean z6, float f6) {
        return dVar.s(new p210v.AbstractC7211e.b(abstractC6984n0, z6 ? p131n0.g.f51312b.c() : j6, z6 ? dVar.i() : j10, z6 ? p161q0.l.f52928a : new p161q0.m(f6, 0.0f, 0, 0, null, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j6, float f6) {
        return p131n0.b.a(java.lang.Math.max(0.0f, p131n0.a.d(j6) - f6), java.lang.Math.max(0.0f, p131n0.a.e(j6) - f6));
    }
}
