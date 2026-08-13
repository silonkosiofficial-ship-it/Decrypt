.class final Lcom/google/android/gms/internal/ads/Kb0;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic C:Ljava/util/Timer;

.field final synthetic D:Lcom/google/android/gms/internal/ads/Nb0;

.field final synthetic E:Lcom/google/android/gms/internal/ads/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Nb0;Lcom/google/android/gms/internal/ads/iu;Ljava/util/Timer;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Kb0;->E:Lcom/google/android/gms/internal/ads/iu;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Kb0;->C:Ljava/util/Timer;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Kb0;->D:Lcom/google/android/gms/internal/ads/Nb0;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kb0;->D:Lcom/google/android/gms/internal/ads/Nb0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nb0;->d(Lcom/google/android/gms/internal/ads/Nb0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kb0;->E:Lcom/google/android/gms/internal/ads/iu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/iu;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kb0;->C:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method
