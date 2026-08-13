.class public final Lr0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/e;


# instance fields
.field private A:Z

.field private B:I

.field private C:Z

.field private final b:J

.field private final c:Lo0/r0;

.field private final d:Lq0/a;

.field private final e:Landroid/graphics/RenderNode;

.field private f:J

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Matrix;

.field private i:Z

.field private j:F

.field private k:I

.field private l:Lo0/z0;

.field private m:J

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:J

.field private t:J

.field private u:F

.field private v:F

.field private w:F

.field private x:F

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(JLo0/r0;Lq0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lr0/E;->b:J

    iput-object p3, p0, Lr0/E;->c:Lo0/r0;

    iput-object p4, p0, Lr0/E;->d:Lq0/a;

    const-string p1, "graphicsLayer"

    invoke-static {p1}, Lv/p;->a(Ljava/lang/String;)Landroid/graphics/RenderNode;

    move-result-object p1

    iput-object p1, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    sget-object p2, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {p2}, Ln0/m$a;->b()J

    move-result-wide p2

    iput-wide p2, p0, Lr0/E;->f:J

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lr0/C;->a(Landroid/graphics/RenderNode;Z)Z

    sget-object p2, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {p2}, Lr0/b$a;->a()I

    move-result p3

    invoke-direct {p0, p1, p3}, Lr0/E;->P(Landroid/graphics/RenderNode;I)V

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lr0/E;->j:F

    sget-object p3, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {p3}, Lo0/f0$a;->B()I

    move-result p3

    iput p3, p0, Lr0/E;->k:I

    sget-object p3, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p3}, Ln0/g$a;->b()J

    move-result-wide p3

    iput-wide p3, p0, Lr0/E;->m:J

    iput p1, p0, Lr0/E;->n:F

    iput p1, p0, Lr0/E;->o:F

    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide p3

    iput-wide p3, p0, Lr0/E;->s:J

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide p3

    iput-wide p3, p0, Lr0/E;->t:J

    const/high16 p1, 0x41000000    # 8.0f

    iput p1, p0, Lr0/E;->x:F

    invoke-virtual {p2}, Lr0/b$a;->a()I

    move-result p1

    iput p1, p0, Lr0/E;->B:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr0/E;->C:Z

    return-void
.end method

.method public synthetic constructor <init>(JLo0/r0;Lq0/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    new-instance p3, Lo0/r0;

    invoke-direct {p3}, Lo0/r0;-><init>()V

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    new-instance p4, Lq0/a;

    invoke-direct {p4}, Lq0/a;-><init>()V

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lr0/E;-><init>(JLo0/r0;Lq0/a;)V

    return-void
.end method

.method private final O()V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lr0/E;->Q()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lr0/E;->i:Z

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lr0/E;->Q()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Lr0/E;->i:Z

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v2, p0, Lr0/E;->z:Z

    if-eq v0, v2, :cond_2

    iput-boolean v0, p0, Lr0/E;->z:Z

    iget-object v2, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v2, v0}, Lr0/C;->a(Landroid/graphics/RenderNode;Z)Z

    :cond_2
    iget-boolean v0, p0, Lr0/E;->A:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, Lr0/E;->A:Z

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, v1}, Lr0/D;->a(Landroid/graphics/RenderNode;Z)Z

    :cond_3
    return-void
.end method

