.class public final synthetic Lcom/google/android/gms/internal/ads/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/F;

.field public final synthetic D:I

.field public final synthetic E:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/F;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/w;->C:Lcom/google/android/gms/internal/ads/F;

    iput p2, p0, Lcom/google/android/gms/internal/ads/w;->D:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/w;->E:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/w;->C:Lcom/google/android/gms/internal/ads/F;

    iget v1, p0, Lcom/google/android/gms/internal/ads/w;->D:I

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/w;->E:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/F;->j(IJ)V

    return-void
.end method
