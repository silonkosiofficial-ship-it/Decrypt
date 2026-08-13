.class public final Lcom/google/android/gms/internal/ads/cy0;
.super Lcom/google/android/gms/internal/ads/Fv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Fy0;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ey0;->c0()Lcom/google/android/gms/internal/ads/ey0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Fv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/cy0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast p1, Lcom/google/android/gms/internal/ads/ey0;

    const-string v0, "image/png"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ey0;->e0(Lcom/google/android/gms/internal/ads/ey0;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B(I)Lcom/google/android/gms/internal/ads/cy0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast p1, Lcom/google/android/gms/internal/ads/ey0;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ey0;->f0(Lcom/google/android/gms/internal/ads/ey0;I)V

    return-object p0
.end method

.method public final z(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/cy0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ey0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/ey0;->d0(Lcom/google/android/gms/internal/ads/ey0;Lcom/google/android/gms/internal/ads/fv0;)V

    return-object p0
.end method
