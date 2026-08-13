package W5;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends W5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f15358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f15359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15361d;

    public d(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "lookupMap");
        this.f15358a = new java.util.LinkedHashMap();
        this.f15359b = new java.util.LinkedHashSet();
        java.util.Iterator it = list.iterator();
        int i6 = Integer.MAX_VALUE;
        int i10 = 0;
        while (it.hasNext()) {
            p087i7.u uVar = (p087i7.u) it.next();
            java.lang.String str = (java.lang.String) uVar.a();
            this.f15358a.put(str, (java.lang.String) uVar.b());
            this.f15359b.add(p087i7.J.e(p087i7.J.g((short) str.charAt(0))));
            int length = str.length();
            i6 = length < i6 ? length : i6;
            if (length > i10) {
                i10 = length;
            }
        }
        this.f15360c = i6;
        this.f15361d = i10;
    }

    @Override // W5.e
    public int a(java.lang.String str, int i6, java.lang.StringBuilder sb) {
        p247y7.AbstractC7350t.f(str, "input");
        p247y7.AbstractC7350t.f(sb, "stringBuilder");
        if (!this.f15359b.contains(p087i7.J.e(p087i7.J.g((short) str.charAt(i6))))) {
            return 0;
        }
        int length = this.f15361d;
        if (i6 + length > str.length()) {
            length = str.length() - i6;
        }
        int i10 = this.f15360c;
        if (i10 > length) {
            return 0;
        }
        while (true) {
            java.lang.CharSequence charSequenceSubSequence = str.subSequence(i6, i6 + length);
            java.lang.String str2 = (java.lang.String) this.f15358a.get(charSequenceSubSequence.toString());
            if (str2 != null) {
                sb.append(str2);
                return charSequenceSubSequence.length();
            }
            if (length == i10) {
                return 0;
            }
            length--;
        }
    }
}