.method private final P(Landroid/graphics/RenderNode;I)V
    .locals 3

    .prologue
    sget-object v0, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v0}, Lr0/b$a;->c()I

    move-result v1

    invoke-static {p2, v1}, Lr0/b;->e(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object p2, p0, Lr0/E;->g:Landroid/graphics/Paint;

    invoke-static {p1, v2, p2}, Lr0/m;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    :goto_0
    invoke-static {p1, v2}, Lr0/n;->a(Landroid/graphics/RenderNode;Z)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lr0/b$a;->b()I

    move-result v0

    invoke-static {p2, v0}, Lr0/b;->e(II)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object p2, p0, Lr0/E;->g:Landroid/graphics/Paint;

    invoke-static {p1, v0, p2}, Lr0/m;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    invoke-static {p1, v0}, Lr0/n;->a(Landroid/graphics/RenderNode;Z)Z

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lr0/E;->g:Landroid/graphics/Paint;

    invoke-static {p1, v0, p2}, Lr0/m;->a(Landroid/graphics/RenderNode;ZLandroid/graphics/Paint;)Z

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final R()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lr0/E;->C()I

    move-result v0

    sget-object v1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v1}, Lr0/b$a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lr0/b;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lr0/E;->S()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr0/E;->t()Lo0/Z1;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method private final S()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lr0/E;->q()I

    move-result v0

    sget-object v1, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v1}, Lo0/f0$a;->B()I

    move-result v1

    invoke-static {v0, v1}, Lo0/f0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lr0/E;->f()Lo0/z0;

    move-result-object v0

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

.method private final T()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lr0/E;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    sget-object v1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v1}, Lr0/b$a;->c()I

    move-result v1

    :goto_0
    invoke-direct {p0, v0, v1}, Lr0/E;->P(Landroid/graphics/RenderNode;I)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-virtual {p0}, Lr0/E;->C()I

    move-result v1

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 0

    iput-boolean p1, p0, Lr0/E;->y:Z

    invoke-direct {p0}, Lr0/E;->O()V

    return-void
.end method

.method public B()F
    .locals 1

    iget v0, p0, Lr0/E;->u:F

    return v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lr0/E;->B:I

    return v0
.end method

.method public D(J)V
    .locals 1

    iput-wide p1, p0, Lr0/E;->t:J

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-static {v0, p1}, Lr0/A;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lr0/E;->o:F

    return v0
.end method

.method public F(IIJ)V
    .locals 3

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result v2

    add-int/2addr v2, p2

    invoke-static {v0, p1, p2, v1, v2}, Lv/q;->a(Landroid/graphics/RenderNode;IIII)Z

    invoke-static {p3, p4}, LY0/u;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, Lr0/E;->f:J

    return-void
.end method

