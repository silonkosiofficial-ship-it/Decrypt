.class public final synthetic Lcom/google/android/gms/internal/ads/iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/qQ;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/ZJ0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/qQ;Lcom/google/android/gms/internal/ads/ZJ0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iO;->C:Lcom/google/android/gms/internal/ads/qQ;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/iO;->D:Lcom/google/android/gms/internal/ads/ZJ0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iO;->C:Lcom/google/android/gms/internal/ads/qQ;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/iO;->D:Lcom/google/android/gms/internal/ads/ZJ0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ZJ0;->a:Lcom/google/android/gms/internal/ads/bK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/qQ;->a()I

    move-result v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/bK0;->e(Lcom/google/android/gms/internal/ads/bK0;I)V

    return-void
.end method
