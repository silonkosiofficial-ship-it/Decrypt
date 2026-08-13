package Z8;

/* JADX INFO: renamed from: Z8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1878o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p237x7.l f16846a = new p237x7.l() { // from class: Z8.m
        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return Z8.AbstractC1878o.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p237x7.p f16847b = new p237x7.p() { // from class: Z8.n
        @Override // p237x7.p
        public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Boolean.valueOf(Z8.AbstractC1878o.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(java.lang.Object obj, java.lang.Object obj2) {
        return p247y7.AbstractC7350t.b(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object d(java.lang.Object obj) {
        return obj;
    }

    public static final Z8.InterfaceC1869f e(Z8.InterfaceC1869f interfaceC1869f) {
        return interfaceC1869f instanceof Z8.N ? interfaceC1869f : f(interfaceC1869f, f16846a, f16847b);
    }

    private static final Z8.InterfaceC1869f f(Z8.InterfaceC1869f interfaceC1869f, p237x7.l lVar, p237x7.p pVar) {
        if (interfaceC1869f instanceof Z8.C1868e) {
            Z8.C1868e c1868e = (Z8.C1868e) interfaceC1869f;
            if (c1868e.f16821D == lVar && c1868e.f16822E == pVar) {
                return interfaceC1869f;
            }
        }
        return new Z8.C1868e(interfaceC1869f, lVar, pVar);
    }
}
