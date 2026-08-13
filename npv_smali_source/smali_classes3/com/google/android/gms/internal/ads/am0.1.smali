.class public abstract Lcom/google/android/gms/internal/ads/am0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/Nt0;->zza:I

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/am0;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 2

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/gm0;->d()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/or0;->a()V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/om0;->a(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Lm0;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/gp0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zm0;->a(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Wm0;->a(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/en0;->a(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jn0;->a(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/nn0;->a(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ao0;->a(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Tn0;->a(Z)V

    return-void
.end method
