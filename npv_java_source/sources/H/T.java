package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ M0.P f3777D;

        /* JADX INFO: renamed from: H.T$a$a, reason: collision with other inner class name */
        static final class C0088a extends p247y7.AbstractC7352v implements p237x7.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ H.S f3778D;

            /* JADX INFO: renamed from: H.T$a$a$a, reason: collision with other inner class name */
            static final class C0089a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ D0.X f3779D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0089a(D0.X x6) {
                    super(1);
                    this.f3779D = x6;
                }

                public final void a(D0.X.a aVar) {
                    D0.X.a.l(aVar, this.f3779D, 0, 0, 0.0f, 4, null);
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a((D0.X.a) obj);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0088a(H.S s6) {
                super(3);
                this.f3778D = s6;
            }

            public final D0.K a(D0.M m6, D0.G g6, long j6) {
                long jB = this.f3778D.b();
                D0.X xU = g6.U(Y0.C1859b.d(j6, E7.j.k(Y0.t.g(jB), Y0.C1859b.n(j6), Y0.C1859b.l(j6)), 0, E7.j.k(Y0.t.f(jB), Y0.C1859b.m(j6), Y0.C1859b.k(j6)), 0, 10, null));
                return D0.L.b(m6, xU.I0(), xU.w0(), null, new H.T.a.C0088a.C0089a(xU), 4, null);
            }

            @Override // p237x7.q
            public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return a((D0.M) obj, (D0.G) obj2, ((Y0.C1859b) obj3).r());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(M0.P p6) {
            super(3);
            this.f3777D = p6;
        }

        private static final java.lang.Object e(V.G1 g6) {
            return g6.getValue();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
              (r10v2 ?? I:java.lang.Object) from 0x00c4: INVOKE (r13v0 ?? I:V.n), (r10v2 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final androidx.compose.ui.d a(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
              (r10v2 ?? I:java.lang.Object) from 0x00c4: INVOKE (r13v0 ?? I:V.n), (r10v2 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, M0.P p6) {
        return androidx.compose.ui.c.c(dVar, null, new H.T.a(p6), 1, null);
    }
}
