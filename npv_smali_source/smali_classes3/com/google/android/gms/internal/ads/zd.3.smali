.class public final Lcom/google/android/gms/internal/ads/zd;
.super Lcom/google/android/gms/internal/ads/Fv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ed;->e0()Lcom/google/android/gms/internal/ads/Ed;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Fv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ff;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zd;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Lcom/google/android/gms/internal/ads/Cd;)Lcom/google/android/gms/internal/ads/zd;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Ed;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Ed;->g0(Lcom/google/android/gms/internal/ads/Ed;Lcom/google/android/gms/internal/ads/Cd;)V

    return-object p0
.end method

.method public z(Lcom/google/android/gms/internal/ads/Ad;)Lcom/google/android/gms/internal/ads/zd;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Ed;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Ed;->f0(Lcom/google/android/gms/internal/ads/Ed;Lcom/google/android/gms/internal/ads/Ad;)V

    return-object p0
.end method
