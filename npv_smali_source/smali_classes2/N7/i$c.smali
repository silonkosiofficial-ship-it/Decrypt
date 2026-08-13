.class final LN7/i$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/i;-><init>(LO7/G;LE8/n;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN7/i;

.field final synthetic E:LE8/n;


# direct methods
.method constructor <init>(LN7/i;LE8/n;)V
    .locals 0

    iput-object p1, p0, LN7/i$c;->D:LN7/i;

    iput-object p2, p0, LN7/i$c;->E:LE8/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/M;
    .locals 5

    iget-object v0, p0, LN7/i$c;->D:LN7/i;

    invoke-static {v0}, LN7/i;->h(LN7/i;)LN7/f$b;

    move-result-object v0

    invoke-virtual {v0}, LN7/f$b;->a()LO7/G;

    move-result-object v0

    sget-object v1, LN7/e;->d:LN7/e$b;

    invoke-virtual {v1}, LN7/e$b;->a()Ln8/b;

    move-result-object v1

    new-instance v2, LO7/J;

    iget-object v3, p0, LN7/i$c;->E:LE8/n;

    iget-object v4, p0, LN7/i$c;->D:LN7/i;

    invoke-static {v4}, LN7/i;->h(LN7/i;)LN7/f$b;

    move-result-object v4

    invoke-virtual {v4}, LN7/f$b;->a()LO7/G;

    move-result-object v4

    invoke-direct {v2, v3, v4}, LO7/J;-><init>(LE8/n;LO7/G;)V

    invoke-static {v0, v1, v2}, LO7/x;->c(LO7/G;Ln8/b;LO7/J;)LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/i$c;->a()LF8/M;

    move-result-object v0

    return-object v0
.end method
