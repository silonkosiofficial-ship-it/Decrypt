.class final Lcom/google/android/gms/internal/ads/b7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ljava/lang/String;

.field final synthetic D:J

.field final synthetic E:Lcom/google/android/gms/internal/ads/d7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/d7;Ljava/lang/String;J)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/b7;->C:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/b7;->D:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/b7;->E:Lcom/google/android/gms/internal/ads/d7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b7;->E:Lcom/google/android/gms/internal/ads/d7;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/d7;->r(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/m7;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/b7;->C:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/b7;->D:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/m7;->a(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/b7;->E:Lcom/google/android/gms/internal/ads/d7;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/d7;->r(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/m7;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/m7;->b(Ljava/lang/String;)V

    return-void
.end method
