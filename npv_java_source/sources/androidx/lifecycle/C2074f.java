package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2074f implements androidx.lifecycle.InterfaceC2083o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.lifecycle.InterfaceC2073e f22814C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.lifecycle.InterfaceC2083o f22815D;

    /* JADX INFO: renamed from: androidx.lifecycle.f$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22816a;

        static {
            int[] iArr = new int[androidx.lifecycle.AbstractC2079k.a.values().length];
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_RESUME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_PAUSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_STOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_DESTROY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_ANY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            f22816a = iArr;
        }
    }

    public C2074f(androidx.lifecycle.InterfaceC2073e interfaceC2073e, androidx.lifecycle.InterfaceC2083o interfaceC2083o) {
        p247y7.AbstractC7350t.f(interfaceC2073e, "defaultLifecycleObserver");
        this.f22814C = interfaceC2073e;
        this.f22815D = interfaceC2083o;
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        switch (androidx.lifecycle.C2074f.a.f22816a[aVar.ordinal()]) {
            case 1:
                this.f22814C.g(rVar);
                break;
            case 2:
                this.f22814C.H(rVar);
                break;
            case 3:
                this.f22814C.f(rVar);
                break;
            case 4:
                this.f22814C.o(rVar);
                break;
            case 5:
                this.f22814C.y(rVar);
                break;
            case 6:
                this.f22814C.D(rVar);
                break;
            case 7:
                throw new java.lang.IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        androidx.lifecycle.InterfaceC2083o interfaceC2083o = this.f22815D;
        if (interfaceC2083o != null) {
            interfaceC2083o.i(rVar, aVar);
        }
    }
}
