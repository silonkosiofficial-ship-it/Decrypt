package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends F8.l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.f0[] f2817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.i0[] f2818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f2819e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(java.util.List list, java.util.List list2) {
        this((O7.f0[]) list.toArray(new O7.f0[0]), (F8.i0[]) list2.toArray(new F8.i0[0]), false, 4, null);
        p247y7.AbstractC7350t.f(list, "parameters");
        p247y7.AbstractC7350t.f(list2, "argumentsList");
    }

    public C(O7.f0[] f0VarArr, F8.i0[] i0VarArr, boolean z6) {
        p247y7.AbstractC7350t.f(f0VarArr, "parameters");
        p247y7.AbstractC7350t.f(i0VarArr, "arguments");
        this.f2817c = f0VarArr;
        this.f2818d = i0VarArr;
        this.f2819e = z6;
        int length = f0VarArr.length;
        int length2 = i0VarArr.length;
    }

    public /* synthetic */ C(O7.f0[] f0VarArr, F8.i0[] i0VarArr, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(f0VarArr, i0VarArr, (i6 & 4) != 0 ? false : z6);
    }

    @Override // F8.l0
    public boolean b() {
        return this.f2819e;
    }

    @Override // F8.l0
    public F8.i0 e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "key");
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        O7.f0 f0Var = interfaceC1427hW instanceof O7.f0 ? (O7.f0) interfaceC1427hW : null;
        if (f0Var == null) {
            return null;
        }
        int index = f0Var.getIndex();
        O7.f0[] f0VarArr = this.f2817c;
        if (index >= f0VarArr.length || !p247y7.AbstractC7350t.b(f0VarArr[index].p(), f0Var.p())) {
            return null;
        }
        return this.f2818d[index];
    }

    @Override // F8.l0
    public boolean f() {
        return this.f2818d.length == 0;
    }

    public final F8.i0[] i() {
        return this.f2818d;
    }

    public final O7.f0[] j() {
        return this.f2817c;
    }
}
