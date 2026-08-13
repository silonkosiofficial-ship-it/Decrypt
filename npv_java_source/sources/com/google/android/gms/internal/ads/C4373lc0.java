package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4373lc0 implements com.google.android.gms.internal.ads.InterfaceC4045ic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f37193a = new int[2];

    @Override // com.google.android.gms.internal.ads.InterfaceC4045ic0
    public final org.json.JSONObject a(android.view.View view) {
        if (view == null) {
            return com.google.android.gms.internal.ads.AbstractC5252tc0.a(0, 0, 0, 0);
        }
        int[] iArr = this.f37193a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f37193a;
        return com.google.android.gms.internal.ads.AbstractC5252tc0.a(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4045ic0
    public final void b(android.view.View view, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.InterfaceC3935hc0 interfaceC3935hc0, boolean z6, boolean z10) {
        int i6;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (!z6) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    interfaceC3935hc0.a(viewGroup.getChildAt(i10), this, jSONObject, z10);
                }
                return;
            }
            java.util.HashMap map = new java.util.HashMap();
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                android.view.View childAt = viewGroup.getChildAt(i11);
                java.util.ArrayList arrayList = (java.util.ArrayList) map.get(java.lang.Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    map.put(java.lang.Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.keySet());
            java.util.Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) map.get((java.lang.Float) arrayList2.get(i12));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    i6 = i12 + 1;
                    if (i13 < size2) {
                        interfaceC3935hc0.a((android.view.View) arrayList3.get(i13), this, jSONObject, z10);
                        i13++;
                    }
                }
                i12 = i6;
            }
        }
    }
}
