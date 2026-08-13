.class public abstract Lcom/google/android/gms/internal/ads/Te0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ll4/l;Ll4/b;)LP4/d;
    .locals 2

    new-instance p1, Lcom/google/android/gms/internal/ads/Se0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/ads/Se0;-><init>(Ljava/lang/Object;Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/fl0;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/Re0;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/Re0;-><init>(Lcom/google/android/gms/internal/ads/Se0;)V

    invoke-virtual {p0, v0, v1}, Ll4/l;->b(Ljava/util/concurrent/Executor;Ll4/f;)Ll4/l;

    return-object p1
.end method
