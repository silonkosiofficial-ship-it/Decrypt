.class final LF0/O$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/O;-><init>(LF0/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/O;


# direct methods
.method constructor <init>(LF0/O;)V
    .locals 0

    iput-object p1, p0, LF0/O$d;->D:LF0/O;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LF0/O$d;->D:LF0/O;

    invoke-virtual {v0}, LF0/O;->K()LF0/d0;

    move-result-object v0

    iget-object v1, p0, LF0/O$d;->D:LF0/O;

    invoke-static {v1}, LF0/O;->f(LF0/O;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LD0/G;->U(J)LD0/X;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/O$d;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
