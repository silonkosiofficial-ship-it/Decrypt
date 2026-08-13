.class public abstract LB/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/z;


# instance fields
.field private final a:LB/m;

.field private final b:LD/w;

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JZLB/m;LD/w;)V
    .locals 6

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, LB/u;->a:LB/m;

    iput-object p5, p0, LB/u;->b:LD/w;

    const p4, 0x7fffffff

    if-eqz p3, :cond_0

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result p5

    move v1, p5

    goto :goto_0

    :cond_0
    move v1, p4

    :goto_0
    if-nez p3, :cond_1

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result p4

    :cond_1
    move v3, p4

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, LB/u;->c:J

    return-void
.end method

.method public synthetic constructor <init>(JZLB/m;LD/w;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LB/u;-><init>(JZLB/m;LD/w;)V

    return-void
.end method

.method public static synthetic e(LB/u;IJILjava/lang/Object;)LB/t;
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    iget-wide p2, p0, LB/u;->c:J

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LB/u;->d(IJ)LB/t;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public bridge synthetic a(IIIJ)LD/y;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LB/u;->c(IIIJ)LB/t;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)LB/t;
.end method

.method public c(IIIJ)LB/t;
    .locals 0

    invoke-virtual {p0, p1, p4, p5}, LB/u;->d(IJ)LB/t;

    move-result-object p1

    return-object p1
.end method

.method public final d(IJ)LB/t;
    .locals 8

    iget-object v0, p0, LB/u;->a:LB/m;

    invoke-interface {v0, p1}, LD/s;->b(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v0, p0, LB/u;->a:LB/m;

    invoke-interface {v0, p1}, LD/s;->e(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v0, p0, LB/u;->b:LD/w;

    invoke-interface {v0, p1, p2, p3}, LD/w;->p0(IJ)Ljava/util/List;

    move-result-object v5

    move-object v1, p0

    move v2, p1

    move-wide v6, p2

    invoke-virtual/range {v1 .. v7}, LB/u;->b(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)LB/t;

    move-result-object p1

    return-object p1
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, LB/u;->c:J

    return-wide v0
.end method

.method public final g()Landroidx/compose/foundation/lazy/layout/c;
    .locals 1

    iget-object v0, p0, LB/u;->a:LB/m;

    invoke-interface {v0}, LB/m;->c()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v0

    return-object v0
.end method
