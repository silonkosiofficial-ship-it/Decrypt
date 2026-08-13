.class final LD0/P;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/P$a;,
        LD0/P$b;,
        LD0/P$c;,
        LD0/P$d;
    }
.end annotation


# static fields
.field public static final a:LD0/P;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD0/P;

    invoke-direct {v0}, LD0/P;-><init>()V

    sput-object v0, LD0/P;->a:LD0/P;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LD0/A;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LD0/P$a;

    sget-object v1, LD0/P$c;->D:LD0/P$c;

    sget-object v2, LD0/P$d;->D:LD0/P$d;

    invoke-direct {v0, p3, v1, v2}, LD0/P$a;-><init>(LD0/n;LD0/P$c;LD0/P$d;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, LD0/r;

    invoke-interface {p2}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p2, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p1, v1, v0, p3, p4}, LD0/A;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getHeight()I

    move-result p1

    return p1
.end method

.method public final b(LD0/A;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LD0/P$a;

    sget-object v1, LD0/P$c;->D:LD0/P$c;

    sget-object v2, LD0/P$d;->C:LD0/P$d;

    invoke-direct {v0, p3, v1, v2}, LD0/P$a;-><init>(LD0/n;LD0/P$c;LD0/P$d;)V

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, LD0/r;

    invoke-interface {p2}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p2, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p1, v1, v0, p3, p4}, LD0/A;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getWidth()I

    move-result p1

    return p1
.end method

.method public final c(LD0/A;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LD0/P$a;

    sget-object v1, LD0/P$c;->C:LD0/P$c;

    sget-object v2, LD0/P$d;->D:LD0/P$d;

    invoke-direct {v0, p3, v1, v2}, LD0/P$a;-><init>(LD0/n;LD0/P$c;LD0/P$d;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, LD0/r;

    invoke-interface {p2}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p2, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p1, v1, v0, p3, p4}, LD0/A;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getHeight()I

    move-result p1

    return p1
.end method

.method public final d(LD0/A;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LD0/P$a;

    sget-object v1, LD0/P$c;->C:LD0/P$c;

    sget-object v2, LD0/P$d;->C:LD0/P$d;

    invoke-direct {v0, p3, v1, v2}, LD0/P$a;-><init>(LD0/n;LD0/P$c;LD0/P$d;)V

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p4

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p3

    new-instance v1, LD0/r;

    invoke-interface {p2}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p2, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p1, v1, v0, p3, p4}, LD0/A;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getWidth()I

    move-result p1

    return p1
.end method
