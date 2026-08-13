package androidx.compose.ui;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.c.a f19584D = new androidx.compose.ui.c.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(androidx.compose.ui.d.b bVar) {
            return java.lang.Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1734n f19585D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.InterfaceC1734n interfaceC1734n) {
            super(2);
            this.f19585D = interfaceC1734n;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.d u(androidx.compose.ui.d dVar, androidx.compose.ui.d.b bVar) {
            boolean z6 = bVar instanceof androidx.compose.ui.b;
            androidx.compose.ui.d dVarD = bVar;
            if (z6) {
                p237x7.q qVarG = ((androidx.compose.ui.b) bVar).g();
                p247y7.AbstractC7350t.d(qVarG, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                dVarD = androidx.compose.ui.c.d(this.f19585D, (androidx.compose.ui.d) ((p237x7.q) p247y7.W.f(qVarG, 3)).j(androidx.compose.ui.d.f19586a, this.f19585D, 0));
            }
            return dVar.b(dVarD);
        }
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, p237x7.l lVar, p237x7.q qVar) {
        return dVar.b(new androidx.compose.ui.b(lVar, qVar));
    }

    public static /* synthetic */ androidx.compose.ui.d c(androidx.compose.ui.d dVar, p237x7.l lVar, p237x7.q qVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            lVar = androidx.compose.ui.platform.E0.a();
        }
        return b(dVar, lVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d d(V.InterfaceC1734n interfaceC1734n, androidx.compose.ui.d dVar) {
        if (dVar.d(androidx.compose.ui.c.a.f19584D)) {
            return dVar;
        }
        interfaceC1734n.f(1219399079);
        androidx.compose.ui.d dVar2 = (androidx.compose.ui.d) dVar.c(androidx.compose.ui.d.f19586a, new androidx.compose.ui.c.b(interfaceC1734n));
        interfaceC1734n.P();
        return dVar2;
    }

    public static final androidx.compose.ui.d e(V.InterfaceC1734n interfaceC1734n, androidx.compose.ui.d dVar) {
        interfaceC1734n.T(439770924);
        androidx.compose.ui.d dVarD = d(interfaceC1734n, dVar);
        interfaceC1734n.J();
        return dVarD;
    }
}
