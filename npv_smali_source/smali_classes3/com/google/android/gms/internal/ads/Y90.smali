.class public final Lcom/google/android/gms/internal/ads/Y90;
.super Lcom/google/android/gms/internal/ads/Fv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ba0;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ca0;->d0()Lcom/google/android/gms/internal/ads/ca0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Fv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/internal/ads/Z90;)Lcom/google/android/gms/internal/ads/Y90;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ca0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/aa0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/ca0;->e0(Lcom/google/android/gms/internal/ads/ca0;Lcom/google/android/gms/internal/ads/aa0;)V

    return-object p0
.end method

.method public final B()Lcom/google/android/gms/internal/ads/Y90;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ca0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ca0;->f0(Lcom/google/android/gms/internal/ads/ca0;)V

    return-object p0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ca0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ca0;->b0()I

    move-result v0

    return v0
.end method
