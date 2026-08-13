.class public final Lcom/google/android/gms/internal/ads/hC;
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

.field private final i:Lcom/google/android/gms/internal/ads/rz0;

.field private final j:Lcom/google/android/gms/internal/ads/rz0;

.field private final k:Lcom/google/android/gms/internal/ads/rz0;

.field private final l:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hC;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hC;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hC;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hC;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/hC;->e:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/hC;->f:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/hC;->g:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/hC;->h:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/hC;->i:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/hC;->j:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/hC;->k:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/hC;->l:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/gC;
    .locals 15

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/android/gms/internal/ads/v90;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ov;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ov;->a()Lw3/a;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/content/pm/ApplicationInfo;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/JQ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/JQ;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/ads/p00;->c()Ljava/util/List;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->e:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/content/pm/PackageInfo;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->f:Lcom/google/android/gms/internal/ads/rz0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mz0;->a(Lcom/google/android/gms/internal/ads/rz0;)Lcom/google/android/gms/internal/ads/kz0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zy0;->a(Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/Uy0;

    move-result-object v8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->g:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/Xu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xu;->a()Lv3/s0;

    move-result-object v9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->h:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->i:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/P20;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/P20;->a()Lcom/google/android/gms/internal/ads/O20;

    move-result-object v11

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->j:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/vC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vC;->a()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v12

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->k:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/google/android/gms/internal/ads/wF;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hC;->l:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v14

    new-instance v0, Lcom/google/android/gms/internal/ads/gC;

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/internal/ads/gC;-><init>(Lcom/google/android/gms/internal/ads/v90;Lw3/a;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Lcom/google/android/gms/internal/ads/Uy0;Lv3/s0;Ljava/lang/String;Lcom/google/android/gms/internal/ads/O20;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/wF;I)V

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/hC;->a()Lcom/google/android/gms/internal/ads/gC;

    move-result-object v0

    return-object v0
.end method
