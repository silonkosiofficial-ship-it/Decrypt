.class final LK6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:LW8/v;

.field public b:Lio/ktor/utils/io/s;

.field final synthetic c:LK6/a;


# direct methods
.method public constructor <init>(LK6/a;LW8/v;)V
    .locals 1

    const-string v0, "savedResponse"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LK6/a$a;->c:LK6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LK6/a$a;->a:LW8/v;

    return-void
.end method

.method public synthetic constructor <init>(LK6/a;LW8/v;ILy7/k;)V
    .locals 0

    .prologue
    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    invoke-static {p2, p4, p2}, LW8/x;->b(LW8/z0;ILjava/lang/Object;)LW8/v;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, LK6/a$a;-><init>(LK6/a;LW8/v;)V

    return-void
.end method


# virtual methods
.method public final a(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, LK6/a$a;->c()Lio/ktor/utils/io/s;

    move-result-object v0

    invoke-static {v0}, Lio/ktor/utils/io/k;->g(Lio/ktor/utils/io/m;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LK6/a$a;->c()Lio/ktor/utils/io/s;

    move-result-object v0

    invoke-virtual {v0}, Lio/ktor/utils/io/s;->b()Lio/ktor/utils/io/d;

    move-result-object v0

    new-instance v1, LK6/b;

    invoke-direct {v1}, LK6/b;-><init>()V

    invoke-interface {v0, v1}, Lio/ktor/utils/io/d;->k(Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, LK6/a$a;->a:LW8/v;

    invoke-interface {v0, p1}, LW8/V;->d1(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()LW8/v;
    .locals 1

    iget-object v0, p0, LK6/a$a;->a:LW8/v;

    return-object v0
.end method

.method public final c()Lio/ktor/utils/io/s;
    .locals 1

    .prologue
    iget-object v0, p0, LK6/a$a;->b:Lio/ktor/utils/io/s;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "writerJob"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Lio/ktor/utils/io/s;
    .locals 6

    sget-object v0, LW8/t0;->C:LW8/t0;

    invoke-static {}, LW8/d0;->d()LW8/J;

    move-result-object v1

    new-instance v3, LK6/a$a$a;

    iget-object v2, p0, LK6/a$a;->c:LK6/a;

    const/4 v4, 0x0

    invoke-direct {v3, v2, p0, v4}, LK6/a$a$a;-><init>(LK6/a;LK6/a$a;Lm7/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lio/ktor/utils/io/k;->m(LW8/N;Lm7/i;ZLx7/p;ILjava/lang/Object;)Lio/ktor/utils/io/s;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lio/ktor/utils/io/s;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LK6/a$a;->b:Lio/ktor/utils/io/s;

    return-void
.end method

.method public final f()Lio/ktor/utils/io/d;
    .locals 1

    invoke-virtual {p0}, LK6/a$a;->d()Lio/ktor/utils/io/s;

    move-result-object v0

    invoke-virtual {p0, v0}, LK6/a$a;->e(Lio/ktor/utils/io/s;)V

    invoke-virtual {p0}, LK6/a$a;->c()Lio/ktor/utils/io/s;

    move-result-object v0

    invoke-virtual {v0}, Lio/ktor/utils/io/s;->b()Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0
.end method
