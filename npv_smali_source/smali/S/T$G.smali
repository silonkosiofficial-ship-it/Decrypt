.class final LS/T$G;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->l(Ljava/lang/Long;JILx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, LS/T$G;->D:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/animation/d;)Lt/k;
    .locals 11

    .prologue
    invoke-interface {p1}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/Y;

    invoke-virtual {v0}, LS/Y;->i()I

    move-result v0

    sget-object v1, LS/Y;->b:LS/Y$a;

    invoke-virtual {v1}, LS/Y$a;->a()I

    move-result v1

    invoke-static {v0, v1}, LS/Y;->f(II)Z

    move-result v0

    const/4 v1, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x64

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    sget-object v0, LS/T$G$a;->D:LS/T$G$a;

    invoke-static {v8, v0, v6, v8}, Landroidx/compose/animation/f;->D(Lu/I;Lx7/l;ILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v0

    invoke-static {v7, v7, v8, v2, v8}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v2

    invoke-static {v2, v5, v4, v8}, Landroidx/compose/animation/f;->o(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    move-result-object v0

    invoke-static {v7, v3, v8, v1, v8}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v1

    invoke-static {v1, v5, v4, v8}, Landroidx/compose/animation/f;->q(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v1

    new-instance v2, LS/T$G$b;

    iget v3, p0, LS/T$G;->D:I

    invoke-direct {v2, v3}, LS/T$G$b;-><init>(I)V

    invoke-static {v8, v2, v6, v8}, Landroidx/compose/animation/f;->G(Lu/I;Lx7/l;ILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    move-result-object v1

    :goto_0
    invoke-static {v0, v1}, Landroidx/compose/animation/a;->e(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)Lt/k;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/16 v0, 0x32

    const/4 v9, 0x5

    invoke-static {v3, v0, v8, v9, v8}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v0

    new-instance v9, LS/T$G$c;

    iget v10, p0, LS/T$G;->D:I

    invoke-direct {v9, v10}, LS/T$G$c;-><init>(I)V

    invoke-static {v0, v9}, Landroidx/compose/animation/f;->C(Lu/I;Lx7/l;)Landroidx/compose/animation/h;

    move-result-object v0

    invoke-static {v7, v7, v8, v2, v8}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v2

    invoke-static {v2, v5, v4, v8}, Landroidx/compose/animation/f;->o(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    move-result-object v0

    sget-object v2, LS/T$G$d;->D:LS/T$G$d;

    invoke-static {v8, v2, v6, v8}, Landroidx/compose/animation/f;->G(Lu/I;Lx7/l;ILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v2

    invoke-static {v7, v3, v8, v1, v8}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v1

    invoke-static {v1, v5, v4, v8}, Landroidx/compose/animation/f;->q(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    move-result-object v1

    goto :goto_0

    :goto_1
    sget-object v1, LS/T$G$e;->D:LS/T$G$e;

    invoke-static {v6, v1}, Landroidx/compose/animation/a;->c(ZLx7/p;)Lt/x;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/compose/animation/d;->a(Lt/k;Lt/x;)Lt/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/animation/d;

    invoke-virtual {p0, p1}, LS/T$G;->a(Landroidx/compose/animation/d;)Lt/k;

    move-result-object p1

    return-object p1
.end method
