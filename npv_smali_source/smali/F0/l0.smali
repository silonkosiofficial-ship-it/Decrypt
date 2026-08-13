.class public final LF0/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/l0$a;
    }
.end annotation


# static fields
.field public static final c:LF0/l0$a;

.field public static final d:I


# instance fields
.field private final a:LX/b;

.field private b:[LF0/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF0/l0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF0/l0$a;-><init>(Ly7/k;)V

    sput-object v0, LF0/l0;->c:LF0/l0$a;

    const/16 v0, 0x8

    sput v0, LF0/l0;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [LF0/J;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LF0/l0;->a:LX/b;

    return-void
.end method

.method private final b(LF0/J;)V
    .locals 3

    .prologue
    invoke-virtual {p1}, LF0/J;->A()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LF0/J;->F1(Z)V

    invoke-virtual {p1}, LF0/J;->w0()LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v2, p1, v0

    check-cast v2, LF0/J;

    invoke-direct {p0, v2}, LF0/l0;->b(LF0/J;)V

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v1, :cond_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    iget-object v0, p0, LF0/l0;->a:LX/b;

    sget-object v1, LF0/l0$a$a;->C:LF0/l0$a$a;

    invoke-virtual {v0, v1}, LX/b;->N(Ljava/util/Comparator;)V

    iget-object v0, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v0

    iget-object v1, p0, LF0/l0;->b:[LF0/J;

    if-eqz v1, :cond_0

    array-length v2, v1

    if-ge v2, v0, :cond_1

    :cond_0
    iget-object v1, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v1}, LX/b;->t()I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [LF0/J;

    :cond_1
    const/4 v2, 0x0

    iput-object v2, p0, LF0/l0;->b:[LF0/J;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v3}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v2, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v2}, LX/b;->j()V

    add-int/lit8 v0, v0, -0x1

    :goto_1
    const/4 v2, -0x1

    if-ge v2, v0, :cond_4

    aget-object v2, v1, v0

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, LF0/J;->j0()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-direct {p0, v2}, LF0/l0;->b(LF0/J;)V

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_4
    iput-object v1, p0, LF0/l0;->b:[LF0/J;

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v0}, LX/b;->x()Z

    move-result v0

    return v0
.end method

.method public final d(LF0/J;)V
    .locals 1

    iget-object v0, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LF0/J;->F1(Z)V

    return-void
.end method

.method public final e(LF0/J;)V
    .locals 1

    iget-object v0, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    iget-object v0, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LF0/J;->F1(Z)V

    return-void
.end method

.method public final f(LF0/J;)V
    .locals 1

    iget-object v0, p0, LF0/l0;->a:LX/b;

    invoke-virtual {v0, p1}, LX/b;->A(Ljava/lang/Object;)Z

    return-void
.end method
