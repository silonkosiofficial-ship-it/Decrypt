.class public final Lcom/google/android/gms/internal/ads/zS;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/tS;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/tS;Lcom/google/android/gms/internal/ads/Yk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zS;->a:Lcom/google/android/gms/internal/ads/tS;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zS;->b:Lcom/google/android/gms/internal/ads/Yk0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Y80;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zS;->a:Lcom/google/android/gms/internal/ads/tS;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/xS;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/xS;-><init>(Lcom/google/android/gms/internal/ads/tS;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zS;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/yS;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/yS;-><init>(Lcom/google/android/gms/internal/ads/zS;Lcom/google/android/gms/internal/ads/Y80;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zS;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method
