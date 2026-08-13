.class public final LF0/K;
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
    .locals 6

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-wide v1, p2

    invoke-static/range {v0 .. v5}, LF0/d0;->Y2(LF0/d0;JZILjava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method

.method protected e(LF0/d0;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, LF0/d0;->q1()LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->f()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected i(LF0/d0;LD0/a;)I
    .locals 0

    invoke-virtual {p1, p2}, LF0/T;->Q(LD0/a;)I

    move-result p1

    return p1
.end method
