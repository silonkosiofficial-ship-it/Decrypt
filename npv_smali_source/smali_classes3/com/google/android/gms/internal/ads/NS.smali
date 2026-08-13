.class public final Lcom/google/android/gms/internal/ads/NS;
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


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NS;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/NS;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/NS;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/NS;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/NS;->e:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/LS;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NS;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NS;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/hC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/hC;->a()Lcom/google/android/gms/internal/ads/gC;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NS;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/ads/DS;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NS;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/AS;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/AS;->a()Lcom/google/android/gms/internal/ads/zS;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NS;->e:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Xu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xu;->a()Lv3/s0;

    move-result-object v6

    new-instance v0, Lcom/google/android/gms/internal/ads/LS;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/LS;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/gC;Lcom/google/android/gms/internal/ads/DS;Lcom/google/android/gms/internal/ads/zS;Lv3/s0;)V

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NS;->a()Lcom/google/android/gms/internal/ads/LS;

    move-result-object v0

    return-object v0
.end method
