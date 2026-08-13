.class public final synthetic Lcom/google/android/gms/internal/ads/QK0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/d;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/I;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/Os;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/d;Lcom/google/android/gms/internal/ads/I;Lcom/google/android/gms/internal/ads/Os;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QK0;->C:Lcom/google/android/gms/internal/ads/d;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/QK0;->D:Lcom/google/android/gms/internal/ads/I;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/QK0;->E:Lcom/google/android/gms/internal/ads/Os;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QK0;->D:Lcom/google/android/gms/internal/ads/I;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/QK0;->C:Lcom/google/android/gms/internal/ads/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/QK0;->E:Lcom/google/android/gms/internal/ads/Os;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/I;->b(Lcom/google/android/gms/internal/ads/L;Lcom/google/android/gms/internal/ads/Os;)V

    return-void
.end method
