.class public abstract Lcom/google/android/gms/internal/play_billing/W4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/android/billingclient/api/p;)Lcom/google/android/gms/internal/play_billing/x1;
    .locals 3

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/S4;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/play_billing/V4;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/V4;-><init>(Lcom/google/android/gms/internal/play_billing/S4;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/play_billing/S4;->b:Lcom/google/android/gms/internal/play_billing/V4;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/play_billing/S4;->a:Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/android/billingclient/api/p;->a(Lcom/google/android/gms/internal/play_billing/S4;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Lcom/google/android/gms/internal/play_billing/S4;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/play_billing/V4;->b(Ljava/lang/Throwable;)Z

    :goto_0
    return-object v1
.end method
