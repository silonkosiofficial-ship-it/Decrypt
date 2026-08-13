.class public final Lcom/google/android/gms/internal/ads/NP;
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

.field private final g:Lcom/google/android/gms/internal/ads/rz0;

.field private final h:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NP;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/NP;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/NP;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/NP;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/NP;->e:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/NP;->f:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/NP;->g:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/NP;->h:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/android/gms/internal/ads/WP;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/nQ;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/ads/wP;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->e:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ov;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ov;->a()Lw3/a;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->f:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/android/gms/internal/ads/FP;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->g:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/internal/ads/iQ;

    new-instance v9, Lcom/google/android/gms/internal/ads/SP;

    invoke-direct {v9}, Lcom/google/android/gms/internal/ads/SP;-><init>()V

    new-instance v10, Lcom/google/android/gms/internal/ads/SP;

    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/SP;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NP;->h:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/fv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fv;->a()Ljava/lang/String;

    move-result-object v11

    new-instance v0, Lcom/google/android/gms/internal/ads/KP;

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/KP;-><init>(Lcom/google/android/gms/internal/ads/WP;Lcom/google/android/gms/internal/ads/nQ;Lcom/google/android/gms/internal/ads/wP;Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/FP;Lcom/google/android/gms/internal/ads/iQ;Lcom/google/android/gms/internal/ads/SP;Lcom/google/android/gms/internal/ads/SP;Ljava/lang/String;)V

    return-object v0
.end method
