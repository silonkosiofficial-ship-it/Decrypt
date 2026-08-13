.class public final Lcom/google/android/gms/internal/ads/yO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/uO;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/uO;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yO;->a:Lcom/google/android/gms/internal/ads/uO;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yO;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/uO;Lcom/google/android/gms/internal/ads/EO;Ljava/util/concurrent/Executor;)Ljava/util/Set;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/uO;->d(Lcom/google/android/gms/internal/ads/EO;Ljava/util/concurrent/Executor;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yO;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/EO;

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yO;->a:Lcom/google/android/gms/internal/ads/uO;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/yO;->a(Lcom/google/android/gms/internal/ads/uO;Lcom/google/android/gms/internal/ads/EO;Ljava/util/concurrent/Executor;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
