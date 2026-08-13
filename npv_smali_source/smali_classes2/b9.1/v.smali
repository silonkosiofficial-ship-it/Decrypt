.class public final Lb9/v;
.super LW8/J;
.source "SourceFile"

# interfaces
.implements LW8/X;


# instance fields
.field private final synthetic E:LW8/X;

.field private final F:LW8/J;

.field private final G:Ljava/lang/String;


# direct methods
.method public constructor <init>(LW8/J;Ljava/lang/String;)V
    .locals 1

    .prologue
    invoke-direct {p0}, LW8/J;-><init>()V

    instance-of v0, p1, LW8/X;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LW8/X;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, LW8/U;->a()LW8/X;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lb9/v;->E:LW8/X;

    iput-object p1, p0, Lb9/v;->F:LW8/J;

    iput-object p2, p0, Lb9/v;->G:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;
    .locals 1

    iget-object v0, p0, Lb9/v;->E:LW8/X;

    invoke-interface {v0, p1, p2, p3, p4}, LW8/X;->m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;

    move-result-object p1

    return-object p1
.end method

.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lb9/v;->F:LW8/J;

    invoke-virtual {v0, p1, p2}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb9/v;->G:Ljava/lang/String;

    return-object v0
.end method

.method public u1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lb9/v;->F:LW8/J;

    invoke-virtual {v0, p1, p2}, LW8/J;->u1(Lm7/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public v1(Lm7/i;)Z
    .locals 1

    iget-object v0, p0, Lb9/v;->F:LW8/J;

    invoke-virtual {v0, p1}, LW8/J;->v1(Lm7/i;)Z

    move-result p1

    return p1
.end method

.method public x0(JLW8/l;)V
    .locals 1

    iget-object v0, p0, Lb9/v;->E:LW8/X;

    invoke-interface {v0, p1, p2, p3}, LW8/X;->x0(JLW8/l;)V

    return-void
.end method
