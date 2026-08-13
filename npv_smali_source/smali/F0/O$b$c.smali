.class final LF0/O$b$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/O$b;-><init>(LF0/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/O;

.field final synthetic E:LF0/O$b;


# direct methods
.method constructor <init>(LF0/O;LF0/O$b;)V
    .locals 0

    iput-object p1, p0, LF0/O$b$c;->D:LF0/O;

    iput-object p2, p0, LF0/O$b$c;->E:LF0/O$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    iget-object v0, p0, LF0/O$b$c;->D:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/T;->s1()LD0/X$a;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v0, p0, LF0/O$b$c;->D:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getPlacementScope()LD0/X$a;

    move-result-object v0

    goto :goto_0

    :goto_2
    iget-object v0, p0, LF0/O$b$c;->E:LF0/O$b;

    iget-object v2, p0, LF0/O$b$c;->D:LF0/O;

    invoke-static {v0}, LF0/O$b;->i1(LF0/O$b;)Lx7/l;

    move-result-object v6

    invoke-static {v0}, LF0/O$b;->h1(LF0/O$b;)Lr0/c;

    move-result-object v5

    invoke-virtual {v2}, LF0/O;->K()LF0/d0;

    move-result-object v2

    invoke-static {v0}, LF0/O$b;->j1(LF0/O$b;)J

    move-result-wide v3

    if-eqz v5, :cond_2

    invoke-static {v0}, LF0/O$b;->k1(LF0/O$b;)F

    move-result v6

    invoke-virtual/range {v1 .. v6}, LD0/X$a;->x(LD0/X;JLr0/c;F)V

    goto :goto_3

    :cond_2
    if-nez v6, :cond_3

    invoke-static {v0}, LF0/O$b;->k1(LF0/O$b;)F

    move-result v0

    invoke-virtual {v1, v2, v3, v4, v0}, LD0/X$a;->i(LD0/X;JF)V

    goto :goto_3

    :cond_3
    invoke-static {v0}, LF0/O$b;->k1(LF0/O$b;)F

    move-result v5

    invoke-virtual/range {v1 .. v6}, LD0/X$a;->w(LD0/X;JFLx7/l;)V

    :goto_3
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/O$b$c;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
