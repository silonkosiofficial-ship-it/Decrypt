package p012b1;

/* JADX INFO: loaded from: classes.dex */
public interface B {

    public static final class a {
        public static /* synthetic */ void a(p012b1.B b6, b1.i.c cVar, float f6, float f10, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i6 & 2) != 0) {
                f6 = Y0.i.q(0);
            }
            if ((i6 & 4) != 0) {
                f10 = Y0.i.q(0);
            }
            b6.a(cVar, f6, f10);
        }
    }

    void a(b1.i.c cVar, float f6, float f10);
}
