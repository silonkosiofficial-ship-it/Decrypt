.class public final Lcom/google/android/gms/internal/ads/Le;
.super Lcom/google/android/gms/internal/ads/Fv0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nw0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Me;->d0()Lcom/google/android/gms/internal/ads/Me;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Fv0;-><init>(Lcom/google/android/gms/internal/ads/Jv0;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ff;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Le;-><init>()V

    return-void
.end method


# virtual methods
.method public z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Le;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Me;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Me;->b0(Lcom/google/android/gms/internal/ads/Me;Ljava/lang/String;)V

    return-object p0
.end method
