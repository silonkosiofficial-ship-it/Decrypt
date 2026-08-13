.class public final synthetic Lcom/google/android/gms/internal/ads/rs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ys;

.field public final synthetic D:Z

.field public final synthetic E:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ys;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rs;->C:Lcom/google/android/gms/internal/ads/ys;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/rs;->D:Z

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/rs;->E:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rs;->C:Lcom/google/android/gms/internal/ads/ys;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/rs;->D:Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/rs;->E:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/ys;->J(ZJ)V

    return-void
.end method
