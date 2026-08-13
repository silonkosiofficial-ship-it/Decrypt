.class public final LK/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/Q0;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:LK/l0;

.field private c:Lx7/l;

.field private d:Lx7/l;

.field private e:LH/w;

.field private f:LN/F;

.field private g:Landroidx/compose/ui/platform/A1;

.field private h:LS0/V;

.field private i:LS0/s;

.field private j:Ljava/util/List;

.field private final k:Li7/n;

.field private l:Landroid/graphics/Rect;

.field private final m:LK/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lx7/l;LK/l0;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/s0;->a:Landroid/view/View;

    iput-object p3, p0, LK/s0;->b:LK/l0;

    sget-object p1, LK/s0$c;->D:LK/s0$c;

    iput-object p1, p0, LK/s0;->c:Lx7/l;

    sget-object p1, LK/s0$d;->D:LK/s0$d;

    iput-object p1, p0, LK/s0;->d:Lx7/l;

    new-instance p1, LS0/V;

    sget-object v0, LM0/N;->b:LM0/N$a;

    invoke-virtual {v0}, LM0/N$a;->a()J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LS0/V;-><init>(Ljava/lang/String;JLM0/N;ILy7/k;)V

    iput-object p1, p0, LK/s0;->h:LS0/V;

    sget-object p1, LS0/s;->g:LS0/s$a;

    invoke-virtual {p1}, LS0/s$a;->a()LS0/s;

    move-result-object p1

    iput-object p1, p0, LK/s0;->i:LS0/s;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LK/s0;->j:Ljava/util/List;

    sget-object p1, Li7/r;->E:Li7/r;

    new-instance v0, LK/s0$a;

    invoke-direct {v0, p0}, LK/s0$a;-><init>(LK/s0;)V

    invoke-static {p1, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LK/s0;->k:Li7/n;

    new-instance p1, LK/p0;

    invoke-direct {p1, p2, p3}, LK/p0;-><init>(Lx7/l;LK/l0;)V

    iput-object p1, p0, LK/s0;->m:LK/p0;

    return-void
.end method

.method public static final synthetic b(LK/s0;)Landroid/view/inputmethod/BaseInputConnection;
    .locals 0

    invoke-direct {p0}, LK/s0;->h()Landroid/view/inputmethod/BaseInputConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LK/s0;)LK/p0;
    .locals 0

    iget-object p0, p0, LK/s0;->m:LK/p0;

    return-object p0
.end method

