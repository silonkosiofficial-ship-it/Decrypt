.class public final synthetic Lcom/google/android/gms/internal/ads/ym0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Np0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/El0;
    .locals 2

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Dm0;

    sget v0, Lcom/google/android/gms/internal/ads/zm0;->d:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Dm0;->c()I

    move-result v0

    const/16 v1, 0x18

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/um0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/um0;-><init>(Lcom/google/android/gms/internal/ads/vm0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/um0;->c(Lcom/google/android/gms/internal/ads/Dm0;)Lcom/google/android/gms/internal/ads/um0;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/um0;->a(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/um0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Dm0;->c()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Mu0;->c(I)Lcom/google/android/gms/internal/ads/Mu0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/um0;->b(Lcom/google/android/gms/internal/ads/Mu0;)Lcom/google/android/gms/internal/ads/um0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/um0;->d()Lcom/google/android/gms/internal/ads/wm0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "192 bit AES GCM Parameters are not valid"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
