.class final LS/y$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


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

    iput-object p1, p0, LS/y$a$a;->D:LS/y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, LS/y$a$a;->D:LS/y;

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v1

    new-instance v4, LS/y$a$a$a;

    iget-object v0, p0, LS/y$a$a;->D:LS/y;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, LS/y$a$a$a;-><init>(LS/y;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/y$a$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
