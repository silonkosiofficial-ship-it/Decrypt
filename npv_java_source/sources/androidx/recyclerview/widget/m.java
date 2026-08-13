package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends androidx.recyclerview.widget.RecyclerView.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f23435g = true;

    public final void A(androidx.recyclerview.widget.RecyclerView.D d6) {
        I(d6);
        h(d6);
    }

    public final void B(androidx.recyclerview.widget.RecyclerView.D d6) {
        J(d6);
    }

    public final void C(androidx.recyclerview.widget.RecyclerView.D d6, boolean z6) {
        K(d6, z6);
        h(d6);
    }

    public final void D(androidx.recyclerview.widget.RecyclerView.D d6, boolean z6) {
        L(d6, z6);
    }

    public final void E(androidx.recyclerview.widget.RecyclerView.D d6) {
        M(d6);
        h(d6);
    }

    public final void F(androidx.recyclerview.widget.RecyclerView.D d6) {
        N(d6);
    }

    public final void G(androidx.recyclerview.widget.RecyclerView.D d6) {
        O(d6);
        h(d6);
    }

    public final void H(androidx.recyclerview.widget.RecyclerView.D d6) {
        P(d6);
    }

    public void I(androidx.recyclerview.widget.RecyclerView.D d6) {
    }

    public void J(androidx.recyclerview.widget.RecyclerView.D d6) {
    }

    public void K(androidx.recyclerview.widget.RecyclerView.D d6, boolean z6) {
    }

    public void L(androidx.recyclerview.widget.RecyclerView.D d6, boolean z6) {
    }

    public void M(androidx.recyclerview.widget.RecyclerView.D d6) {
    }

    public void N(androidx.recyclerview.widget.RecyclerView.D d6) {
    }

    public void O(androidx.recyclerview.widget.RecyclerView.D d6) {
    }

    public void P(androidx.recyclerview.widget.RecyclerView.D d6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
        int i6;
        int i10;
        return (bVar == null || ((i6 = bVar.f23168a) == (i10 = bVar2.f23168a) && bVar.f23169b == bVar2.f23169b)) ? w(d6) : y(d6, i6, bVar.f23169b, i10, bVar2.f23169b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
        int i6;
        int i10;
        int i11 = bVar.f23168a;
        int i12 = bVar.f23169b;
        if (d10.J()) {
            int i13 = bVar.f23168a;
            i10 = bVar.f23169b;
            i6 = i13;
        } else {
            i6 = bVar2.f23168a;
            i10 = bVar2.f23169b;
        }
        return x(d6, d10, i11, i12, i6, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
        int i6 = bVar.f23168a;
        int i10 = bVar.f23169b;
        android.view.View view = d6.f23130a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f23168a;
        int top = bVar2 == null ? view.getTop() : bVar2.f23169b;
        if (d6.v() || (i6 == left && i10 == top)) {
            return z(d6);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(d6, i6, i10, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2) {
        int i6 = bVar.f23168a;
        int i10 = bVar2.f23168a;
        if (i6 != i10 || bVar.f23169b != bVar2.f23169b) {
            return y(d6, i6, bVar.f23169b, i10, bVar2.f23169b);
        }
        E(d6);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(androidx.recyclerview.widget.RecyclerView.D d6) {
        return !this.f23435g || d6.t();
    }

    public abstract boolean w(androidx.recyclerview.widget.RecyclerView.D d6);

    public abstract boolean x(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10, int i6, int i10, int i11, int i12);

    public abstract boolean y(androidx.recyclerview.widget.RecyclerView.D d6, int i6, int i10, int i11, int i12);

    public abstract boolean z(androidx.recyclerview.widget.RecyclerView.D d6);
}
