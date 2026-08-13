package B8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f831c;

        static {
            int[] iArr = new int[p088i8.j.values().length];
            try {
                iArr[p088i8.j.DECLARATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p088i8.j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p088i8.j.DELEGATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p088i8.j.SYNTHESIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f829a = iArr;
            int[] iArr2 = new int[O7.InterfaceC1421b.a.values().length];
            try {
                iArr2[O7.InterfaceC1421b.a.DECLARATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[O7.InterfaceC1421b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[O7.InterfaceC1421b.a.DELEGATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[O7.InterfaceC1421b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            f830b = iArr2;
            int[] iArr3 = new int[p088i8.x.values().length];
            try {
                iArr3[p088i8.x.INTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[p088i8.x.PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[p088i8.x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[p088i8.x.PROTECTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[p088i8.x.PUBLIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[p088i8.x.LOCAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            f831c = iArr3;
        }
    }

    public static final O7.AbstractC1439u a(B8.B b6, p088i8.x xVar) {
        O7.AbstractC1439u abstractC1439u;
        p247y7.AbstractC7350t.f(b6, "<this>");
        int i6 = xVar == null ? -1 : B8.C.a.f831c[xVar.ordinal()];
        java.lang.String str = "PRIVATE";
        switch (i6) {
            case 1:
                abstractC1439u = O7.AbstractC1438t.f8185d;
                str = "INTERNAL";
                break;
            case 2:
            default:
                abstractC1439u = O7.AbstractC1438t.f8182a;
                break;
            case 3:
                abstractC1439u = O7.AbstractC1438t.f8183b;
                str = "PRIVATE_TO_THIS";
                break;
            case 4:
                abstractC1439u = O7.AbstractC1438t.f8184c;
                str = "PROTECTED";
                break;
            case 5:
                abstractC1439u = O7.AbstractC1438t.f8186e;
                str = "PUBLIC";
                break;
            case 6:
                abstractC1439u = O7.AbstractC1438t.f8187f;
                str = "LOCAL";
                break;
        }
        p247y7.AbstractC7350t.e(abstractC1439u, str);
        return abstractC1439u;
    }

    public static final O7.InterfaceC1421b.a b(B8.B b6, p088i8.j jVar) {
        p247y7.AbstractC7350t.f(b6, "<this>");
        int i6 = jVar == null ? -1 : B8.C.a.f829a[jVar.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                return O7.InterfaceC1421b.a.FAKE_OVERRIDE;
            }
            if (i6 == 3) {
                return O7.InterfaceC1421b.a.DELEGATION;
            }
            if (i6 == 4) {
                return O7.InterfaceC1421b.a.SYNTHESIZED;
            }
        }
        return O7.InterfaceC1421b.a.DECLARATION;
    }
}
