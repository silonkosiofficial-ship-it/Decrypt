package T3;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f12934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q3.C1470i f12935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12936d;

    public a(java.lang.String str, java.lang.String... strArr) {
        java.lang.String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            for (java.lang.String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f12934b = string;
        this.f12933a = str;
        this.f12935c = new Q3.C1470i(str);
        int i6 = 2;
        while (i6 <= 7 && !android.util.Log.isLoggable(this.f12933a, i6)) {
            i6++;
        }
        this.f12936d = i6;
    }

    public void a(java.lang.String str, java.lang.Object... objArr) {
        if (d(3)) {
            java.lang.String str2 = this.f12933a;
            c(str, objArr);
        }
    }

    public void b(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = this.f12933a;
        c(str, objArr);
    }

    protected java.lang.String c(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        return this.f12934b.concat(str);
    }

    public boolean d(int i6) {
        return this.f12936d <= i6;
    }
}
