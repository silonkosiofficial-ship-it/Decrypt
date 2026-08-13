.class public final LS0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lz0/Q;

.field private final b:LS0/u;

.field private final c:Ljava/lang/Object;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:LS0/V;

.field private k:LM0/K;

.field private l:LS0/L;

.field private m:Lx7/l;

.field private n:Ln0/i;

.field private o:Ln0/i;

.field private final p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field private final q:[F

.field private final r:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz0/Q;LS0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS0/e;->a:Lz0/Q;

    iput-object p2, p0, LS0/e;->b:LS0/u;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS0/e;->c:Ljava/lang/Object;

    sget-object p1, LS0/e$b;->D:LS0/e$b;

    iput-object p1, p0, LS0/e;->m:Lx7/l;

    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object p1, p0, LS0/e;->p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object p1

    iput-object p1, p0, LS0/e;->q:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, LS0/e;->r:Landroid/graphics/Matrix;

    return-void
.end method

.method private final c()V
    .locals 12

    .prologue
    iget-object v0, p0, LS0/e;->b:LS0/u;

    invoke-interface {v0}, LS0/u;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LS0/e;->m:Lx7/l;

    iget-object v1, p0, LS0/e;->q:[F

    invoke-static {v1}, Lo0/J1;->a([F)Lo0/J1;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LS0/e;->a:Lz0/Q;

    iget-object v1, p0, LS0/e;->q:[F

    invoke-interface {v0, v1}, Lz0/Q;->k([F)V

    iget-object v0, p0, LS0/e;->r:Landroid/graphics/Matrix;

    iget-object v1, p0, LS0/e;->q:[F

    invoke-static {v0, v1}, Lo0/S;->a(Landroid/graphics/Matrix;[F)V

    iget-object v0, p0, LS0/e;->b:LS0/u;

    iget-object v1, p0, LS0/e;->p:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-object v2, p0, LS0/e;->j:LS0/V;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LS0/e;->l:LS0/L;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v4, p0, LS0/e;->k:LM0/K;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v5, p0, LS0/e;->r:Landroid/graphics/Matrix;

    iget-object v6, p0, LS0/e;->n:Ln0/i;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v7, p0, LS0/e;->o:Ln0/i;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v8, p0, LS0/e;->f:Z

    iget-boolean v9, p0, LS0/e;->g:Z

    iget-boolean v10, p0, LS0/e;->h:Z

    iget-boolean v11, p0, LS0/e;->i:Z

    invoke-static/range {v1 .. v11}, LS0/d;->b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LS0/V;LS0/L;LM0/K;Landroid/graphics/Matrix;Ln0/i;Ln0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v1

    invoke-interface {v0, v1}, LS0/u;->j(Landroid/view/inputmethod/CursorAnchorInfo;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LS0/e;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, LS0/e;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, LS0/e;->j:LS0/V;

    iput-object v1, p0, LS0/e;->l:LS0/L;

    iput-object v1, p0, LS0/e;->k:LM0/K;

    sget-object v2, LS0/e$a;->D:LS0/e$a;

    iput-object v2, p0, LS0/e;->m:Lx7/l;

    iput-object v1, p0, LS0/e;->n:Ln0/i;

    iput-object v1, p0, LS0/e;->o:Ln0/i;

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final b(ZZZZZZ)V
    .locals 1

    .prologue
    iget-object v0, p0, LS0/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p3, p0, LS0/e;->f:Z

    iput-boolean p4, p0, LS0/e;->g:Z

    iput-boolean p5, p0, LS0/e;->h:Z

    iput-boolean p6, p0, LS0/e;->i:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LS0/e;->e:Z

    iget-object p1, p0, LS0/e;->j:LS0/V;

    if-eqz p1, :cond_0

    invoke-direct {p0}, LS0/e;->c()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean p2, p0, LS0/e;->d:Z

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final d(LS0/V;LS0/L;LM0/K;Lx7/l;Ln0/i;Ln0/i;)V
    .locals 1

    .prologue
    iget-object v0, p0, LS0/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LS0/e;->j:LS0/V;

    iput-object p2, p0, LS0/e;->l:LS0/L;

    iput-object p3, p0, LS0/e;->k:LM0/K;

    iput-object p4, p0, LS0/e;->m:Lx7/l;

    iput-object p5, p0, LS0/e;->n:Ln0/i;

    iput-object p6, p0, LS0/e;->o:Ln0/i;

    iget-boolean p1, p0, LS0/e;->e:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, LS0/e;->d:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-direct {p0}, LS0/e;->c()V

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
