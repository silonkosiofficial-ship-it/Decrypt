.class public abstract LC/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:LC/G;

.field private final c:I

.field private final d:I

.field private final e:LC/w;

.field private final f:LC/J;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLC/G;IILC/w;LC/J;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LC/y;->a:Z

    iput-object p2, p0, LC/y;->b:LC/G;

    iput p3, p0, LC/y;->c:I

    iput p4, p0, LC/y;->d:I

    iput-object p5, p0, LC/y;->e:LC/w;

    iput-object p6, p0, LC/y;->f:LC/J;

    return-void
.end method


# virtual methods
.method public final a(II)J
    .locals 2

    .prologue
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object p2, p0, LC/y;->b:LC/G;

    invoke-virtual {p2}, LC/G;->b()[I

    move-result-object p2

    aget p1, p2, p1

    goto :goto_0

    :cond_0
    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    iget-object v0, p0, LC/y;->b:LC/G;

    invoke-virtual {v0}, LC/G;->a()[I

    move-result-object v0

    aget v0, v0, p2

    iget-object v1, p0, LC/y;->b:LC/G;

    invoke-virtual {v1}, LC/G;->b()[I

    move-result-object v1

    aget p2, v1, p2

    add-int/2addr v0, p2

    iget-object p2, p0, LC/y;->b:LC/G;

    invoke-virtual {p2}, LC/G;->a()[I

    move-result-object p2

    aget p1, p2, p1

    sub-int p1, v0, p1

    :goto_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, LE7/j;->d(II)I

    move-result p1

    iget-boolean p2, p0, LC/y;->a:Z

    if-eqz p2, :cond_1

    sget-object p2, LY0/b;->b:LY0/b$a;

    invoke-virtual {p2, p1}, LY0/b$a;->e(I)J

    move-result-wide p1

    goto :goto_1

    :cond_1
    sget-object p2, LY0/b;->b:LY0/b$a;

    invoke-virtual {p2, p1}, LY0/b$a;->d(I)J

    move-result-wide p1

    :goto_1
    return-wide p1
.end method

.method public abstract b(I[LC/v;Ljava/util/List;I)LC/x;
.end method

.method public final c(I)LC/x;
    .locals 14

    .prologue
    iget-object v0, p0, LC/y;->f:LC/J;

    invoke-virtual {v0, p1}, LC/J;->c(I)LC/J$c;

    move-result-object v0

    invoke-virtual {v0}, LC/J$c;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LC/J$c;->a()I

    move-result v3

    add-int/2addr v3, v1

    iget v4, p0, LC/y;->c:I

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    iget v3, p0, LC/y;->d:I

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v2

    :goto_1
    new-array v11, v1, [LC/v;

    move v12, v2

    :goto_2
    if-ge v2, v1, :cond_2

    invoke-virtual {v0}, LC/J$c;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/c;

    invoke-virtual {v4}, LC/c;->g()J

    move-result-wide v4

    invoke-static {v4, v5}, LC/c;->d(J)I

    move-result v13

    invoke-virtual {p0, v12, v13}, LC/y;->a(II)J

    move-result-wide v6

    iget-object v4, p0, LC/y;->e:LC/w;

    invoke-virtual {v0}, LC/J$c;->a()I

    move-result v5

    add-int/2addr v5, v2

    move v8, v12

    move v9, v13

    move v10, v3

    invoke-virtual/range {v4 .. v10}, LC/w;->d(IJIII)LC/v;

    move-result-object v4

    add-int/2addr v12, v13

    sget-object v5, Li7/M;->a:Li7/M;

    aput-object v4, v11, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, LC/J$c;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v11, v0, v3}, LC/y;->b(I[LC/v;Ljava/util/List;I)LC/x;

    move-result-object p1

    return-object p1
.end method

.method public final d(I)I
    .locals 2

    iget-object v0, p0, LC/y;->f:LC/J;

    invoke-virtual {v0}, LC/J;->e()I

    move-result v1

    invoke-virtual {v0, p1, v1}, LC/J;->i(II)I

    move-result p1

    return p1
.end method
