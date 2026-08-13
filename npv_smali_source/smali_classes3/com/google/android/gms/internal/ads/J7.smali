.class public abstract Lcom/google/android/gms/internal/ads/J7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/q7;)Lcom/google/android/gms/internal/ads/e7;
    .locals 3

    .prologue
    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/r7;

    new-instance v0, Lcom/google/android/gms/internal/ads/D7;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/google/android/gms/internal/ads/D7;-><init>(Lcom/google/android/gms/internal/ads/C7;Ljavax/net/ssl/SSLSocketFactory;)V

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/r7;-><init>(Lcom/google/android/gms/internal/ads/q7;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/r7;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/r7;-><init>(Lcom/google/android/gms/internal/ads/q7;)V

    move-object p1, v0

    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/internal/ads/I7;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/I7;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/google/android/gms/internal/ads/e7;

    new-instance v1, Lcom/google/android/gms/internal/ads/y7;

    const/high16 v2, 0x500000

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/y7;-><init>(Lcom/google/android/gms/internal/ads/x7;I)V

    const/4 v0, 0x4

    invoke-direct {p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/e7;-><init>(Lcom/google/android/gms/internal/ads/N6;Lcom/google/android/gms/internal/ads/W6;I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/e7;->d()V

    return-object p0
.end method
