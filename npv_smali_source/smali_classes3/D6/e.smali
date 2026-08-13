.class public final LD6/e;
.super LD6/b;
.source "SourceFile"


# instance fields
.field private final J:[B

.field private final K:Z


# direct methods
.method public constructor <init>(LC6/c;LO6/b;LQ6/c;[B)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseBody"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LD6/b;-><init>(LC6/c;)V

    iput-object p4, p0, LD6/e;->J:[B

    new-instance p1, LD6/f;

    invoke-direct {p1, p0, p2}, LD6/f;-><init>(LD6/e;LO6/b;)V

    invoke-virtual {p0, p1}, LD6/b;->h(LO6/b;)V

    new-instance p1, LD6/g;

    invoke-direct {p1, p0, p4, p3}, LD6/g;-><init>(LD6/e;[BLQ6/c;)V

    invoke-virtual {p0, p1}, LD6/b;->i(LQ6/c;)V

    invoke-static {p3}, LT6/z;->b(LT6/x;)Ljava/lang/Long;

    move-result-object p1

    array-length p3, p4

    int-to-long p3, p3

    invoke-interface {p2}, LO6/b;->u0()LT6/A;

    move-result-object p2

    invoke-static {p1, p3, p4, p2}, LD6/h;->a(Ljava/lang/Long;JLT6/A;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LD6/e;->K:Z

    return-void
.end method


# virtual methods
.method protected b()Z
    .locals 1

    iget-boolean v0, p0, LD6/e;->K:Z

    return v0
.end method

.method protected f(Lm7/e;)Ljava/lang/Object;
    .locals 3

    iget-object p1, p0, LD6/e;->J:[B

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, Lio/ktor/utils/io/b;->c([BIIILjava/lang/Object;)Lio/ktor/utils/io/d;

    move-result-object p1

    return-object p1
.end method
