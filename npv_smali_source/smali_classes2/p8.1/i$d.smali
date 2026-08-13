.class public abstract Lp8/i$d;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/i$d$a;
    }
.end annotation


# instance fields
.field private final D:Lp8/h;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i;-><init>()V

    invoke-static {}, Lp8/h;->t()Lp8/h;

    move-result-object v0

    iput-object v0, p0, Lp8/i$d;->D:Lp8/h;

    return-void
.end method

.method protected constructor <init>(Lp8/i$c;)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    invoke-static {p1}, Lp8/i$c;->n(Lp8/i$c;)Lp8/h;

    move-result-object p1

    iput-object p1, p0, Lp8/i$d;->D:Lp8/h;

    return-void
.end method

.method static synthetic r(Lp8/i$d;)Lp8/h;
    .locals 0

    iget-object p0, p0, Lp8/i$d;->D:Lp8/h;

    return-object p0
.end method

.method private z(Lp8/i$f;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, Lp8/i$f;->b()Lp8/p;

    move-result-object p1

    invoke-interface {p0}, Lp8/q;->a()Lp8/p;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected m()V
    .locals 1

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    invoke-virtual {v0}, Lp8/h;->q()V

    return-void
.end method

.method protected p(Lp8/e;Lp8/f;Lp8/g;I)Z
    .locals 6

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    invoke-interface {p0}, Lp8/q;->a()Lp8/p;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lp8/i;->j(Lp8/h;Lp8/p;Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result p1

    return p1
.end method

.method protected s()Z
    .locals 1

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    invoke-virtual {v0}, Lp8/h;->n()Z

    move-result v0

    return v0
.end method

.method protected t()I
    .locals 1

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    invoke-virtual {v0}, Lp8/h;->k()I

    move-result v0

    return v0
.end method

.method public final u(Lp8/i$f;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-direct {p0, p1}, Lp8/i$d;->z(Lp8/i$f;)V

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    iget-object v1, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0, v1}, Lp8/h;->h(Lp8/h$b;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p1, Lp8/i$f;->b:Ljava/lang/Object;

    return-object p1

    :cond_0
    invoke-virtual {p1, v0}, Lp8/i$f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final v(Lp8/i$f;I)Ljava/lang/Object;
    .locals 2

    invoke-direct {p0, p1}, Lp8/i$d;->z(Lp8/i$f;)V

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    iget-object v1, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0, v1, p2}, Lp8/h;->i(Lp8/h$b;I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp8/i$f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lp8/i$f;)I
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;->z(Lp8/i$f;)V

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    iget-object p1, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0, p1}, Lp8/h;->j(Lp8/h$b;)I

    move-result p1

    return p1
.end method

.method public final x(Lp8/i$f;)Z
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;->z(Lp8/i$f;)V

    iget-object v0, p0, Lp8/i$d;->D:Lp8/h;

    iget-object p1, p1, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0, p1}, Lp8/h;->m(Lp8/h$b;)Z

    move-result p1

    return p1
.end method

.method protected y()Lp8/i$d$a;
    .locals 3

    new-instance v0, Lp8/i$d$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lp8/i$d$a;-><init>(Lp8/i$d;ZLp8/i$a;)V

    return-object v0
.end method
