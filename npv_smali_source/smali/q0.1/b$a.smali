.class public final Lq0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq0/b;->b(Lq0/d;)Lq0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq0/d;


# direct methods
.method constructor <init>(Lq0/d;)V
    .locals 0

    iput-object p1, p0, Lq0/b$a;->a:Lq0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([F)V
    .locals 1

    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0, p1}, Lo0/q0;->o([F)V

    return-void
.end method

.method public b(Lo0/Q1;I)V
    .locals 1

    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo0/q0;->b(Lo0/Q1;I)V

    return-void
.end method

.method public c(FFFFI)V
    .locals 7

    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v1

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lo0/q0;->c(FFFFI)V

    return-void
.end method

.method public d(FF)V
    .locals 1

    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo0/q0;->d(FF)V

    return-void
.end method

.method public e(FFJ)V
    .locals 3

    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-static {p3, p4}, Ln0/g;->m(J)F

    move-result v1

    invoke-static {p3, p4}, Ln0/g;->n(J)F

    move-result v2

    invoke-interface {v0, v1, v2}, Lo0/q0;->d(FF)V

    invoke-interface {v0, p1, p2}, Lo0/q0;->g(FF)V

    invoke-static {p3, p4}, Ln0/g;->m(J)F

    move-result p1

    neg-float p1, p1

    invoke-static {p3, p4}, Ln0/g;->n(J)F

    move-result p2

    neg-float p2, p2

    invoke-interface {v0, p1, p2}, Lo0/q0;->d(FF)V

    return-void
.end method

.method public f(FFFF)V
    .locals 5

    .prologue
    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    iget-object v1, p0, Lq0/b$a;->a:Lq0/d;

    invoke-virtual {p0}, Lq0/b$a;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v2

    add-float/2addr p3, p1

    sub-float/2addr v2, p3

    invoke-virtual {p0}, Lq0/b$a;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/m;->g(J)F

    move-result p3

    add-float/2addr p4, p2

    sub-float/2addr p3, p4

    invoke-static {v2, p3}, Ln0/n;->a(FF)J

    move-result-wide p3

    invoke-static {p3, p4}, Ln0/m;->i(J)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    invoke-static {p3, p4}, Ln0/m;->g(J)F

    move-result v2

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    const-string v2, "Width and height must be greater than or equal to zero"

    invoke-static {v2}, Lo0/H1;->a(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v1, p3, p4}, Lq0/d;->d(J)V

    invoke-interface {v0, p1, p2}, Lo0/q0;->d(FF)V

    return-void
.end method

.method public g(FJ)V
    .locals 3

    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-static {p2, p3}, Ln0/g;->m(J)F

    move-result v1

    invoke-static {p2, p3}, Ln0/g;->n(J)F

    move-result v2

    invoke-interface {v0, v1, v2}, Lo0/q0;->d(FF)V

    invoke-interface {v0, p1}, Lo0/q0;->i(F)V

    invoke-static {p2, p3}, Ln0/g;->m(J)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2, p3}, Ln0/g;->n(J)F

    move-result p2

    neg-float p2, p2

    invoke-interface {v0, p1, p2}, Lo0/q0;->d(FF)V

    return-void
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Lq0/b$a;->a:Lq0/d;

    invoke-interface {v0}, Lq0/d;->i()J

    move-result-wide v0

    return-wide v0
.end method
