.class final LF0/O$a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/O$a;->A1(JFLx7/l;Lr0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/O;

.field final synthetic E:LF0/o0;

.field final synthetic F:J


# direct methods
.method constructor <init>(LF0/O;LF0/o0;J)V
    .locals 0

    iput-object p1, p0, LF0/O$a$c;->D:LF0/O;

    iput-object p2, p0, LF0/O$a$c;->E:LF0/o0;

    iput-wide p3, p0, LF0/O$a$c;->F:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .prologue
    iget-object v0, p0, LF0/O$a$c;->D:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-static {v0}, LF0/P;->a(LF0/J;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF0/O$a$c;->D:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-virtual {v0}, LF0/T;->s1()LD0/X$a;

    move-result-object v1

    goto :goto_1

    :cond_0
    iget-object v0, p0, LF0/O$a$c;->D:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    iget-object v0, p0, LF0/O$a$c;->E:LF0/o0;

    invoke-interface {v0}, LF0/o0;->getPlacementScope()LD0/X$a;

    move-result-object v1

    :cond_2
    move-object v2, v1

    iget-object v0, p0, LF0/O$a$c;->D:LF0/O;

    iget-wide v4, p0, LF0/O$a$c;->F:J

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, LD0/X$a;->j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/O$a$c;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
