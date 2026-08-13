.class public final Lcom/google/android/gms/internal/ads/OV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;

.field private final e:Lcom/google/android/gms/internal/ads/rz0;

.field private final f:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/OV;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/OV;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/OV;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/OV;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/OV;->e:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/OV;->f:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OV;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/android/gms/internal/ads/Su;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OV;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/wC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wC;->a()Lcom/google/android/gms/internal/ads/lC;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OV;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/dX;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dX;->a()Lcom/google/android/gms/internal/ads/bX;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OV;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ZF;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ZF;->a()Lcom/google/android/gms/internal/ads/EF;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OV;->e:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/ads/TV;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/OV;->f:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/android/gms/internal/ads/bU;

    new-instance v0, Lcom/google/android/gms/internal/ads/NV;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/NV;-><init>(Lcom/google/android/gms/internal/ads/Su;Lcom/google/android/gms/internal/ads/lC;Lcom/google/android/gms/internal/ads/bX;Lcom/google/android/gms/internal/ads/EF;Lcom/google/android/gms/internal/ads/TV;Lcom/google/android/gms/internal/ads/bU;)V

    return-object v0
.end method
