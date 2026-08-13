package p087i7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46743a;

        static {
            int[] iArr = new int[p087i7.r.values().length];
            try {
                iArr[p087i7.r.SYNCHRONIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p087i7.r.PUBLICATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p087i7.r.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f46743a = iArr;
        }
    }

    public static p087i7.InterfaceC6668n a(p087i7.r rVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "mode");
        p247y7.AbstractC7350t.f(aVar, "initializer");
        int i6 = i7.p.a.f46743a[rVar.ordinal()];
        int i10 = 2;
        if (i6 == 1) {
            p247y7.AbstractC7342k abstractC7342k = null;
            return new p087i7.z(aVar, abstractC7342k, i10, abstractC7342k);
        }
        if (i6 == 2) {
            return new p087i7.y(aVar);
        }
        if (i6 == 3) {
            return new p087i7.N(aVar);
        }
        throw new p087i7.s();
    }

    public static p087i7.InterfaceC6668n b(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "initializer");
        p247y7.AbstractC7342k abstractC7342k = null;
        return new p087i7.z(aVar, abstractC7342k, 2, abstractC7342k);
    }
}
