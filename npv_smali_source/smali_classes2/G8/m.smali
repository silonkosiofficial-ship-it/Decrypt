.class public final LG8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG8/l;


# instance fields
.field private final c:LG8/g;

.field private final d:LG8/f;

.field private final e:Lr8/l;


# direct methods
.method public constructor <init>(LG8/g;LG8/f;)V
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypePreparator"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/m;->c:LG8/g;

    iput-object p2, p0, LG8/m;->d:LG8/f;

    invoke-virtual {p0}, LG8/m;->c()LG8/g;

    move-result-object p1

    invoke-static {p1}, Lr8/l;->m(LG8/g;)Lr8/l;

    move-result-object p1

    const-string p2, "createWithTypeRefiner(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LG8/m;->e:Lr8/l;

    return-void
.end method

.method public synthetic constructor <init>(LG8/g;LG8/f;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LG8/f$a;->a:LG8/f$a;

    :cond_0
    invoke-direct {p0, p1, p2}, LG8/m;-><init>(LG8/g;LG8/f;)V

    return-void
.end method


# virtual methods
.method public a()Lr8/l;
    .locals 1

    iget-object v0, p0, LG8/m;->e:Lr8/l;

    return-object v0
.end method

.method public b(LF8/E;LF8/E;)Z
    .locals 8

    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LG8/m;->c()LG8/g;

    move-result-object v5

    invoke-virtual {p0}, LG8/m;->f()LG8/f;

    move-result-object v4

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, LG8/a;->b(ZZLG8/b;LG8/f;LG8/g;ILjava/lang/Object;)LF8/d0;

    move-result-object v0

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    invoke-virtual {p2}, LF8/E;->Z0()LF8/t0;

    move-result-object p2

    invoke-virtual {p0, v0, p1, p2}, LG8/m;->e(LF8/d0;LF8/t0;LF8/t0;)Z

    move-result p1

    return p1
.end method

.method public c()LG8/g;
    .locals 1

    iget-object v0, p0, LG8/m;->c:LG8/g;

    return-object v0
.end method

.method public d(LF8/E;LF8/E;)Z
    .locals 8

    const-string v0, "subtype"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertype"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LG8/m;->c()LG8/g;

    move-result-object v5

    invoke-virtual {p0}, LG8/m;->f()LG8/f;

    move-result-object v4

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, LG8/a;->b(ZZLG8/b;LG8/f;LG8/g;ILjava/lang/Object;)LF8/d0;

    move-result-object v0

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    invoke-virtual {p2}, LF8/E;->Z0()LF8/t0;

    move-result-object p2

    invoke-virtual {p0, v0, p1, p2}, LG8/m;->g(LF8/d0;LF8/t0;LF8/t0;)Z

    move-result p1

    return p1
.end method

.method public final e(LF8/d0;LF8/t0;LF8/t0;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "a"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF8/e;->a:LF8/e;

    invoke-virtual {v0, p1, p2, p3}, LF8/e;->k(LF8/d0;LJ8/i;LJ8/i;)Z

    move-result p1

    return p1
.end method

.method public f()LG8/f;
    .locals 1

    iget-object v0, p0, LG8/m;->d:LG8/f;

    return-object v0
.end method

.method public final g(LF8/d0;LF8/t0;LF8/t0;)Z
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LF8/e;->a:LF8/e;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result p1

    return p1
.end method
