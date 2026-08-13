.class public abstract Landroidx/fragment/app/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/n$j;,
        Landroidx/fragment/app/n$k;,
        Landroidx/fragment/app/n$m;,
        Landroidx/fragment/app/n$l;
    }
.end annotation


# static fields
.field private static S:Z


# instance fields
.field private A:Landroidx/fragment/app/j;

.field private B:Landroidx/fragment/app/B;

.field private C:Landroidx/fragment/app/B;

.field private D:Lh/c;

.field private E:Lh/c;

.field private F:Lh/c;

.field G:Ljava/util/ArrayDeque;

.field private H:Z

.field private I:Z

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:Ljava/util/ArrayList;

.field private N:Ljava/util/ArrayList;

.field private O:Ljava/util/ArrayList;

.field private P:Landroidx/fragment/app/q;

.field private Q:LW1/c$c;

.field private R:Ljava/lang/Runnable;

.field private final a:Ljava/util/ArrayList;

.field private b:Z

.field private final c:Landroidx/fragment/app/t;

.field d:Ljava/util/ArrayList;

.field private e:Ljava/util/ArrayList;

.field private final f:Landroidx/fragment/app/l;

.field private g:Le/x;

.field private final h:Le/w;

.field private final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final j:Ljava/util/Map;

.field private final k:Ljava/util/Map;

.field private final l:Ljava/util/Map;

.field private m:Ljava/util/ArrayList;

.field private final n:Landroidx/fragment/app/m;

.field private final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final p:LB1/a;

.field private final q:LB1/a;

.field private final r:LB1/a;

.field private final s:LB1/a;

.field private final t:Landroidx/core/view/z;

.field u:I

.field private v:Landroidx/fragment/app/k;

.field private w:LV1/e;

.field private x:Landroidx/fragment/app/f;

.field y:Landroidx/fragment/app/f;

