.class public final LB3/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcom/google/android/gms/internal/ads/QQ;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/QQ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/L;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LB3/L;->b:Lcom/google/android/gms/internal/ads/QQ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, LB3/L;->b:Lcom/google/android/gms/internal/ads/QQ;

    check-cast p1, Lcom/google/android/gms/internal/ads/Po;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/QQ;->c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object v0

    new-instance v1, LB3/K;

    invoke-direct {v1, p1}, LB3/K;-><init>(Lcom/google/android/gms/internal/ads/Po;)V

    iget-object p1, p0, LB3/L;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method
