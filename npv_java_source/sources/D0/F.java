package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final F0.U a(F0.U u6) {
        F0.J jO1 = u6.o1();
        while (true) {
            F0.J jO0 = jO1.o0();
            if ((jO0 != null ? jO0.b0() : null) == null) {
                F0.U uJ2 = jO1.m0().j2();
                p247y7.AbstractC7350t.c(uJ2);
                return uJ2;
            }
            F0.J jO2 = jO1.o0();
            F0.J jB0 = jO2 != null ? jO2.b0() : null;
            p247y7.AbstractC7350t.c(jB0);
            boolean zO0 = jB0.O0();
            jO1 = jO1.o0();
            p247y7.AbstractC7350t.c(jO1);
            if (!zO0) {
                jO1 = jO1.b0();
                p247y7.AbstractC7350t.c(jO1);
            }
        }
    }
}
