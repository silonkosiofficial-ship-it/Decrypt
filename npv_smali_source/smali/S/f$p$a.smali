.class final LS/f$p$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f$p;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:I

.field final synthetic F:LD0/X;

.field final synthetic G:LA/b$e;

.field final synthetic H:J

.field final synthetic I:LD0/X;

.field final synthetic J:LD0/M;

.field final synthetic K:LA/b$m;

.field final synthetic L:I

.field final synthetic M:I


# direct methods
.method constructor <init>(LD0/X;ILD0/X;LA/b$e;JLD0/X;LD0/M;LA/b$m;II)V
    .locals 0

    iput-object p1, p0, LS/f$p$a;->D:LD0/X;

    iput p2, p0, LS/f$p$a;->E:I

    iput-object p3, p0, LS/f$p$a;->F:LD0/X;

    iput-object p4, p0, LS/f$p$a;->G:LA/b$e;

    iput-wide p5, p0, LS/f$p$a;->H:J

    iput-object p7, p0, LS/f$p$a;->I:LD0/X;

    iput-object p8, p0, LS/f$p$a;->J:LD0/M;

    iput-object p9, p0, LS/f$p$a;->K:LA/b$m;

    iput p10, p0, LS/f$p$a;->L:I

    iput p11, p0, LS/f$p$a;->M:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 14

    .prologue
    iget-object v1, p0, LS/f$p$a;->D:LD0/X;

    iget v0, p0, LS/f$p$a;->E:I

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v2

    sub-int/2addr v0, v2

    div-int/lit8 v3, v0, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    iget-object v8, p0, LS/f$p$a;->F:LD0/X;

    iget-object v0, p0, LS/f$p$a;->G:LA/b$e;

    sget-object v1, LA/b;->a:LA/b;

    invoke-virtual {v1}, LA/b;->b()LA/b$f;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, LS/f$p$a;->H:J

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v0

    iget-object v2, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    iget-object v2, p0, LS/f$p$a;->D:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, LS/f$p$a;->D:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_0
    add-int/2addr v0, v2

    goto :goto_1

    :cond_0
    iget-object v2, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    add-int/2addr v2, v0

    iget-wide v3, p0, LS/f$p$a;->H:J

    invoke-static {v3, v4}, LY0/b;->l(J)I

    move-result v3

    iget-object v4, p0, LS/f$p$a;->I:LD0/X;

    invoke-virtual {v4}, LD0/X;->I0()I

    move-result v4

    sub-int/2addr v3, v4

    if-le v2, v3, :cond_1

    iget-wide v2, p0, LS/f$p$a;->H:J

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v2

    iget-object v3, p0, LS/f$p$a;->I:LD0/X;

    invoke-virtual {v3}, LD0/X;->I0()I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v3}, LD0/X;->I0()I

    move-result v3

    add-int/2addr v3, v0

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_1
    :goto_1
    move v9, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, LA/b;->c()LA/b$e;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v2, p0, LS/f$p$a;->H:J

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v0

    iget-object v2, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int/2addr v0, v2

    iget-object v2, p0, LS/f$p$a;->I:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int/2addr v0, v2

    goto :goto_1

    :cond_3
    iget-object v0, p0, LS/f$p$a;->J:LD0/M;

    invoke-static {}, LS/f;->k()F

    move-result v2

    invoke-interface {v0, v2}, LY0/e;->S0(F)I

    move-result v0

    iget-object v2, p0, LS/f$p$a;->D:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_1

    :goto_2
    iget-object v0, p0, LS/f$p$a;->K:LA/b$m;

    invoke-virtual {v1}, LA/b;->b()LA/b$f;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget v0, p0, LS/f$p$a;->E:I

    iget-object v1, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    :goto_3
    move v10, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, LA/b;->a()LA/b$m;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget v0, p0, LS/f$p$a;->L:I

    if-nez v0, :cond_5

    iget v0, p0, LS/f$p$a;->E:I

    iget-object v1, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_3

    :cond_5
    iget-object v2, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v2

    iget v3, p0, LS/f$p$a;->M:I

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    iget-object v2, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v2

    add-int/2addr v2, v0

    iget-wide v3, p0, LS/f$p$a;->H:J

    invoke-static {v3, v4}, LY0/b;->k(J)I

    move-result v3

    if-le v2, v3, :cond_6

    iget-wide v3, p0, LS/f$p$a;->H:J

    invoke-static {v3, v4}, LY0/b;->k(J)I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    :cond_6
    iget v2, p0, LS/f$p$a;->E:I

    iget-object v3, p0, LS/f$p$a;->F:LD0/X;

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int/2addr v2, v0

    move v10, v2

    goto :goto_4

    :cond_7
    move v10, v1

    :goto_4
    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    iget-object v1, p0, LS/f$p$a;->I:LD0/X;

    iget-wide v2, p0, LS/f$p$a;->H:J

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v0

    iget-object v2, p0, LS/f$p$a;->I:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int v2, v0, v2

    iget v0, p0, LS/f$p$a;->E:I

    iget-object v3, p0, LS/f$p$a;->I:LD0/X;

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v3

    sub-int/2addr v0, v3

    div-int/lit8 v3, v0, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/f$p$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
