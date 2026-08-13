.class public final LD/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/c;


# instance fields
.field private final b:Lr/N;

.field private final c:[Ljava/lang/Object;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE7/i;LD/o;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, LD/o;->f()LD/d;

    move-result-object p2

    invoke-virtual {p1}, LE7/g;->f()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p1}, LE7/g;->g()I

    move-result p1

    invoke-interface {p2}, LD/d;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-ge p1, v0, :cond_0

    invoke-static {}, Lr/O;->a()Lr/N;

    move-result-object p1

    iput-object p1, p0, LD/J;->b:Lr/N;

    const/4 p1, 0x0

    new-array p2, p1, [Ljava/lang/Object;

    iput-object p2, p0, LD/J;->c:[Ljava/lang/Object;

    iput p1, p0, LD/J;->d:I

    goto :goto_0

    :cond_0
    sub-int v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iput-object v2, p0, LD/J;->c:[Ljava/lang/Object;

    iput v0, p0, LD/J;->d:I

    new-instance v2, Lr/H;

    invoke-direct {v2, v1}, Lr/H;-><init>(I)V

    new-instance v1, LD/J$a;

    invoke-direct {v1, v0, p1, v2, p0}, LD/J$a;-><init>(IILr/H;LD/J;)V

    invoke-interface {p2, v0, p1, v1}, LD/d;->b(IILx7/l;)V

    iput-object v2, p0, LD/J;->b:Lr/N;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "negative nearestRange.first"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a(LD/J;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LD/J;->c:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic c(LD/J;)I
    .locals 0

    iget p0, p0, LD/J;->d:I

    return p0
.end method


# virtual methods
.method public b(I)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, LD/J;->c:[Ljava/lang/Object;

    iget v1, p0, LD/J;->d:I

    sub-int/2addr p1, v1

    if-ltz p1, :cond_0

    invoke-static {v0}, Lj7/n;->e0([Ljava/lang/Object;)I

    move-result v1

    if-gt p1, v1, :cond_0

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public d(Ljava/lang/Object;)I
    .locals 1

    .prologue
    iget-object v0, p0, LD/J;->b:Lr/N;

    invoke-virtual {v0, p1}, Lr/N;->b(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, v0, Lr/N;->c:[I

    aget p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method
