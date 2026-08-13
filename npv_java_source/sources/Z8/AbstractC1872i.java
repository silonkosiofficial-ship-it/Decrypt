package Z8;

/* JADX INFO: renamed from: Z8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1872i {

    /* JADX INFO: renamed from: Z8.i$a */
    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.lang.Object[] f16829C;

        /* JADX INFO: renamed from: Z8.i$a$a, reason: collision with other inner class name */
        public static final class C0317a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16830F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f16831G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f16833I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f16834J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            int f16835K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            int f16836L;

            public C0317a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16830F = obj;
                this.f16831G |= Integer.MIN_VALUE;
                return Z8.AbstractC1872i.a.this.b(null, this);
            }
        }

        public a(java.lang.Object[] objArr) {
            this.f16829C = objArr;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004b  */
        /* JADX WARN: Code duplicated, block: B:18:0x005f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g r8, p127m7.e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof Z8.AbstractC1872i.a.C0317a
                if (r0 == 0) goto L13
                r0 = r9
                Z8.i$a$a r0 = (Z8.AbstractC1872i.a.C0317a) r0
                int r1 = r0.f16831G
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f16831G = r1
                goto L18
            L13:
                Z8.i$a$a r0 = new Z8.i$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f16830F
                java.lang.Object r1 = p137n7.b.g()
                int r2 = r0.f16831G
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f16836L
                int r2 = r0.f16835K
                java.lang.Object r4 = r0.f16834J
                Z8.g r4 = (Z8.InterfaceC1870g) r4
                java.lang.Object r5 = r0.f16833I
                Z8.i$a r5 = (Z8.AbstractC1872i.a) r5
                p087i7.x.b(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                p087i7.x.b(r9)
                java.lang.Object[] r9 = r7.f16829C
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.f16829C
                r4 = r4[r2]
                r0.f16833I = r5
                r0.f16834J = r9
                r0.f16835K = r2
                r0.f16836L = r8
                r0.f16831G = r3
                java.lang.Object r4 = r9.a(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                i7.M r8 = p087i7.M.f46721a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Z8.AbstractC1872i.a.b(Z8.g, m7.e):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: Z8.i$b */
    public static final class b implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f16837C;

        public b(java.lang.Object obj) {
            this.f16837C = obj;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objA = interfaceC1870g.a(this.f16837C, eVar);
            return objA == p137n7.b.g() ? objA : p087i7.M.f46721a;
        }
    }

    public static final Z8.InterfaceC1869f a(p237x7.p pVar) {
        return new Z8.C1865b(pVar, null, 0, null, 14, null);
    }

    public static final Z8.InterfaceC1869f b(p237x7.p pVar) {
        return new Z8.C1867d(pVar, null, 0, null, 14, null);
    }

    public static final Z8.InterfaceC1869f c(p237x7.p pVar) {
        return new Z8.B(pVar);
    }

    public static final Z8.InterfaceC1869f d(java.lang.Object obj) {
        return new Z8.AbstractC1872i.b(obj);
    }

    public static final Z8.InterfaceC1869f e(java.lang.Object... objArr) {
        return new Z8.AbstractC1872i.a(objArr);
    }
}
