.class public final LC/M$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/E;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/M;->a(LC/K;ZLV/n;I)LD/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/K;


# direct methods
.method constructor <init>(LC/K;)V
    .locals 0

    iput-object p1, p0, LC/M$a;->a:LC/K;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .prologue
    iget-object v0, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->e()Lx/s;

    move-result-object v0

    sget-object v1, Lx/s;->C:Lx/s;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result v0

    :goto_0
    return v0
.end method

.method public b()F
    .locals 2

    iget-object v0, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v0}, LC/K;->n()I

    move-result v0

    iget-object v1, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v1}, LC/K;->o()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/lazy/layout/f;->b(II)F

    move-result v0

    return v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->g()I

    move-result v0

    iget-object v1, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v1}, LC/K;->r()LC/s;

    move-result-object v1

    invoke-interface {v1}, LC/s;->b()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public d()F
    .locals 3

    iget-object v0, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v0}, LC/K;->n()I

    move-result v0

    iget-object v1, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v1}, LC/K;->o()I

    move-result v1

    iget-object v2, p0, LC/M$a;->a:LC/K;

    invoke-virtual {v2}, LC/K;->c()Z

    move-result v2

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/f;->a(IIZ)F

    move-result v0

    return v0
.end method

.method public e()LK0/b;
    .locals 2

    new-instance v0, LK0/b;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, LK0/b;-><init>(II)V

    return-object v0
.end method

.method public f(ILm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, LC/M$a;->a:LC/K;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LC/K;->E(LC/K;IILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