.method public G(J)V
    .locals 2

    .prologue
    iput-wide p1, p0, Lr0/E;->m:J

    invoke-static {p1, p2}, Ln0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p1}, Lr0/p;->a(Landroid/graphics/RenderNode;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    invoke-static {v0, v1}, Lr0/q;->a(Landroid/graphics/RenderNode;F)Z

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-static {v0, p1}, Lr0/r;->a(Landroid/graphics/RenderNode;F)Z

    :goto_0
    return-void
.end method

.method public H()J
    .locals 2

    iget-wide v0, p0, Lr0/E;->s:J

    return-wide v0
.end method

.method public I(LY0/e;LY0/v;Lr0/c;Lx7/l;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lv/r;->a(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lr0/E;->c:Lo0/r0;

    invoke-virtual {v1}, Lo0/r0;->a()Lo0/G;

    move-result-object v2

    invoke-virtual {v2}, Lo0/G;->a()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v1}, Lo0/r0;->a()Lo0/G;

    move-result-object v3

    invoke-virtual {v3, v0}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    invoke-virtual {v1}, Lo0/r0;->a()Lo0/G;

    move-result-object v0

    iget-object v3, p0, Lr0/E;->d:Lq0/a;

    invoke-virtual {v3}, Lq0/a;->F0()Lq0/d;

    move-result-object v3

    invoke-interface {v3, p1}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v3, p2}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v3, p3}, Lq0/d;->e(Lr0/c;)V

    iget-wide p1, p0, Lr0/E;->f:J

    invoke-interface {v3, p1, p2}, Lq0/d;->d(J)V

    invoke-interface {v3, v0}, Lq0/d;->g(Lo0/q0;)V

    iget-object p1, p0, Lr0/E;->d:Lq0/a;

    invoke-interface {p4, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lo0/r0;->a()Lo0/G;

    move-result-object p1

    invoke-virtual {p1, v2}, Lo0/G;->w(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p1}, Lv/s;->a(Landroid/graphics/RenderNode;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lr0/E;->s(Z)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p2}, Lv/s;->a(Landroid/graphics/RenderNode;)V

    throw p1
.end method

.method public J()J
    .locals 2

    iget-wide v0, p0, Lr0/E;->t:J

    return-wide v0
.end method

.method public K(I)V
    .locals 0

    iput p1, p0, Lr0/E;->B:I

    invoke-direct {p0}, Lr0/E;->T()V

    return-void
.end method

.method public L()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    iget-object v0, p0, Lr0/E;->h:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lr0/E;->h:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v1, v0}, Lr0/v;->a(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public M()F
    .locals 1

    iget v0, p0, Lr0/E;->r:F

    return v0
.end method

.method public N(Lo0/q0;)V
    .locals 1

    invoke-static {p1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object p1

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, v0}, Lv/t;->a(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lr0/E;->y:Z

    return v0
.end method

.method public a()F
    .locals 1

    iget v0, p0, Lr0/E;->j:F

    return v0
.end method

.method public b(F)V
    .locals 1

    iput p1, p0, Lr0/E;->j:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/i;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public c(F)V
    .locals 1

    iput p1, p0, Lr0/E;->v:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/y;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public d(F)V
    .locals 1

    iput p1, p0, Lr0/E;->w:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/z;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public e(F)V
    .locals 1

    iput p1, p0, Lr0/E;->q:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/B;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public f()Lo0/z0;
    .locals 1

    iget-object v0, p0, Lr0/E;->l:Lo0/z0;

    return-object v0
.end method

.method public g(F)V
    .locals 1

    iput p1, p0, Lr0/E;->o:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/h;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public h(F)V
    .locals 1

    iput p1, p0, Lr0/E;->n:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/k;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lr0/l;->a(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public j(F)V
    .locals 1

    iput p1, p0, Lr0/E;->p:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/x;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

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

    sget-object v0, Lr0/T;->a:Lr0/T;

    iget-object v1, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-virtual {v0, v1, p1}, Lr0/T;->a(Landroid/graphics/RenderNode;Lo0/Z1;)V

    :cond_0
    return-void
.end method

.method public m(F)V
    .locals 1

    iput p1, p0, Lr0/E;->x:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/t;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public n(F)V
    .locals 1

    iput p1, p0, Lr0/E;->u:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/o;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public o()F
    .locals 1

    iget v0, p0, Lr0/E;->n:F

    return v0
.end method

.method public p(F)V
    .locals 1

    iput p1, p0, Lr0/E;->r:F

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lr0/s;->a(Landroid/graphics/RenderNode;F)Z

    return-void
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lr0/E;->k:I

    return v0
.end method

.method public r()F
    .locals 1

    iget v0, p0, Lr0/E;->v:F

    return v0
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lr0/E;->C:Z

    return-void
.end method

.method public t()Lo0/Z1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Lr0/E;->w:F

    return v0
.end method

.method public v()F
    .locals 1

    iget v0, p0, Lr0/E;->q:F

    return v0
.end method

.method public w(J)V
    .locals 1

    iput-wide p1, p0, Lr0/E;->s:J

    iget-object v0, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-static {v0, p1}, Lr0/w;->a(Landroid/graphics/RenderNode;I)Z

    return-void
.end method

.method public x()F
    .locals 1

    iget v0, p0, Lr0/E;->x:F

    return v0
.end method

.method public y(Landroid/graphics/Outline;J)V
    .locals 0

    .prologue
    iget-object p2, p0, Lr0/E;->e:Landroid/graphics/RenderNode;

    invoke-static {p2, p1}, Lr0/j;->a(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lr0/E;->i:Z

    invoke-direct {p0}, Lr0/E;->O()V

    return-void
.end method

.method public z()F
    .locals 1

    iget v0, p0, Lr0/E;->p:F

    return v0
.end method
