package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.InterfaceC7175j f3664a = p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(H.G.b.f3677D), null, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f3665b = Y0.i.q(2);

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p141o0.AbstractC6984n0 f3666D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ H.C1230w f3667E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ S0.V f3668F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ S0.L f3669G;

        /* JADX INFO: renamed from: H.G$a$a, reason: collision with other inner class name */
        static final class C0077a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f3670G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ K.C1293o f3671H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0077a(K.C1293o c1293o, p127m7.e eVar) {
                super(2, eVar);
                this.f3671H = c1293o;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f3670G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    K.C1293o c1293o = this.f3671H;
                    this.f3670G = 1;
                    if (c1293o.e(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((H.G.a.C0077a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new H.G.a.C0077a(this.f3671H, eVar);
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ K.C1293o f3672D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ S0.L f3673E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ S0.V f3674F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ H.C1230w f3675G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p141o0.AbstractC6984n0 f3676H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(K.C1293o c1293o, S0.L l6, S0.V v6, H.C1230w c1230w, p141o0.AbstractC6984n0 abstractC6984n0) {
                super(1);
                this.f3672D = c1293o;
                this.f3673E = l6;
                this.f3674F = v6;
                this.f3675G = c1230w;
                this.f3676H = abstractC6984n0;
            }

            public final void a(p161q0.c cVar) {
                p131n0.i iVar;
                M0.K kF;
                cVar.l1();
                float fC = this.f3672D.c();
                if (fC == 0.0f) {
                    return;
                }
                int iB = this.f3673E.b(M0.N.n(this.f3674F.h()));
                H.V vJ = this.f3675G.j();
                if (vJ == null || (kF = vJ.f()) == null || (iVar = kF.e(iB)) == null) {
                    iVar = new p131n0.i(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fB0 = cVar.B0(H.G.b());
                float f6 = fB0 / 2;
                float fC2 = E7.j.c(E7.j.f(iVar.i() + f6, p131n0.m.i(cVar.i()) - f6), f6);
                p161q0.f.h(cVar, this.f3676H, p131n0.h.a(fC2, iVar.l()), p131n0.h.a(fC2, iVar.e()), fB0, 0, null, fC, null, 0, 432, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p161q0.c) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p141o0.AbstractC6984n0 abstractC6984n0, H.C1230w c1230w, S0.V v6, S0.L l6) {
            super(3);
            this.f3666D = abstractC6984n0;
            this.f3667E = c1230w;
            this.f3668F = v6;
            this.f3669G = l6;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v15 ??, still in use, count: 1, list:
              (r11v15 ?? I:java.lang.Object) from 0x00d3: INVOKE (r10v0 ?? I:V.n), (r11v15 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v15 ??, still in use, count: 1, list:
              (r11v15 ?? I:java.lang.Object) from 0x00d3: INVOKE (r10v0 ?? I:V.n), (r11v15 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
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

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final H.G.b f3677D = new H.G.b();

        b() {
            super(1);
        }

        public final void a(u.W.b bVar) {
            bVar.d(1000);
            java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
            bVar.f(fValueOf, 0);
            bVar.f(fValueOf, 499);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
            bVar.f(fValueOf2, 500);
            bVar.f(fValueOf2, 999);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((u.W.b) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, H.C1230w c1230w, S0.V v6, S0.L l6, p141o0.AbstractC6984n0 abstractC6984n0, boolean z6) {
        return z6 ? androidx.compose.ui.c.c(dVar, null, new H.G.a(abstractC6984n0, c1230w, v6, l6), 1, null) : dVar;
    }

    public static final float b() {
        return f3665b;
    }
}
