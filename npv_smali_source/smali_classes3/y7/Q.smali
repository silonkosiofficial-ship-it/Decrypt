.class public Ly7/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly7/p;)LF7/f;
    .locals 0

    return-object p1
.end method

.method public b(Ljava/lang/Class;)LF7/c;
    .locals 1

    new-instance v0, Ly7/i;

    invoke-direct {v0, p1}, Ly7/i;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)LF7/e;
    .locals 1

    new-instance v0, Ly7/C;

    invoke-direct {v0, p1, p2}, Ly7/C;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(LF7/o;)LF7/o;
    .locals 4

    move-object v0, p1

    check-cast v0, Ly7/Z;

    new-instance v1, Ly7/Z;

    invoke-interface {p1}, LF7/o;->b()LF7/d;

    move-result-object v2

    invoke-interface {p1}, LF7/o;->a()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Ly7/Z;->j()LF7/o;

    move-result-object v3

    invoke-virtual {v0}, Ly7/Z;->i()I

    move-result v0

    or-int/lit8 v0, v0, 0x2

    invoke-direct {v1, v2, p1, v3, v0}, Ly7/Z;-><init>(LF7/d;Ljava/util/List;LF7/o;I)V

    return-object v1
.end method

.method public e(Ly7/x;)LF7/h;
    .locals 0

    return-object p1
.end method

.method public f(Ly7/z;)LF7/i;
    .locals 0

    return-object p1
.end method

.method public g(Ly7/D;)LF7/l;
    .locals 0

    return-object p1
.end method

.method public h(Ly7/F;)LF7/m;
    .locals 0

    return-object p1
.end method

.method public i(Ly7/H;)LF7/n;
    .locals 0

    return-object p1
.end method

.method public j(Ly7/o;)Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "kotlin.jvm.functions."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public k(Ly7/v;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ly7/Q;->j(Ly7/o;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l(LF7/p;Ljava/util/List;)V
    .locals 0

    check-cast p1, Ly7/X;

    invoke-virtual {p1, p2}, Ly7/X;->a(Ljava/util/List;)V

    return-void
.end method

.method public m(LF7/d;Ljava/util/List;Z)LF7/o;
    .locals 1

    new-instance v0, Ly7/Z;

    invoke-direct {v0, p1, p2, p3}, Ly7/Z;-><init>(LF7/d;Ljava/util/List;Z)V

    return-object v0
.end method

.method public n(Ljava/lang/Object;Ljava/lang/String;LF7/r;Z)LF7/p;
    .locals 1

    new-instance v0, Ly7/X;

    invoke-direct {v0, p1, p2, p3, p4}, Ly7/X;-><init>(Ljava/lang/Object;Ljava/lang/String;LF7/r;Z)V

    return-object v0
.end method
