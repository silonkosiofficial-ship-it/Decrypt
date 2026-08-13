.class final LD/g$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/g$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD/h;

.field final synthetic E:I

.field final synthetic F:F

.field final synthetic G:Ly7/L;

.field final synthetic H:Lx/w;

.field final synthetic I:Ly7/K;

.field final synthetic J:Z

.field final synthetic K:F

.field final synthetic L:Ly7/M;

.field final synthetic M:I

.field final synthetic N:I

.field final synthetic O:Ly7/O;


# direct methods
.method constructor <init>(LD/h;IFLy7/L;Lx/w;Ly7/K;ZFLy7/M;IILy7/O;)V
    .locals 0

    iput-object p1, p0, LD/g$a$a;->D:LD/h;

    iput p2, p0, LD/g$a$a;->E:I

    iput p3, p0, LD/g$a$a;->F:F

    iput-object p4, p0, LD/g$a$a;->G:Ly7/L;

    iput-object p5, p0, LD/g$a$a;->H:Lx/w;

    iput-object p6, p0, LD/g$a$a;->I:Ly7/K;

    iput-boolean p7, p0, LD/g$a$a;->J:Z

    iput p8, p0, LD/g$a$a;->K:F

    iput-object p9, p0, LD/g$a$a;->L:Ly7/M;

    iput p10, p0, LD/g$a$a;->M:I

    iput p11, p0, LD/g$a$a;->N:I

    iput-object p12, p0, LD/g$a$a;->O:Ly7/O;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/i;)V
    .locals 7

    .prologue
    iget-object v0, p0, LD/g$a$a;->D:LD/h;

    iget v1, p0, LD/g$a$a;->E:I

    invoke-static {v0, v1}, LD/g;->e(LD/h;I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget v0, p0, LD/g$a$a;->F:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LD/g$a$a;->F:F

    invoke-static {v0, v2}, LE7/j;->f(FF)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LD/g$a$a;->F:F

    invoke-static {v0, v2}, LE7/j;->c(FF)F

    move-result v0

    :goto_0
    iget-object v2, p0, LD/g$a$a;->G:Ly7/L;

    iget v2, v2, Ly7/L;->C:F

    sub-float/2addr v0, v2

    iget-object v2, p0, LD/g$a$a;->H:Lx/w;

    invoke-interface {v2, v0}, Lx/w;->a(F)F

    move-result v2

    iget-object v3, p0, LD/g$a$a;->D:LD/h;

    iget v4, p0, LD/g$a$a;->E:I

    invoke-static {v3, v4}, LD/g;->e(LD/h;I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-boolean v3, p0, LD/g$a$a;->J:Z

    iget-object v4, p0, LD/g$a$a;->D:LD/h;

    iget v5, p0, LD/g$a$a;->E:I

    iget v6, p0, LD/g$a$a;->N:I

    invoke-static {v3, v4, v5, v6}, LD/g$a;->H(ZLD/h;II)Z

    move-result v3

    if-nez v3, :cond_6

    cmpg-float v2, v0, v2

    if-nez v2, :cond_5

    iget-object v2, p0, LD/g$a$a;->G:Ly7/L;

    iget v3, v2, Ly7/L;->C:F

    add-float/2addr v3, v0

    iput v3, v2, Ly7/L;->C:F

    iget-boolean v0, p0, LD/g$a$a;->J:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LD/g$a$a;->K:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    :goto_1
    invoke-virtual {p1}, Lu/i;->a()V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LD/g$a$a;->K:F

    neg-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    iget-boolean v0, p0, LD/g$a$a;->J:Z

    const/4 v2, 0x2

    if-eqz v0, :cond_4

    iget-object v0, p0, LD/g$a$a;->L:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    if-lt v0, v2, :cond_6

    iget v0, p0, LD/g$a$a;->E:I

    iget-object v2, p0, LD/g$a$a;->D:LD/h;

    invoke-interface {v2}, LD/h;->b()I

    move-result v2

    sub-int/2addr v0, v2

    iget v2, p0, LD/g$a$a;->M:I

    if-le v0, v2, :cond_6

    iget-object v0, p0, LD/g$a$a;->D:LD/h;

    iget-object v3, p0, LD/g$a$a;->H:Lx/w;

    iget v4, p0, LD/g$a$a;->E:I

    sub-int/2addr v4, v2

    invoke-interface {v0, v3, v4, v1}, LD/h;->c(Lx/w;II)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, LD/g$a$a;->L:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    if-lt v0, v2, :cond_6

    iget-object v0, p0, LD/g$a$a;->D:LD/h;

    invoke-interface {v0}, LD/h;->g()I

    move-result v0

    iget v2, p0, LD/g$a$a;->E:I

    sub-int/2addr v0, v2

    iget v3, p0, LD/g$a$a;->M:I

    if-le v0, v3, :cond_6

    iget-object v0, p0, LD/g$a$a;->D:LD/h;

    iget-object v4, p0, LD/g$a$a;->H:Lx/w;

    add-int/2addr v2, v3

    invoke-interface {v0, v4, v2, v1}, LD/h;->c(Lx/w;II)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lu/i;->a()V

    iget-object p1, p0, LD/g$a$a;->I:Ly7/K;

    iput-boolean v1, p1, Ly7/K;->C:Z

    return-void

    :cond_6
    :goto_3
    iget-boolean v0, p0, LD/g$a$a;->J:Z

    iget-object v2, p0, LD/g$a$a;->D:LD/h;

    iget v3, p0, LD/g$a$a;->E:I

    iget v4, p0, LD/g$a$a;->N:I

    invoke-static {v0, v2, v3, v4}, LD/g$a;->H(ZLD/h;II)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, LD/g$a$a;->D:LD/h;

    iget v2, p0, LD/g$a$a;->N:I

    iget-object v3, p0, LD/g$a$a;->H:Lx/w;

    iget v4, p0, LD/g$a$a;->E:I

    invoke-interface {v0, v3, v4, v2}, LD/h;->c(Lx/w;II)V

    iget-object v0, p0, LD/g$a$a;->I:Ly7/K;

    iput-boolean v1, v0, Ly7/K;->C:Z

    invoke-virtual {p1}, Lu/i;->a()V

    return-void

    :cond_7
    iget-object p1, p0, LD/g$a$a;->D:LD/h;

    iget v0, p0, LD/g$a$a;->E:I

    invoke-static {p1, v0}, LD/g;->e(LD/h;I)Z

    move-result p1

    if-nez p1, :cond_8

    return-void

    :cond_8
    iget-object p1, p0, LD/g$a$a;->D:LD/h;

    iget v0, p0, LD/g$a$a;->E:I

    invoke-interface {p1, v0}, LD/h;->f(I)F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    new-instance v0, LD/f;

    iget-object v1, p0, LD/g$a$a;->O:Ly7/O;

    iget-object v1, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Lu/l;

    invoke-direct {v0, p1, v1}, LD/f;-><init>(ILu/l;)V

    throw v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/i;

    invoke-virtual {p0, p1}, LD/g$a$a;->a(Lu/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
