.class public final Lcom/google/android/gms/internal/ads/QG;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Lcom/google/android/gms/internal/ads/La0;

.field private final c:Lw3/w;

.field private d:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/La0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/R60;->p:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/QG;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/QG;->b:Lcom/google/android/gms/internal/ads/La0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->x0:Lw3/w;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QG;->c:Lw3/w;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/QG;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QG;->b:Lcom/google/android/gms/internal/ads/La0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/QG;->a:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/QG;->c:Lw3/w;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/La0;->e(Ljava/util/List;Lw3/w;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/QG;->d:Z

    :cond_0
    return-void
.end method
