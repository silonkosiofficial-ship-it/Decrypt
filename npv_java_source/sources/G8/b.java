package G8;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends F8.o0, J8.q {

    public static final class a {

        /* JADX INFO: renamed from: G8.b$a$a, reason: collision with other inner class name */
        public static final class C0075a extends F8.d0.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ G8.b f3132a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ F8.n0 f3133b;

            C0075a(G8.b bVar, F8.n0 n0Var) {
                this.f3132a = bVar;
                this.f3133b = n0Var;
            }

            @Override // F8.d0.c
            public J8.j a(F8.d0 d0Var, J8.i iVar) {
                p247y7.AbstractC7350t.f(d0Var, "state");
                p247y7.AbstractC7350t.f(iVar, "type");
                G8.b bVar = this.f3132a;
                F8.n0 n0Var = this.f3133b;
                java.lang.Object objZ = bVar.z(iVar);
                p247y7.AbstractC7350t.d(objZ, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                F8.E eN = n0Var.n((F8.E) objZ, F8.u0.INVARIANT);
                p247y7.AbstractC7350t.e(eN, "safeSubstitute(...)");
                J8.j jVarB = bVar.b(eN);
                p247y7.AbstractC7350t.c(jVarB);
                return jVarB;
            }
        }

        public static boolean A(G8.b bVar, J8.i iVar, p138n8.c cVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            p247y7.AbstractC7350t.f(cVar, "fqName");
            if (iVar instanceof F8.E) {
                return ((F8.E) iVar).k().H(cVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static boolean B(G8.b bVar, J8.n nVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(nVar, "$receiver");
            if (!(nVar instanceof O7.f0)) {
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + p247y7.P.b(nVar.getClass())).toString());
            }
            if (mVar == null ? true : mVar instanceof F8.e0) {
                return K8.a.m((O7.f0) nVar, (F8.e0) mVar, null, 4, null);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + p247y7.P.b(nVar.getClass())).toString());
        }

        public static boolean C(G8.b bVar, J8.j jVar, J8.j jVar2) {
            p247y7.AbstractC7350t.f(jVar, "a");
            p247y7.AbstractC7350t.f(jVar2, "b");
            if (!(jVar instanceof F8.M)) {
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
            }
            if (jVar2 instanceof F8.M) {
                return ((F8.M) jVar).U0() == ((F8.M) jVar2).U0();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar2 + ", " + p247y7.P.b(jVar2.getClass())).toString());
        }

        public static J8.i D(G8.b bVar, java.util.List list) {
            p247y7.AbstractC7350t.f(list, "types");
            return G8.d.a(list);
        }

        public static boolean E(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                return L7.g.w0((F8.e0) mVar, L7.j.a.f6367b);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean F(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                return ((F8.e0) mVar).w() instanceof O7.InterfaceC1424e;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean G(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.e0) mVar).w();
                O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
                return (interfaceC1424e == null || !O7.E.a(interfaceC1424e) || interfaceC1424e.j() == O7.EnumC1425f.ENUM_ENTRY || interfaceC1424e.j() == O7.EnumC1425f.ANNOTATION_CLASS) ? false : true;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean H(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                return ((F8.e0) mVar).y();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean I(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return F8.G.a((F8.E) iVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static boolean J(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.e0) mVar).w();
                O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
                return (interfaceC1424e != null ? interfaceC1424e.I0() : null) instanceof O7.C1444z;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean K(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                return mVar instanceof p198t8.n;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean L(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                return mVar instanceof F8.D;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean M(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                return ((F8.M) jVar).X0();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static boolean N(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            return iVar instanceof F8.J;
        }

        public static boolean O(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                return L7.g.w0((F8.e0) mVar, L7.j.a.f6369c);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static boolean P(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return F8.q0.l((F8.E) iVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static boolean Q(G8.b bVar, J8.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "$receiver");
            return dVar instanceof p188s8.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean R(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.E) {
                return L7.g.s0((F8.E) jVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static boolean S(G8.b bVar, J8.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "$receiver");
            if (dVar instanceof G8.i) {
                return ((G8.i) dVar).i1();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + p247y7.P.b(dVar.getClass())).toString());
        }

        public static boolean T(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return iVar instanceof F8.L;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean U(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (!(jVar instanceof F8.M)) {
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
            }
            if (!F8.G.a((F8.E) jVar)) {
                F8.M m6 = (F8.M) jVar;
                if (!(m6.W0().w() instanceof O7.e0) && (m6.W0().w() != null || (jVar instanceof p188s8.a) || (jVar instanceof G8.i) || (jVar instanceof F8.C0954o) || (m6.W0() instanceof p198t8.n) || V(bVar, jVar))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean V(G8.b bVar, J8.j jVar) {
            return (jVar instanceof F8.P) && bVar.f(((F8.P) jVar).O0());
        }

        public static boolean W(G8.b bVar, J8.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "$receiver");
            if (lVar instanceof F8.i0) {
                return ((F8.i0) lVar).b();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + p247y7.P.b(lVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean X(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                return K8.a.p((F8.E) jVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                return K8.a.q((F8.E) jVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static boolean Z(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (!(iVar instanceof F8.t0)) {
                return false;
            }
            ((F8.t0) iVar).W0();
            return false;
        }

        public static boolean a(G8.b bVar, J8.m mVar, J8.m mVar2) {
            p247y7.AbstractC7350t.f(mVar, "c1");
            p247y7.AbstractC7350t.f(mVar2, "c2");
            if (!(mVar instanceof F8.e0)) {
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
            }
            if (mVar2 instanceof F8.e0) {
                return p247y7.AbstractC7350t.b(mVar, mVar2);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar2 + ", " + p247y7.P.b(mVar2.getClass())).toString());
        }

        public static boolean a0(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.e0) mVar).w();
                return interfaceC1427hW != null && L7.g.B0(interfaceC1427hW);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static int b(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return ((F8.E) iVar).U0().size();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static J8.j b0(G8.b bVar, J8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "$receiver");
            if (gVar instanceof F8.AbstractC0963y) {
                return ((F8.AbstractC0963y) gVar).e1();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + p247y7.P.b(gVar.getClass())).toString());
        }

        public static J8.k c(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                return (J8.k) jVar;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static J8.i c0(G8.b bVar, J8.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "$receiver");
            if (dVar instanceof G8.i) {
                return ((G8.i) dVar).h1();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + p247y7.P.b(dVar.getClass())).toString());
        }

        public static J8.d d(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                if (jVar instanceof F8.P) {
                    return bVar.d(((F8.P) jVar).O0());
                }
                if (jVar instanceof G8.i) {
                    return (G8.i) jVar;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static J8.i d0(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.t0) {
                return G8.c.b((F8.t0) iVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static J8.e e(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                if (jVar instanceof F8.C0954o) {
                    return (F8.C0954o) jVar;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static F8.d0 e0(G8.b bVar, boolean z6, boolean z10) {
            return G8.a.b(z6, z10, bVar, null, null, 24, null);
        }

        public static J8.f f(G8.b bVar, J8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "$receiver");
            if (gVar instanceof F8.AbstractC0963y) {
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + p247y7.P.b(gVar.getClass())).toString());
        }

        public static J8.j f0(G8.b bVar, J8.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "$receiver");
            if (eVar instanceof F8.C0954o) {
                return ((F8.C0954o) eVar).i1();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + p247y7.P.b(eVar.getClass())).toString());
        }

        public static J8.g g(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                F8.t0 t0VarZ0 = ((F8.E) iVar).Z0();
                if (t0VarZ0 instanceof F8.AbstractC0963y) {
                    return (F8.AbstractC0963y) t0VarZ0;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static int g0(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                return ((F8.e0) mVar).x().size();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static J8.j h(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                F8.t0 t0VarZ0 = ((F8.E) iVar).Z0();
                if (t0VarZ0 instanceof F8.M) {
                    return (F8.M) t0VarZ0;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static java.util.Collection h0(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            J8.m mVarE = bVar.e(jVar);
            if (mVarE instanceof p198t8.n) {
                return ((p198t8.n) mVarE).f();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static J8.l i(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return K8.a.a((F8.E) iVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static J8.l i0(G8.b bVar, J8.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "$receiver");
            if (cVar instanceof G8.j) {
                return ((G8.j) cVar).a();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + p247y7.P.b(cVar.getClass())).toString());
        }

        public static J8.j j(G8.b bVar, J8.j jVar, J8.b bVar2) {
            p247y7.AbstractC7350t.f(jVar, "type");
            p247y7.AbstractC7350t.f(bVar2, "status");
            if (jVar instanceof F8.M) {
                return G8.k.b((F8.M) jVar, bVar2);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static F8.d0.c j0(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "type");
            if (jVar instanceof F8.M) {
                return new G8.b.a.C0075a(bVar, F8.f0.f2923c.a((F8.E) jVar).c());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static J8.b k(G8.b bVar, J8.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "$receiver");
            if (dVar instanceof G8.i) {
                return ((G8.i) dVar).f1();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + p247y7.P.b(dVar.getClass())).toString());
        }

        public static java.util.Collection k0(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                java.util.Collection collectionU = ((F8.e0) mVar).u();
                p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
                return collectionU;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static J8.i l(G8.b bVar, J8.j jVar, J8.j jVar2) {
            p247y7.AbstractC7350t.f(jVar, "lowerBound");
            p247y7.AbstractC7350t.f(jVar2, "upperBound");
            if (!(jVar instanceof F8.M)) {
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + p247y7.P.b(bVar.getClass())).toString());
            }
            if (jVar2 instanceof F8.M) {
                return F8.F.d((F8.M) jVar, (F8.M) jVar2);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + p247y7.P.b(bVar.getClass())).toString());
        }

        public static J8.c l0(G8.b bVar, J8.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "$receiver");
            if (dVar instanceof G8.i) {
                return ((G8.i) dVar).W0();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + p247y7.P.b(dVar.getClass())).toString());
        }

        public static J8.l m(G8.b bVar, J8.i iVar, int i6) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return (J8.l) ((F8.E) iVar).U0().get(i6);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static J8.m m0(G8.b bVar, J8.j jVar) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                return ((F8.M) jVar).W0();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static java.util.List n(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return ((F8.E) iVar).U0();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static J8.j n0(G8.b bVar, J8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "$receiver");
            if (gVar instanceof F8.AbstractC0963y) {
                return ((F8.AbstractC0963y) gVar).f1();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + p247y7.P.b(gVar.getClass())).toString());
        }

        public static p138n8.d o(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.e0) mVar).w();
                p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return p218v8.c.m((O7.InterfaceC1424e) interfaceC1427hW);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static J8.i o0(G8.b bVar, J8.i iVar, boolean z6) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof J8.j) {
                return bVar.g((J8.j) iVar, z6);
            }
            if (!(iVar instanceof J8.g)) {
                throw new java.lang.IllegalStateException("sealed".toString());
            }
            J8.g gVar = (J8.g) iVar;
            return bVar.P(bVar.g(bVar.c(gVar), z6), bVar.g(bVar.a(gVar), z6));
        }

        public static J8.n p(G8.b bVar, J8.m mVar, int i6) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                java.lang.Object obj = ((F8.e0) mVar).x().get(i6);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                return (J8.n) obj;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static J8.j p0(G8.b bVar, J8.j jVar, boolean z6) {
            p247y7.AbstractC7350t.f(jVar, "$receiver");
            if (jVar instanceof F8.M) {
                return ((F8.M) jVar).a1(z6);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + p247y7.P.b(jVar.getClass())).toString());
        }

        public static java.util.List q(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                java.util.List listX = ((F8.e0) mVar).x();
                p247y7.AbstractC7350t.e(listX, "getParameters(...)");
                return listX;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static L7.h r(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.e0) mVar).w();
                p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return L7.g.P((O7.InterfaceC1424e) interfaceC1427hW);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static L7.h s(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.e0) mVar).w();
                p247y7.AbstractC7350t.d(interfaceC1427hW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return L7.g.S((O7.InterfaceC1424e) interfaceC1427hW);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static J8.i t(G8.b bVar, J8.n nVar) {
            p247y7.AbstractC7350t.f(nVar, "$receiver");
            if (nVar instanceof O7.f0) {
                return K8.a.j((O7.f0) nVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + p247y7.P.b(nVar.getClass())).toString());
        }

        public static J8.i u(G8.b bVar, J8.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "$receiver");
            if (lVar instanceof F8.i0) {
                return ((F8.i0) lVar).getType().Z0();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + p247y7.P.b(lVar.getClass())).toString());
        }

        public static J8.n v(G8.b bVar, J8.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "$receiver");
            if (mVar instanceof F8.e0) {
                O7.InterfaceC1427h interfaceC1427hW = ((F8.e0) mVar).w();
                if (interfaceC1427hW instanceof O7.f0) {
                    return (O7.f0) interfaceC1427hW;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + p247y7.P.b(mVar.getClass())).toString());
        }

        public static J8.i w(G8.b bVar, J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "$receiver");
            if (iVar instanceof F8.E) {
                return p178r8.h.k((F8.E) iVar);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + p247y7.P.b(iVar.getClass())).toString());
        }

        public static java.util.List x(G8.b bVar, J8.n nVar) {
            p247y7.AbstractC7350t.f(nVar, "$receiver");
            if (nVar instanceof O7.f0) {
                java.util.List upperBounds = ((O7.f0) nVar).getUpperBounds();
                p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + p247y7.P.b(nVar.getClass())).toString());
        }

        public static J8.s y(G8.b bVar, J8.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "$receiver");
            if (lVar instanceof F8.i0) {
                F8.u0 u0VarA = ((F8.i0) lVar).a();
                p247y7.AbstractC7350t.e(u0VarA, "getProjectionKind(...)");
                return J8.p.a(u0VarA);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + p247y7.P.b(lVar.getClass())).toString());
        }

        public static J8.s z(G8.b bVar, J8.n nVar) {
            p247y7.AbstractC7350t.f(nVar, "$receiver");
            if (nVar instanceof O7.f0) {
                F8.u0 u0VarS = ((O7.f0) nVar).s();
                p247y7.AbstractC7350t.e(u0VarS, "getVariance(...)");
                return J8.p.a(u0VarS);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + p247y7.P.b(nVar.getClass())).toString());
        }
    }

    J8.i P(J8.j jVar, J8.j jVar2);

    @Override // J8.o
    J8.j a(J8.g gVar);

    @Override // J8.o
    J8.j b(J8.i iVar);

    @Override // J8.o
    J8.j c(J8.g gVar);

    @Override // J8.o
    J8.d d(J8.j jVar);

    @Override // J8.o
    J8.m e(J8.j jVar);

    @Override // J8.o
    boolean f(J8.j jVar);

    @Override // J8.o
    J8.j g(J8.j jVar, boolean z6);
}
