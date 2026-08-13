package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes2.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z6);

    void setAllowFileAccess(boolean z6);

    void setBlockNetworkLoads(boolean z6);

    void setCacheMode(int i6);

    void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> set);
}
