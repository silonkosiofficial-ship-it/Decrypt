.class public final synthetic Lcom/google/android/gms/internal/ads/Zn0;
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
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/co0;

    sget v0, Lcom/google/android/gms/internal/ads/ao0;->e:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/co0;->b()Lcom/google/android/gms/internal/ads/bo0;

    move-result-object p1

    const/16 v0, 0x20

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Mu0;->c(I)Lcom/google/android/gms/internal/ads/Mu0;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Wn0;->a(Lcom/google/android/gms/internal/ads/bo0;Lcom/google/android/gms/internal/ads/Mu0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/Wn0;

    move-result-object p1

    return-object p1
.end method
