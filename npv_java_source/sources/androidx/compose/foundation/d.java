package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f18924D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18925E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ K0.h f18926F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18927G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
            super(3);
            this.f18924D = z6;
            this.f18925E = str;
            this.f18926F = hVar;
            this.f18927G = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            p250z.l lVar;
            interfaceC1734n.T(-756081143);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-756081143, i6, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            p210v.G g6 = (p210v.G) interfaceC1734n.n(androidx.compose.foundation.h.a());
            if (g6 instanceof p210v.I) {
                interfaceC1734n.T(617140216);
                interfaceC1734n.J();
                lVar = null;
            } else {
                interfaceC1734n.T(617248189);
                java.lang.Object objG = interfaceC1734n.g();
                if (objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = p250z.k.a();
                    interfaceC1734n.K(objG);
                }
                lVar = (p250z.l) objG;
                interfaceC1734n.J();
            }
            androidx.compose.ui.d dVarA = androidx.compose.foundation.d.a(androidx.compose.ui.d.f19586a, lVar, g6, this.f18924D, this.f18925E, this.f18926F, this.f18927G);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarA;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p210v.G f18928D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f18929E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18930F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ K0.h f18931G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18932H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p210v.G g6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
            super(3);
            this.f18928D = g6;
            this.f18929E = z6;
            this.f18930F = str;
            this.f18931G = hVar;
            this.f18932H = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-1525724089);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1525724089, i6, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            java.lang.Object objG = interfaceC1734n.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = p250z.k.a();
                interfaceC1734n.K(objG);
            }
            p250z.l lVar = (p250z.l) objG;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, this.f18928D).b(new androidx.compose.foundation.ClickableElement(lVar, null, this.f18929E, this.f18930F, this.f18931G, this.f18932H, null));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarB;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f18933D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18934E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ K0.h f18935F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18936G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
            super(1);
            this.f18933D = z6;
            this.f18934E = str;
            this.f18935F = hVar;
            this.f18936G = aVar;
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.d$d, reason: collision with other inner class name */
    static final class C0357d extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f18937D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18938E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ K0.h f18939F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18940G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18941H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18942I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18943J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0357d(boolean z6, java.lang.String str, K0.h hVar, java.lang.String str2, p237x7.a aVar, p237x7.a aVar2, p237x7.a aVar3) {
            super(3);
            this.f18937D = z6;
            this.f18938E = str;
            this.f18939F = hVar;
            this.f18940G = str2;
            this.f18941H = aVar;
            this.f18942I = aVar2;
            this.f18943J = aVar3;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            p250z.l lVar;
            interfaceC1734n.T(1969174843);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1969174843, i6, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
            }
            p210v.G g6 = (p210v.G) interfaceC1734n.n(androidx.compose.foundation.h.a());
            if (g6 instanceof p210v.I) {
                interfaceC1734n.T(-1726989699);
                interfaceC1734n.J();
                lVar = null;
            } else {
                interfaceC1734n.T(-1726881726);
                java.lang.Object objG = interfaceC1734n.g();
                if (objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = p250z.k.a();
                    interfaceC1734n.K(objG);
                }
                lVar = (p250z.l) objG;
                interfaceC1734n.J();
            }
            androidx.compose.ui.d dVarE = androidx.compose.foundation.d.e(androidx.compose.ui.d.f19586a, lVar, g6, this.f18937D, this.f18938E, this.f18939F, this.f18940G, this.f18941H, this.f18942I, this.f18943J);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarE;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final class e extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p210v.G f18944D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f18945E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18946F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ K0.h f18947G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18948H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18949I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18950J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18951K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p210v.G g6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, java.lang.String str2, p237x7.a aVar2, p237x7.a aVar3) {
            super(3);
            this.f18944D = g6;
            this.f18945E = z6;
            this.f18946F = str;
            this.f18947G = hVar;
            this.f18948H = aVar;
            this.f18949I = str2;
            this.f18950J = aVar2;
            this.f18951K = aVar3;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-1525724089);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1525724089, i6, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            java.lang.Object objG = interfaceC1734n.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = p250z.k.a();
                interfaceC1734n.K(objG);
            }
            p250z.l lVar = (p250z.l) objG;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, this.f18944D).b(new androidx.compose.foundation.CombinedClickableElement(lVar, null, this.f18945E, this.f18946F, this.f18947G, this.f18948H, this.f18949I, this.f18950J, this.f18951K, null));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarB;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f18952D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18953E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ K0.h f18954F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18955G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18956H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.a f18957I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.lang.String f18958J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, p237x7.a aVar2, p237x7.a aVar3, java.lang.String str2) {
            super(1);
            this.f18952D = z6;
            this.f18953E = str;
            this.f18954F = hVar;
            this.f18955G = aVar;
            this.f18956H = aVar2;
            this.f18957I = aVar3;
            this.f18958J = str2;
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.K f18959D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p247y7.K k6) {
            super(1);
            this.f18959D = k6;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F0.E0 e6) {
            boolean z6;
            p247y7.K k6 = this.f18959D;
            if (k6.f57250C) {
                z6 = true;
            } else {
                p247y7.AbstractC7350t.d(e6, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                if (((p230x.x) e6).T1()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            k6.f57250C = z6;
            return java.lang.Boolean.valueOf(!this.f18959D.f57250C);
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p250z.l lVar, p210v.G g6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
        androidx.compose.ui.d dVarB;
        if (g6 instanceof p210v.I) {
            dVarB = new androidx.compose.foundation.ClickableElement(lVar, (p210v.I) g6, z6, str, hVar, aVar, null);
        } else if (g6 == null) {
            dVarB = new androidx.compose.foundation.ClickableElement(lVar, null, z6, str, hVar, aVar, null);
        } else {
            dVarB = lVar != null ? androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, g6).b(new androidx.compose.foundation.ClickableElement(lVar, null, z6, str, hVar, aVar, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.f19586a, null, new androidx.compose.foundation.d.b(g6, z6, str, hVar, aVar), 1, null);
        }
        return dVar.b(dVarB);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, p250z.l lVar, p210v.G g6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        return a(dVar, lVar, g6, z6, (i6 & 8) != 0 ? null : str, (i6 & 16) != 0 ? null : hVar, aVar);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new androidx.compose.foundation.d.c(z6, str, hVar, aVar) : androidx.compose.ui.platform.E0.a(), new androidx.compose.foundation.d.a(z6, str, hVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        if ((i6 & 2) != 0) {
            str = null;
        }
        if ((i6 & 4) != 0) {
            hVar = null;
        }
        return c(dVar, z6, str, hVar, aVar);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, p250z.l lVar, p210v.G g6, boolean z6, java.lang.String str, K0.h hVar, java.lang.String str2, p237x7.a aVar, p237x7.a aVar2, p237x7.a aVar3) {
        androidx.compose.ui.d dVarB;
        if (g6 instanceof p210v.I) {
            dVarB = new androidx.compose.foundation.CombinedClickableElement(lVar, (p210v.I) g6, z6, str, hVar, aVar3, str2, aVar, aVar2, null);
        } else if (g6 == null) {
            dVarB = new androidx.compose.foundation.CombinedClickableElement(lVar, null, z6, str, hVar, aVar3, str2, aVar, aVar2, null);
        } else {
            dVarB = lVar != null ? androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, g6).b(new androidx.compose.foundation.CombinedClickableElement(lVar, null, z6, str, hVar, aVar3, str2, aVar, aVar2, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.f19586a, null, new androidx.compose.foundation.d.e(g6, z6, str, hVar, aVar3, str2, aVar, aVar2), 1, null);
        }
        return dVar.b(dVarB);
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, boolean z6, java.lang.String str, K0.h hVar, java.lang.String str2, p237x7.a aVar, p237x7.a aVar2, p237x7.a aVar3) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new androidx.compose.foundation.d.f(z6, str, hVar, aVar3, aVar2, aVar, str2) : androidx.compose.ui.platform.E0.a(), new androidx.compose.foundation.d.C0357d(z6, str, hVar, str2, aVar, aVar2, aVar3));
    }

    public static final boolean h(F0.E0 e6) {
        p247y7.K k6 = new p247y7.K();
        F0.F0.c(e6, p230x.x.f56598R, new androidx.compose.foundation.d.g(k6));
        return k6.f57250C;
    }
}
