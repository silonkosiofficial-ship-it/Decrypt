.class public final Lcom/google/android/gms/internal/ads/eW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/cW;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;

.field private final e:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/cW;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eW;->a:Lcom/google/android/gms/internal/ads/cW;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eW;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/eW;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/eW;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/eW;->e:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eW;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV3/f;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eW;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/WV;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/WV;->a()Lcom/google/android/gms/internal/ads/VV;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eW;->d:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/bU;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eW;->e:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/La0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/eW;->a:Lcom/google/android/gms/internal/ads/cW;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/cW;->a(LV3/f;Lcom/google/android/gms/internal/ads/VV;Lcom/google/android/gms/internal/ads/bU;Lcom/google/android/gms/internal/ads/La0;)Lcom/google/android/gms/internal/ads/TV;

    move-result-object v0

    return-object v0
.end method
