.class public final Lcom/google/android/gms/internal/ads/I90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/ci0;

.field public final b:Lcom/google/android/gms/internal/ads/b60;

.field public final c:Lcom/google/android/gms/internal/ads/d70;

.field public final d:Lcom/google/android/gms/internal/ads/h90;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Y40;Ljava/util/List;Lcom/google/android/gms/internal/ads/b60;Lcom/google/android/gms/internal/ads/d70;Lcom/google/android/gms/internal/ads/h90;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ci0;->M(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/I90;->a:Lcom/google/android/gms/internal/ads/ci0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/I90;->b:Lcom/google/android/gms/internal/ads/b60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/I90;->c:Lcom/google/android/gms/internal/ads/d70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/I90;->d:Lcom/google/android/gms/internal/ads/h90;

    return-void
.end method
