.class final LF8/e$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/e$b;->a(LF8/d0$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/d0;

.field final synthetic E:LJ8/o;

.field final synthetic F:LJ8/j;

.field final synthetic G:LJ8/j;


# direct methods
.method constructor <init>(LF8/d0;LJ8/o;LJ8/j;LJ8/j;)V
    .locals 0

    iput-object p1, p0, LF8/e$b$a;->D:LF8/d0;

    iput-object p2, p0, LF8/e$b$a;->E:LJ8/o;

    iput-object p3, p0, LF8/e$b$a;->F:LJ8/j;

    iput-object p4, p0, LF8/e$b$a;->G:LJ8/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 4

    sget-object v0, LF8/e;->a:LF8/e;

    iget-object v1, p0, LF8/e$b$a;->D:LF8/d0;

    iget-object v2, p0, LF8/e$b$a;->E:LJ8/o;

    iget-object v3, p0, LF8/e$b$a;->F:LJ8/j;

    invoke-interface {v2, v3}, LJ8/o;->j(LJ8/j;)LJ8/k;

    move-result-object v2

    iget-object v3, p0, LF8/e$b$a;->G:LJ8/j;

    invoke-virtual {v0, v1, v2, v3}, LF8/e;->q(LF8/d0;LJ8/k;LJ8/j;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF8/e$b$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
