package p108k8;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements p108k8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p088i8.p f49813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p088i8.o f49814b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49815a;

        static {
            int[] iArr = new int[i8.o.c.EnumC0573c.values().length];
            try {
                iArr[i8.o.c.EnumC0573c.CLASS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[i8.o.c.EnumC0573c.PACKAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[i8.o.c.EnumC0573c.LOCAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f49815a = iArr;
        }
    }

    public d(p088i8.p pVar, p088i8.o oVar) {
        p247y7.AbstractC7350t.f(pVar, "strings");
        p247y7.AbstractC7350t.f(oVar, "qualifiedNames");
        this.f49813a = pVar;
        this.f49814b = oVar;
    }

    private final p087i7.A c(int i6) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        boolean z6 = false;
        while (i6 != -1) {
            i8.o.c cVarV = this.f49814b.v(i6);
            java.lang.String strV = this.f49813a.v(cVarV.z());
            i8.o.c.EnumC0573c enumC0573cX = cVarV.x();
            p247y7.AbstractC7350t.c(enumC0573cX);
            int i10 = k8.d.a.f49815a[enumC0573cX.ordinal()];
            if (i10 == 1) {
                linkedList2.addFirst(strV);
            } else if (i10 == 2) {
                linkedList.addFirst(strV);
            } else if (i10 == 3) {
                linkedList2.addFirst(strV);
                z6 = true;
            }
            i6 = cVarV.y();
        }
        return new p087i7.A(linkedList, linkedList2, java.lang.Boolean.valueOf(z6));
    }

    @Override // p108k8.c
    public java.lang.String a(int i6) {
        p087i7.A aC = c(i6);
        java.util.List list = (java.util.List) aC.a();
        java.lang.String strR0 = p097j7.AbstractC6879v.r0((java.util.List) aC.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strR0;
        }
        return p097j7.AbstractC6879v.r0(list, "/", null, null, 0, null, null, 62, null) + '/' + strR0;
    }

    @Override // p108k8.c
    public boolean b(int i6) {
        return ((java.lang.Boolean) c(i6).d()).booleanValue();
    }

    @Override // p108k8.c
    public java.lang.String getString(int i6) {
        java.lang.String strV = this.f49813a.v(i6);
        p247y7.AbstractC7350t.e(strV, "getString(...)");
        return strV;
    }
}
