package H;

/* JADX INFO: renamed from: H.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1226s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final H.InterfaceC1225q f4171a = new H.AbstractC1226s.a();

    /* JADX INFO: renamed from: H.s$a */
    public static final class a implements H.InterfaceC1225q {
        a() {
        }

        @Override // H.InterfaceC1225q
        public H.EnumC1223o a(android.view.KeyEvent keyEvent) {
            H.EnumC1223o enumC1223o = null;
            if (p231x0.d.f(keyEvent) && p231x0.d.d(keyEvent)) {
                long jA = p231x0.d.a(keyEvent);
                H.C1232y c1232y = H.C1232y.f4238a;
                if (p231x0.a.p(jA, c1232y.i())) {
                    enumC1223o = H.EnumC1223o.SELECT_LINE_LEFT;
                } else if (p231x0.a.p(jA, c1232y.j())) {
                    enumC1223o = H.EnumC1223o.SELECT_LINE_RIGHT;
                } else if (p231x0.a.p(jA, c1232y.k())) {
                    enumC1223o = H.EnumC1223o.SELECT_HOME;
                } else if (p231x0.a.p(jA, c1232y.h())) {
                    enumC1223o = H.EnumC1223o.SELECT_END;
                }
            } else if (p231x0.d.d(keyEvent)) {
                long jA2 = p231x0.d.a(keyEvent);
                H.C1232y c1232y2 = H.C1232y.f4238a;
                if (p231x0.a.p(jA2, c1232y2.i())) {
                    enumC1223o = H.EnumC1223o.LINE_LEFT;
                } else if (p231x0.a.p(jA2, c1232y2.j())) {
                    enumC1223o = H.EnumC1223o.LINE_RIGHT;
                } else if (p231x0.a.p(jA2, c1232y2.k())) {
                    enumC1223o = H.EnumC1223o.HOME;
                } else if (p231x0.a.p(jA2, c1232y2.h())) {
                    enumC1223o = H.EnumC1223o.END;
                }
            }
            return enumC1223o == null ? H.r.b().a(keyEvent) : enumC1223o;
        }
    }

    public static final H.InterfaceC1225q a() {
        return f4171a;
    }
}
