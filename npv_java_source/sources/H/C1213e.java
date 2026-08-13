package H;

/* JADX INFO: renamed from: H.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1213e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H.C1213e f3893a = new H.C1213e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p237x7.q f3894b = p031d0.c.c(671295101, false, H.C1213e.a.f3895D);

    /* JADX INFO: renamed from: H.e$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final H.C1213e.a f3895D = new H.C1213e.a();

        a() {
            super(3);
        }

        public final void a(p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 6) == 0) {
                i6 |= interfaceC1734n.l(pVar) ? 4 : 2;
            }
            if ((i6 & 19) == 18 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(671295101, i6, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
            }
            pVar.u(interfaceC1734n, java.lang.Integer.valueOf(i6 & 14));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((p237x7.p) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }
    }

    public final p237x7.q a() {
        return f3894b;
    }
}
