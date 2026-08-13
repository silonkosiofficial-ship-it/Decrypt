.class public final synthetic Lcom/google/android/gms/internal/ads/TJ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/UJ0;

.field public final synthetic D:I

.field public final synthetic E:J

.field public final synthetic F:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/UJ0;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/TJ0;->C:Lcom/google/android/gms/internal/ads/UJ0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/TJ0;->D:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/TJ0;->E:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/TJ0;->F:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TJ0;->C:Lcom/google/android/gms/internal/ads/UJ0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/UJ0;->b(Lcom/google/android/gms/internal/ads/UJ0;)Lcom/google/android/gms/internal/ads/WJ0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/TJ0;->D:I

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/TJ0;->E:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/TJ0;->F:J

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/WJ0;->x(IJJ)V

    return-void
.end method
