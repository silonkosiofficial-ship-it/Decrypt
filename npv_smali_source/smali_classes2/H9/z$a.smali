.class public LH9/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH9/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:LH9/u;

.field private b:Ljava/lang/String;

.field private c:LH9/t$a;

.field private d:LH9/A;

.field private e:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LH9/z$a;->e:Ljava/util/Map;

    const-string v0, "GET"

    iput-object v0, p0, LH9/z$a;->b:Ljava/lang/String;

    new-instance v0, LH9/t$a;

    invoke-direct {v0}, LH9/t$a;-><init>()V

    iput-object v0, p0, LH9/z$a;->c:LH9/t$a;

    return-void
.end method

.method public constructor <init>(LH9/z;)V
    .locals 1

    .prologue
    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LH9/z$a;->e:Ljava/util/Map;

    invoke-virtual {p1}, LH9/z;->i()LH9/u;

    move-result-object v0

    iput-object v0, p0, LH9/z$a;->a:LH9/u;

    invoke-virtual {p1}, LH9/z;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LH9/z$a;->b:Ljava/lang/String;

    invoke-virtual {p1}, LH9/z;->a()LH9/A;

    move-result-object v0

    iput-object v0, p0, LH9/z$a;->d:LH9/A;

    invoke-virtual {p1}, LH9/z;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LH9/z;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lj7/S;->u(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    iput-object v0, p0, LH9/z$a;->e:Ljava/util/Map;

    invoke-virtual {p1}, LH9/z;->e()LH9/t;

    move-result-object p1

    invoke-virtual {p1}, LH9/t;->g()LH9/t$a;

    move-result-object p1

    iput-object p1, p0, LH9/z$a;->c:LH9/t$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH9/z$a;->c:LH9/t$a;

    invoke-virtual {v0, p1, p2}, LH9/t$a;->a(Ljava/lang/String;Ljava/lang/String;)LH9/t$a;

    return-object p0
.end method

.method public b()LH9/z;
    .locals 7

    .prologue
    iget-object v1, p0, LH9/z$a;->a:LH9/u;

    if-eqz v1, :cond_0

    iget-object v2, p0, LH9/z$a;->b:Ljava/lang/String;

    iget-object v0, p0, LH9/z$a;->c:LH9/t$a;

    invoke-virtual {v0}, LH9/t$a;->d()LH9/t;

    move-result-object v3

    iget-object v4, p0, LH9/z$a;->d:LH9/A;

    iget-object v0, p0, LH9/z$a;->e:Ljava/util/Map;

    invoke-static {v0}, LI9/d;->U(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    new-instance v6, LH9/z;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LH9/z;-><init>(LH9/u;Ljava/lang/String;LH9/t;LH9/A;Ljava/util/Map;)V

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH9/z$a;->c:LH9/t$a;

    invoke-virtual {v0, p1, p2}, LH9/t$a;->g(Ljava/lang/String;Ljava/lang/String;)LH9/t$a;

    return-object p0
.end method

.method public d(LH9/t;)LH9/z$a;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH9/t;->g()LH9/t$a;

    move-result-object p1

    iput-object p1, p0, LH9/z$a;->c:LH9/t$a;

    return-object p0
.end method

.method public e(Ljava/lang/String;LH9/A;)LH9/z$a;
    .locals 2

    .prologue
    const-string v0, "method"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_3

    const-string v0, "method "

    if-nez p2, :cond_1

    invoke-static {p1}, LN9/f;->d(Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-static {p1}, LN9/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iput-object p1, p0, LH9/z$a;->b:Ljava/lang/String;

    iput-object p2, p0, LH9/z$a;->d:LH9/A;

    return-object p0

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.isEmpty() == true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/lang/String;)LH9/z$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH9/z$a;->c:LH9/t$a;

    invoke-virtual {v0, p1}, LH9/t$a;->f(Ljava/lang/String;)LH9/t$a;

    return-object p0
.end method

.method public g(LH9/u;)LH9/z$a;
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH9/z$a;->a:LH9/u;

    return-object p0
.end method

.method public h(Ljava/lang/String;)LH9/z$a;
    .locals 3

    .prologue
    const-string v0, "url"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ws:"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LS8/r;->T(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "this as java.lang.String).substring(startIndex)"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x3

    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    const-string v0, "wss:"

    invoke-static {p1, v0, v1}, LS8/r;->T(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v0, LH9/u;->k:LH9/u$b;

    invoke-virtual {v0, p1}, LH9/u$b;->d(Ljava/lang/String;)LH9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, LH9/z$a;->g(LH9/u;)LH9/z$a;

    move-result-object p1

    return-object p1
.end method
