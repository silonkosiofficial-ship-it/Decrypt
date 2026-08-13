package p080i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p080i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.b.a f46616a = new i.b.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final android.content.Intent a(java.lang.String[] strArr) {
            p247y7.AbstractC7350t.f(strArr, "input");
            android.content.Intent intentPutExtra = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            p247y7.AbstractC7350t.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // p080i.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public android.content.Intent a(android.content.Context context, java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(strArr, "input");
        return f46616a.a(strArr);
    }

    @Override // p080i.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p080i.a.C0566a b(android.content.Context context, java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(strArr, "input");
        if (strArr.length == 0) {
            return new p080i.a.C0566a(p097j7.S.h());
        }
        for (java.lang.String str : strArr) {
            if (androidx.core.content.a.a(context, str) != 0) {
                return null;
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(strArr.length), 16));
        for (java.lang.String str2 : strArr) {
            p087i7.u uVarA = p087i7.B.a(str2, java.lang.Boolean.TRUE);
            linkedHashMap.put(uVarA.c(), uVarA.d());
        }
        return new p080i.a.C0566a(linkedHashMap);
    }

    @Override // p080i.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.util.Map c(int i6, android.content.Intent intent) {
        if (i6 == -1 && intent != null) {
            java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return p097j7.S.h();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(intArrayExtra.length);
            for (int i10 : intArrayExtra) {
                arrayList.add(java.lang.Boolean.valueOf(i10 == 0));
            }
            return p097j7.S.q(p097j7.AbstractC6879v.c1(p097j7.AbstractC6872n.W(stringArrayExtra), arrayList));
        }
        return p097j7.S.h();
    }
}
