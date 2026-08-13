.class public final LF8/o;
.super LF8/q;
.source "SourceFile"

# interfaces
.implements LF8/m;
.implements LJ8/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/o$a;
    }
.end annotation


# static fields
.field public static final F:LF8/o$a;


# instance fields
.field private final D:LF8/M;

.field private final E:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/o$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/o;->F:LF8/o$a;

    return-void
.end method

.method private constructor <init>(LF8/M;Z)V
    .locals 0

    invoke-direct {p0}, LF8/q;-><init>()V

    iput-object p1, p0, LF8/o;->D:LF8/M;

    iput-boolean p2, p0, LF8/o;->E:Z

    return-void
.end method

.method public synthetic constructor <init>(LF8/M;ZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF8/o;-><init>(LF8/M;Z)V

    return-void
.end method


# virtual methods
.method public J0()Z
    .locals 1

    invoke-virtual {p0}, LF8/o;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    invoke-virtual {p0}, LF8/o;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v0, v0, LO7/f0;

    return v0
.end method

.method public Q(LF8/E;)LF8/E;
    .locals 1

    const-string v0, "replacement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    iget-boolean v0, p0, LF8/o;->E:Z

    invoke-static {p1, v0}, LF8/Q;->e(LF8/t0;Z)LF8/t0;

    move-result-object p1

    return-object p1
.end method

.method public X0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/o;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/o;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public d1(Z)LF8/M;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p0}, LF8/o;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/o;

    invoke-virtual {p0}, LF8/o;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    iget-boolean v1, p0, LF8/o;->E:Z

    invoke-direct {v0, p1, v1}, LF8/o;-><init>(LF8/M;Z)V

    return-object v0
.end method

.method protected f1()LF8/M;
    .locals 1

    iget-object v0, p0, LF8/o;->D:LF8/M;

    return-object v0
.end method

.method public bridge synthetic h1(LF8/M;)LF8/q;
    .locals 0

    invoke-virtual {p0, p1}, LF8/o;->j1(LF8/M;)LF8/o;

    move-result-object p1

    return-object p1
.end method

.method public final i1()LF8/M;
    .locals 1

    iget-object v0, p0, LF8/o;->D:LF8/M;

    return-object v0
.end method

.method public j1(LF8/M;)LF8/o;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/o;

    iget-boolean v1, p0, LF8/o;->E:Z

    invoke-direct {v0, p1, v1}, LF8/o;-><init>(LF8/M;Z)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LF8/o;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " & Any"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
