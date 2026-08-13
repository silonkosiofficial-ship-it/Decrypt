.class public final synthetic Lcom/google/android/gms/internal/ads/jA0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aK;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/Rh;

    new-instance v0, Lcom/google/android/gms/internal/ads/TA0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/TA0;-><init>(I)V

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Qz0;->d(Ljava/lang/RuntimeException;I)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/Rh;->b0(Lcom/google/android/gms/internal/ads/Pf;)V

    return-void
.end method
