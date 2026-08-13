.class public final Lcom/google/android/gms/internal/ads/fI;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fI;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fI;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/fI;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/fI;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/fI;->e:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fI;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/EH;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/EH;->a()Lcom/google/android/gms/internal/ads/lq;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fI;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fI;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/ads/pq;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fI;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/uH;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/uH;->a()Landroid/view/View;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fI;->e:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/ads/vd;

    new-instance v0, Lcom/google/android/gms/internal/ads/eI;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/eI;-><init>(Lcom/google/android/gms/internal/ads/lq;Landroid/content/Context;Lcom/google/android/gms/internal/ads/pq;Landroid/view/View;Lcom/google/android/gms/internal/ads/vd;)V

    return-object v0
.end method
