.class public abstract Li1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/c$a;
    }
.end annotation


# static fields
.field public static final I:Li1/c$a;

.field public static final J:I


# instance fields
.field private final C:[C

.field private D:J

.field private E:J

.field private F:Li1/b;

.field private G:I

.field private final H:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li1/c$a;-><init>(Ly7/k;)V

    sput-object v0, Li1/c;->I:Li1/c$a;

    const/16 v0, 0x8

    sput v0, Li1/c;->J:I

    return-void
.end method

.method public constructor <init>(Li1/c;)V
    .locals 2

    const-string v0, "clElement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Li1/c;->C:[C

    invoke-direct {p0, v0}, Li1/c;-><init>([C)V

    invoke-virtual {p1}, Li1/c;->C()J

    move-result-wide v0

    iput-wide v0, p0, Li1/c;->D:J

    invoke-virtual {p1}, Li1/c;->f()J

    move-result-wide v0

    iput-wide v0, p0, Li1/c;->E:J

    iget-object v0, p1, Li1/c;->F:Li1/b;

    iput-object v0, p0, Li1/c;->F:Li1/b;

    iget p1, p1, Li1/c;->G:I

    iput p1, p0, Li1/c;->G:I

    return-void
.end method

.method public constructor <init>([C)V
    .locals 2

    const-string v0, "content"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/c;->C:[C

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Li1/c;->D:J

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Li1/c;->E:J

    return-void
.end method


# virtual methods
.method public final C()J
    .locals 2

    iget-wide v0, p0, Li1/c;->D:J

    return-wide v0
.end method

.method public final D()Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x2e

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v6}, LS8/r;->v0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final E()Z
    .locals 2

    .prologue
    iget-object v0, p0, Li1/c;->C:[C

    array-length v0, v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public final M(Li1/b;)V
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li1/c;->F:Li1/b;

    return-void
.end method

.method public final N(J)V
    .locals 4

    .prologue
    iget-wide v0, p0, Li1/c;->E:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-wide p1, p0, Li1/c;->E:J

    iget-object p1, p0, Li1/c;->F:Li1/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Li1/b;->P(Li1/c;)V

    :cond_1
    return-void
.end method

.method public final O(J)V
    .locals 0

    iput-wide p1, p0, Li1/c;->D:J

    return-void
.end method

.method public abstract d()Li1/c;
.end method

.method public final e()Ljava/lang/String;
    .locals 9

    .prologue
    iget-object v0, p0, Li1/c;->C:[C

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lj7/n;->v0([CLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-wide v1, p0, Li1/c;->E:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v3, v1, v3

    const-string v4, "substring(...)"

    if-eqz v3, :cond_2

    iget-wide v5, p0, Li1/c;->D:J

    cmp-long v3, v1, v5

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    long-to-int v3, v5

    :goto_0
    long-to-int v1, v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    :goto_1
    iget-wide v1, p0, Li1/c;->D:J

    long-to-int v3, v1

    goto :goto_0

    :goto_2
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Li1/c;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-wide v2, p0, Li1/c;->D:J

    check-cast p1, Li1/c;

    iget-wide v4, p1, Li1/c;->D:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, Li1/c;->E:J

    iget-wide v4, p1, Li1/c;->E:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget v0, p0, Li1/c;->G:I

    iget v2, p1, Li1/c;->G:I

    if-eq v0, v2, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Li1/c;->C:[C

    iget-object v2, p1, Li1/c;->C:[C

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v0

    if-nez v0, :cond_5

    return v1

    :cond_5
    iget-object v0, p0, Li1/c;->F:Li1/b;

    iget-object p1, p1, Li1/c;->F:Li1/b;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Li1/c;->E:J

    return-wide v0
.end method

.method public g()F
    .locals 1

    .prologue
    instance-of v0, p0, Li1/e;

    if-eqz v0, :cond_0

    iget v0, p0, Li1/c;->H:F

    goto :goto_0

    :cond_0
    const/high16 v0, 0x7fc00000    # Float.NaN

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 6

    .prologue
    iget-object v0, p0, Li1/c;->C:[C

    invoke-virtual {v0}, [C->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Li1/c;->D:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Li1/c;->E:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Li1/c;->F:Li1/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Li1/c;->G:I

    add-int/2addr v0, v1

    return v0
.end method

.method public o()I
    .locals 1

    .prologue
    instance-of v0, p0, Li1/e;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li1/c;->o()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Li1/c;->G:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .prologue
    iget-wide v0, p0, Li1/c;->D:J

    iget-wide v2, p0, Li1/c;->E:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Li1/c;->C:[C

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lj7/n;->v0([CLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Li1/c;->D:J

    long-to-int v1, v1

    iget-wide v2, p0, Li1/c;->E:J

    long-to-int v2, v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li1/c;->D()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Li1/c;->D:J

    iget-wide v4, p0, Li1/c;->E:J

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ") <<"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ">>"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    iget-wide v1, p0, Li1/c;->D:J

    iget-wide v3, p0, Li1/c;->E:J

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " (INVALID, "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
