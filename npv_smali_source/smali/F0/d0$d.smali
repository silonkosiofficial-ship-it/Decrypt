.class final LF0/d0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/d0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/d0$d;

    invoke-direct {v0}, LF0/d0$d;-><init>()V

    sput-object v0, LF0/d0$d;->D:LF0/d0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/d0;)V
    .locals 5

    .prologue
    invoke-virtual {p1}, LF0/d0;->R()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, LF0/d0;->G1(LF0/d0;)LF0/A;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    invoke-static {p1, v3, v2, v1}, LF0/d0;->f3(LF0/d0;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LF0/d0;->L1()LF0/A;

    move-result-object v4

    invoke-virtual {v4, v0}, LF0/A;->a(LF0/A;)V

    invoke-static {p1, v3, v2, v1}, LF0/d0;->f3(LF0/d0;ZILjava/lang/Object;)V

    invoke-static {}, LF0/d0;->L1()LF0/A;

    move-result-object v4

    invoke-virtual {v4, v0}, LF0/A;->c(LF0/A;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, LF0/d0;->o1()LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->V()LF0/O;

    move-result-object v0

    invoke-virtual {v0}, LF0/O;->s()I

    move-result v4

    if-lez v4, :cond_3

    invoke-virtual {v0}, LF0/O;->u()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, LF0/O;->v()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    invoke-static {p1, v3, v2, v1}, LF0/J;->u1(LF0/J;ZILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, LF0/O;->I()LF0/O$b;

    move-result-object v0

    invoke-virtual {v0}, LF0/O$b;->B1()V

    :cond_3
    invoke-virtual {p1}, LF0/J;->n0()LF0/o0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, LF0/o0;->n(LF0/J;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/d0;

    invoke-virtual {p0, p1}, LF0/d0$d;->a(LF0/d0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
