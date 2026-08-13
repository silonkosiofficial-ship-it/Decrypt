.class public final Lcom/google/android/gms/internal/ads/j4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/ci0;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Ljava/util/List;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ci0;->M(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j4;->a:Lcom/google/android/gms/internal/ads/ci0;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/j4;->b:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/j4;->c:J

    return-void
.end method
