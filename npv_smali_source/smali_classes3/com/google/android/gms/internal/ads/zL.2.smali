.class public final Lcom/google/android/gms/internal/ads/zL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zL;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zL;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zL;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zL;->d:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zL;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/yA;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yA;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zL;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ZI;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zL;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/xJ;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/xJ;->a()Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zL;->d:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/eO;

    new-instance v4, Lcom/google/android/gms/internal/ads/yL;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/yL;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ZI;Lcom/google/android/gms/internal/ads/eJ;Lcom/google/android/gms/internal/ads/eO;)V

    return-object v4
.end method
