.class final LS/y$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, LS/y$b$b;->D:LS/y;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 7

    iget-object v0, p0, LS/y$b$b;->D:LS/y;

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v1

    new-instance v4, LS/y$b$b$a;

    iget-object v0, p0, LS/y$b$b;->D:LS/y;

    const/4 v2, 0x0

    invoke-direct {v4, v0, p1, p2, v2}, LS/y$b$b$a;-><init>(LS/y;JLm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LS/y$b$b;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
