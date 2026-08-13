.class public final Lcom/google/android/gms/internal/ads/I50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/I50;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/I50;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/I50;->c:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/F50;
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I50;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/I50;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/X70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/I50;->c:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/q80;

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->g6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v3

    invoke-interface {v3}, Lv3/s0;->i()Lcom/google/android/gms/internal/ads/Oq;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v3

    invoke-interface {v3}, Lv3/s0;->g()Lcom/google/android/gms/internal/ads/Oq;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Oq;->h()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->i6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_3

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->f6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz v4, :cond_3

    :cond_2
    new-instance v3, Lcom/google/android/gms/internal/ads/f50;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/f50;-><init>()V

    sget-object v4, Lcom/google/android/gms/internal/ads/g80;->C:Lcom/google/android/gms/internal/ads/g80;

    new-instance v5, Lcom/google/android/gms/internal/ads/i50;

    invoke-direct {v5, v3}, Lcom/google/android/gms/internal/ads/i50;-><init>(Lcom/google/android/gms/internal/ads/F50;)V

    invoke-virtual {v2, v4, v0, v1, v5}, Lcom/google/android/gms/internal/ads/q80;->a(Lcom/google/android/gms/internal/ads/g80;Landroid/content/Context;Lcom/google/android/gms/internal/ads/X70;Lcom/google/android/gms/internal/ads/w80;)Lcom/google/android/gms/internal/ads/p80;

    move-result-object v0

    new-instance v7, Lcom/google/android/gms/internal/ads/k50;

    new-instance v2, Lcom/google/android/gms/internal/ads/u50;

    new-instance v1, Lcom/google/android/gms/internal/ads/t50;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/t50;-><init>()V

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/u50;-><init>(Lcom/google/android/gms/internal/ads/F50;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/p80;->a:Lcom/google/android/gms/internal/ads/b80;

    new-instance v3, Lcom/google/android/gms/internal/ads/q50;

    sget-object v6, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-direct {v3, v1, v6}, Lcom/google/android/gms/internal/ads/q50;-><init>(Lcom/google/android/gms/internal/ads/b80;Ljava/util/concurrent/Executor;)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/p80;->b:Lcom/google/android/gms/internal/ads/y80;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/p80;->a:Lcom/google/android/gms/internal/ads/b80;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/b80;->a()Lcom/google/android/gms/internal/ads/j80;

    move-result-object v0

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/j80;->J:Ljava/lang/String;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/k50;-><init>(Lcom/google/android/gms/internal/ads/F50;Lcom/google/android/gms/internal/ads/F50;Lcom/google/android/gms/internal/ads/y80;Ljava/lang/String;Ljava/util/concurrent/Executor;)V

    goto :goto_1

    :cond_3
    new-instance v7, Lcom/google/android/gms/internal/ads/t50;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/t50;-><init>()V

    :goto_1
    return-object v7
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/I50;->a()Lcom/google/android/gms/internal/ads/F50;

    move-result-object v0

    return-object v0
.end method
