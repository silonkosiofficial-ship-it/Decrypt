package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    public static abstract class a {
        public abstract X2.w a();

        public abstract X2.w.a b(X2.w.b bVar);

        public abstract X2.w.a c(X2.w.c cVar);
    }

    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);


        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private static final android.util.SparseArray f15829Y;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f15831C;

        static {
            X2.w.b bVar = UNKNOWN_MOBILE_SUBTYPE;
            X2.w.b bVar2 = GPRS;
            X2.w.b bVar3 = EDGE;
            X2.w.b bVar4 = UMTS;
            X2.w.b bVar5 = CDMA;
            X2.w.b bVar6 = EVDO_0;
            X2.w.b bVar7 = EVDO_A;
            X2.w.b bVar8 = RTT;
            X2.w.b bVar9 = HSDPA;
            X2.w.b bVar10 = HSUPA;
            X2.w.b bVar11 = HSPA;
            X2.w.b bVar12 = IDEN;
            X2.w.b bVar13 = EVDO_B;
            X2.w.b bVar14 = LTE;
            X2.w.b bVar15 = EHRPD;
            X2.w.b bVar16 = HSPAP;
            X2.w.b bVar17 = GSM;
            X2.w.b bVar18 = TD_SCDMA;
            X2.w.b bVar19 = IWLAN;
            X2.w.b bVar20 = LTE_CA;
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            f15829Y = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(18, bVar19);
            sparseArray.put(19, bVar20);
        }

        b(int i6) {
            this.f15831C = i6;
        }

        public static X2.w.b e(int i6) {
            return (X2.w.b) f15829Y.get(i6);
        }

        public int g() {
            return this.f15831C;
        }
    }

    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);


        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private static final android.util.SparseArray f15851W;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f15853C;

        static {
            X2.w.c cVar = MOBILE;
            X2.w.c cVar2 = WIFI;
            X2.w.c cVar3 = MOBILE_MMS;
            X2.w.c cVar4 = MOBILE_SUPL;
            X2.w.c cVar5 = MOBILE_DUN;
            X2.w.c cVar6 = MOBILE_HIPRI;
            X2.w.c cVar7 = WIMAX;
            X2.w.c cVar8 = BLUETOOTH;
            X2.w.c cVar9 = DUMMY;
            X2.w.c cVar10 = ETHERNET;
            X2.w.c cVar11 = MOBILE_FOTA;
            X2.w.c cVar12 = MOBILE_IMS;
            X2.w.c cVar13 = MOBILE_CBS;
            X2.w.c cVar14 = WIFI_P2P;
            X2.w.c cVar15 = MOBILE_IA;
            X2.w.c cVar16 = MOBILE_EMERGENCY;
            X2.w.c cVar17 = PROXY;
            X2.w.c cVar18 = VPN;
            X2.w.c cVar19 = NONE;
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            f15851W = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar13);
            sparseArray.put(13, cVar14);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar17);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar19);
        }

        c(int i6) {
            this.f15853C = i6;
        }

        public static X2.w.c e(int i6) {
            return (X2.w.c) f15851W.get(i6);
        }

        public int g() {
            return this.f15853C;
        }
    }

    public static X2.w.a a() {
        return new X2.m.b();
    }

    public abstract X2.w.b b();

    public abstract X2.w.c c();
}
