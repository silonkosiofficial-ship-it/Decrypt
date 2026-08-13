package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S5.s.a f12555c = new S5.s.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f12557b;

    public static final class a {

        /* JADX INFO: renamed from: S5.s$a$a, reason: collision with other inner class name */
        static final class C0266a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f12558F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            /* synthetic */ java.lang.Object f12559G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            int f12561I;

            C0266a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f12559G = obj;
                this.f12561I |= Integer.MIN_VALUE;
                return S5.s.a.this.a(null, this);
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [G5.e] */
        /* JADX WARN: Type inference failed for: r9v0, types: [G5.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        public final java.lang.Object a(G5.e eVar, p127m7.e eVar2) {
            S5.s.a.C0266a c0266a;
            ?? r10;
            java.lang.String str;
            ?? r11;
            if (eVar2 instanceof S5.s.a.C0266a) {
                c0266a = (S5.s.a.C0266a) eVar2;
                int i6 = c0266a.f12561I;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0266a.f12561I = i6 - Integer.MIN_VALUE;
                } else {
                    c0266a = new S5.s.a.C0266a(eVar2);
                }
            } else {
                c0266a = new S5.s.a.C0266a(eVar2);
            }
            java.lang.Object objA = c0266a.f12559G;
            java.lang.Object objG = p137n7.b.g();
            int i10 = c0266a.f12561I;
            java.lang.String str2 = "";
            try {
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            G5.e eVar3 = (G5.e) c0266a.f12558F;
                            p087i7.x.b(objA);
                            eVar = eVar3;
                        } else {
                            if (i10 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.String str3 = (java.lang.String) c0266a.f12558F;
                            p087i7.x.b(objA);
                            eVar = str3;
                        }
                        p247y7.AbstractC7350t.e(objA, "{\n          firebaseInst…ions.id.await()\n        }");
                        str2 = (java.lang.String) objA;
                        r11 = eVar;
                        return new S5.s(str2, r11, null);
                    }
                    p087i7.x.b(objA);
                    p115l4.AbstractC6931l abstractC6931lB = eVar.b(false);
                    p247y7.AbstractC7350t.e(abstractC6931lB, "firebaseInstallations.getToken(false)");
                    c0266a.f12558F = eVar;
                    c0266a.f12561I = 1;
                    objA = p069g9.b.a(abstractC6931lB, c0266a);
                    eVar = eVar;
                    if (objA == objG) {
                        return objG;
                    }
                    java.lang.String strB = ((com.google.firebase.installations.g) objA).b();
                    p247y7.AbstractC7350t.e(strB, "{\n          firebaseInst…).await().token\n        }");
                    r10 = eVar;
                    str = strB;
                } catch (java.lang.Exception e6) {
                    r10 = eVar;
                    str = "";
                }
                p115l4.AbstractC6931l abstractC6931lA = r10.a();
                p247y7.AbstractC7350t.e(abstractC6931lA, "firebaseInstallations.id");
                c0266a.f12558F = str;
                c0266a.f12561I = 2;
                objA = p069g9.b.a(abstractC6931lA, c0266a);
                eVar = str;
                if (objA == objG) {
                    return objG;
                }
                p247y7.AbstractC7350t.e(objA, "{\n          firebaseInst…ions.id.await()\n        }");
                str2 = (java.lang.String) objA;
                r11 = eVar;
            } catch (java.lang.Exception e10) {
                r11 = eVar;
            }
            return new S5.s(str2, r11, null);
        }
    }

    private s(java.lang.String str, java.lang.String str2) {
        this.f12556a = str;
        this.f12557b = str2;
    }

    public /* synthetic */ s(java.lang.String str, java.lang.String str2, p247y7.AbstractC7342k abstractC7342k) {
        this(str, str2);
    }

    public final java.lang.String a() {
        return this.f12557b;
    }

    public final java.lang.String b() {
        return this.f12556a;
    }
}
