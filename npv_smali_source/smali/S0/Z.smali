.class public final LS0/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/P;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS0/Z$a;,
        LS0/Z$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/view/View;

.field private final b:LS0/u;

.field private final c:Ljava/util/concurrent/Executor;

.field private d:Z

.field private e:Lx7/l;

.field private f:Lx7/l;

.field private g:LS0/V;

.field private h:LS0/s;

.field private i:Ljava/util/List;

.field private final j:Li7/n;

.field private k:Landroid/graphics/Rect;

.field private final l:LS0/e;

.field private final m:LX/b;

.field private n:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lz0/Q;)V
    .locals 7

    new-instance v3, LS0/v;

    invoke-direct {v3, p1}, LS0/v;-><init>(Landroid/view/View;)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, LS0/Z;-><init>(Landroid/view/View;Lz0/Q;LS0/u;Ljava/util/concurrent/Executor;ILy7/k;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lz0/Q;LS0/u;Ljava/util/concurrent/Executor;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS0/Z;->a:Landroid/view/View;

    iput-object p3, p0, LS0/Z;->b:LS0/u;

    iput-object p4, p0, LS0/Z;->c:Ljava/util/concurrent/Executor;

    sget-object p1, LS0/Z$e;->D:LS0/Z$e;

    iput-object p1, p0, LS0/Z;->e:Lx7/l;

    sget-object p1, LS0/Z$f;->D:LS0/Z$f;

    iput-object p1, p0, LS0/Z;->f:Lx7/l;

    new-instance p1, LS0/V;

    sget-object p4, LM0/N;->b:LM0/N$a;

    invoke-virtual {p4}, LM0/N$a;->a()J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LS0/V;-><init>(Ljava/lang/String;JLM0/N;ILy7/k;)V

    iput-object p1, p0, LS0/Z;->g:LS0/V;

    sget-object p1, LS0/s;->g:LS0/s$a;

    invoke-virtual {p1}, LS0/s$a;->a()LS0/s;

    move-result-object p1

    iput-object p1, p0, LS0/Z;->h:LS0/s;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LS0/Z;->i:Ljava/util/List;

    sget-object p1, Li7/r;->E:Li7/r;

    new-instance p4, LS0/Z$c;

    invoke-direct {p4, p0}, LS0/Z$c;-><init>(LS0/Z;)V

    invoke-static {p1, p4}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LS0/Z;->j:Li7/n;

    new-instance p1, LS0/e;

    invoke-direct {p1, p2, p3}, LS0/e;-><init>(Lz0/Q;LS0/u;)V

    iput-object p1, p0, LS0/Z;->l:LS0/e;

    new-instance p1, LX/b;

    const/16 p2, 0x10

    new-array p2, p2, [LS0/Z$a;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LS0/Z;->m:LX/b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Lz0/Q;LS0/u;Ljava/util/concurrent/Executor;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p4

    invoke-static {p4}, LS0/c0;->d(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;

    move-result-object p4

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LS0/Z;-><init>(Landroid/view/View;Lz0/Q;LS0/u;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic i(LS0/Z;)V
    .locals 0

    invoke-static {p0}, LS0/Z;->w(LS0/Z;)V

    return-void
.end method

.method public static final synthetic j(LS0/Z;)Landroid/view/inputmethod/BaseInputConnection;
    .locals 0

    invoke-direct {p0}, LS0/Z;->p()Landroid/view/inputmethod/BaseInputConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LS0/Z;)LS0/e;
    .locals 0

    iget-object p0, p0, LS0/Z;->l:LS0/e;

    return-object p0
.end method

.method public static final synthetic l(LS0/Z;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LS0/Z;->i:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic m(LS0/Z;)Lx7/l;
    .locals 0

    iget-object p0, p0, LS0/Z;->e:Lx7/l;

    return-object p0
.end method

.method public static final synthetic n(LS0/Z;)Lx7/l;
    .locals 0

    iget-object p0, p0, LS0/Z;->f:Lx7/l;

    return-object p0
.end method

.method private final p()Landroid/view/inputmethod/BaseInputConnection;
    .locals 1

    iget-object v0, p0, LS0/Z;->j:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/BaseInputConnection;

    return-object v0
.end method

.method private final s()V
    .locals 6

    .prologue
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    iget-object v2, p0, LS0/Z;->m:LX/b;

    invoke-virtual {v2}, LX/b;->t()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x0

    :cond_0
    aget-object v5, v2, v4

    check-cast v5, LS0/Z$a;

    invoke-static {v5, v0, v1}, LS0/Z;->t(LS0/Z$a;Ly7/O;Ly7/O;)V

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v3, :cond_0

    :cond_1
    iget-object v2, p0, LS0/Z;->m:LX/b;

    invoke-virtual {v2}, LX/b;->j()V

    iget-object v2, v0, Ly7/O;->C:Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0}, LS0/Z;->u()V

    :cond_2
    iget-object v1, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-direct {p0, v1}, LS0/Z;->x(Z)V

    :cond_3
    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, LS0/Z;->u()V

    :cond_4
    return-void
.end method

.method private static final t(LS0/Z$a;Ly7/O;Ly7/O;)V
    .locals 3

    .prologue
    sget-object v0, LS0/Z$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    goto :goto_3

    :cond_0
    iget-object p1, p1, Ly7/O;->C:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, LS0/Z$a;->E:LS0/Z$a;

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    :goto_1
    iput-object p0, p2, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_3

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_2
    iput-object p0, p1, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method

.method private final u()V
    .locals 1

    iget-object v0, p0, LS0/Z;->b:LS0/u;

    invoke-interface {v0}, LS0/u;->i()V

    return-void
.end method

.method private final v(LS0/Z$a;)V
    .locals 1

    .prologue
    iget-object v0, p0, LS0/Z;->m:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    iget-object p1, p0, LS0/Z;->n:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    new-instance p1, LS0/Y;

    invoke-direct {p1, p0}, LS0/Y;-><init>(LS0/Z;)V

    iget-object v0, p0, LS0/Z;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iput-object p1, p0, LS0/Z;->n:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method private static final w(LS0/Z;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LS0/Z;->n:Ljava/lang/Runnable;

    invoke-direct {p0}, LS0/Z;->s()V

    return-void
.end method

.method private final x(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget-object p1, p0, LS0/Z;->b:LS0/u;

    invoke-interface {p1}, LS0/u;->b()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LS0/Z;->b:LS0/u;

    invoke-interface {p1}, LS0/u;->a()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, LS0/Z$a;->C:LS0/Z$a;

    invoke-direct {p0, v0}, LS0/Z;->v(LS0/Z$a;)V

    return-void
.end method

.method public b(LS0/V;LS0/V;)V
    .locals 6

    .prologue
    iget-object v0, p0, LS0/Z;->g:LS0/V;

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LM0/N;->g(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LS0/Z;->g:LS0/V;

    invoke-virtual {v0}, LS0/V;->g()LM0/N;

    move-result-object v0

    invoke-virtual {p2}, LS0/V;->g()LM0/N;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-object p2, p0, LS0/Z;->g:LS0/V;

    iget-object v2, p0, LS0/Z;->i:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_3

    iget-object v4, p0, LS0/Z;->i:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LS0/Q;

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v4, p2}, LS0/Q;->f(LS0/V;)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v2, p0, LS0/Z;->l:LS0/e;

    invoke-virtual {v2}, LS0/e;->a()V

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v0, :cond_6

    iget-object p1, p0, LS0/Z;->b:LS0/u;

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->l(J)I

    move-result v0

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->k(J)I

    move-result p2

    iget-object v1, p0, LS0/Z;->g:LS0/V;

    invoke-virtual {v1}, LS0/V;->g()LM0/N;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LM0/N;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->l(J)I

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v2

    :goto_4
    iget-object v3, p0, LS0/Z;->g:LS0/V;

    invoke-virtual {v3}, LS0/V;->g()LM0/N;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LM0/N;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->k(J)I

    move-result v2

    :cond_5
    invoke-interface {p1, v0, p2, v1, v2}, LS0/u;->h(IIII)V

    :cond_6
    return-void

    :cond_7
    if-eqz p1, :cond_9

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, LS0/V;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v2

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LM0/N;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, LS0/V;->g()LM0/N;

    move-result-object p1

    invoke-virtual {p2}, LS0/V;->g()LM0/N;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_8
    invoke-direct {p0}, LS0/Z;->u()V

    goto :goto_6

    :cond_9
    iget-object p1, p0, LS0/Z;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_5
    if-ge v1, p1, :cond_b

    iget-object p2, p0, LS0/Z;->i:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LS0/Q;

    if-eqz p2, :cond_a

    iget-object v0, p0, LS0/Z;->g:LS0/V;

    iget-object v2, p0, LS0/Z;->b:LS0/u;

    invoke-virtual {p2, v0, v2}, LS0/Q;->g(LS0/V;LS0/u;)V

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_b
    :goto_6
    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, LS0/Z$a;->E:LS0/Z$a;

    invoke-direct {p0, v0}, LS0/Z;->v(LS0/Z$a;)V

    return-void
.end method

.method public d(LS0/V;LS0/L;LM0/K;Lx7/l;Ln0/i;Ln0/i;)V
    .locals 7

    iget-object v0, p0, LS0/Z;->l:LS0/e;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, LS0/e;->d(LS0/V;LS0/L;LM0/K;Lx7/l;Ln0/i;Ln0/i;)V

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LS0/Z;->d:Z

    sget-object v0, LS0/Z$g;->D:LS0/Z$g;

    iput-object v0, p0, LS0/Z;->e:Lx7/l;

    sget-object v0, LS0/Z$h;->D:LS0/Z$h;

    iput-object v0, p0, LS0/Z;->f:Lx7/l;

    const/4 v0, 0x0

    iput-object v0, p0, LS0/Z;->k:Landroid/graphics/Rect;

    sget-object v0, LS0/Z$a;->D:LS0/Z$a;

    invoke-direct {p0, v0}, LS0/Z;->v(LS0/Z$a;)V

    return-void
.end method

.method public f(Ln0/i;)V
    .locals 4

    .prologue
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Ln0/i;->i()F

    move-result v1

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v1

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v2

    invoke-static {v2}, LA7/a;->d(F)I

    move-result v2

    invoke-virtual {p1}, Ln0/i;->j()F

    move-result v3

    invoke-static {v3}, LA7/a;->d(F)I

    move-result v3

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, LS0/Z;->k:Landroid/graphics/Rect;

    iget-object p1, p0, LS0/Z;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LS0/Z;->k:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    iget-object v0, p0, LS0/Z;->a:Landroid/view/View;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    :cond_0
    return-void
.end method

.method public g(LS0/V;LS0/s;Lx7/l;Lx7/l;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LS0/Z;->d:Z

    iput-object p1, p0, LS0/Z;->g:LS0/V;

    iput-object p2, p0, LS0/Z;->h:LS0/s;

    iput-object p3, p0, LS0/Z;->e:Lx7/l;

    iput-object p4, p0, LS0/Z;->f:Lx7/l;

    sget-object p1, LS0/Z$a;->C:LS0/Z$a;

    invoke-direct {p0, p1}, LS0/Z;->v(LS0/Z$a;)V

    return-void
.end method

.method public h()V
    .locals 1

    sget-object v0, LS0/Z$a;->F:LS0/Z$a;

    invoke-direct {p0, v0}, LS0/Z;->v(LS0/Z$a;)V

    return-void
.end method

.method public final o(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .prologue
    iget-boolean v0, p0, LS0/Z;->d:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LS0/Z;->h:LS0/s;

    iget-object v1, p0, LS0/Z;->g:LS0/V;

    invoke-static {p1, v0, v1}, LS0/c0;->h(Landroid/view/inputmethod/EditorInfo;LS0/s;LS0/V;)V

    invoke-static {p1}, LS0/c0;->c(Landroid/view/inputmethod/EditorInfo;)V

    iget-object p1, p0, LS0/Z;->g:LS0/V;

    iget-object v0, p0, LS0/Z;->h:LS0/s;

    invoke-virtual {v0}, LS0/s;->b()Z

    move-result v0

    new-instance v1, LS0/Z$d;

    invoke-direct {v1, p0}, LS0/Z$d;-><init>(LS0/Z;)V

    new-instance v2, LS0/Q;

    invoke-direct {v2, p1, v1, v0}, LS0/Q;-><init>(LS0/V;LS0/t;Z)V

    iget-object p1, p0, LS0/Z;->i:Ljava/util/List;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method public final q()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LS0/Z;->a:Landroid/view/View;

    return-object v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, LS0/Z;->d:Z

    return v0
.end method