.field private z:Landroidx/fragment/app/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    new-instance v0, Landroidx/fragment/app/t;

    invoke-direct {v0}, Landroidx/fragment/app/t;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    new-instance v0, Landroidx/fragment/app/l;

    invoke-direct {v0, p0}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->f:Landroidx/fragment/app/l;

    new-instance v0, Landroidx/fragment/app/n$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/n$b;-><init>(Landroidx/fragment/app/n;Z)V

    iput-object v0, p0, Landroidx/fragment/app/n;->h:Le/w;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->l:Ljava/util/Map;

    new-instance v0, Landroidx/fragment/app/m;

    invoke-direct {v0, p0}, Landroidx/fragment/app/m;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->n:Landroidx/fragment/app/m;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, LV1/f;

    invoke-direct {v0, p0}, LV1/f;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->p:LB1/a;

    new-instance v0, LV1/g;

    invoke-direct {v0, p0}, LV1/g;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->q:LB1/a;

    new-instance v0, LV1/h;

    invoke-direct {v0, p0}, LV1/h;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->r:LB1/a;

    new-instance v0, LV1/i;

    invoke-direct {v0, p0}, LV1/i;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->s:LB1/a;

    new-instance v0, Landroidx/fragment/app/n$c;

    invoke-direct {v0, p0}, Landroidx/fragment/app/n$c;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->t:Landroidx/core/view/z;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/n;->u:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/n;->z:Landroidx/fragment/app/j;

    new-instance v1, Landroidx/fragment/app/n$d;

    invoke-direct {v1, p0}, Landroidx/fragment/app/n$d;-><init>(Landroidx/fragment/app/n;)V

    iput-object v1, p0, Landroidx/fragment/app/n;->A:Landroidx/fragment/app/j;

    iput-object v0, p0, Landroidx/fragment/app/n;->B:Landroidx/fragment/app/B;

    new-instance v0, Landroidx/fragment/app/n$e;

    invoke-direct {v0, p0}, Landroidx/fragment/app/n$e;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->C:Landroidx/fragment/app/B;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->G:Ljava/util/ArrayDeque;

    new-instance v0, Landroidx/fragment/app/n$f;

    invoke-direct {v0, p0}, Landroidx/fragment/app/n$f;-><init>(Landroidx/fragment/app/n;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->R:Ljava/lang/Runnable;

    return-void
.end method

.method public static E0(I)Z
    .locals 1

    .prologue
    sget-boolean v0, Landroidx/fragment/app/n;->S:Z

    if-nez v0, :cond_1

    const-string v0, "FragmentManager"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private F0(Landroidx/fragment/app/f;)Z
    .locals 1

    .prologue
    iget-boolean v0, p1, Landroidx/fragment/app/f;->g0:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Landroidx/fragment/app/f;->h0:Z

    if-nez v0, :cond_1

    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private G0()Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/f;->a0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object v0

    invoke-direct {v0}, Landroidx/fragment/app/n;->G0()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private J(Landroidx/fragment/app/f;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->c0(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/f;->h1()V

    :cond_0
    return-void
.end method

.method private synthetic M0()Landroid/os/Bundle;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/n;->g1()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method private synthetic N0(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/fragment/app/n;->G0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/n;->x(Landroid/content/res/Configuration;Z)V

    :cond_0
    return-void
.end method

.method private synthetic O0(Ljava/lang/Integer;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/fragment/app/n;->G0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x50

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/n;->D(Z)V

    :cond_0
    return-void
.end method

.method private synthetic P0(Landroidx/core/app/g;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/fragment/app/n;->G0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/core/app/g;->a()Z

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/n;->E(ZZ)V

    :cond_0
    return-void
.end method

.method private Q(I)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/n;->b:Z

    iget-object v2, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/t;->d(I)V

    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/n;->S0(IZ)V

    invoke-direct {p0}, Landroidx/fragment/app/n;->r()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/A;

    invoke-virtual {v2}, Landroidx/fragment/app/A;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iput-boolean v1, p0, Landroidx/fragment/app/n;->b:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->Y(Z)Z

    return-void

    :goto_1
    iput-boolean v1, p0, Landroidx/fragment/app/n;->b:Z

    throw p1
.end method

.method private synthetic Q0(Landroidx/core/app/p;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/fragment/app/n;->G0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/core/app/p;->a()Z

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/n;->L(ZZ)V

    :cond_0
    return-void
.end method

.method private T()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/n;->L:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->L:Z

    invoke-direct {p0}, Landroidx/fragment/app/n;->n1()V

    :cond_0
    return-void
.end method

.method private V()V
    .locals 2

    .prologue
    invoke-direct {p0}, Landroidx/fragment/app/n;->r()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/A;

    invoke-virtual {v1}, Landroidx/fragment/app/A;->j()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private X(Z)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/n;->b:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/n;->K:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v1}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_4

    if-nez p1, :cond_2

    invoke-direct {p0}, Landroidx/fragment/app/n;->o()V

    :cond_2
    iget-object p1, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    if-nez p1, :cond_3

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private Z0(Ljava/lang/String;II)Z
    .locals 8

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->Y(Z)Z

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->X(Z)V

    iget-object v1, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    if-eqz v1, :cond_0

    if-gez p2, :cond_0

    if-nez p1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/f;->s()Landroidx/fragment/app/n;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/n;->X0()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    iget-object v3, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    invoke-virtual/range {v2 .. v7}, Landroidx/fragment/app/n;->a1(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->b:Z

    :try_start_0
    iget-object p2, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    iget-object p3, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    invoke-direct {p0, p2, p3}, Landroidx/fragment/app/n;->c1(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Landroidx/fragment/app/n;->p()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Landroidx/fragment/app/n;->p()V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0}, Landroidx/fragment/app/n;->p1()V

    invoke-direct {p0}, Landroidx/fragment/app/n;->T()V

    iget-object p2, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {p2}, Landroidx/fragment/app/t;->b()V

    return p1
.end method

.method public static synthetic a(Landroidx/fragment/app/n;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->O0(Ljava/lang/Integer;)V

    return-void
.end method

.method private static a0(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 2

    .prologue
    :goto_0
    if-ge p2, p3, :cond_1

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/a;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/a;->p(I)V

    invoke-virtual {v0}, Landroidx/fragment/app/a;->u()V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/a;->p(I)V

    invoke-virtual {v0}, Landroidx/fragment/app/a;->t()V

    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic b(Landroidx/fragment/app/n;)Landroid/os/Bundle;
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/n;->M0()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method private b0(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 8

    .prologue
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/a;

    iget-boolean v0, v0, Landroidx/fragment/app/u;->r:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->O:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/n;->O:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/n;->O:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v2}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/n;->v0()Landroidx/fragment/app/f;

    move-result-object v1

    const/4 v2, 0x0

    move v3, p3

    move v4, v2

    :goto_1
    const/4 v5, 0x1

    if-ge v3, p4, :cond_4

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/a;

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_1

    iget-object v7, p0, Landroidx/fragment/app/n;->O:Ljava/util/ArrayList;

    invoke-virtual {v6, v7, v1}, Landroidx/fragment/app/a;->v(Ljava/util/ArrayList;Landroidx/fragment/app/f;)Landroidx/fragment/app/f;

    move-result-object v1

    goto :goto_2

    :cond_1
    iget-object v7, p0, Landroidx/fragment/app/n;->O:Ljava/util/ArrayList;

    invoke-virtual {v6, v7, v1}, Landroidx/fragment/app/a;->y(Ljava/util/ArrayList;Landroidx/fragment/app/f;)Landroidx/fragment/app/f;

    move-result-object v1

    :goto_2
    if-nez v4, :cond_3

    iget-boolean v4, v6, Landroidx/fragment/app/u;->i:Z

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    move v4, v2

    goto :goto_4

    :cond_3
    :goto_3
    move v4, v5

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    iget-object v1, p0, Landroidx/fragment/app/n;->O:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v0, :cond_7

    iget v0, p0, Landroidx/fragment/app/n;->u:I

    if-lt v0, v5, :cond_7

    move v0, p3

    :goto_5
    if-ge v0, p4, :cond_7

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/a;

    iget-object v1, v1, Landroidx/fragment/app/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/u$a;

    iget-object v2, v2, Landroidx/fragment/app/u$a;->b:Landroidx/fragment/app/f;

    if-eqz v2, :cond_5

    iget-object v3, v2, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2}, Landroidx/fragment/app/n;->t(Landroidx/fragment/app/f;)Landroidx/fragment/app/s;

    move-result-object v2

    iget-object v3, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v3, v2}, Landroidx/fragment/app/t;->r(Landroidx/fragment/app/s;)V

    goto :goto_6

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_7
    invoke-static {p1, p2, p3, p4}, Landroidx/fragment/app/n;->a0(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v0, p4, -0x1

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v1, p3

    :goto_7
    if-ge v1, p4, :cond_c

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a;

    if-eqz v0, :cond_9

    iget-object v3, v2, Landroidx/fragment/app/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v5

    :goto_8
    if-ltz v3, :cond_b

    iget-object v6, v2, Landroidx/fragment/app/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/u$a;

    iget-object v6, v6, Landroidx/fragment/app/u$a;->b:Landroidx/fragment/app/f;

    if-eqz v6, :cond_8

    invoke-virtual {p0, v6}, Landroidx/fragment/app/n;->t(Landroidx/fragment/app/f;)Landroidx/fragment/app/s;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/s;->m()V

    :cond_8
    add-int/lit8 v3, v3, -0x1

    goto :goto_8

    :cond_9
    iget-object v2, v2, Landroidx/fragment/app/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/u$a;

    iget-object v3, v3, Landroidx/fragment/app/u$a;->b:Landroidx/fragment/app/f;

    if-eqz v3, :cond_a

    invoke-virtual {p0, v3}, Landroidx/fragment/app/n;->t(Landroidx/fragment/app/f;)Landroidx/fragment/app/s;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/fragment/app/s;->m()V

    goto :goto_9

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_c
    iget v1, p0, Landroidx/fragment/app/n;->u:I

    invoke-virtual {p0, v1, v5}, Landroidx/fragment/app/n;->S0(IZ)V

    invoke-direct {p0, p1, p3, p4}, Landroidx/fragment/app/n;->s(Ljava/util/ArrayList;II)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/A;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/A;->r(Z)V

    invoke-virtual {v2}, Landroidx/fragment/app/A;->p()V

    invoke-virtual {v2}, Landroidx/fragment/app/A;->g()V

    goto :goto_a

    :cond_d
    :goto_b
    if-ge p3, p4, :cond_f

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/a;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_e

    iget v1, v0, Landroidx/fragment/app/a;->v:I

    if-ltz v1, :cond_e

    const/4 v1, -0x1

    iput v1, v0, Landroidx/fragment/app/a;->v:I

    :cond_e
    invoke-virtual {v0}, Landroidx/fragment/app/a;->x()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_b

    :cond_f
    if-eqz v4, :cond_10

    invoke-direct {p0}, Landroidx/fragment/app/n;->d1()V

    :cond_10
    return-void
.end method

.method public static synthetic c(Landroidx/fragment/app/n;Landroidx/core/app/p;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->Q0(Landroidx/core/app/p;)V

    return-void
.end method

.method private c1(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/u;->r:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-direct {p0, p1, p2, v2, v1}, Landroidx/fragment/app/n;->b0(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/u;->r:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1, p2, v1, v2}, Landroidx/fragment/app/n;->b0(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-direct {p0, p1, p2, v2, v0}, Landroidx/fragment/app/n;->b0(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic d(Landroidx/fragment/app/n;Landroidx/core/app/g;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->P0(Landroidx/core/app/g;)V

    return-void
.end method

.method private d0(Ljava/lang/String;IZ)I
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    const/4 v1, -0x1

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    if-nez p1, :cond_2

    if-gez p2, :cond_2

    if-eqz p3, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_5

    iget-object v2, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a;

    if-eqz p1, :cond_3

    invoke-virtual {v2}, Landroidx/fragment/app/a;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    if-ltz p2, :cond_4

    iget v2, v2, Landroidx/fragment/app/a;->v:I

    if-ne p2, v2, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-gez v0, :cond_6

    return v0

    :cond_6
    if-eqz p3, :cond_9

    :goto_2
    if-lez v0, :cond_b

    iget-object p3, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/fragment/app/a;

    if-eqz p1, :cond_7

    invoke-virtual {p3}, Landroidx/fragment/app/a;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    if-ltz p2, :cond_b

    iget p3, p3, Landroidx/fragment/app/a;->v:I

    if-ne p2, p3, :cond_b

    :cond_8
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_9
    iget-object p1, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ne v0, p1, :cond_a

    return v1

    :cond_a
    add-int/lit8 v0, v0, 0x1

    :cond_b
    return v0

    :cond_c
    :goto_3
    return v1
.end method

.method private d1()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->m:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic e(Landroidx/fragment/app/n;Landroid/content/res/Configuration;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->N0(Landroid/content/res/Configuration;)V

    return-void
.end method

.method static synthetic f(Landroidx/fragment/app/n;)Landroidx/fragment/app/t;
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    return-object p0
.end method

.method static f1(I)I
    .locals 3

    .prologue
    const/16 v0, 0x2002

    const/16 v1, 0x1001

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_0

    const/16 v0, 0x1004

    const/16 v1, 0x2005

    if-eq p0, v1, :cond_2

    const/16 v2, 0x1003

    if-eq p0, v2, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :cond_2
    :goto_0
    return v0
.end method

.method static h0(Landroid/view/View;)Landroidx/fragment/app/n;
    .locals 4

    .prologue
    invoke-static {p0}, Landroidx/fragment/app/n;->i0(Landroid/view/View;)Landroidx/fragment/app/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/f;->a0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/f;->s()Landroidx/fragment/app/n;

    move-result-object p0

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The Fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " that owns View "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " has already been destroyed. Nested fragments should always use the child FragmentManager."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_3

    instance-of v1, v0, Landroidx/fragment/app/g;

    if-eqz v1, :cond_2

    check-cast v0, Landroidx/fragment/app/g;

    goto :goto_1

    :cond_2
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroidx/fragment/app/g;->e0()Landroidx/fragment/app/n;

    move-result-object p0

    :goto_2
    return-object p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "View "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not within a subclass of FragmentActivity."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static i0(Landroid/view/View;)Landroidx/fragment/app/f;
    .locals 2

    .prologue
    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-static {p0}, Landroidx/fragment/app/n;->y0(Landroid/view/View;)Landroidx/fragment/app/f;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_1

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_1
    move-object p0, v0

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private j0()V
    .locals 2

    .prologue
    invoke-direct {p0}, Landroidx/fragment/app/n;->r()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/A;

    invoke-virtual {v1}, Landroidx/fragment/app/A;->k()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private k0(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :try_start_1
    iget-object v1, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v4, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/n$l;

    invoke-interface {v4, p1, p2}, Landroidx/fragment/app/n$l;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_2
    iget-object p1, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {p1}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Landroidx/fragment/app/n;->R:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v0

    return v3

    :goto_1
    iget-object p2, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    iget-object p2, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {p2}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object p2

    iget-object v1, p0, Landroidx/fragment/app/n;->R:Ljava/lang/Runnable;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    throw p1

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private l1(Landroidx/fragment/app/f;)V
    .locals 3

    .prologue
    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->o0(Landroidx/fragment/app/f;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/f;->v()I

    move-result v1

    invoke-virtual {p1}, Landroidx/fragment/app/f;->y()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroidx/fragment/app/f;->J()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroidx/fragment/app/f;->K()I

    move-result v2

    add-int/2addr v1, v2

    if-lez v1, :cond_1

    sget v1, LU1/b;->c:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    sget v1, LU1/b;->c:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    sget v1, LU1/b;->c:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/f;

    invoke-virtual {p1}, Landroidx/fragment/app/f;->I()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/f;->y1(Z)V

    :cond_1
    return-void
.end method

.method private m0(Landroidx/fragment/app/f;)Landroidx/fragment/app/q;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/q;->m(Landroidx/fragment/app/f;)Landroidx/fragment/app/q;

    move-result-object p1

    return-object p1
.end method

.method private n1()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/s;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/n;->V0(Landroidx/fragment/app/s;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/fragment/app/n;->L0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private o0(Landroidx/fragment/app/f;)Landroid/view/ViewGroup;
    .locals 2

    .prologue
    iget-object v0, p1, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Landroidx/fragment/app/f;->a0:I

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/n;->w:LV1/e;

    invoke-virtual {v0}, LV1/e;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/n;->w:LV1/e;

    iget p1, p1, Landroidx/fragment/app/f;->a0:I

    invoke-virtual {v0, p1}, LV1/e;->h(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    return-object v1
.end method

.method private o1(Ljava/lang/RuntimeException;)V
    .locals 7

    .prologue
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    const-string v0, "Activity state:"

    nop

    new-instance v0, Landroidx/fragment/app/z;

    invoke-direct {v0, v1}, Landroidx/fragment/app/z;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    const-string v3, "Failed dumping state"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "  "

    if-eqz v0, :cond_0

    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v0, v6, v5, v2, v4}, Landroidx/fragment/app/k;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    nop

    goto :goto_0

    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    invoke-virtual {p0, v6, v5, v2, v0}, Landroidx/fragment/app/n;->U(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    throw p1
.end method

.method private p()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->b:Z

    iget-object v0, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private p1()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/n;->h:Le/w;

    invoke-virtual {v1, v2}, Le/w;->j(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/fragment/app/n;->h:Le/w;

    invoke-virtual {p0}, Landroidx/fragment/app/n;->l0()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/n;->J0(Landroidx/fragment/app/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Le/w;->j(Z)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private q()V
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v1, v0, Landroidx/lifecycle/Y;

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->p()Landroidx/fragment/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->q()Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/n;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->C:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v3}, Landroidx/fragment/app/t;->p()Landroidx/fragment/app/q;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method private r()Ljava/util/Set;
    .locals 4

    .prologue
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1}, Landroidx/fragment/app/t;->k()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/s;

    invoke-virtual {v2}, Landroidx/fragment/app/s;->k()Landroidx/fragment/app/f;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/n;->w0()Landroidx/fragment/app/B;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/fragment/app/A;->o(Landroid/view/ViewGroup;Landroidx/fragment/app/B;)Landroidx/fragment/app/A;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private s(Ljava/util/ArrayList;II)Ljava/util/Set;
    .locals 3

    .prologue
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/a;

    iget-object v1, v1, Landroidx/fragment/app/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/u$a;

    iget-object v2, v2, Landroidx/fragment/app/u$a;->b:Landroidx/fragment/app/f;

    if-eqz v2, :cond_0

    iget-object v2, v2, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-static {v2, p0}, Landroidx/fragment/app/A;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/n;)Landroidx/fragment/app/A;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method static y0(Landroid/view/View;)Landroidx/fragment/app/f;
    .locals 1

    .prologue
    sget v0, LU1/b;->a:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/fragment/app/f;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/f;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method A(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 7

    .prologue
    iget v0, p0, Landroidx/fragment/app/n;->u:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/f;

    if-eqz v5, :cond_1

    invoke-virtual {p0, v5}, Landroidx/fragment/app/n;->I0(Landroidx/fragment/app/f;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5, p1, p2}, Landroidx/fragment/app/f;->U0(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v6

    if-eqz v6, :cond_1

    if-nez v3, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v2

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/n;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_6

    :goto_1
    iget-object p1, p0, Landroidx/fragment/app/n;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_6

    iget-object p1, p0, Landroidx/fragment/app/n;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/f;

    if-eqz v3, :cond_4

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/f;->u0()V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    iput-object v3, p0, Landroidx/fragment/app/n;->e:Ljava/util/ArrayList;

    return v4
.end method

.method A0()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->Y(Z)Z

    iget-object v0, p0, Landroidx/fragment/app/n;->h:Le/w;

    invoke-virtual {v0}, Le/w;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/n;->X0()Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->g:Le/x;

    invoke-virtual {v0}, Le/x;->l()V

    :goto_0
    return-void
.end method

.method B()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->K:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->Y(Z)Z

    invoke-direct {p0}, Landroidx/fragment/app/n;->V()V

    invoke-direct {p0}, Landroidx/fragment/app/n;->q()V

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v1, v0, Landroidx/core/content/c;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/core/content/c;

    iget-object v1, p0, Landroidx/fragment/app/n;->q:LB1/a;

    invoke-interface {v0, v1}, Landroidx/core/content/c;->q(LB1/a;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v1, v0, Landroidx/core/content/b;

    if-eqz v1, :cond_1

    check-cast v0, Landroidx/core/content/b;

    iget-object v1, p0, Landroidx/fragment/app/n;->p:LB1/a;

    invoke-interface {v0, v1}, Landroidx/core/content/b;->t(LB1/a;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v1, v0, Landroidx/core/app/n;

    if-eqz v1, :cond_2

    check-cast v0, Landroidx/core/app/n;

    iget-object v1, p0, Landroidx/fragment/app/n;->r:LB1/a;

    invoke-interface {v0, v1}, Landroidx/core/app/n;->c(LB1/a;)V

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v1, v0, Landroidx/core/app/o;

    if-eqz v1, :cond_3

    check-cast v0, Landroidx/core/app/o;

    iget-object v1, p0, Landroidx/fragment/app/n;->s:LB1/a;

    invoke-interface {v0, v1}, Landroidx/core/app/o;->l(LB1/a;)V

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v1, v0, Landroidx/core/view/w;

    if-eqz v1, :cond_4

    iget-object v1, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    if-nez v1, :cond_4

    check-cast v0, Landroidx/core/view/w;

    iget-object v1, p0, Landroidx/fragment/app/n;->t:Landroidx/core/view/z;

    invoke-interface {v0, v1}, Landroidx/core/view/w;->d(Landroidx/core/view/z;)V

    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    iput-object v0, p0, Landroidx/fragment/app/n;->w:LV1/e;

    iput-object v0, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    iget-object v1, p0, Landroidx/fragment/app/n;->g:Le/x;

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroidx/fragment/app/n;->h:Le/w;

    invoke-virtual {v1}, Le/w;->h()V

    iput-object v0, p0, Landroidx/fragment/app/n;->g:Le/x;

    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/n;->D:Lh/c;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lh/c;->c()V

    iget-object v0, p0, Landroidx/fragment/app/n;->E:Lh/c;

    invoke-virtual {v0}, Lh/c;->c()V

    iget-object v0, p0, Landroidx/fragment/app/n;->F:Lh/c;

    invoke-virtual {v0}, Lh/c;->c()V

    :cond_6
    return-void
.end method

.method B0(Landroidx/fragment/app/f;)V
    .locals 2

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hide: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/f;->c0:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/f;->c0:Z

    iget-boolean v1, p1, Landroidx/fragment/app/f;->q0:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/f;->q0:Z

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->l1(Landroidx/fragment/app/f;)V

    :cond_1
    return-void
.end method

.method C()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method C0(Landroidx/fragment/app/f;)V
    .locals 1

    .prologue
    iget-boolean v0, p1, Landroidx/fragment/app/f;->N:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->F0(Landroidx/fragment/app/f;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->H:Z

    :cond_0
    return-void
.end method

.method D(Z)V
    .locals 3

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v0, v0, Landroidx/core/content/c;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->o1(Ljava/lang/RuntimeException;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/f;->a1()V

    if-eqz p1, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/fragment/app/n;->D(Z)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public D0()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/n;->K:Z

    return v0
.end method

.method E(ZZ)V
    .locals 3

    .prologue
    if-eqz p2, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v0, v0, Landroidx/core/app/n;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->o1(Ljava/lang/RuntimeException;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroidx/fragment/app/f;->b1(Z)V

    if-eqz p2, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/n;->E(ZZ)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method F(Landroidx/fragment/app/f;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV1/k;

    invoke-interface {v1, p0, p1}, LV1/k;->a(Landroidx/fragment/app/n;Landroidx/fragment/app/f;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method G()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/f;->b0()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/f;->y0(Z)V

    iget-object v1, v1, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->G()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method H(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    iget v0, p0, Landroidx/fragment/app/n;->u:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/f;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/f;->c1(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method H0(Landroidx/fragment/app/f;)Z
    .locals 0

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/f;->b0()Z

    move-result p1

    return p1
.end method

.method I(Landroid/view/Menu;)V
    .locals 2

    .prologue
    iget v0, p0, Landroidx/fragment/app/n;->u:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroidx/fragment/app/f;->d1(Landroid/view/Menu;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method I0(Landroidx/fragment/app/f;)Z
    .locals 0

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/f;->d0()Z

    move-result p1

    return p1
.end method

.method J0(Landroidx/fragment/app/f;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->v0()Landroidx/fragment/app/f;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroidx/fragment/app/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v1, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/n;->J0(Landroidx/fragment/app/f;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method K()V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method K0(I)Z
    .locals 1

    .prologue
    iget v0, p0, Landroidx/fragment/app/n;->u:I

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method L(ZZ)V
    .locals 3

    .prologue
    if-eqz p2, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v0, v0, Landroidx/core/app/o;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->o1(Ljava/lang/RuntimeException;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroidx/fragment/app/f;->f1(Z)V

    if-eqz p2, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/n;->L(ZZ)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public L0()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/n;->I:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method M(Landroid/view/Menu;)Z
    .locals 5

    .prologue
    iget v0, p0, Landroidx/fragment/app/n;->u:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/f;

    if-eqz v3, :cond_1

    invoke-virtual {p0, v3}, Landroidx/fragment/app/n;->I0(Landroidx/fragment/app/f;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/f;->g1(Landroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    goto :goto_0

    :cond_2
    return v1
.end method

.method N()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/n;->p1()V

    iget-object v0, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->J(Landroidx/fragment/app/f;)V

    return-void
.end method

.method O()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->I:Z

    iput-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/q;->s(Z)V

    const/4 v0, 0x7

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method P()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->I:Z

    iput-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/q;->s(Z)V

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method R()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/q;->s(Z)V

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method R0(Landroidx/fragment/app/f;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->D:Lh/c;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/fragment/app/n$k;

    iget-object p1, p1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-direct {v0, p1, p3}, Landroidx/fragment/app/n$k;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Landroidx/fragment/app/n;->G:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    if-eqz p4, :cond_0

    const-string p1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {p2, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/n;->D:Lh/c;

    invoke-virtual {p1, p2}, Lh/c;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/k;->z(Landroidx/fragment/app/f;Landroid/content/Intent;ILandroid/os/Bundle;)V

    :goto_0
    return-void
.end method

.method S()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method S0(IZ)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    iget p2, p0, Landroidx/fragment/app/n;->u:I

    if-ne p1, p2, :cond_2

    return-void

    :cond_2
    iput p1, p0, Landroidx/fragment/app/n;->u:I

    iget-object p1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {p1}, Landroidx/fragment/app/t;->t()V

    invoke-direct {p0}, Landroidx/fragment/app/n;->n1()V

    iget-boolean p1, p0, Landroidx/fragment/app/n;->H:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-eqz p1, :cond_3

    iget p2, p0, Landroidx/fragment/app/n;->u:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_3

    invoke-virtual {p1}, Landroidx/fragment/app/k;->A()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/n;->H:Z

    :cond_3
    return-void
.end method

.method T0()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->I:Z

    iput-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/q;->s(Z)V

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/f;->h0()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public U(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroidx/fragment/app/t;->e(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/n;->e:Ljava/util/ArrayList;

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Fragments Created Menus:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v1, p4

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p0, Landroidx/fragment/app/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/f;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/f;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Back Stack:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v1, p4

    :goto_1
    if-ge v1, p2, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p3}, Landroidx/fragment/app/a;->r(Ljava/lang/String;Ljava/io/PrintWriter;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Back Stack Index: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/n;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Pending Actions:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_2
    if-ge p4, v0, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n$l;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/n;->w:LV1/e;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    if-eqz p2, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/n;->u:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/n;->I:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/n;->J:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/n;->K:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, Landroidx/fragment/app/n;->H:Z

    if-eqz p2, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/fragment/app/n;->H:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_4
    return-void

    :goto_3
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method U0(Landroidx/fragment/app/FragmentContainerView;)V
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/s;

    invoke-virtual {v1}, Landroidx/fragment/app/s;->k()Landroidx/fragment/app/f;

    move-result-object v2

    iget v3, v2, Landroidx/fragment/app/f;->a0:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    if-ne v3, v4, :cond_0

    iget-object v3, v2, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_0

    iput-object p1, v2, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroidx/fragment/app/s;->b()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method V0(Landroidx/fragment/app/s;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, Landroidx/fragment/app/s;->k()Landroidx/fragment/app/f;

    move-result-object v0

    iget-boolean v1, v0, Landroidx/fragment/app/f;->l0:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Landroidx/fragment/app/n;->b:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->L:Z

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/f;->l0:Z

    invoke-virtual {p1}, Landroidx/fragment/app/s;->m()V

    :cond_1
    return-void
.end method

.method W(Landroidx/fragment/app/n$l;Z)V
    .locals 2

    .prologue
    if-nez p2, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/n;->K:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-direct {p0}, Landroidx/fragment/app/n;->o()V

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-nez v1, :cond_4

    if-eqz p2, :cond_3

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p2, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/n;->h1()V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method W0(IIZ)V
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    new-instance v0, Landroidx/fragment/app/n$m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1, p2}, Landroidx/fragment/app/n$m;-><init>(Landroidx/fragment/app/n;Ljava/lang/String;II)V

    invoke-virtual {p0, v0, p3}, Landroidx/fragment/app/n;->W(Landroidx/fragment/app/n$l;Z)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Bad id: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public X0()Z
    .locals 3

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/fragment/app/n;->Z0(Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method Y(Z)Z
    .locals 2

    .prologue
    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->X(Z)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Landroidx/fragment/app/n;->k0(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->b:Z

    :try_start_0
    iget-object v0, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Landroidx/fragment/app/n;->c1(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Landroidx/fragment/app/n;->p()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Landroidx/fragment/app/n;->p()V

    throw p1

    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/n;->p1()V

    invoke-direct {p0}, Landroidx/fragment/app/n;->T()V

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->b()V

    return p1
.end method

.method public Y0(II)Z
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Landroidx/fragment/app/n;->Z0(Ljava/lang/String;II)Z

    move-result p1

    return p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bad id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method Z(Landroidx/fragment/app/n$l;Z)V
    .locals 1

    .prologue
    if-eqz p2, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/n;->K:Z

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p2}, Landroidx/fragment/app/n;->X(Z)V

    iget-object p2, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v0}, Landroidx/fragment/app/n$l;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->b:Z

    :try_start_0
    iget-object p1, p0, Landroidx/fragment/app/n;->M:Ljava/util/ArrayList;

    iget-object p2, p0, Landroidx/fragment/app/n;->N:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/n;->c1(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Landroidx/fragment/app/n;->p()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Landroidx/fragment/app/n;->p()V

    throw p1

    :cond_2
    :goto_0
    invoke-direct {p0}, Landroidx/fragment/app/n;->p1()V

    invoke-direct {p0}, Landroidx/fragment/app/n;->T()V

    iget-object p1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {p1}, Landroidx/fragment/app/t;->b()V

    return-void
.end method

.method a1(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    and-int/2addr p5, v0

    const/4 v1, 0x0

    if-eqz p5, :cond_0

    move p5, v0

    goto :goto_0

    :cond_0
    move p5, v1

    :goto_0
    invoke-direct {p0, p3, p4, p5}, Landroidx/fragment/app/n;->d0(Ljava/lang/String;IZ)I

    move-result p3

    if-gez p3, :cond_1

    return v1

    :cond_1
    iget-object p4, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    sub-int/2addr p4, v0

    :goto_1
    if-lt p4, p3, :cond_2

    iget-object p5, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroidx/fragment/app/a;

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p4, p4, -0x1

    goto :goto_1

    :cond_2
    return v0
.end method

.method b1(Landroidx/fragment/app/f;)V
    .locals 3

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "remove: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " nesting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Landroidx/fragment/app/f;->U:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/f;->c0()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-boolean v2, p1, Landroidx/fragment/app/f;->d0:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->u(Landroidx/fragment/app/f;)V

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->F0(Landroidx/fragment/app/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Landroidx/fragment/app/n;->H:Z

    :cond_2
    iput-boolean v1, p1, Landroidx/fragment/app/f;->O:Z

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->l1(Landroidx/fragment/app/f;)V

    :cond_3
    return-void
.end method

.method c0(Ljava/lang/String;)Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->f(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object p1

    return-object p1
.end method

.method public e0(I)Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->g(I)Landroidx/fragment/app/f;

    move-result-object p1

    return-object p1
.end method

.method e1(Landroid/os/Parcelable;)V
    .locals 13

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "result_"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v3}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v3, 0x7

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Landroidx/fragment/app/n;->k:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "state"

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "fragment_"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v4, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v4}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/r;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/t;->x(Ljava/util/ArrayList;)V

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/p;

    if-nez p1, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->v()V

    iget-object v0, p1, Landroidx/fragment/app/p;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "): "

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "FragmentManager"

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v6, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v6, v1, v3}, Landroidx/fragment/app/t;->B(Ljava/lang/String;Landroidx/fragment/app/r;)Landroidx/fragment/app/r;

    move-result-object v12

    if-eqz v12, :cond_6

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    iget-object v3, v12, Landroidx/fragment/app/r;->D:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroidx/fragment/app/q;->l(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {v4}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restoreSaveState: re-attaching retained "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    nop

    :cond_7
    new-instance v3, Landroidx/fragment/app/s;

    iget-object v6, p0, Landroidx/fragment/app/n;->n:Landroidx/fragment/app/m;

    iget-object v7, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-direct {v3, v6, v7, v1, v12}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/m;Landroidx/fragment/app/t;Landroidx/fragment/app/f;Landroidx/fragment/app/r;)V

    goto :goto_3

    :cond_8
    new-instance v3, Landroidx/fragment/app/s;

    iget-object v8, p0, Landroidx/fragment/app/n;->n:Landroidx/fragment/app/m;

    iget-object v9, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v1}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v10

    invoke-virtual {p0}, Landroidx/fragment/app/n;->p0()Landroidx/fragment/app/j;

    move-result-object v11

    move-object v7, v3

    invoke-direct/range {v7 .. v12}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/m;Landroidx/fragment/app/t;Ljava/lang/ClassLoader;Landroidx/fragment/app/j;Landroidx/fragment/app/r;)V

    :goto_3
    invoke-virtual {v3}, Landroidx/fragment/app/s;->k()Landroidx/fragment/app/f;

    move-result-object v1

    iput-object p0, v1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-static {v4}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v4

    if-eqz v4, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restoreSaveState: active ("

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    :cond_9
    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v1}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroidx/fragment/app/s;->o(Ljava/lang/ClassLoader;)V

    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1, v3}, Landroidx/fragment/app/t;->r(Landroidx/fragment/app/s;)V

    iget v1, p0, Landroidx/fragment/app/n;->u:I

    invoke-virtual {v3, v1}, Landroidx/fragment/app/s;->t(I)V

    goto/16 :goto_2

    :cond_a
    iget-object v0, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->o()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    iget-object v6, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    iget-object v7, v1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroidx/fragment/app/t;->c(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_b

    invoke-static {v4}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v6

    if-eqz v6, :cond_c

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Discarding retained Fragment "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " that was not found in the set of active Fragments "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p1, Landroidx/fragment/app/p;->C:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    nop

    :cond_c
    iget-object v6, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v6, v1}, Landroidx/fragment/app/q;->r(Landroidx/fragment/app/f;)V

    iput-object p0, v1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    new-instance v6, Landroidx/fragment/app/s;

    iget-object v7, p0, Landroidx/fragment/app/n;->n:Landroidx/fragment/app/m;

    iget-object v8, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-direct {v6, v7, v8, v1}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/m;Landroidx/fragment/app/t;Landroidx/fragment/app/f;)V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroidx/fragment/app/s;->t(I)V

    invoke-virtual {v6}, Landroidx/fragment/app/s;->m()V

    iput-boolean v7, v1, Landroidx/fragment/app/f;->O:Z

    invoke-virtual {v6}, Landroidx/fragment/app/s;->m()V

    goto :goto_4

    :cond_d
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    iget-object v1, p1, Landroidx/fragment/app/p;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/t;->w(Ljava/util/List;)V

    iget-object v0, p1, Landroidx/fragment/app/p;->E:[Landroidx/fragment/app/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    new-instance v0, Ljava/util/ArrayList;

    iget-object v3, p1, Landroidx/fragment/app/p;->E:[Landroidx/fragment/app/b;

    array-length v3, v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    move v0, v1

    :goto_5
    iget-object v3, p1, Landroidx/fragment/app/p;->E:[Landroidx/fragment/app/b;

    array-length v6, v3

    if-ge v0, v6, :cond_10

    aget-object v3, v3, v0

    invoke-virtual {v3, p0}, Landroidx/fragment/app/b;->b(Landroidx/fragment/app/n;)Landroidx/fragment/app/a;

    move-result-object v3

    invoke-static {v4}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v6

    if-eqz v6, :cond_e

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "restoreAllState: back stack #"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " (index "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, v3, Landroidx/fragment/app/a;->v:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    nop

    new-instance v6, Landroidx/fragment/app/z;

    invoke-direct {v6, v5}, Landroidx/fragment/app/z;-><init>(Ljava/lang/String;)V

    new-instance v7, Ljava/io/PrintWriter;

    invoke-direct {v7, v6}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v6, "  "

    invoke-virtual {v3, v6, v7, v1}, Landroidx/fragment/app/a;->s(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v7}, Ljava/io/PrintWriter;->close()V

    :cond_e
    iget-object v6, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_f
    iput-object v3, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    :cond_10
    iget-object v0, p0, Landroidx/fragment/app/n;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v2, p1, Landroidx/fragment/app/p;->F:I

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p1, Landroidx/fragment/app/p;->G:Ljava/lang/String;

    if-eqz v0, :cond_11

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->c0(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->J(Landroidx/fragment/app/f;)V

    :cond_11
    iget-object v0, p1, Landroidx/fragment/app/p;->H:Ljava/util/ArrayList;

    if-eqz v0, :cond_12

    :goto_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_12

    iget-object v2, p0, Landroidx/fragment/app/n;->j:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p1, Landroidx/fragment/app/p;->I:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/c;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_12
    new-instance v0, Ljava/util/ArrayDeque;

    iget-object p1, p1, Landroidx/fragment/app/p;->J:Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->G:Ljava/util/ArrayDeque;

    return-void
.end method

.method public f0(Ljava/lang/String;)Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->h(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object p1

    return-object p1
.end method

.method g(Landroidx/fragment/app/a;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method g0(Ljava/lang/String;)Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->i(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object p1

    return-object p1
.end method

.method g1()Landroid/os/Bundle;
    .locals 11

    .prologue
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0}, Landroidx/fragment/app/n;->j0()V

    invoke-direct {p0}, Landroidx/fragment/app/n;->V()V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/n;->Y(Z)Z

    iput-boolean v1, p0, Landroidx/fragment/app/n;->I:Z

    iget-object v2, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v2, v1}, Landroidx/fragment/app/q;->s(Z)V

    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1}, Landroidx/fragment/app/t;->y()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v2}, Landroidx/fragment/app/t;->m()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const-string v4, "FragmentManager"

    const/4 v5, 0x2

    if-eqz v3, :cond_0

    invoke-static {v5}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "saveAllState: no fragments!"

    nop

    goto/16 :goto_3

    :cond_0
    iget-object v3, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v3}, Landroidx/fragment/app/t;->z()Ljava/util/ArrayList;

    move-result-object v3

    iget-object v6, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_2

    new-array v7, v6, [Landroidx/fragment/app/b;

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_3

    new-instance v9, Landroidx/fragment/app/b;

    iget-object v10, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/a;

    invoke-direct {v9, v10}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    aput-object v9, v7, v8

    invoke-static {v5}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v9

    if-eqz v9, :cond_1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "saveAllState: adding back stack #"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ": "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    nop

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :cond_3
    new-instance v4, Landroidx/fragment/app/p;

    invoke-direct {v4}, Landroidx/fragment/app/p;-><init>()V

    iput-object v1, v4, Landroidx/fragment/app/p;->C:Ljava/util/ArrayList;

    iput-object v3, v4, Landroidx/fragment/app/p;->D:Ljava/util/ArrayList;

    iput-object v7, v4, Landroidx/fragment/app/p;->E:[Landroidx/fragment/app/b;

    iget-object v1, p0, Landroidx/fragment/app/n;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iput v1, v4, Landroidx/fragment/app/p;->F:I

    iget-object v1, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    if-eqz v1, :cond_4

    iget-object v1, v1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    iput-object v1, v4, Landroidx/fragment/app/p;->G:Ljava/lang/String;

    :cond_4
    iget-object v1, v4, Landroidx/fragment/app/p;->H:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/n;->j:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v4, Landroidx/fragment/app/p;->I:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/n;->j:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/n;->G:Ljava/util/ArrayDeque;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v4, Landroidx/fragment/app/p;->J:Ljava/util/ArrayList;

    const-string v1, "state"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v3, p0, Landroidx/fragment/app/n;->k:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "result_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Landroidx/fragment/app/n;->k:Ljava/util/Map;

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    invoke-virtual {v0, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/r;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v4, v1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "fragment_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Landroidx/fragment/app/r;->D:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_2

    :cond_6
    :goto_3
    return-object v0
.end method

.method h(Landroidx/fragment/app/f;)Landroidx/fragment/app/s;
    .locals 3

    .prologue
    iget-object v0, p1, Landroidx/fragment/app/f;->t0:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, LW1/c;->f(Landroidx/fragment/app/f;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/n;->t(Landroidx/fragment/app/f;)Landroidx/fragment/app/s;

    move-result-object v0

    iput-object p0, p1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/t;->r(Landroidx/fragment/app/s;)V

    iget-boolean v1, p1, Landroidx/fragment/app/f;->d0:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/t;->a(Landroidx/fragment/app/f;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/f;->O:Z

    iget-object v2, p1, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Landroidx/fragment/app/f;->q0:Z

    :cond_2
    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->F0(Landroidx/fragment/app/f;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->H:Z

    :cond_3
    return-object v0
.end method

.method h1()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v1}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/n;->R:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {v1}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/n;->R:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0}, Landroidx/fragment/app/n;->p1()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public i(LV1/k;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method i1(Landroidx/fragment/app/f;Z)V
    .locals 1

    .prologue
    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->o0(Landroidx/fragment/app/f;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method j()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    return v0
.end method

.method j1(Landroidx/fragment/app/f;Landroidx/lifecycle/k$b;)V
    .locals 2

    .prologue
    iget-object v0, p1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->c0(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/f;->u0:Landroidx/lifecycle/k$b;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method k(Landroidx/fragment/app/k;LV1/e;Landroidx/fragment/app/f;)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-nez v0, :cond_f

    iput-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    iput-object p2, p0, Landroidx/fragment/app/n;->w:LV1/e;

    iput-object p3, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    if-eqz p3, :cond_0

    new-instance p2, Landroidx/fragment/app/n$g;

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/n$g;-><init>(Landroidx/fragment/app/n;Landroidx/fragment/app/f;)V

    :goto_0
    invoke-virtual {p0, p2}, Landroidx/fragment/app/n;->i(LV1/k;)V

    goto :goto_1

    :cond_0
    instance-of p2, p1, LV1/k;

    if-eqz p2, :cond_1

    move-object p2, p1

    check-cast p2, LV1/k;

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p2, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    if-eqz p2, :cond_2

    invoke-direct {p0}, Landroidx/fragment/app/n;->p1()V

    :cond_2
    instance-of p2, p1, Le/A;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Le/A;

    invoke-interface {p2}, Le/A;->b()Le/x;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->g:Le/x;

    if-eqz p3, :cond_3

    move-object p2, p3

    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/n;->h:Le/w;

    invoke-virtual {v0, p2, v1}, Le/x;->h(Landroidx/lifecycle/r;Le/w;)V

    :cond_4
    if-eqz p3, :cond_5

    iget-object p1, p3, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-direct {p1, p3}, Landroidx/fragment/app/n;->m0(Landroidx/fragment/app/f;)Landroidx/fragment/app/q;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    goto :goto_3

    :cond_5
    instance-of p2, p1, Landroidx/lifecycle/Y;

    if-eqz p2, :cond_6

    check-cast p1, Landroidx/lifecycle/Y;

    invoke-interface {p1}, Landroidx/lifecycle/Y;->n()Landroidx/lifecycle/X;

    move-result-object p1

    invoke-static {p1}, Landroidx/fragment/app/q;->n(Landroidx/lifecycle/X;)Landroidx/fragment/app/q;

    move-result-object p1

    goto :goto_2

    :cond_6
    new-instance p1, Landroidx/fragment/app/q;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroidx/fragment/app/q;-><init>(Z)V

    goto :goto_2

    :goto_3
    iget-object p1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {p0}, Landroidx/fragment/app/n;->L0()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/fragment/app/q;->s(Z)V

    iget-object p1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    iget-object p2, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/t;->A(Landroidx/fragment/app/q;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of p2, p1, Lx2/f;

    if-eqz p2, :cond_7

    if-nez p3, :cond_7

    check-cast p1, Lx2/f;

    invoke-interface {p1}, Lx2/f;->p()Lx2/d;

    move-result-object p1

    new-instance p2, LV1/j;

    invoke-direct {p2, p0}, LV1/j;-><init>(Landroidx/fragment/app/n;)V

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0, p2}, Lx2/d;->h(Ljava/lang/String;Lx2/d$c;)V

    invoke-virtual {p1, v0}, Lx2/d;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p0, p1}, Landroidx/fragment/app/n;->e1(Landroid/os/Parcelable;)V

    :cond_7
    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of p2, p1, Lh/f;

    if-eqz p2, :cond_9

    check-cast p1, Lh/f;

    invoke-interface {p1}, Lh/f;->m()Lh/e;

    move-result-object p1

    if-eqz p3, :cond_8

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p3, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_8
    const-string p2, ""

    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FragmentManager:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "StartActivityForResult"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Li/d;

    invoke-direct {v1}, Li/d;-><init>()V

    new-instance v2, Landroidx/fragment/app/n$h;

    invoke-direct {v2, p0}, Landroidx/fragment/app/n$h;-><init>(Landroidx/fragment/app/n;)V

    invoke-virtual {p1, v0, v1, v2}, Lh/e;->m(Ljava/lang/String;Li/a;Lh/b;)Lh/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->D:Lh/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "StartIntentSenderForResult"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/n$j;

    invoke-direct {v1}, Landroidx/fragment/app/n$j;-><init>()V

    new-instance v2, Landroidx/fragment/app/n$i;

    invoke-direct {v2, p0}, Landroidx/fragment/app/n$i;-><init>(Landroidx/fragment/app/n;)V

    invoke-virtual {p1, v0, v1, v2}, Lh/e;->m(Ljava/lang/String;Li/a;Lh/b;)Lh/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->E:Lh/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "RequestPermissions"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Li/b;

    invoke-direct {v0}, Li/b;-><init>()V

    new-instance v1, Landroidx/fragment/app/n$a;

    invoke-direct {v1, p0}, Landroidx/fragment/app/n$a;-><init>(Landroidx/fragment/app/n;)V

    invoke-virtual {p1, p2, v0, v1}, Lh/e;->m(Ljava/lang/String;Li/a;Lh/b;)Lh/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/n;->F:Lh/c;

    :cond_9
    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of p2, p1, Landroidx/core/content/b;

    if-eqz p2, :cond_a

    check-cast p1, Landroidx/core/content/b;

    iget-object p2, p0, Landroidx/fragment/app/n;->p:LB1/a;

    invoke-interface {p1, p2}, Landroidx/core/content/b;->i(LB1/a;)V

    :cond_a
    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of p2, p1, Landroidx/core/content/c;

    if-eqz p2, :cond_b

    check-cast p1, Landroidx/core/content/c;

    iget-object p2, p0, Landroidx/fragment/app/n;->q:LB1/a;

    invoke-interface {p1, p2}, Landroidx/core/content/c;->e(LB1/a;)V

    :cond_b
    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of p2, p1, Landroidx/core/app/n;

    if-eqz p2, :cond_c

    check-cast p1, Landroidx/core/app/n;

    iget-object p2, p0, Landroidx/fragment/app/n;->r:LB1/a;

    invoke-interface {p1, p2}, Landroidx/core/app/n;->v(LB1/a;)V

    :cond_c
    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of p2, p1, Landroidx/core/app/o;

    if-eqz p2, :cond_d

    check-cast p1, Landroidx/core/app/o;

    iget-object p2, p0, Landroidx/fragment/app/n;->s:LB1/a;

    invoke-interface {p1, p2}, Landroidx/core/app/o;->f(LB1/a;)V

    :cond_d
    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of p2, p1, Landroidx/core/view/w;

    if-eqz p2, :cond_e

    if-nez p3, :cond_e

    check-cast p1, Landroidx/core/view/w;

    iget-object p2, p0, Landroidx/fragment/app/n;->t:Landroidx/core/view/z;

    invoke-interface {p1, p2}, Landroidx/core/view/w;->s(Landroidx/core/view/z;)V

    :cond_e
    return-void

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method k1(Landroidx/fragment/app/f;)V
    .locals 3

    .prologue
    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/n;->c0(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    iput-object p1, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->J(Landroidx/fragment/app/f;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->J(Landroidx/fragment/app/f;)V

    return-void
.end method

.method l(Landroidx/fragment/app/f;)V
    .locals 4

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "attach: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/f;->d0:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/f;->d0:Z

    iget-boolean v1, p1, Landroidx/fragment/app/f;->N:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/t;->a(Landroidx/fragment/app/f;)V

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add from attach: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_1
    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->F0(Landroidx/fragment/app/f;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/n;->H:Z

    :cond_2
    return-void
.end method

.method public l0()I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Landroidx/fragment/app/u;
    .locals 1

    new-instance v0, Landroidx/fragment/app/a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/n;)V

    return-object v0
.end method

.method m1(Landroidx/fragment/app/f;)V
    .locals 2

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "show: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/f;->c0:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/f;->c0:Z

    iget-boolean v0, p1, Landroidx/fragment/app/f;->q0:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/f;->q0:Z

    :cond_1
    return-void
.end method

.method n()Z
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/f;

    if-eqz v3, :cond_1

    invoke-direct {p0, v3}, Landroidx/fragment/app/n;->F0(Landroidx/fragment/app/f;)Z

    move-result v2

    :cond_1
    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method n0()LV1/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->w:LV1/e;

    return-object v0
.end method

.method public p0()Landroidx/fragment/app/j;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->z:Landroidx/fragment/app/j;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->p0()Landroidx/fragment/app/j;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/n;->A:Landroidx/fragment/app/j;

    return-object v0
.end method

.method public q0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public r0()Landroidx/fragment/app/k;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    return-object v0
.end method

.method s0()Landroid/view/LayoutInflater$Factory2;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->f:Landroidx/fragment/app/l;

    return-object v0
.end method

.method t(Landroidx/fragment/app/f;)Landroidx/fragment/app/s;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    iget-object v1, p1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/t;->n(Ljava/lang/String;)Landroidx/fragment/app/s;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroidx/fragment/app/s;

    iget-object v1, p0, Landroidx/fragment/app/n;->n:Landroidx/fragment/app/m;

    iget-object v2, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-direct {v0, v1, v2, p1}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/m;Landroidx/fragment/app/t;Landroidx/fragment/app/f;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    invoke-virtual {p1}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/s;->o(Ljava/lang/ClassLoader;)V

    iget p1, p0, Landroidx/fragment/app/n;->u:I

    invoke-virtual {v0, p1}, Landroidx/fragment/app/s;->t(I)V

    return-object v0
.end method

.method t0()Landroidx/fragment/app/m;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->n:Landroidx/fragment/app/m;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    :goto_0
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method u(Landroidx/fragment/app/f;)V
    .locals 4

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "detach: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/f;->d0:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, p1, Landroidx/fragment/app/f;->d0:Z

    iget-boolean v3, p1, Landroidx/fragment/app/f;->N:Z

    if-eqz v3, :cond_3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remove from detach: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/t;->u(Landroidx/fragment/app/f;)V

    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->F0(Landroidx/fragment/app/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Landroidx/fragment/app/n;->H:Z

    :cond_2
    invoke-direct {p0, p1}, Landroidx/fragment/app/n;->l1(Landroidx/fragment/app/f;)V

    :cond_3
    return-void
.end method

.method u0()Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    return-object v0
.end method

.method v()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->I:Z

    iput-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/q;->s(Z)V

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method public v0()Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/f;

    return-object v0
.end method

.method w()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->I:Z

    iput-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/q;->s(Z)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method w0()Landroidx/fragment/app/B;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/n;->B:Landroidx/fragment/app/B;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/f;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->w0()Landroidx/fragment/app/B;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/n;->C:Landroidx/fragment/app/B;

    return-object v0
.end method

.method x(Landroid/content/res/Configuration;Z)V
    .locals 3

    .prologue
    if-eqz p2, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/k;

    instance-of v0, v0, Landroidx/core/content/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->o1(Ljava/lang/RuntimeException;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroidx/fragment/app/f;->R0(Landroid/content/res/Configuration;)V

    if-eqz p2, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/n;->x(Landroid/content/res/Configuration;Z)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public x0()LW1/c$c;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->Q:LW1/c$c;

    return-object v0
.end method

.method y(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    iget v0, p0, Landroidx/fragment/app/n;->u:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->c:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/f;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/f;->S0(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method z()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/n;->I:Z

    iput-boolean v0, p0, Landroidx/fragment/app/n;->J:Z

    iget-object v1, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/q;->s(Z)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/fragment/app/n;->Q(I)V

    return-void
.end method

.method z0(Landroidx/fragment/app/f;)Landroidx/lifecycle/X;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->P:Landroidx/fragment/app/q;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/q;->p(Landroidx/fragment/app/f;)Landroidx/lifecycle/X;

    move-result-object p1

    return-object p1
.end method
