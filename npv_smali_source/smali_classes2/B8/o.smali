.class public abstract LB8/o;
.super LR7/z;
.source "SourceFile"


# instance fields
.field private final I:LE8/n;


# direct methods
.method public constructor <init>(Ln8/c;LE8/n;LO7/G;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p1}, LR7/z;-><init>(LO7/G;Ln8/c;)V

    iput-object p2, p0, LB8/o;->I:LE8/n;

    return-void
.end method


# virtual methods
.method public abstract O0()LB8/h;
.end method

.method public T0(Ln8/f;)Z
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/K;->u()Ly8/h;

    move-result-object v0

    instance-of v1, v0, LD8/h;

    if-eqz v1, :cond_0

    check-cast v0, LD8/h;

    invoke-virtual {v0}, LD8/h;->q()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract U0(LB8/k;)V
.end method
