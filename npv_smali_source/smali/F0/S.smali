.class public final LF0/S;
.super LF0/a;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LF0/a;-><init>(LF0/b;Ly7/k;)V

    return-void
.end method


# virtual methods
.method protected d(LF0/d0;J)J
    .locals 2

    invoke-virtual {p1}, LF0/d0;->j2()LF0/U;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LF0/U;->t1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result v0

    int-to-float v0, v0

    invoke-static {p1, v0}, Ln0/h;->a(FF)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method protected e(LF0/d0;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, LF0/d0;->j2()LF0/U;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LF0/U;->q1()LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected i(LF0/d0;LD0/a;)I
    .locals 0

    invoke-virtual {p1}, LF0/d0;->j2()LF0/U;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LF0/T;->Q(LD0/a;)I

    move-result p1

    return p1
.end method
