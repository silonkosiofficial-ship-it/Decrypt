.class public final Lcom/google/android/gms/internal/ads/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ns;


# static fields
.field private static final o:Ljava/util/concurrent/Executor;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/d;

.field private final c:Lcom/google/android/gms/internal/ads/n;

.field private final d:Lcom/google/android/gms/internal/ads/t;

.field private final e:Lcom/google/android/gms/internal/ads/Mj;

.field private final f:Ljava/util/List;

.field private final g:Lcom/google/android/gms/internal/ads/L;

.field private final h:Lcom/google/android/gms/internal/ads/mD;

.field private final i:Ljava/util/concurrent/CopyOnWriteArraySet;

.field private j:Lcom/google/android/gms/internal/ads/k;

.field private k:Lcom/google/android/gms/internal/ads/xI;

.field private l:Landroid/util/Pair;

.field private m:I

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/MK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/MK0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/j;->o:Ljava/util/concurrent/Executor;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/OK0;Lcom/google/android/gms/internal/ads/i;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/OK0;->a(Lcom/google/android/gms/internal/ads/OK0;)Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j;->a:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/ads/d;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/d;-><init>(Lcom/google/android/gms/internal/ads/j;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/j;->b:Lcom/google/android/gms/internal/ads/d;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/OK0;->c(Lcom/google/android/gms/internal/ads/OK0;)Lcom/google/android/gms/internal/ads/mD;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j;->h:Lcom/google/android/gms/internal/ads/mD;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/OK0;->f(Lcom/google/android/gms/internal/ads/OK0;)Lcom/google/android/gms/internal/ads/n;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/j;->c:Lcom/google/android/gms/internal/ads/n;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/n;->k(Lcom/google/android/gms/internal/ads/mD;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/t;

    new-instance v2, Lcom/google/android/gms/internal/ads/PK0;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/google/android/gms/internal/ads/PK0;-><init>(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/i;)V

    invoke-direct {p2, v2, v1}, Lcom/google/android/gms/internal/ads/t;-><init>(Lcom/google/android/gms/internal/ads/PK0;Lcom/google/android/gms/internal/ads/n;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j;->d:Lcom/google/android/gms/internal/ads/t;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/OK0;->b(Lcom/google/android/gms/internal/ads/OK0;)Lcom/google/android/gms/internal/ads/Mj;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/j;->e:Lcom/google/android/gms/internal/ads/Mj;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/OK0;->g(Lcom/google/android/gms/internal/ads/OK0;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j;->f:Ljava/util/List;

    new-instance p1, Lcom/google/android/gms/internal/ads/wK0;

    invoke-direct {p1, v1, p2}, Lcom/google/android/gms/internal/ads/wK0;-><init>(Lcom/google/android/gms/internal/ads/n;Lcom/google/android/gms/internal/ads/t;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j;->g:Lcom/google/android/gms/internal/ads/L;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 p2, 0x0

    iput p2, p0, Lcom/google/android/gms/internal/ads/j;->n:I

    new-instance p2, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/j;)Landroid/util/Pair;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->l:Landroid/util/Pair;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/PA0;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/j;->v(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/PA0;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/Mr;
    .locals 11

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/j;->n:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->C:Lcom/google/android/gms/internal/ads/PA0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->v(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/PA0;

    move-result-object v0

    iget v1, v0, Lcom/google/android/gms/internal/ads/PA0;->c:I

    const/4 v2, 0x7

    if-ne v1, v2, :cond_1

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v2, 0x22

    if-ge v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/PA0;->c()Lcom/google/android/gms/internal/ads/Oz0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Oz0;->d(I)Lcom/google/android/gms/internal/ads/Oz0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Oz0;->g()Lcom/google/android/gms/internal/ads/PA0;

    move-result-object v0

    :cond_1
    move-object v3, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j;->h:Lcom/google/android/gms/internal/ads/mD;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v10, 0x0

    invoke-interface {v0, v1, v10}, Lcom/google/android/gms/internal/ads/mD;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/j;->k:Lcom/google/android/gms/internal/ads/xI;

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/j;->e:Lcom/google/android/gms/internal/ads/Mj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/j;->a:Landroid/content/Context;

    sget-object v4, Lcom/google/android/gms/internal/ads/sC0;->a:Lcom/google/android/gms/internal/ads/sC0;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lcom/google/android/gms/internal/ads/NK0;

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/NK0;-><init>(Lcom/google/android/gms/internal/ads/xI;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v7

    const-wide/16 v8, 0x0

    move-object v5, p0

    invoke-interface/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/Mj;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/PA0;Lcom/google/android/gms/internal/ads/sC0;Lcom/google/android/gms/internal/ads/ns;Ljava/util/concurrent/Executor;Ljava/util/List;J)Lcom/google/android/gms/internal/ads/nk;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->l:Landroid/util/Pair;

    if-eqz p0, :cond_2

    iget-object v0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/internal/ads/UR;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/UR;->b()I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/UR;->a()I

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_2
    :goto_1
    throw v10
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Hq; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ads/K;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/K;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/D;)V

    throw v0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/mD;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->h:Lcom/google/android/gms/internal/ads/mD;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/k;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->j:Lcom/google/android/gms/internal/ads/k;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/n;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->c:Lcom/google/android/gms/internal/ads/n;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->g:Lcom/google/android/gms/internal/ads/L;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/ads/j;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->f:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic j(Lcom/google/android/gms/internal/ads/j;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static bridge synthetic k()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/j;->o:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method static bridge synthetic l(Lcom/google/android/gms/internal/ads/j;Z)V
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/j;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/j;->m:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/j;->m:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j;->g:Lcom/google/android/gms/internal/ads/L;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/L;->H0(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/j;->k:Lcom/google/android/gms/internal/ads/xI;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/LK0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/LK0;-><init>(Lcom/google/android/gms/internal/ads/j;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method static bridge synthetic m(Lcom/google/android/gms/internal/ads/j;JJ)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->g:Lcom/google/android/gms/internal/ads/L;

    invoke-interface {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/L;->N0(JJ)V

    return-void
.end method

.method static bridge synthetic n(Lcom/google/android/gms/internal/ads/j;F)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->g:Lcom/google/android/gms/internal/ads/L;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/L;->w0(F)V

    return-void
.end method

.method static synthetic o(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j;->j:Lcom/google/android/gms/internal/ads/k;

    return-void
.end method

.method static bridge synthetic t(Lcom/google/android/gms/internal/ads/j;J)Z
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/j;->m:I

    if-nez v0, :cond_0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->d:Lcom/google/android/gms/internal/ads/t;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/t;->d(J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static bridge synthetic u(Lcom/google/android/gms/internal/ads/j;Z)Z
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/j;->g:Lcom/google/android/gms/internal/ads/L;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/L;->G0(Z)Z

    move-result p0

    return p0
.end method

.method private static v(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/PA0;
    .locals 1

    .prologue
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/PA0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/PA0;->h:Lcom/google/android/gms/internal/ads/PA0;

    return-object p0
.end method


# virtual methods
.method public final h()Lcom/google/android/gms/internal/ads/L;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j;->b:Lcom/google/android/gms/internal/ads/d;

    return-object v0
.end method

.method public final p()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/UR;->c:Lcom/google/android/gms/internal/ads/UR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/UR;->b()I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/UR;->a()I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/j;->l:Landroid/util/Pair;

    return-void
.end method

.method final synthetic q()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/j;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/j;->m:I

    return-void
.end method

.method public final r()V
    .locals 3

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/j;->n:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j;->k:Lcom/google/android/gms/internal/ads/xI;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/xI;->d(Ljava/lang/Object;)V

    :cond_1
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/j;->l:Landroid/util/Pair;

    iput v1, p0, Lcom/google/android/gms/internal/ads/j;->n:I

    return-void
.end method

.method public final s(Landroid/view/Surface;Lcom/google/android/gms/internal/ads/UR;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j;->l:Landroid/util/Pair;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j;->l:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/UR;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/UR;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j;->l:Landroid/util/Pair;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/UR;->b()I

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/UR;->a()I

    return-void
.end method
