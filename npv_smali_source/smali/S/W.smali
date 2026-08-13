.class final LS/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/g0;


# instance fields
.field private final b:LT/k;

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:LS/W$a;


# direct methods
.method public constructor <init>(LT/k;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/W;->b:LT/k;

    invoke-virtual {p1}, LT/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LT/k;->a()C

    move-result v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    iput v0, p0, LS/W;->c:I

    invoke-virtual {p1}, LT/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LT/k;->a()C

    move-result v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->v0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    iput v0, p0, LS/W;->d:I

    invoke-virtual {p1}, LT/k;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, LS/W;->e:I

    new-instance p1, LS/W$a;

    invoke-direct {p1, p0}, LS/W$a;-><init>(LS/W;)V

    iput-object p1, p0, LS/W;->f:LS/W$a;

    return-void
.end method

.method public static final synthetic b(LS/W;)I
    .locals 0

    iget p0, p0, LS/W;->e:I

    return p0
.end method

.method public static final synthetic c(LS/W;)I
    .locals 0

    iget p0, p0, LS/W;->c:I

    return p0
.end method

.method public static final synthetic d(LS/W;)I
    .locals 0

    iget p0, p0, LS/W;->d:I

    return p0
.end method


# virtual methods
.method public a(LM0/d;)LS0/e0;
    .locals 9

    .prologue
    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, LS/W;->e:I

    const/4 v2, 0x0

    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object p1

    if-le v0, v1, :cond_0

    iget v0, p0, LS/W;->e:I

    invoke-static {v2, v0}, LE7/j;->q(II)LE7/i;

    move-result-object v0

    invoke-static {p1, v0}, LS8/r;->e1(Ljava/lang/String;LE7/i;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const-string v0, ""

    move-object v4, v0

    move v0, v2

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v2, v1, :cond_3

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    add-int/lit8 v3, v0, 0x1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v4, p0, LS/W;->c:I

    if-eq v3, v4, :cond_2

    add-int/lit8 v0, v0, 0x2

    iget v4, p0, LS/W;->d:I

    if-ne v0, v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v1

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS/W;->b:LT/k;

    invoke-virtual {v1}, LT/k;->a()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    :goto_2
    add-int/lit8 v2, v2, 0x1

    move v0, v3

    goto :goto_0

    :cond_3
    new-instance p1, LS0/e0;

    new-instance v0, LM0/d;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    iget-object v1, p0, LS/W;->f:LS/W$a;

    invoke-direct {p1, v0, v1}, LS0/e0;-><init>(LM0/d;LS0/L;)V

    return-object p1
.end method
