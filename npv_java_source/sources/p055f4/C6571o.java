package p055f4;

/* JADX INFO: renamed from: f4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6571o implements p055f4.E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Application f45205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.C6575q f45206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f45207c;

    public C6571o(android.app.Application application, p055f4.C6575q c6575q, java.util.concurrent.Executor executor) {
        this.f45205a = application;
        this.f45206b = c6575q;
        this.f45207c = executor;
    }

    @Override // p055f4.E0
    public final java.util.concurrent.Executor a() {
        return this.f45207c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // p055f4.E0
    public final boolean b(java.lang.String str, org.json.JSONObject jSONObject) {
        byte b6;
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            if (iHashCode == 113399775 && str.equals("write")) {
                b6 = 0;
            } else {
                b6 = -1;
            }
        } else if (str.equals("clear")) {
            b6 = 1;
        } else {
            b6 = -1;
        }
        if (b6 == 0) {
            p055f4.C6577r0 c6577r0 = new p055f4.C6577r0(this.f45205a);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object objOpt = jSONObject.opt(next);
                java.lang.String str2 = "Writing to storage: [" + next + "] " + java.lang.String.valueOf(objOpt);
                if (c6577r0.c(next, objOpt)) {
                    this.f45206b.d().add(next);
                } else {
                    "Failed writing key: ".concat(java.lang.String.valueOf(next));
                }
            }
            this.f45206b.e();
            c6577r0.b();
            return true;
        }
        if (b6 != 1) {
            return false;
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            "Action[clear]: wrong args.".concat(java.lang.String.valueOf(jSONObject.toString()));
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                java.lang.String strOptString = jSONArrayOptJSONArray.optString(i6);
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    java.lang.String str3 = "Action[clear]: empty key at index: " + i6;
                } else {
                    hashSet.add(strOptString);
                }
            }
            p055f4.AbstractC6579s0.b(this.f45205a, hashSet);
        }
        return true;
    }
}
