.class public final LO6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT6/C;

.field private final b:LY6/b;

.field private final c:LT6/p;

.field private final d:LT6/B;

.field private final e:Ljava/lang/Object;

.field private final f:Lm7/i;

.field private final g:LY6/b;


# direct methods
.method public constructor <init>(LT6/C;LY6/b;LT6/p;LT6/B;Ljava/lang/Object;Lm7/i;)V
    .locals 1

    const-string v0, "statusCode"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestTime"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callContext"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO6/h;->a:LT6/C;

    iput-object p2, p0, LO6/h;->b:LY6/b;

    iput-object p3, p0, LO6/h;->c:LT6/p;

    iput-object p4, p0, LO6/h;->d:LT6/B;

    iput-object p5, p0, LO6/h;->e:Ljava/lang/Object;

    iput-object p6, p0, LO6/h;->f:Lm7/i;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, LY6/a;->b(Ljava/lang/Long;ILjava/lang/Object;)LY6/b;

    move-result-object p1

    iput-object p1, p0, LO6/h;->g:LY6/b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LO6/h;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lm7/i;
    .locals 1

    iget-object v0, p0, LO6/h;->f:Lm7/i;

    return-object v0
.end method

.method public final c()LT6/p;
    .locals 1

    iget-object v0, p0, LO6/h;->c:LT6/p;

    return-object v0
.end method

.method public final d()LY6/b;
    .locals 1

    iget-object v0, p0, LO6/h;->b:LY6/b;

    return-object v0
.end method

.method public final e()LY6/b;
    .locals 1

    iget-object v0, p0, LO6/h;->g:LY6/b;

    return-object v0
.end method

.method public final f()LT6/C;
    .locals 1

    iget-object v0, p0, LO6/h;->a:LT6/C;

    return-object v0
.end method

.method public final g()LT6/B;
    .locals 1

    iget-object v0, p0, LO6/h;->d:LT6/B;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpResponseData=(statusCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LO6/h;->a:LT6/C;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
