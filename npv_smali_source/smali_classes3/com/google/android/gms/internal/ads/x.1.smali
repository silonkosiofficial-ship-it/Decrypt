.class public final synthetic Lcom/google/android/gms/internal/ads/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/F;

.field public final synthetic D:Ljava/lang/Object;

.field public final synthetic E:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/F;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x;->C:Lcom/google/android/gms/internal/ads/F;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/x;->D:Ljava/lang/Object;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/x;->E:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x;->C:Lcom/google/android/gms/internal/ads/F;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x;->D:Ljava/lang/Object;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/x;->E:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/F;->m(Ljava/lang/Object;J)V

    return-void
.end method
