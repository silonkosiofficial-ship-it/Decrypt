package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public static final void b(final p009a9.v vVar, p127m7.i iVar) {
        if (((java.lang.Number) iVar.D(0, new p237x7.p() { // from class: a9.x
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(p009a9.y.c(vVar, ((java.lang.Integer) obj).intValue(), (m7.i.b) obj2));
            }
        })).intValue() == vVar.f17228H) {
            return;
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.f17227G + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(p009a9.v vVar, int i6, m7.i.b bVar) {
        m7.i.c key = bVar.getKey();
        m7.i.b bVarI = vVar.f17227G.i(key);
        if (key != W8.InterfaceC1822z0.f15544h) {
            if (bVar != bVarI) {
                return Integer.MIN_VALUE;
            }
            return i6 + 1;
        }
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) bVarI;
        p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        W8.InterfaceC1822z0 interfaceC1822z0D = d((W8.InterfaceC1822z0) bVar, interfaceC1822z0);
        if (interfaceC1822z0D == interfaceC1822z0) {
            return interfaceC1822z0 == null ? i6 : i6 + 1;
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC1822z0D + ", expected child of " + interfaceC1822z0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final W8.InterfaceC1822z0 d(W8.InterfaceC1822z0 interfaceC1822z0, W8.InterfaceC1822z0 interfaceC1822z1) {
        while (interfaceC1822z0 != null) {
            if (interfaceC1822z0 == interfaceC1822z1 || !(interfaceC1822z0 instanceof p019b9.z)) {
                return interfaceC1822z0;
            }
            interfaceC1822z0 = ((p019b9.z) interfaceC1822z0).Z();
        }
        return null;
    }
}
