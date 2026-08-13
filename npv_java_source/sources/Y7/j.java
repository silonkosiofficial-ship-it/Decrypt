package Y7;

/* JADX INFO: loaded from: classes2.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y7.j f16488a = new Y7.j.a();

    static class a implements Y7.j {
        a() {
        }

        private static /* synthetic */ void c(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i6) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i6 == 5 || i6 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Y7.j
        public void a(O7.InterfaceC1421b interfaceC1421b, java.util.List list) {
            if (interfaceC1421b == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new java.lang.UnsupportedOperationException("Should not be called");
        }

        @Override // Y7.j
        public Y7.j.b b(p048e8.r rVar, O7.InterfaceC1424e interfaceC1424e, F8.E e6, F8.E e10, java.util.List list, java.util.List list2) {
            if (rVar == null) {
                c(0);
            }
            if (interfaceC1424e == null) {
                c(1);
            }
            if (e6 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new Y7.j.b(e6, e10, list, list2, java.util.Collections.emptyList(), false);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F8.E f16489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final F8.E f16490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.List f16491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.List f16492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final java.util.List f16493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f16494f;

        public b(F8.E e6, F8.E e10, java.util.List list, java.util.List list2, java.util.List list3, boolean z6) {
            if (e6 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f16489a = e6;
            this.f16490b = e10;
            this.f16491c = list;
            this.f16492d = list2;
            this.f16493e = list3;
            this.f16494f = z6;
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.String str = (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) ? 2 : 3];
            switch (i6) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i6 == 4) {
                objArr[1] = "getReturnType";
            } else if (i6 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i6 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i6 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        public java.util.List b() {
            java.util.List list = this.f16493e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public F8.E c() {
            return this.f16490b;
        }

        public F8.E d() {
            F8.E e6 = this.f16489a;
            if (e6 == null) {
                a(4);
            }
            return e6;
        }

        public java.util.List e() {
            java.util.List list = this.f16492d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public java.util.List f() {
            java.util.List list = this.f16491c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f16494f;
        }
    }

    void a(O7.InterfaceC1421b interfaceC1421b, java.util.List list);

    Y7.j.b b(p048e8.r rVar, O7.InterfaceC1424e interfaceC1424e, F8.E e6, F8.E e10, java.util.List list, java.util.List list2);
}
