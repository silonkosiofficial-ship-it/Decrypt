.class public final LF8/z;
.super LF8/y;
.source "SourceFile"

# interfaces
.implements LF8/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/z$a;
    }
.end annotation


# static fields
.field public static final G:LF8/z$a;

.field public static H:Z


# instance fields
.field private F:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/z$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/z;->G:LF8/z$a;

    return-void
.end method

.method public constructor <init>(LF8/M;LF8/M;)V
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LF8/y;-><init>(LF8/M;LF8/M;)V

    return-void
.end method

.method private final i1()V
    .locals 3

    .prologue
    sget-boolean v0, LF8/z;->H:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LF8/z;->F:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LF8/z;->F:Z

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-static {v0}, LF8/B;->b(LF8/E;)Z

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v0

    invoke-static {v0}, LF8/B;->b(LF8/E;)Z

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, LG8/e;->a:LG8/e;

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v1

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LG8/e;->d(LF8/E;LF8/E;)Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public J0()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v0, v0, LO7/f0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public Q(LF8/E;)LF8/E;
    .locals 2

    .prologue
    const-string v0, "replacement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    instance-of v0, p1, LF8/y;

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LF8/M;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LF8/M;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LF8/M;->d1(Z)LF8/M;

    move-result-object v1

    invoke-static {v0, v1}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v0

    :goto_0
    invoke-static {v0, p1}, LF8/s0;->b(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LF8/z;->h1(LG8/g;)LF8/y;

    move-result-object p1

    return-object p1
.end method

.method public a1(Z)LF8/t0;
    .locals 2

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object v0

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    invoke-static {v0, p1}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/z;->h1(LG8/g;)LF8/y;

    move-result-object p1

    return-object p1
.end method

.method public c1(LF8/a0;)LF8/t0;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object v0

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    invoke-static {v0, p1}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    return-object p1
.end method

.method public d1()LF8/M;
    .locals 1

    invoke-direct {p0}, LF8/z;->i1()V

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public g1(Lq8/c;Lq8/f;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "renderer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lq8/f;->n()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x28

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq8/c;->w(LF8/E;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq8/c;->w(LF8/E;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq8/c;->w(LF8/E;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq8/c;->w(LF8/E;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Lq8/c;->t(Ljava/lang/String;Ljava/lang/String;LL7/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public h1(LG8/g;)LF8/y;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/z;

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v1

    invoke-virtual {p1, v1}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LF8/M;

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v3

    invoke-virtual {p1, v3}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object p1

    invoke-static {p1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/M;

    invoke-direct {v0, v1, p1}, LF8/z;-><init>(LF8/M;LF8/M;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
