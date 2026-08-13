package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4263kc0 implements com.google.android.gms.internal.ads.InterfaceC4045ic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4045ic0 f36989a;

    public C4263kc0(com.google.android.gms.internal.ads.InterfaceC4045ic0 interfaceC4045ic0) {
        this.f36989a = interfaceC4045ic0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4045ic0
    public final org.json.JSONObject a(android.view.View view) {
        org.json.JSONObject jSONObjectA = com.google.android.gms.internal.ads.AbstractC5252tc0.a(0, 0, 0, 0);
        int iB = com.google.android.gms.internal.ads.AbstractC5582wc0.b();
        int i6 = iB - 1;
        if (iB == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i6 == 0);
        } catch (org.json.JSONException e6) {
            com.google.android.gms.internal.ads.AbstractC5362uc0.a("Error with setting output device status", e6);
        }
        return jSONObjectA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4045ic0
    public final void b(android.view.View view, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.InterfaceC3935hc0 interfaceC3935hc0, boolean z6, boolean z10) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.C2963Wb0 c2963Wb0A = com.google.android.gms.internal.ads.C2963Wb0.a();
        if (c2963Wb0A != null) {
            java.util.Collection collectionB = c2963Wb0A.b();
            int size = collectionB.size();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap(size + size + 3);
            java.util.Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                android.view.View viewF = ((com.google.android.gms.internal.ads.C2339Fb0) it.next()).f();
                if (viewF != null && viewF.isAttachedToWindow() && viewF.isShown()) {
                    android.view.View view2 = viewF;
                    while (true) {
                        if (view2 == null) {
                            android.view.View rootView = viewF.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z11 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i6 = size2 - 1;
                                    if (((android.view.View) arrayList.get(i6)).getZ() <= z11) {
                                        break;
                                    } else {
                                        size2 = i6;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        java.lang.Object parent = view2.getParent();
                        view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            interfaceC3935hc0.a((android.view.View) arrayList.get(i10), this.f36989a, jSONObject, z10);
        }
    }
}
