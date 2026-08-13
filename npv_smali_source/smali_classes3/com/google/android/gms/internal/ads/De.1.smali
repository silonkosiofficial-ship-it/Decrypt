.class public final Lcom/google/android/gms/internal/ads/De;
.super Lcom/google/android/gms/internal/ads/Fv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ee;->e0()Lcom/google/android/gms/internal/ads/Ee;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Fv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ff;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/De;-><init>()V

    return-void
.end method


# virtual methods
.method public A(I)Lcom/google/android/gms/internal/ads/De;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Ee;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Ee;->h0(Lcom/google/android/gms/internal/ads/Ee;I)V

    return-object p0
.end method

.method public B()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Ee;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ee;->f0()Z

    move-result v0

    return v0
.end method

.method public z(Z)Lcom/google/android/gms/internal/ads/De;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Ee;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Ee;->g0(Lcom/google/android/gms/internal/ads/Ee;Z)V

    return-object p0
.end method
