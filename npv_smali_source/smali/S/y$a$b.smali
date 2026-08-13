.class final LS/y$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/y;


# direct methods
.method constructor <init>(LS/y;)V
    .locals 0

    iput-object p1, p0, LS/y$a$b;->D:LS/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;J)V
    .locals 6

    iget-object p1, p0, LS/y$a$b;->D:LS/y;

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v0

    new-instance v3, LS/y$a$b$a;

    iget-object p1, p0, LS/y$a$b;->D:LS/y;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p2, p3, v1}, LS/y$a$b$a;-><init>(LS/y;JLm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iget-object p1, p0, LS/y$a$b;->D:LS/y;

    invoke-static {p1}, LS/y;->e2(LS/y;)LS/c;

    move-result-object v0

    iget-object p1, p0, LS/y$a$b;->D:LS/y;

    invoke-static {p1}, LS/y;->c2(LS/y;)F

    move-result v1

    iget-object p1, p0, LS/y$a$b;->D:LS/y;

    invoke-static {p1}, LS/y;->d2(LS/y;)F

    move-result v2

    iget-object p1, p0, LS/y$a$b;->D:LS/y;

    invoke-static {p1}, LS/y;->b2(LS/y;)F

    move-result v3

    iget-object p1, p0, LS/y$a$b;->D:LS/y;

    invoke-static {p1}, LS/y;->a2(LS/y;)J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, LS/q1;->R(LS/t1;FFFJ)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lz0/B;

    check-cast p2, Ln0/g;

    invoke-virtual {p2}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LS/y$a$b;->a(Lz0/B;J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
