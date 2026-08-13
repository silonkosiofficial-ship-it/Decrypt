package Y7;

/* JADX INFO: loaded from: classes2.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y7.g f16481a = new Y7.g.a();

    static class a implements Y7.g {
        a() {
        }

        private static /* synthetic */ void f(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i6) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i6) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Y7.g
        public void a(p048e8.l lVar, O7.InterfaceC1431l interfaceC1431l) {
            if (lVar == null) {
                f(3);
            }
            if (interfaceC1431l == null) {
                f(4);
            }
        }

        @Override // Y7.g
        public void b(p048e8.q qVar, O7.Z z6) {
            if (qVar == null) {
                f(1);
            }
            if (z6 == null) {
                f(2);
            }
        }

        @Override // Y7.g
        public O7.InterfaceC1424e c(p138n8.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // Y7.g
        public void d(p048e8.g gVar, O7.InterfaceC1424e interfaceC1424e) {
            if (gVar == null) {
                f(7);
            }
            if (interfaceC1424e == null) {
                f(8);
            }
        }

        @Override // Y7.g
        public void e(p048e8.n nVar, O7.U u6) {
            if (nVar == null) {
                f(5);
            }
            if (u6 == null) {
                f(6);
            }
        }
    }

    void a(p048e8.l lVar, O7.InterfaceC1431l interfaceC1431l);

    void b(p048e8.q qVar, O7.Z z6);

    O7.InterfaceC1424e c(p138n8.c cVar);

    void d(p048e8.g gVar, O7.InterfaceC1424e interfaceC1424e);

    void e(p048e8.n nVar, O7.U u6);
}
