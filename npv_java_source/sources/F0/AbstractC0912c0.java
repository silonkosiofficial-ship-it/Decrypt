package F0;

/* JADX INFO: renamed from: F0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0912c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F0.AbstractC0912c0.a f2571a;

    /* JADX INFO: renamed from: F0.c0$a */
    public static final class a extends androidx.compose.ui.d.c {
        a() {
        }

        public java.lang.String toString() {
            return "<Head>";
        }
    }

    /* JADX INFO: renamed from: F0.c0$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ X.b f2572D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X.b bVar) {
            super(1);
            this.f2572D = bVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(androidx.compose.ui.d.b bVar) {
            this.f2572D.d(bVar);
            return java.lang.Boolean.TRUE;
        }
    }

    static {
        F0.AbstractC0912c0.a aVar = new F0.AbstractC0912c0.a();
        aVar.J1(-1);
        f2571a = aVar;
    }

    public static final int d(androidx.compose.ui.d.b bVar, androidx.compose.ui.d.b bVar2) {
        if (p247y7.AbstractC7350t.b(bVar, bVar2)) {
            return 2;
        }
        return p071h0.b.a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X.b e(androidx.compose.ui.d dVar, X.b bVar) {
        X.b bVar2 = new X.b(new androidx.compose.ui.d[E7.j.d(bVar.t(), 16)], 0);
        bVar2.d(dVar);
        F0.AbstractC0912c0.b bVar3 = null;
        while (bVar2.x()) {
            androidx.compose.ui.d dVar2 = (androidx.compose.ui.d) bVar2.D(bVar2.t() - 1);
            if (dVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) dVar2;
                bVar2.d(aVar.g());
                bVar2.d(aVar.j());
            } else if (dVar2 instanceof androidx.compose.ui.d.b) {
                bVar.d(dVar2);
            } else {
                if (bVar3 == null) {
                    bVar3 = new F0.AbstractC0912c0.b(bVar);
                }
                dVar2.d(bVar3);
                bVar3 = bVar3;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(F0.W w6, androidx.compose.ui.d.c cVar) {
        p247y7.AbstractC7350t.d(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        w6.j(cVar);
    }
}
