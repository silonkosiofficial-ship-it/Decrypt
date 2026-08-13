.class public final Landroidx/compose/ui/platform/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/s0;


# instance fields
.field private final a:Landroidx/compose/ui/platform/r;

.field private final b:Landroid/graphics/RenderNode;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/h1;->a:Landroidx/compose/ui/platform/r;

    const-string p1, "Compose"

    invoke-static {p1}, Lv/p;->a(Ljava/lang/String;)Landroid/graphics/RenderNode;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    sget-object p1, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/a$a;->a()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/platform/h1;->c:I

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/a1;->a(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public B()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/g1;->a(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public C(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/w;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public D()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/d1;->a(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public E(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/D;->a(Landroid/graphics/RenderNode;Z)Z

    return-void
.end method

.method public F(Z)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/n;->a(Landroid/graphics/RenderNode;Z)Z

    move-result p1

    return p1
.end method

.method public G(Lo0/r0;Lo0/Q1;Lx7/l;)V
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lv/r;->a(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    move-result-object v0

    invoke-virtual {p1}, Lo0/r0;->a()Lo0/G;

    move-result-object v1

    invoke-virtual {v1}, Lo0/G;->a()Landroid/graphics/Canvas;

    move-result-object v1

    invoke-virtual {p1}, Lo0/r0;->a()Lo0/G;

    move-result-object v2

    invoke-virtual {v2, v0}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Lo0/r0;->a()Lo0/G;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-interface {v0}, Lo0/q0;->m()V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, p2, v4, v2, v3}, Lo0/p0;->c(Lo0/q0;Lo0/Q1;IILjava/lang/Object;)V

    :cond_0
    invoke-interface {p3, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    invoke-interface {v0}, Lo0/q0;->s()V

    :cond_1
    invoke-virtual {p1}, Lo0/r0;->a()Lo0/G;

    move-result-object p1

    invoke-virtual {p1, v1}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {p1}, Lv/s;->a(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public H(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/A;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public I(Landroid/graphics/Matrix;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/v;->a(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public J()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/e1;->a(Landroid/graphics/RenderNode;)F

    move-result v0

    return v0
.end method

.method public a()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/f1;->a(Landroid/graphics/RenderNode;)F

    move-result v0

    return v0
.end method

.method public b(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/i;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public c(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/y;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public d(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/z;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public e(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/B;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/c1;->a(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public g(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/h;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/b1;->a(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/Z0;->a(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public h(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/k;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lr0/l;->a(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public j(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/x;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lr0/u;->a(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public l(Lo0/Z1;)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/i1;->a:Landroidx/compose/ui/platform/i1;

    iget-object v1, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-virtual {v0, v1, p1}, Landroidx/compose/ui/platform/i1;->a(Landroid/graphics/RenderNode;Lo0/Z1;)V

    :cond_0
    return-void
.end method

.method public m(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/t;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public n(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/o;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/X0;->a(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public p(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/V0;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public q(I)V
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    sget-object v1, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/a$a;->c()I

    move-result v2

    invoke-static {p1, v2}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-static {v0, v4, v3}, Lr0/m;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    :cond_0
    invoke-static {v0, v4}, Lr0/n;->a(Landroid/graphics/RenderNode;Z)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/a$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v3}, Lr0/m;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    if-eqz v1, :cond_0

    invoke-static {v0, v2}, Lr0/n;->a(Landroid/graphics/RenderNode;Z)Z

    :goto_0
    iput p1, p0, Landroidx/compose/ui/platform/h1;->c:I

    return-void
.end method

.method public r()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0}, Landroidx/compose/ui/platform/Y0;->a(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public s(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {p1, v0}, Lv/t;->a(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public t(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/q;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public u(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/C;->a(Landroid/graphics/RenderNode;Z)Z

    return-void
.end method

.method public v(IIII)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1, p2, p3, p4}, Lv/q;->a(Landroid/graphics/RenderNode;IIII)Z

    move-result p1

    return p1
.end method

.method public w(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/r;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public x(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/s;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public y(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/W0;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public z(Landroid/graphics/Outline;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/h1;->b:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/j;->a(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)Z

    return-void
.end method
