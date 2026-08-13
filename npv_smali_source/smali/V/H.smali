.class final LV/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/j0;


# static fields
.field public static final C:LV/H;

.field private static final D:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LV/H;

    invoke-direct {v0}, LV/H;-><init>()V

    sput-object v0, LV/H;->C:LV/H;

    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    invoke-virtual {v0}, LW8/J0;->z1()LW8/J0;

    move-result-object v0

    new-instance v1, LV/H$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LV/H$a;-><init>(Lm7/e;)V

    invoke-static {v0, v1}, LW8/g;->e(Lm7/i;Lx7/p;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Choreographer;

    sput-object v0, LV/H;->D:Landroid/view/Choreographer;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Landroid/view/Choreographer;
    .locals 1

    sget-object v0, LV/H;->D:Landroid/view/Choreographer;

    return-object v0
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LV/j0$a;->a(LV/j0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public R(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    new-instance v1, LV/H$c;

    invoke-direct {v1, v0, p1}, LV/H$c;-><init>(LW8/l;Lx7/l;)V

    invoke-static {}, LV/H;->a()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, LV/H$b;

    invoke-direct {p1, v1}, LV/H$b;-><init>(Landroid/view/Choreographer$FrameCallback;)V

    invoke-interface {v0, p1}, LW8/l;->G(Lx7/l;)V

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p1
.end method

.method public synthetic getKey()Lm7/i$c;
    .locals 1

    invoke-static {p0}, LV/i0;->a(LV/j0;)Lm7/i$c;

    move-result-object v0

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->b(LV/j0;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->d(LV/j0;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->c(LV/j0;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
