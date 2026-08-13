.class public final synthetic Lcom/google/android/gms/internal/ads/cR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    .prologue
    check-cast p1, Ljava/lang/Exception;

    const-string v0, "PreloadedLoader.getTypeTwoAdResponseString"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const-string v0, "Timed out waiting for ad response."

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/XV;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/ads/XV;

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/XV;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    const-string p1, "Fetch failed."

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    move-object p1, v0

    :goto_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method
