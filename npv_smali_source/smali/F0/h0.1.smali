.class public final LF0/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/h0$a;,
        LF0/h0$b;,
        LF0/h0$c;,
        LF0/h0$d;,
        LF0/h0$e;
    }
.end annotation


# static fields
.field public static final a:LF0/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/h0;

    invoke-direct {v0}, LF0/h0;-><init>()V

    sput-object v0, LF0/h0;->a:LF0/h0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF0/h0$e;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LF0/h0$a;

    sget-object v1, LF0/h0$c;->D:LF0/h0$c;

    sget-object v2, LF0/h0$d;->D:LF0/h0$d;

    invoke-direct {v0, p3, v1, v2}, LF0/h0$a;-><init>(LD0/n;LF0/h0$c;LF0/h0$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LF0/h0$e;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getHeight()I

    move-result p1

    return p1
.end method

.method public final b(LF0/h0$e;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LF0/h0$a;

    sget-object v1, LF0/h0$c;->D:LF0/h0$c;

    sget-object v2, LF0/h0$d;->C:LF0/h0$d;

    invoke-direct {v0, p3, v1, v2}, LF0/h0$a;-><init>(LD0/n;LF0/h0$c;LF0/h0$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LF0/h0$e;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getWidth()I

    move-result p1

    return p1
.end method

.method public final c(LF0/h0$e;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LF0/h0$a;

    sget-object v1, LF0/h0$c;->C:LF0/h0$c;

    sget-object v2, LF0/h0$d;->D:LF0/h0$d;

    invoke-direct {v0, p3, v1, v2}, LF0/h0$a;-><init>(LD0/n;LF0/h0$c;LF0/h0$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LF0/h0$e;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getHeight()I

    move-result p1

    return p1
.end method

.method public final d(LF0/h0$e;LD0/o;LD0/n;I)I
    .locals 9

    new-instance v0, LF0/h0$a;

    sget-object v1, LF0/h0$c;->C:LF0/h0$c;

    sget-object v2, LF0/h0$d;->C:LF0/h0$d;

    invoke-direct {v0, p3, v1, v2}, LF0/h0$a;-><init>(LD0/n;LF0/h0$c;LF0/h0$d;)V

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

    invoke-interface {p1, v1, v0, p3, p4}, LF0/h0$e;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-interface {p1}, LD0/K;->getWidth()I

    move-result p1

    return p1
.end method
