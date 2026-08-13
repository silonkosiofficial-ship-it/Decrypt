.class public final synthetic Lcom/google/android/gms/internal/ads/gu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/QT;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/QT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gu;->C:Lcom/google/android/gms/internal/ads/QT;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gu;->C:Lcom/google/android/gms/internal/ads/QT;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/LT;->h(Lcom/google/android/gms/internal/ads/Bb0;)V

    return-void
.end method
