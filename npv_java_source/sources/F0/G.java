package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(F0.T t6, D0.AbstractC0882a abstractC0882a) {
        F0.T tK1 = t6.k1();
        if (!(tK1 != null)) {
            C0.a.b("Child of " + t6 + " cannot be null when calculating alignment line");
        }
        if (t6.q1().f().containsKey(abstractC0882a)) {
            java.lang.Integer num = (java.lang.Integer) t6.q1().f().get(abstractC0882a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iQ = tK1.Q(abstractC0882a);
        if (iQ == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        tK1.D1(true);
        t6.C1(true);
        t6.B1();
        tK1.D1(false);
        t6.C1(false);
        return iQ + (abstractC0882a instanceof D0.C0894m ? Y0.p.i(tK1.t1()) : Y0.p.h(tK1.t1()));
    }
}
