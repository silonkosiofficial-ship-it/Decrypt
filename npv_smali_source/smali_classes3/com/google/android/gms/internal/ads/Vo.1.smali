.class final Lcom/google/android/gms/internal/ads/Vo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Lcom/google/android/gms/internal/ads/To;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Wo;Lcom/google/android/gms/internal/ads/To;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Vo;->a:J

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Vo;->b:Lcom/google/android/gms/internal/ads/To;

    return-void
.end method
