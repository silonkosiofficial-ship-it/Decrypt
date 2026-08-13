package M7;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p248y8.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(E8.n nVar, M7.b bVar) {
        super(nVar, bVar);
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(bVar, "containingClass");
    }

    @Override // p248y8.e
    protected java.util.List i() {
        M7.e.a aVar;
        M7.b bVar;
        boolean z6;
        O7.InterfaceC1424e interfaceC1424eL = l();
        p247y7.AbstractC7350t.d(interfaceC1424eL, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        M7.f fVarD1 = ((M7.b) interfaceC1424eL).d1();
        if (p247y7.AbstractC7350t.b(fVarD1, M7.f.a.f7066e)) {
            aVar = M7.e.f7061g0;
            bVar = (M7.b) l();
            z6 = false;
        } else {
            if (!p247y7.AbstractC7350t.b(fVarD1, M7.f.d.f7069e)) {
                return p097j7.AbstractC6879v.m();
            }
            aVar = M7.e.f7061g0;
            bVar = (M7.b) l();
            z6 = true;
        }
        return p097j7.AbstractC6879v.e(aVar.a(bVar, z6));
    }
}
