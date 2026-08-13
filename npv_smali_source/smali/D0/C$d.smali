.class public final LD0/C$d;
.super LF0/J$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/C;->u(Lx7/p;)LD0/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LD0/C;

.field final synthetic c:Lx7/p;


# direct methods
.method constructor <init>(LD0/C;Lx7/p;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LD0/C$d;->b:LD0/C;

    iput-object p2, p0, LD0/C$d;->c:Lx7/p;

    invoke-direct {p0, p3}, LF0/J$f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 1

    .prologue
    iget-object p2, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p2}, LD0/C;->l(LD0/C;)LD0/C$c;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v0

    invoke-virtual {p2, v0}, LD0/C$c;->s(LY0/v;)V

    iget-object p2, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p2}, LD0/C;->l(LD0/C;)LD0/C$c;

    move-result-object p2

    invoke-interface {p1}, LY0/e;->getDensity()F

    move-result v0

    invoke-virtual {p2, v0}, LD0/C$c;->f(F)V

    iget-object p2, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p2}, LD0/C;->l(LD0/C;)LD0/C$c;

    move-result-object p2

    invoke-interface {p1}, LY0/n;->v0()F

    move-result v0

    invoke-virtual {p2, v0}, LD0/C$c;->k(F)V

    invoke-interface {p1}, LD0/o;->A0()Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p1}, LD0/C;->k(LD0/C;)LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->b0()LF0/J;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p1, p2}, LD0/C;->r(LD0/C;I)V

    iget-object p1, p0, LD0/C$d;->c:Lx7/p;

    iget-object p2, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p2}, LD0/C;->e(LD0/C;)LD0/C$b;

    move-result-object p2

    invoke-static {p3, p4}, LY0/b;->a(J)LY0/b;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD0/K;

    iget-object p2, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p2}, LD0/C;->c(LD0/C;)I

    move-result p2

    iget-object p3, p0, LD0/C$d;->b:LD0/C;

    new-instance p4, LD0/C$d$a;

    invoke-direct {p4, p1, p3, p2, p1}, LD0/C$d$a;-><init>(LD0/K;LD0/C;ILD0/K;)V

    return-object p4

    :cond_0
    iget-object p1, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p1, p2}, LD0/C;->q(LD0/C;I)V

    iget-object p1, p0, LD0/C$d;->c:Lx7/p;

    iget-object p2, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p2}, LD0/C;->l(LD0/C;)LD0/C$c;

    move-result-object p2

    invoke-static {p3, p4}, LY0/b;->a(J)LY0/b;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD0/K;

    iget-object p2, p0, LD0/C$d;->b:LD0/C;

    invoke-static {p2}, LD0/C;->b(LD0/C;)I

    move-result p2

    iget-object p3, p0, LD0/C$d;->b:LD0/C;

    new-instance p4, LD0/C$d$b;

    invoke-direct {p4, p1, p3, p2, p1}, LD0/C$d$b;-><init>(LD0/K;LD0/C;ILD0/K;)V

    return-object p4
.end method
