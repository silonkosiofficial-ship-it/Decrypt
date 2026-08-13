.class public final Lcom/google/android/gms/internal/ads/rd0;
.super Lcom/google/android/gms/internal/ads/Fv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/sd0;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/ads/td0;->c0()Lcom/google/android/gms/internal/ads/td0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Fv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/ads/rd0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast p1, Lcom/google/android/gms/internal/ads/td0;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/td0;->e0(Lcom/google/android/gms/internal/ads/td0;I)V

    return-object p0
.end method

.method public final z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rd0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/td0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/td0;->d0(Lcom/google/android/gms/internal/ads/td0;Ljava/lang/String;)V

    return-object p0
.end method
