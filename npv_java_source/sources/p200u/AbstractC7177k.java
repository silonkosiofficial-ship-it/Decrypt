package p200u;

/* JADX INFO: renamed from: u.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7177k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final p200u.r b(p200u.x0 x0Var, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (p200u.r) x0Var.a().l(obj);
    }

    public static final p200u.InterfaceC7175j c(p200u.InterfaceC7175j interfaceC7175j, long j6) {
        return new p200u.C7182m0(interfaceC7175j, j6);
    }

    public static final p200u.Q d(p200u.E e6, p200u.EnumC7168f0 enumC7168f0, long j6) {
        return new p200u.Q(e6, enumC7168f0, j6, null);
    }

    public static /* synthetic */ p200u.Q e(p200u.E e6, p200u.EnumC7168f0 enumC7168f0, long j6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            enumC7168f0 = p200u.EnumC7168f0.Restart;
        }
        if ((i6 & 4) != 0) {
            j6 = p200u.AbstractC7186o0.c(0, 0, 2, null);
        }
        return d(e6, enumC7168f0, j6);
    }

    public static final p200u.W f(p237x7.l lVar) {
        u.W.b bVar = new u.W.b();
        lVar.l(bVar);
        return new p200u.W(bVar);
    }

    public static final p200u.C7172h0 g(int i6) {
        return new p200u.C7172h0(i6);
    }

    public static /* synthetic */ p200u.C7172h0 h(int i6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        return g(i6);
    }

    public static final p200u.C7180l0 i(float f6, float f10, java.lang.Object obj) {
        return new p200u.C7180l0(f6, f10, obj);
    }

    public static /* synthetic */ p200u.C7180l0 j(float f6, float f10, java.lang.Object obj, int i6, java.lang.Object obj2) {
        if ((i6 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i6 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i6 & 4) != 0) {
            obj = null;
        }
        return i(f6, f10, obj);
    }

    public static final p200u.w0 k(int i6, int i10, p200u.F f6) {
        return new p200u.w0(i6, i10, f6);
    }

    public static /* synthetic */ p200u.w0 l(int i6, int i10, p200u.F f6, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 300;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            f6 = p200u.H.d();
        }
        return k(i6, i10, f6);
    }
}
