package p188s8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F8.i0 f54408D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F8.i0 i0Var) {
            super(0);
            this.f54408D = i0Var;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E b() {
            F8.E type = this.f54408D.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            return type;
        }
    }

    public static final class b extends F8.AbstractC0955p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f54409d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(F8.l0 l0Var, boolean z6) {
            super(l0Var);
            this.f54409d = z6;
        }

        @Override // F8.l0
        public boolean b() {
            return this.f54409d;
        }

        @Override // F8.AbstractC0955p, F8.l0
        public F8.i0 e(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "key");
            F8.i0 i0VarE = super.e(e6);
            if (i0VarE == null) {
                return null;
            }
            O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
            return p188s8.d.b(i0VarE, interfaceC1427hW instanceof O7.f0 ? (O7.f0) interfaceC1427hW : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F8.i0 b(F8.i0 i0Var, O7.f0 f0Var) {
        if (f0Var == null || i0Var.a() == F8.u0.INVARIANT) {
            return i0Var;
        }
        if (f0Var.s() != i0Var.a()) {
            return new F8.k0(c(i0Var));
        }
        if (!i0Var.b()) {
            return new F8.k0(i0Var.getType());
        }
        E8.n nVar = E8.f.f2273e;
        p247y7.AbstractC7350t.e(nVar, "NO_LOCKS");
        return new F8.k0(new F8.H(nVar, new s8.d.a(i0Var)));
    }

    public static final F8.E c(F8.i0 i0Var) {
        p247y7.AbstractC7350t.f(i0Var, "typeProjection");
        return new p188s8.a(i0Var, null, false, null, 14, null);
    }

    public static final boolean d(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        return e6.W0() instanceof p188s8.b;
    }

    public static final F8.l0 e(F8.l0 l0Var, boolean z6) {
        p247y7.AbstractC7350t.f(l0Var, "<this>");
        if (!(l0Var instanceof F8.C)) {
            return new s8.d.b(l0Var, z6);
        }
        F8.C c6 = (F8.C) l0Var;
        O7.f0[] f0VarArrJ = c6.j();
        java.util.List<p087i7.u> listH1 = p097j7.AbstractC6872n.h1(c6.i(), c6.j());
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listH1, 10));
        for (p087i7.u uVar : listH1) {
            arrayList.add(b((F8.i0) uVar.c(), (O7.f0) uVar.d()));
        }
        return new F8.C(f0VarArrJ, (F8.i0[]) arrayList.toArray(new F8.i0[0]), z6);
    }

    public static /* synthetic */ F8.l0 f(F8.l0 l0Var, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return e(l0Var, z6);
    }
}
