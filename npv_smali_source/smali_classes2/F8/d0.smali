.class public LF8/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/d0$a;,
        LF8/d0$b;,
        LF8/d0$c;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:LJ8/o;

.field private final e:LF8/g;

.field private final f:LF8/h;

.field private g:I

.field private h:Z

.field private i:Ljava/util/ArrayDeque;

.field private j:Ljava/util/Set;


# direct methods
.method public constructor <init>(ZZZLJ8/o;LF8/g;LF8/h;)V
    .locals 1

    const-string v0, "typeSystemContext"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypePreparator"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LF8/d0;->a:Z

    iput-boolean p2, p0, LF8/d0;->b:Z

    iput-boolean p3, p0, LF8/d0;->c:Z

    iput-object p4, p0, LF8/d0;->d:LJ8/o;

    iput-object p5, p0, LF8/d0;->e:LF8/g;

    iput-object p6, p0, LF8/d0;->f:LF8/h;

    return-void
.end method

.method public static final synthetic a(LF8/d0;)I
    .locals 0

    iget p0, p0, LF8/d0;->g:I

    return p0
.end method

.method public static final synthetic b(LF8/d0;I)V
    .locals 0

    iput p1, p0, LF8/d0;->g:I

    return-void
.end method

.method public static synthetic d(LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LF8/d0;->c(LJ8/i;LJ8/i;Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addSubtypeConstraint"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(LJ8/i;LJ8/i;Z)Ljava/lang/Boolean;
    .locals 0

    const-string p3, "subType"

    invoke-static {p1, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "superType"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, LF8/d0;->i:Ljava/util/ArrayDeque;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, LF8/d0;->j:Ljava/util/Set;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LF8/d0;->h:Z

    return-void
.end method

.method public f(LJ8/i;LJ8/i;)Z
    .locals 1

    const-string v0, "subType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "superType"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public g(LJ8/j;LJ8/d;)LF8/d0$b;
    .locals 1

    const-string v0, "subType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "superType"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LF8/d0$b;->D:LF8/d0$b;

    return-object p1
.end method

.method public final h()Ljava/util/ArrayDeque;
    .locals 1

    iget-object v0, p0, LF8/d0;->i:Ljava/util/ArrayDeque;

    return-object v0
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LF8/d0;->j:Ljava/util/Set;

    return-object v0
.end method

.method public final j()LJ8/o;
    .locals 1

    iget-object v0, p0, LF8/d0;->d:LJ8/o;

    return-object v0
.end method

.method public final k()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LF8/d0;->h:Z

    iget-object v0, p0, LF8/d0;->i:Ljava/util/ArrayDeque;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, LF8/d0;->i:Ljava/util/ArrayDeque;

    :cond_0
    iget-object v0, p0, LF8/d0;->j:Ljava/util/Set;

    if-nez v0, :cond_1

    sget-object v0, LP8/g;->E:LP8/g$b;

    invoke-virtual {v0}, LP8/g$b;->a()LP8/g;

    move-result-object v0

    iput-object v0, p0, LF8/d0;->j:Ljava/util/Set;

    :cond_1
    return-void
.end method

.method public final l(LJ8/i;)Z
    .locals 1

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LF8/d0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LF8/d0;->d:LJ8/o;

    invoke-interface {v0, p1}, LJ8/o;->D(LJ8/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, LF8/d0;->a:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, LF8/d0;->b:Z

    return v0
.end method

.method public final o(LJ8/i;)LJ8/i;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/d0;->e:LF8/g;

    invoke-virtual {v0, p1}, LF8/g;->a(LJ8/i;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public final p(LJ8/i;)LJ8/i;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/d0;->f:LF8/h;

    invoke-virtual {v0, p1}, LF8/h;->a(LJ8/i;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public q(Lx7/l;)Z
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/d0$a$a;

    invoke-direct {v0}, LF8/d0$a$a;-><init>()V

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LF8/d0$a$a;->b()Z

    move-result p1

    return p1
.end method
