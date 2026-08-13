package X2;

/* JADX INFO: loaded from: classes.dex */
public enum x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final android.util.SparseArray f15860J;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f15862C;

    static {
        X2.x xVar = DEFAULT;
        X2.x xVar2 = UNMETERED_ONLY;
        X2.x xVar3 = UNMETERED_OR_DAILY;
        X2.x xVar4 = FAST_IF_RADIO_AWAKE;
        X2.x xVar5 = NEVER;
        X2.x xVar6 = UNRECOGNIZED;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f15860J = sparseArray;
        sparseArray.put(0, xVar);
        sparseArray.put(1, xVar2);
        sparseArray.put(2, xVar3);
        sparseArray.put(3, xVar4);
        sparseArray.put(4, xVar5);
        sparseArray.put(-1, xVar6);
    }

    x(int i6) {
        this.f15862C = i6;
    }
}
