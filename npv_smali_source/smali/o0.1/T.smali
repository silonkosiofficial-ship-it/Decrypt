.class public final Lo0/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/N1;


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:I

.field private c:Landroid/graphics/Shader;

.field private d:Lo0/z0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lo0/U;->j()Landroid/graphics/Paint;

    move-result-object v0

    invoke-direct {p0, v0}, Lo0/T;-><init>(Landroid/graphics/Paint;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/T;->a:Landroid/graphics/Paint;

    sget-object p1, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {p1}, Lo0/f0$a;->B()I

    move-result p1

    iput p1, p0, Lo0/T;->b:I

    return-void
.end method


# virtual methods
.method public A(Lo0/z0;)V
    .locals 1

    iput-object p1, p0, Lo0/T;->d:Lo0/z0;

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->n(Landroid/graphics/Paint;Lo0/z0;)V

    return-void
.end method

.method public B(I)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->o(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public C()I
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lo0/U;->e(Landroid/graphics/Paint;)I

    move-result v0

    return v0
.end method

.method public D()I
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lo0/U;->f(Landroid/graphics/Paint;)I

    move-result v0

    return v0
.end method

.method public E(I)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->s(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public F(I)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->v(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public G(J)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1, p2}, Lo0/U;->m(Landroid/graphics/Paint;J)V

    return-void
.end method

.method public H()Lo0/R1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public I(F)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->u(Landroid/graphics/Paint;F)V

    return-void
.end method

.method public J()F
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lo0/U;->i(Landroid/graphics/Paint;)F

    move-result v0

    return v0
.end method

.method public a()F
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lo0/U;->c(Landroid/graphics/Paint;)F

    move-result v0

    return v0
.end method

.method public b(F)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->k(Landroid/graphics/Paint;F)V

    return-void
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lo0/U;->d(Landroid/graphics/Paint;)J

    move-result-wide v0

    return-wide v0
.end method

.method public f()Lo0/z0;
    .locals 1

    iget-object v0, p0, Lo0/T;->d:Lo0/z0;

    return-object v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lo0/T;->b:I

    return v0
.end method

.method public r()I
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lo0/U;->g(Landroid/graphics/Paint;)I

    move-result v0

    return v0
.end method

.method public s(I)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->r(Landroid/graphics/Paint;I)V

    return-void
.end method

.method public t(Lo0/R1;)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->p(Landroid/graphics/Paint;Lo0/R1;)V

    return-void
.end method

.method public u(I)V
    .locals 1

    .prologue
    iget v0, p0, Lo0/T;->b:I

    invoke-static {v0, p1}, Lo0/f0;->E(II)Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Lo0/T;->b:I

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->l(Landroid/graphics/Paint;I)V

    :cond_0
    return-void
.end method

.method public v()F
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0}, Lo0/U;->h(Landroid/graphics/Paint;)F

    move-result v0

    return v0
.end method

.method public w()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    return-object v0
.end method

.method public x(Landroid/graphics/Shader;)V
    .locals 1

    iput-object p1, p0, Lo0/T;->c:Landroid/graphics/Shader;

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->q(Landroid/graphics/Paint;Landroid/graphics/Shader;)V

    return-void
.end method

.method public y()Landroid/graphics/Shader;
    .locals 1

    iget-object v0, p0, Lo0/T;->c:Landroid/graphics/Shader;

    return-object v0
.end method

.method public z(F)V
    .locals 1

    iget-object v0, p0, Lo0/T;->a:Landroid/graphics/Paint;

    invoke-static {v0, p1}, Lo0/U;->t(Landroid/graphics/Paint;F)V

    return-void
.end method
