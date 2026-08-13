package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.c2> CREATOR = new p184s3.d2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f54198C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f54199D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f54200E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f54201F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f54202G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f54203H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final p184s3.c2[] f54204I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f54205J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f54206K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f54207L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f54208M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f54209N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f54210O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f54211P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f54212Q;

    public c2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public c2(android.content.Context context, p104k3.h hVar) {
        this(context, new p104k3.h[]{hVar});
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    public c2(android.content.Context context, p104k3.h[] hVarArr) {
        int iA;
        int i6;
        java.lang.String string;
        int dimensionPixelSize;
        p104k3.h hVar = hVarArr[0];
        this.f54201F = false;
        boolean zE = hVar.e();
        this.f54206K = zE;
        this.f54210O = p104k3.z.f(hVar);
        this.f54211P = p104k3.z.g(hVar);
        boolean zH = p104k3.z.h(hVar);
        this.f54212Q = zH;
        if (zE) {
            p104k3.h hVar2 = p104k3.h.f49467i;
            this.f54202G = hVar2.c();
            iA = hVar2.a();
        } else if (this.f54211P) {
            this.f54202G = hVar.c();
            iA = p104k3.z.a(hVar);
        } else if (zH) {
            this.f54202G = hVar.c();
            iA = p104k3.z.b(hVar);
        } else {
            this.f54202G = hVar.c();
            iA = hVar.a();
        }
        this.f54199D = iA;
        boolean z6 = this.f54202G == -1;
        boolean z10 = iA == -2;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z6) {
            p184s3.C7147y.b();
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
            } else {
                android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    p184s3.C7147y.b();
                    android.util.DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i10 = displayMetrics3.heightPixels;
                        int i11 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i12 = displayMetrics3.heightPixels;
                        int i13 = displayMetrics3.widthPixels;
                        if (i12 == i10 && i13 == i11) {
                            int i14 = displayMetrics.widthPixels;
                            p184s3.C7147y.b();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i14 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                }
            }
            this.f54203H = dimensionPixelSize;
            double d6 = dimensionPixelSize / displayMetrics.density;
            i6 = (int) d6;
            if (d6 - ((double) i6) >= 0.01d) {
                i6++;
            }
        } else {
            i6 = this.f54202G;
            p184s3.C7147y.b();
            this.f54203H = p224w3.g.r(displayMetrics, this.f54202G);
        }
        int iC = z10 ? C(displayMetrics) : this.f54199D;
        p184s3.C7147y.b();
        this.f54200E = p224w3.g.r(displayMetrics, iC);
        if (z6 || z10) {
            string = i6 + "x" + iC + "_as";
        } else if (this.f54211P || this.f54212Q) {
            string = this.f54202G + "x" + this.f54199D + "_as";
        } else {
            string = zE ? "320x50_mb" : hVar.toString();
        }
        this.f54198C = string;
        int length = hVarArr.length;
        if (length > 1) {
            this.f54204I = new p184s3.c2[length];
            for (int i15 = 0; i15 < hVarArr.length; i15++) {
                this.f54204I[i15] = new p184s3.c2(context, hVarArr[i15]);
            }
        } else {
            this.f54204I = null;
        }
        this.f54205J = false;
        this.f54207L = false;
    }

    c2(java.lang.String str, int i6, int i10, boolean z6, int i11, int i12, p184s3.c2[] c2VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f54198C = str;
        this.f54199D = i6;
        this.f54200E = i10;
        this.f54201F = z6;
        this.f54202G = i11;
        this.f54203H = i12;
        this.f54204I = c2VarArr;
        this.f54205J = z10;
        this.f54206K = z11;
        this.f54207L = z12;
        this.f54208M = z13;
        this.f54209N = z14;
        this.f54210O = z15;
        this.f54211P = z16;
        this.f54212Q = z17;
    }

    private static int C(android.util.DisplayMetrics displayMetrics) {
        int i6 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i6 <= 400) {
            return 32;
        }
        return i6 <= 720 ? 50 : 90;
    }

    public static int e(android.util.DisplayMetrics displayMetrics) {
        return (int) (C(displayMetrics) * displayMetrics.density);
    }

    public static p184s3.c2 f() {
        return new p184s3.c2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static p184s3.c2 s() {
        return new p184s3.c2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static p184s3.c2 w() {
        return new p184s3.c2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f54198C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, str, false);
        R3.c.k(parcel, 3, this.f54199D);
        R3.c.k(parcel, 4, this.f54200E);
        R3.c.c(parcel, 5, this.f54201F);
        R3.c.k(parcel, 6, this.f54202G);
        R3.c.k(parcel, 7, this.f54203H);
        R3.c.t(parcel, 8, this.f54204I, i6, false);
        R3.c.c(parcel, 9, this.f54205J);
        R3.c.c(parcel, 10, this.f54206K);
        R3.c.c(parcel, 11, this.f54207L);
        R3.c.c(parcel, 12, this.f54208M);
        R3.c.c(parcel, 13, this.f54209N);
        R3.c.c(parcel, 14, this.f54210O);
        R3.c.c(parcel, 15, this.f54211P);
        R3.c.c(parcel, 16, this.f54212Q);
        R3.c.b(parcel, iA);
    }
}