.method public static final synthetic d(LK/s0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LK/s0;->j:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic e(LK/s0;)Lx7/l;
    .locals 0

    iget-object p0, p0, LK/s0;->c:Lx7/l;

    return-object p0
.end method

.method public static final synthetic f(LK/s0;)Lx7/l;
    .locals 0

    iget-object p0, p0, LK/s0;->d:Lx7/l;

    return-object p0
.end method

.method private final h()Landroid/view/inputmethod/BaseInputConnection;
    .locals 1

    iget-object v0, p0, LK/s0;->k:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/BaseInputConnection;

    return-object v0
.end method

.method private final k()V
    .locals 1

    iget-object v0, p0, LK/s0;->b:LK/l0;

    invoke-interface {v0}, LK/l0;->i()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    invoke-virtual {p0, p1}, LK/s0;->g(Landroid/view/inputmethod/EditorInfo;)LK/w0;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroid/view/inputmethod/EditorInfo;)LK/w0;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LK/s0;->h:LS0/V;

    invoke-virtual {v1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, LK/s0;->h:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v4

    iget-object v6, v0, LK/s0;->i:LS0/s;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v9}, LK/z;->c(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLS0/s;[Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static/range {p1 .. p1}, LK/r0;->a(Landroid/view/inputmethod/EditorInfo;)V

    iget-object v11, v0, LK/s0;->h:LS0/V;

    iget-object v1, v0, LK/s0;->i:LS0/s;

    invoke-virtual {v1}, LS0/s;->b()Z

    move-result v13

    new-instance v12, LK/s0$b;

    invoke-direct {v12, v0}, LK/s0$b;-><init>(LK/s0;)V

    iget-object v14, v0, LK/s0;->e:LH/w;

    iget-object v15, v0, LK/s0;->f:LN/F;

    iget-object v1, v0, LK/s0;->g:Landroidx/compose/ui/platform/A1;

    new-instance v2, LK/w0;

    move-object v10, v2

    move-object/from16 v16, v1

    invoke-direct/range {v10 .. v16}, LK/w0;-><init>(LS0/V;LK/k0;ZLH/w;LN/F;Landroidx/compose/ui/platform/A1;)V

    iget-object v1, v0, LK/s0;->j:Ljava/util/List;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method public final i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LK/s0;->a:Landroid/view/View;

    return-object v0
.end method

.method public final j(Ln0/i;)V
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

    iput-object v0, p0, LK/s0;->l:Landroid/graphics/Rect;

    iget-object p1, p0, LK/s0;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LK/s0;->l:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    iget-object v0, p0, LK/s0;->a:Landroid/view/View;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    :cond_0
    return-void
.end method

.method public final l(LS0/V;LK/q0$a;LS0/s;Lx7/l;Lx7/l;)V
    .locals 0

    .prologue
    iput-object p1, p0, LK/s0;->h:LS0/V;

    iput-object p3, p0, LK/s0;->i:LS0/s;

    iput-object p4, p0, LK/s0;->c:Lx7/l;

    iput-object p5, p0, LK/s0;->d:Lx7/l;

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, LK/q0$a;->i1()LH/w;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p1

    :goto_0
    iput-object p3, p0, LK/s0;->e:LH/w;

    if-eqz p2, :cond_1

    invoke-interface {p2}, LK/q0$a;->d0()LN/F;

    move-result-object p3

    goto :goto_1

    :cond_1
    move-object p3, p1

    :goto_1
    iput-object p3, p0, LK/s0;->f:LN/F;

    if-eqz p2, :cond_2

    invoke-interface {p2}, LK/q0$a;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object p1

    :cond_2
    iput-object p1, p0, LK/s0;->g:Landroidx/compose/ui/platform/A1;

    return-void
.end method

.method public final m(LS0/V;LS0/V;)V
    .locals 6

    .prologue
    iget-object v0, p0, LK/s0;->h:LS0/V;

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LM0/N;->g(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LK/s0;->h:LS0/V;

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
    iput-object p2, p0, LK/s0;->h:LS0/V;

    iget-object v2, p0, LK/s0;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_3

    iget-object v4, p0, LK/s0;->j:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LK/w0;

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v4, p2}, LK/w0;->g(LS0/V;)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v2, p0, LK/s0;->m:LK/p0;

    invoke-virtual {v2}, LK/p0;->a()V

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v0, :cond_6

    iget-object p1, p0, LK/s0;->b:LK/l0;

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->l(J)I

    move-result v0

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->k(J)I

    move-result p2

    iget-object v1, p0, LK/s0;->h:LS0/V;

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
    iget-object v3, p0, LK/s0;->h:LS0/V;

    invoke-virtual {v3}, LS0/V;->g()LM0/N;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LM0/N;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->k(J)I

    move-result v2

    :cond_5
    invoke-interface {p1, v0, p2, v1, v2}, LK/l0;->h(IIII)V

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
    invoke-direct {p0}, LK/s0;->k()V

    goto :goto_6

    :cond_9
    iget-object p1, p0, LK/s0;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_5
    if-ge v1, p1, :cond_b

    iget-object p2, p0, LK/s0;->j:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LK/w0;

    if-eqz p2, :cond_a

    iget-object v0, p0, LK/s0;->h:LS0/V;

    iget-object v2, p0, LK/s0;->b:LK/l0;

    invoke-virtual {p2, v0, v2}, LK/w0;->h(LS0/V;LK/l0;)V

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_b
    :goto_6
    return-void
.end method

.method public final n(LS0/V;LS0/L;LM0/K;Ln0/i;Ln0/i;)V
    .locals 6

    iget-object v0, p0, LK/s0;->m:LK/p0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LK/p0;->d(LS0/V;LS0/L;LM0/K;Ln0/i;Ln0/i;)V

    return-void
.end method
