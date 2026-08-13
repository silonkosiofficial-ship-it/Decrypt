.class public final LD/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/j$a;
    }
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:LX/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LX/b;->F:I

    sput v0, LD/j;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [LD/j$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LD/j;->a:LX/b;

    return-void
.end method


# virtual methods
.method public final a(II)LD/j$a;
    .locals 1

    new-instance v0, LD/j$a;

    invoke-direct {v0, p1, p2}, LD/j$a;-><init>(II)V

    iget-object p1, p0, LD/j;->a:LX/b;

    invoke-virtual {p1, v0}, LX/b;->d(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final b()I
    .locals 6

    .prologue
    iget-object v0, p0, LD/j;->a:LX/b;

    invoke-virtual {v0}, LX/b;->p()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/j$a;

    invoke-virtual {v0}, LD/j$a;->a()I

    move-result v0

    iget-object v1, p0, LD/j;->a:LX/b;

    invoke-virtual {v1}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, LD/j$a;

    invoke-virtual {v4}, LD/j$a;->a()I

    move-result v5

    if-le v5, v0, :cond_1

    invoke-virtual {v4}, LD/j$a;->a()I

    move-result v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return v0
.end method

.method public final c()I
    .locals 6

    .prologue
    iget-object v0, p0, LD/j;->a:LX/b;

    invoke-virtual {v0}, LX/b;->p()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/j$a;

    invoke-virtual {v0}, LD/j$a;->b()I

    move-result v0

    iget-object v1, p0, LD/j;->a:LX/b;

    invoke-virtual {v1}, LX/b;->t()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, LD/j$a;

    invoke-virtual {v4}, LD/j$a;->b()I

    move-result v5

    if-ge v5, v0, :cond_1

    invoke-virtual {v4}, LD/j$a;->b()I

    move-result v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    if-ltz v0, :cond_3

    return v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative minIndex"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, LD/j;->a:LX/b;

    invoke-virtual {v0}, LX/b;->x()Z

    move-result v0

    return v0
.end method

.method public final e(LD/j$a;)V
    .locals 1

    iget-object v0, p0, LD/j;->a:LX/b;

    invoke-virtual {v0, p1}, LX/b;->A(Ljava/lang/Object;)Z

    return-void
.end method
