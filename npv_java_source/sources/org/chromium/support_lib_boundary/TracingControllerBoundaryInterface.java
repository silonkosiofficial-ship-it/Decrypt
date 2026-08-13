package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes2.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i6, java.util.Collection<java.lang.String> collection, int i10);

    boolean stop(java.io.OutputStream outputStream, java.util.concurrent.Executor executor);
}
