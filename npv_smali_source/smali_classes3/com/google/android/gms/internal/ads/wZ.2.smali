.class public final Lcom/google/android/gms/internal/ads/wZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:Lcom/google/android/gms/internal/ads/XA;

.field private final f:Lcom/google/android/gms/internal/ads/V70;

.field private final g:Lcom/google/android/gms/internal/ads/n70;

.field private final h:Lv3/s0;

.field private final i:Lcom/google/android/gms/internal/ads/YN;

.field private final j:Lcom/google/android/gms/internal/ads/lB;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/XA;Lcom/google/android/gms/internal/ads/V70;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/YN;Lcom/google/android/gms/internal/ads/lB;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wZ;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wZ;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wZ;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wZ;->e:Lcom/google/android/gms/internal/ads/XA;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/wZ;->f:Lcom/google/android/gms/internal/ads/V70;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/wZ;->g:Lcom/google/android/gms/internal/ads/n70;

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wZ;->h:Lv3/s0;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/wZ;->i:Lcom/google/android/gms/internal/ads/YN;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/wZ;->j:Lcom/google/android/gms/internal/ads/lB;

    iput-wide p9, p0, Lcom/google/android/gms/internal/ads/wZ;->d:J

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final b()LP4/d;
    .locals 9

    .prologue
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wZ;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "seq_num"

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/wZ;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wZ;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v1

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/wZ;->d:J

    sub-long/2addr v3, v5

    const-string v1, "tsacc"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wZ;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wZ;->a:Landroid/content/Context;

    invoke-static {v1}, Lv3/E0;->h(Landroid/content/Context;)Z

    move-result v1

    const/4 v3, 0x1

    if-eq v3, v1, :cond_0

    const-string v1, "1"

    goto :goto_0

    :cond_0
    const-string v1, "0"

    :goto_0
    const-string v3, "foreground"

    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wZ;->e:Lcom/google/android/gms/internal/ads/XA;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wZ;->g:Lcom/google/android/gms/internal/ads/n70;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/XA;->o(Ls3/X1;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wZ;->f:Lcom/google/android/gms/internal/ads/V70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/V70;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wZ;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/wZ;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/wZ;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/wZ;->h:Lv3/s0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wZ;->g:Lcom/google/android/gms/internal/ads/n70;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/wZ;->j:Lcom/google/android/gms/internal/ads/lB;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    new-instance v8, Lcom/google/android/gms/internal/ads/xZ;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/xZ;-><init>(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lv3/s0;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lB;)V

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method
