.class public final Lcom/google/android/gms/internal/ads/vX;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vX;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vX;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vX;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/vX;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/vX;->e:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vX;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vX;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/jI;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jI;->a()Ls3/H;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vX;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/vC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vC;->a()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vX;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/cz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cz;->a()Lcom/google/android/gms/internal/ads/Qy;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vX;->e:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/ads/eO;

    new-instance v0, Lcom/google/android/gms/internal/ads/uX;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/uX;-><init>(Landroid/content/Context;Ls3/H;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/Qy;Lcom/google/android/gms/internal/ads/eO;)V

    return-object v0
.end method
