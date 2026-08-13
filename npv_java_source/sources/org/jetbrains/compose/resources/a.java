package org.jetbrains.compose.resources;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: org.jetbrains.compose.resources.a$a, reason: collision with other inner class name */
    static final class C0677a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f52608D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0677a(int i6) {
            super(2);
            this.f52608D = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            org.jetbrains.compose.resources.a.a(interfaceC1734n, V.S0.a(this.f52608D | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1587247798);
        if (i6 == 0 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1587247798, i6, -1, "org.jetbrains.compose.resources.PreviewContextConfigurationEffect (AndroidContextProvider.kt:35)");
            }
            if (((java.lang.Boolean) interfaceC1734nR.n(androidx.compose.ui.platform.F0.a())).booleanValue()) {
                org.jetbrains.compose.resources.AndroidContextProvider.f52606C.b((android.content.Context) interfaceC1734nR.n(androidx.compose.ui.platform.T.g()));
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new org.jetbrains.compose.resources.a.C0677a(i6));
        }
    }

    public static final android.content.Context b() {
        return org.jetbrains.compose.resources.AndroidContextProvider.f52606C.a();
    }

    public static final android.content.Context c() {
        return androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().getContext();
    }
}
