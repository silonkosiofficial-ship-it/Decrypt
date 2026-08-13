.class public final LB3/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LB3/M;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()LB3/L;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    iget-object v1, p0, LB3/M;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/SQ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/SQ;->a()Lcom/google/android/gms/internal/ads/QQ;

    move-result-object v1

    new-instance v2, LB3/L;

    invoke-direct {v2, v0, v1}, LB3/L;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/QQ;)V

    return-object v2
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB3/M;->a()LB3/L;

    move-result-object v0

    return-object v0
.end method
