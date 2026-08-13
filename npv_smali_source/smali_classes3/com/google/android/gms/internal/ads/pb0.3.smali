.class public final synthetic Lcom/google/android/gms/internal/ads/pb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/tb0;

.field public final synthetic D:J

.field public final synthetic E:Lj$/util/Optional;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/tb0;JLj$/util/Optional;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pb0;->C:Lcom/google/android/gms/internal/ads/tb0;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/pb0;->D:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/pb0;->E:Lj$/util/Optional;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pb0;->C:Lcom/google/android/gms/internal/ads/tb0;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/pb0;->D:J

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/pb0;->E:Lj$/util/Optional;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/tb0;->q(JLj$/util/Optional;)V

    return-void
.end method
