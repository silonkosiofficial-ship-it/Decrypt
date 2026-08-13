.class public final Lcom/google/android/gms/internal/ads/le;
.super Lcom/google/android/gms/internal/ads/Fv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/se;->e0()Lcom/google/android/gms/internal/ads/se;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Fv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ff;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/le;-><init>()V

    return-void
.end method


# virtual methods
.method public z(Lcom/google/android/gms/internal/ads/je;)Lcom/google/android/gms/internal/ads/le;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/se;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/ke;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/se;->f0(Lcom/google/android/gms/internal/ads/se;Lcom/google/android/gms/internal/ads/ke;)V

    return-object p0
.end method
