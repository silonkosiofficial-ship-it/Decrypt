.class final Lcom/google/android/gms/internal/ads/oB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/fB0;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/GH0;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/List;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/NH0;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/GH0;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/GH0;-><init>(Lcom/google/android/gms/internal/ads/NH0;Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/oB0;->a:Lcom/google/android/gms/internal/ads/GH0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oB0;->c:Ljava/util/List;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oB0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/qm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oB0;->a:Lcom/google/android/gms/internal/ads/GH0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/GH0;->G()Lcom/google/android/gms/internal/ads/qm;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oB0;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/oB0;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/oB0;->e:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oB0;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method
