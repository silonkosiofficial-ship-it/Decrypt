.class public final synthetic Lcom/google/android/gms/internal/ads/mn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/kq0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/El0;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/wn0;

    sget v0, Lcom/google/android/gms/internal/ads/nn0;->d:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wn0;->b()Lcom/google/android/gms/internal/ads/Bn0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Bn0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wn0;->b()Lcom/google/android/gms/internal/ads/Bn0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Bn0;->b()Lcom/google/android/gms/internal/ads/cm0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ql0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Pl0;

    const/4 p1, 0x0

    throw p1
.end method
