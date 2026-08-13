package B9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static final class a implements androidx.lifecycle.InterfaceC2073e {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p040e.x f974C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ B9.f f975D;

        a(p040e.x xVar, B9.f fVar) {
            this.f974C = xVar;
            this.f975D = fVar;
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void D(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.b(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void H(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.e(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void f(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.d(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public void g(androidx.lifecycle.r rVar) {
            p247y7.AbstractC7350t.f(rVar, "owner");
            androidx.lifecycle.AbstractC2072d.a(this, rVar);
            this.f974C.h(rVar, this.f975D.j());
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void o(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.c(this, rVar);
        }

        @Override // androidx.lifecycle.InterfaceC2073e
        public /* synthetic */ void y(androidx.lifecycle.r rVar) {
            androidx.lifecycle.AbstractC2072d.f(this, rVar);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f976G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ B9.f f977H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ V.G1 f978I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B9.f fVar, V.G1 g6, p127m7.e eVar) {
            super(2, eVar);
            this.f977H = fVar;
            this.f978I = g6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f976G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            this.f977H.j().j(B9.d.e(this.f978I));
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((B9.d.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new B9.d.b(this.f977H, this.f978I, eVar);
        }
    }

    static final class c implements p237x7.p {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p237x7.p f979C;

        c(p237x7.p pVar) {
            this.f979C = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-397913119, i6, -1, "moe.tlaster.precompose.PreComposeApp.<anonymous> (PreComposeApp.android.kt:48)");
            }
            this.f979C.u(interfaceC1734n, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: B9.d$d, reason: collision with other inner class name */
    public static final class C0017d implements V.M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.AbstractC2079k f980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B9.d.a f981b;

        public C0017d(androidx.lifecycle.AbstractC2079k abstractC2079k, B9.d.a aVar) {
            this.f980a = abstractC2079k;
            this.f981b = aVar;
        }

        @Override // V.M
        public void e() {
            this.f980a.d(this.f981b);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(final p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, final int i6, final int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-34648287);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.l(pVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i11 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                pVar = B9.a.f965a.a();
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-34648287, i11, -1, "moe.tlaster.precompose.PreComposeApp (PreComposeApp.android.kt:19)");
            }
            interfaceC1734nR.f(1729797275);
            androidx.lifecycle.Y yA = p033d2.a.f44287a.a(interfaceC1734nR, 6);
            if (yA == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.T tB = p033d2.c.b(p247y7.P.b(B9.f.class), yA, null, null, yA instanceof androidx.lifecycle.InterfaceC2077i ? ((androidx.lifecycle.InterfaceC2077i) yA).k() : p023c2.a.C0466a.f24405b, interfaceC1734nR, 0, 0);
            interfaceC1734nR.P();
            final B9.f fVar = (B9.f) tB;
            final androidx.lifecycle.AbstractC2079k abstractC2079kU = ((androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a())).u();
            p040e.A a6 = p050f.b.f44771a.a(interfaceC1734nR, p050f.b.f44773c);
            if (a6 == null) {
                throw new java.lang.IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            final p040e.x xVarB = a6.b();
            interfaceC1734nR.T(-1752806638);
            boolean zL = interfaceC1734nR.l(xVarB) | interfaceC1734nR.l(fVar) | interfaceC1734nR.l(abstractC2079kU);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new p237x7.l() { // from class: B9.b
                    @Override // p237x7.l
                    public final java.lang.Object l(java.lang.Object obj) {
                        return B9.d.d(abstractC2079kU, xVarB, fVar, (V.N) obj);
                    }
                };
                interfaceC1734nR.K(objG);
            }
            interfaceC1734nR.J();
            V.Q.b(abstractC2079kU, (p237x7.l) objG, interfaceC1734nR, 0);
            V.G1 g1A = V.v1.a(fVar.c().b(), java.lang.Boolean.FALSE, null, interfaceC1734nR, 48, 2);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(e(g1A));
            interfaceC1734nR.T(-1752790188);
            boolean zL2 = interfaceC1734nR.l(fVar) | interfaceC1734nR.S(g1A);
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (zL2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                objG2 = new B9.d.b(fVar, g1A, null);
                interfaceC1734nR.K(objG2);
            }
            interfaceC1734nR.J();
            V.Q.e(boolValueOf, (p237x7.p) objG2, interfaceC1734nR, 0);
            V.AbstractC1756y.a(F9.e.c().d(fVar), p031d0.c.e(-397913119, true, new B9.d.c(pVar), interfaceC1734nR, 54), interfaceC1734nR, V.P0.f14698i | 48);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new p237x7.p() { // from class: B9.c
                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return B9.d.f(pVar, i6, i10, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.M d(androidx.lifecycle.AbstractC2079k abstractC2079k, p040e.x xVar, B9.f fVar, V.N n6) {
        p247y7.AbstractC7350t.f(n6, "$this$DisposableEffect");
        B9.d.a aVar = new B9.d.a(xVar, fVar);
        abstractC2079k.a(aVar);
        return new B9.d.C0017d(abstractC2079k, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(V.G1 g6) {
        return ((java.lang.Boolean) g6.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M f(p237x7.p pVar, int i6, int i10, V.InterfaceC1734n interfaceC1734n, int i11) {
        c(pVar, interfaceC1734n, V.S0.a(i6 | 1), i10);
        return p087i7.M.f46721a;
    }
}
