.class public final Ls3/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Rl;

.field private final b:Ls3/b2;

.field private final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final d:Lk3/w;

.field final e:Ls3/z;

.field private f:Ls3/a;

.field private g:Lk3/d;

.field private h:[Lk3/h;

.field private i:Ll3/c;

.field private j:Ls3/V;

.field private k:Lk3/x;

.field private l:Ljava/lang/String;

.field private final m:Landroid/view/ViewGroup;

.field private n:I

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 7

    sget-object v4, Ls3/b2;->a:Ls3/b2;

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v6, p2

    invoke-direct/range {v0 .. v6}, Ls3/i1;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLs3/b2;Ls3/V;I)V

    return-void
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLs3/b2;Ls3/V;I)V
    .locals 23

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    iput-object v3, v1, Ls3/i1;->a:Lcom/google/android/gms/internal/ads/Rl;

    new-instance v3, Lk3/w;

    invoke-direct {v3}, Lk3/w;-><init>()V

    iput-object v3, v1, Ls3/i1;->d:Lk3/w;

    new-instance v3, Ls3/h1;

    invoke-direct {v3, v1}, Ls3/h1;-><init>(Ls3/i1;)V

    iput-object v3, v1, Ls3/i1;->e:Ls3/z;

    iput-object v2, v1, Ls3/i1;->m:Landroid/view/ViewGroup;

    move-object/from16 v3, p4

    iput-object v3, v1, Ls3/i1;->b:Ls3/b2;

    const/4 v3, 0x0

    iput-object v3, v1, Ls3/i1;->j:Ls3/V;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v3, v1, Ls3/i1;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    move/from16 v3, p6

    iput v3, v1, Ls3/i1;->n:I

    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    :try_start_0
    new-instance v5, Ls3/b;

    invoke-direct {v5, v3, v0}, Ls3/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    move/from16 v0, p3

    invoke-virtual {v5, v0}, Ls3/b;->b(Z)[Lk3/h;

    move-result-object v0

    iput-object v0, v1, Ls3/i1;->h:[Lk3/h;

    invoke-virtual {v5}, Ls3/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ls3/i1;->l:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v0

    iget-object v5, v1, Ls3/i1;->h:[Lk3/h;

    aget-object v4, v5, v4

    iget v5, v1, Ls3/i1;->n:I

    sget-object v6, Lk3/h;->q:Lk3/h;

    invoke-virtual {v4, v6}, Lk3/h;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    new-instance v3, Ls3/c2;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-string v8, "invalid"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v7, v3

    invoke-direct/range {v7 .. v22}, Ls3/c2;-><init>(Ljava/lang/String;IIZII[Ls3/c2;ZZZZZZZZ)V

    goto :goto_0

    :cond_0
    new-instance v6, Ls3/c2;

    invoke-direct {v6, v3, v4}, Ls3/c2;-><init>(Landroid/content/Context;Lk3/h;)V

    invoke-static {v5}, Ls3/i1;->b(I)Z

    move-result v3

    iput-boolean v3, v6, Ls3/c2;->L:Z

    move-object v3, v6

    :goto_0
    const-string v4, "Ads by Google"

    invoke-virtual {v0, v2, v3, v4}, Lw3/g;->o(Landroid/view/ViewGroup;Ls3/c2;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v4

    new-instance v5, Ls3/c2;

    sget-object v6, Lk3/h;->i:Lk3/h;

    invoke-direct {v5, v3, v6}, Ls3/c2;-><init>(Landroid/content/Context;Lk3/h;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v2, v5, v3, v0}, Lw3/g;->n(Landroid/view/ViewGroup;Ls3/c2;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private static a(Landroid/content/Context;[Lk3/h;I)Ls3/c2;
    .locals 20

    .prologue
    move-object/from16 v0, p1

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    sget-object v4, Lk3/h;->q:Lk3/h;

    invoke-virtual {v3, v4}, Lk3/h;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Ls3/c2;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v5, "invalid"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v19}, Ls3/c2;-><init>(Ljava/lang/String;IIZII[Ls3/c2;ZZZZZZZZ)V

    return-object v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ls3/c2;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Ls3/c2;-><init>(Landroid/content/Context;[Lk3/h;)V

    invoke-static/range {p2 .. p2}, Ls3/i1;->b(I)Z

    move-result v0

    iput-boolean v0, v1, Ls3/c2;->L:Z

    return-object v1
.end method

.method private static b(I)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static bridge synthetic g(Ls3/i1;)Lk3/w;
    .locals 0

    iget-object p0, p0, Ls3/i1;->d:Lk3/w;

    return-object p0
.end method


# virtual methods
.method public final c()Lk3/d;
    .locals 1

    iget-object v0, p0, Ls3/i1;->g:Lk3/d;

    return-object v0
.end method

.method public final d()Lk3/h;
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls3/V;->i()Ls3/c2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Ls3/c2;->G:I

    iget v2, v0, Ls3/c2;->D:I

    iget-object v0, v0, Ls3/c2;->C:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lk3/z;->c(IILjava/lang/String;)Lk3/h;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Ls3/i1;->h:[Lk3/h;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Lk3/o;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Lk3/u;
    .locals 3

    .prologue
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ls3/V;->k()Ls3/U0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-static {v0}, Lk3/u;->d(Ls3/U0;)Lk3/u;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lk3/w;
    .locals 1

    iget-object v0, p0, Ls3/i1;->d:Lk3/w;

    return-object v0
.end method

.method public final i()Ls3/Y0;
    .locals 3

    .prologue
    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Ls3/V;->l()Ls3/Y0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v1
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/i1;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Ls3/V;->t()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls3/i1;->l:Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Ls3/i1;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final k()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls3/V;->C()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method final synthetic l(LX3/a;)V
    .locals 1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Ls3/i1;->m:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final m(Ls3/f1;)V
    .locals 13

    .prologue
    const-string v0, "#007 Could not call remote method."

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Ls3/i1;->j:Ls3/V;

    const/4 v4, 0x0

    if-nez v3, :cond_7

    iget-object v3, p0, Ls3/i1;->h:[Lk3/h;

    if-eqz v3, :cond_6

    iget-object v3, p0, Ls3/i1;->l:Ljava/lang/String;

    if-eqz v3, :cond_6

    iget-object v3, p0, Ls3/i1;->m:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v5, p0, Ls3/i1;->h:[Lk3/h;

    iget v6, p0, Ls3/i1;->n:I

    invoke-static {v3, v5, v6}, Ls3/i1;->a(Landroid/content/Context;[Lk3/h;I)Ls3/c2;

    move-result-object v8

    const-string v5, "search_v2"

    iget-object v6, v8, Ls3/c2;->C:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v11, 0x0

    if-eqz v5, :cond_0

    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v5

    iget-object v6, p0, Ls3/i1;->l:Ljava/lang/String;

    new-instance v7, Ls3/n;

    invoke-direct {v7, v5, v3, v8, v6}, Ls3/n;-><init>(Ls3/w;Landroid/content/Context;Ls3/c2;Ljava/lang/String;)V

    invoke-virtual {v7, v3, v11}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v3

    :goto_0
    check-cast v3, Ls3/V;

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v6

    iget-object v9, p0, Ls3/i1;->l:Ljava/lang/String;

    iget-object v10, p0, Ls3/i1;->a:Lcom/google/android/gms/internal/ads/Rl;

    new-instance v12, Ls3/l;

    move-object v5, v12

    move-object v7, v3

    invoke-direct/range {v5 .. v10}, Ls3/l;-><init>(Ls3/w;Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V

    invoke-virtual {v12, v3, v11}, Ls3/x;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :goto_1
    iput-object v3, p0, Ls3/i1;->j:Ls3/V;

    new-instance v5, Ls3/P1;

    iget-object v6, p0, Ls3/i1;->e:Ls3/z;

    invoke-direct {v5, v6}, Ls3/P1;-><init>(Lk3/d;)V

    invoke-interface {v3, v5}, Ls3/V;->u3(Ls3/H;)V

    iget-object v3, p0, Ls3/i1;->f:Ls3/a;

    if-eqz v3, :cond_1

    iget-object v5, p0, Ls3/i1;->j:Ls3/V;

    new-instance v6, Ls3/v;

    invoke-direct {v6, v3}, Ls3/v;-><init>(Ls3/a;)V

    invoke-interface {v5, v6}, Ls3/V;->V5(Ls3/E;)V

    :cond_1
    iget-object v3, p0, Ls3/i1;->i:Ll3/c;

    if-eqz v3, :cond_2

    iget-object v5, p0, Ls3/i1;->j:Ls3/V;

    new-instance v6, Lcom/google/android/gms/internal/ads/bc;

    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/ads/bc;-><init>(Ll3/c;)V

    invoke-interface {v5, v6}, Ls3/V;->i2(Ls3/i0;)V

    :cond_2
    iget-object v3, p0, Ls3/i1;->k:Lk3/x;

    if-eqz v3, :cond_3

    iget-object v3, p0, Ls3/i1;->j:Ls3/V;

    new-instance v5, Ls3/Q1;

    iget-object v6, p0, Ls3/i1;->k:Lk3/x;

    invoke-direct {v5, v6}, Ls3/Q1;-><init>(Lk3/x;)V

    invoke-interface {v3, v5}, Ls3/V;->j4(Ls3/Q1;)V

    :cond_3
    iget-object v3, p0, Ls3/i1;->j:Ls3/V;

    new-instance v5, Ls3/H1;

    invoke-direct {v5, v4}, Ls3/H1;-><init>(Lk3/o;)V

    invoke-interface {v3, v5}, Ls3/V;->l1(Ls3/N0;)V

    iget-object v3, p0, Ls3/i1;->j:Ls3/V;

    iget-boolean v5, p0, Ls3/i1;->o:Z

    invoke-interface {v3, v5}, Ls3/V;->e6(Z)V

    iget-object v3, p0, Ls3/i1;->j:Ls3/V;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    :try_start_1
    invoke-interface {v3}, Ls3/V;->n()LX3/a;

    move-result-object v3

    if-eqz v3, :cond_7

    sget-object v5, Lcom/google/android/gms/internal/ads/Ag;->f:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_5

    sget-object v5, Lcom/google/android/gms/internal/ads/Af;->bb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_5

    sget-object v5, Lw3/g;->b:Landroid/os/Handler;

    new-instance v6, Ls3/g1;

    invoke-direct {v6, p0, v3}, Ls3/g1;-><init>(Ls3/i1;LX3/a;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :catch_1
    move-exception v3

    goto :goto_2

    :cond_5
    iget-object v5, p0, Ls3/i1;->m:Landroid/view/ViewGroup;

    invoke-static {v3}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :goto_2
    :try_start_2
    invoke-static {v0, v3}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size and ad unit ID must be set before loadAd is called."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    invoke-virtual {p1, v1, v2}, Ls3/f1;->o(J)V

    :cond_8
    iget-object v1, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v1, :cond_9

    iget-object v2, p0, Ls3/i1;->b:Ls3/b2;

    iget-object v3, p0, Ls3/i1;->m:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, p1}, Ls3/b2;->a(Landroid/content/Context;Ls3/f1;)Ls3/X1;

    move-result-object p1

    invoke-interface {v1, p1}, Ls3/V;->K3(Ls3/X1;)Z

    return-void

    :cond_9
    throw v4
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final n()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls3/V;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final o()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls3/V;->Y()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final p(Ls3/a;)V
    .locals 2

    .prologue
    :try_start_0
    iput-object p1, p0, Ls3/i1;->f:Ls3/a;

    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v1, Ls3/v;

    invoke-direct {v1, p1}, Ls3/v;-><init>(Ls3/a;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Ls3/V;->V5(Ls3/E;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :goto_1
    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final q(Lk3/d;)V
    .locals 1

    iput-object p1, p0, Ls3/i1;->g:Lk3/d;

    iget-object v0, p0, Ls3/i1;->e:Ls3/z;

    invoke-virtual {v0, p1}, Ls3/z;->r(Lk3/d;)V

    return-void
.end method

.method public final varargs r([Lk3/h;)V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/i1;->h:[Lk3/h;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Ls3/i1;->s([Lk3/h;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad size can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final varargs s([Lk3/h;)V
    .locals 3

    .prologue
    iput-object p1, p0, Ls3/i1;->h:[Lk3/h;

    :try_start_0
    iget-object p1, p0, Ls3/i1;->j:Ls3/V;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ls3/i1;->m:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Ls3/i1;->h:[Lk3/h;

    iget v2, p0, Ls3/i1;->n:I

    invoke-static {v0, v1, v2}, Ls3/i1;->a(Landroid/content/Context;[Lk3/h;I)Ls3/c2;

    move-result-object v0

    invoke-interface {p1, v0}, Ls3/V;->T1(Ls3/c2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Ls3/i1;->m:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/i1;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    iput-object p1, p0, Ls3/i1;->l:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ad unit ID can only be set once on AdView."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u(Ll3/c;)V
    .locals 2

    .prologue
    :try_start_0
    iput-object p1, p0, Ls3/i1;->i:Ll3/c;

    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/bc;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/bc;-><init>(Ll3/c;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Ls3/V;->i2(Ls3/i0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :goto_1
    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final v(Lk3/o;)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Ls3/i1;->j:Ls3/V;

    if-eqz v0, :cond_0

    new-instance v1, Ls3/H1;

    invoke-direct {v1, p1}, Ls3/H1;-><init>(Lk3/o;)V

    invoke-interface {v0, v1}, Ls3/V;->l1(Ls3/N0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
