.class public final LJ0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ0/d$a;


# instance fields
.field private final a:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, LJ0/l;->a:LV/w0;

    return-void
.end method

.method private final e(Z)V
    .locals 1

    iget-object v0, p0, LJ0/l;->a:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LJ0/l;->e(Z)V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LJ0/l;->e(Z)V

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, LJ0/l;->a:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d(Landroid/view/View;LK0/q;Lm7/i;Ljava/util/function/Consumer;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LK0/q;",
            "Lm7/i;",
            "Ljava/util/function/Consumer<",
            "Landroid/view/ScrollCaptureTarget;",
            ">;)V"
        }
    .end annotation

    .prologue
    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [LJ0/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    invoke-virtual {p2}, LK0/q;->a()LK0/o;

    move-result-object p2

    new-instance v1, LJ0/l$a;

    invoke-direct {v1, v0}, LJ0/l$a;-><init>(Ljava/lang/Object;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p2, v2, v1, v3, v4}, LJ0/n;->e(LK0/o;ILx7/l;ILjava/lang/Object;)V

    new-array p2, v3, [Lx7/l;

    sget-object v1, LJ0/l$b;->D:LJ0/l$b;

    aput-object v1, p2, v2

    sget-object v1, LJ0/l$c;->D:LJ0/l$c;

    const/4 v2, 0x1

    aput-object v1, p2, v2

    invoke-static {p2}, Ll7/a;->b([Lx7/l;)Ljava/util/Comparator;

    move-result-object p2

    invoke-virtual {v0, p2}, LX/b;->N(Ljava/util/Comparator;)V

    invoke-virtual {v0}, LX/b;->w()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LX/b;->t()I

    move-result p2

    sub-int/2addr p2, v2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    aget-object v4, v0, p2

    :goto_0
    check-cast v4, LJ0/m;

    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-static {p3}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object p2

    new-instance p3, LJ0/d;

    invoke-virtual {v4}, LJ0/m;->c()LK0/o;

    move-result-object v0

    invoke-virtual {v4}, LJ0/m;->d()LY0/r;

    move-result-object v1

    invoke-direct {p3, v0, v1, p2, p0}, LJ0/d;-><init>(LK0/o;LY0/r;LW8/N;LJ0/d$a;)V

    invoke-virtual {v4}, LJ0/m;->a()LD0/t;

    move-result-object p2

    invoke-static {p2}, LD0/u;->b(LD0/t;)Ln0/i;

    move-result-object p2

    invoke-virtual {v4}, LJ0/m;->d()LY0/r;

    move-result-object v0

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v0

    invoke-static {p2}, LY0/s;->b(Ln0/i;)LY0/r;

    move-result-object p2

    invoke-static {p2}, Lo0/X1;->a(LY0/r;)Landroid/graphics/Rect;

    move-result-object p2

    new-instance v2, Landroid/graphics/Point;

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v3

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {p3}, LJ0/i;->a(Ljava/lang/Object;)Landroid/view/ScrollCaptureCallback;

    move-result-object p3

    invoke-static {p1, p2, v2, p3}, LJ0/k;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;

    move-result-object p1

    invoke-virtual {v4}, LJ0/m;->d()LY0/r;

    move-result-object p2

    invoke-static {p2}, Lo0/X1;->a(LY0/r;)Landroid/graphics/Rect;

    move-result-object p2

    invoke-static {p1, p2}, LJ0/j;->a(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V

    invoke-interface {p4, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
