.class public final synthetic Lcom/google/android/gms/internal/ads/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/F;

.field public final synthetic D:J

.field public final synthetic E:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/F;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y;->C:Lcom/google/android/gms/internal/ads/F;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/y;->D:J

    iput p4, p0, Lcom/google/android/gms/internal/ads/y;->E:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y;->C:Lcom/google/android/gms/internal/ads/F;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/y;->D:J

    iget v3, p0, Lcom/google/android/gms/internal/ads/y;->E:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/F;->n(JI)V

    return-void
.end method
