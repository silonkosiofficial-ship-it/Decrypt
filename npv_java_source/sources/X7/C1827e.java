package X7;

/* JADX INFO: renamed from: X7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1827e extends X7.I {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final X7.C1827e f16009o = new X7.C1827e();

    /* JADX INFO: renamed from: X7.e$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.Z f16010D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O7.Z z6) {
            super(1);
            this.f16010D = z6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            return java.lang.Boolean.valueOf(X7.I.f15954a.j().containsKey(p068g8.y.d(this.f16010D)));
        }
    }

    private C1827e() {
    }

    public final p138n8.f i(O7.Z z6) {
        p247y7.AbstractC7350t.f(z6, "functionDescriptor");
        java.util.Map mapJ = X7.I.f15954a.j();
        java.lang.String strD = p068g8.y.d(z6);
        if (strD == null) {
            return null;
        }
        return (p138n8.f) mapJ.get(strD);
    }

    public final boolean j(O7.Z z6) {
        p247y7.AbstractC7350t.f(z6, "functionDescriptor");
        return L7.g.g0(z6) && p218v8.c.f(z6, false, new X7.C1827e.a(z6), 1, null) != null;
    }

    public final boolean k(O7.Z z6) {
        p247y7.AbstractC7350t.f(z6, "<this>");
        return p247y7.AbstractC7350t.b(z6.getName().g(), "removeAt") && p247y7.AbstractC7350t.b(p068g8.y.d(z6), X7.I.f15954a.h().d());
    }
}
