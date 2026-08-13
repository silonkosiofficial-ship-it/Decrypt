.class final LF0/O$b$b;
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
.field final synthetic D:LF0/O$b;


# direct methods
.method constructor <init>(LF0/O$b;)V
    .locals 0

    iput-object p1, p0, LF0/O$b$b;->D:LF0/O$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LF0/O$b$b;->D:LF0/O$b;

    invoke-static {v0}, LF0/O$b;->f1(LF0/O$b;)V

    iget-object v0, p0, LF0/O$b$b;->D:LF0/O$b;

    sget-object v1, LF0/O$b$b$a;->D:LF0/O$b$b$a;

    invoke-virtual {v0, v1}, LF0/O$b;->c0(Lx7/l;)V

    iget-object v0, p0, LF0/O$b$b;->D:LF0/O$b;

    invoke-virtual {v0}, LF0/O$b;->F()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->q1()LD0/K;

    move-result-object v0

    invoke-interface {v0}, LD0/K;->k()V

    iget-object v0, p0, LF0/O$b$b;->D:LF0/O$b;

    invoke-static {v0}, LF0/O$b;->e1(LF0/O$b;)V

    iget-object v0, p0, LF0/O$b$b;->D:LF0/O$b;

    sget-object v1, LF0/O$b$b$b;->D:LF0/O$b$b$b;

    invoke-virtual {v0, v1}, LF0/O$b;->c0(Lx7/l;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/O$b$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
