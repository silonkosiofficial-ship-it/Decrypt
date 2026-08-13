.class public abstract Lo7/d;
.super Lo7/a;
.source "SourceFile"


# instance fields
.field private final D:Lm7/i;

.field private transient E:Lm7/e;


# direct methods
.method public constructor <init>(Lm7/e;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lo7/d;-><init>(Lm7/e;Lm7/i;)V

    return-void
.end method

.method public constructor <init>(Lm7/e;Lm7/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lo7/a;-><init>(Lm7/e;)V

    iput-object p2, p0, Lo7/d;->D:Lm7/i;

    return-void
.end method


# virtual methods
.method protected D()V
    .locals 3

    .prologue
    iget-object v0, p0, Lo7/d;->E:Lm7/e;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lo7/d;->getContext()Lm7/i;

    move-result-object v1

    sget-object v2, Lm7/f;->A:Lm7/f$b;

    invoke-interface {v1, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lm7/f;

    invoke-interface {v1, v0}, Lm7/f;->H(Lm7/e;)V

    :cond_0
    sget-object v0, Lo7/c;->C:Lo7/c;

    iput-object v0, p0, Lo7/d;->E:Lm7/e;

    return-void
.end method

.method public final E()Lm7/e;
    .locals 2

    .prologue
    iget-object v0, p0, Lo7/d;->E:Lm7/e;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lo7/d;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, Lm7/f;->A:Lm7/f$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, Lm7/f;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lm7/f;->q0(Lm7/e;)Lm7/e;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Lo7/d;->E:Lm7/e;

    :cond_2
    return-object v0
.end method

.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lo7/d;->D:Lm7/i;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method
