package p122m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p122m1.e {

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private java.util.ArrayList f50471G0;

    public m(int i6, int i10) {
        super(i6, i10);
        this.f50471G0 = new java.util.ArrayList();
    }

    @Override // p122m1.e
    public void W0() {
        this.f50471G0.clear();
        super.W0();
    }

    @Override // p122m1.e
    public void Z0(p042e1.c cVar) {
        super.Z0(cVar);
        int size = this.f50471G0.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = this.f50471G0.get(i6);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            ((p122m1.e) obj).Z0(cVar);
        }
    }

    public final void a2(p122m1.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "widget");
        this.f50471G0.add(eVar);
        if (eVar.o0() != null) {
            p122m1.e eVarO0 = eVar.o0();
            p247y7.AbstractC7350t.d(eVarO0, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.WidgetContainer");
            ((p122m1.m) eVarO0).f2(eVar);
        }
        eVar.I1(this);
    }

    public final void b2(p122m1.e... eVarArr) {
        p247y7.AbstractC7350t.f(eVarArr, "widgets");
        for (p122m1.e eVar : eVarArr) {
            a2(eVar);
        }
    }

    public final java.util.ArrayList c2() {
        return this.f50471G0;
    }

    public final java.util.ArrayList d2() {
        return this.f50471G0;
    }

    public abstract void e2();

    public final void f2(p122m1.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "widget");
        this.f50471G0.remove(eVar);
        eVar.W0();
    }

    public final void g2() {
        this.f50471G0.clear();
    }

    public final void h2(java.util.ArrayList arrayList) {
        p247y7.AbstractC7350t.f(arrayList, "<set-?>");
        this.f50471G0 = arrayList;
    }
}
