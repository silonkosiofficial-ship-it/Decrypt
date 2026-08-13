package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52183a;

        static {
            int[] iArr = new int[o0.Q1.b.values().length];
            try {
                iArr[o0.Q1.b.CounterClockwise.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[o0.Q1.b.Clockwise.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f52183a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p141o0.Q1 a() {
        return new p141o0.V(null, 1, 0 == true ? 1 : 0);
    }

    public static final p141o0.Q1 c(android.graphics.Path path) {
        return new p141o0.V(path);
    }

    public static final void d(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Path.Direction e(o0.Q1.b bVar) {
        int i6 = o0.Y.a.f52183a[bVar.ordinal()];
        if (i6 == 1) {
            return android.graphics.Path.Direction.CCW;
        }
        if (i6 == 2) {
            return android.graphics.Path.Direction.CW;
        }
        throw new p087i7.s();
    }
}
