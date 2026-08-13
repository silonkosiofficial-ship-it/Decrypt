.class public final Lm9/s;
.super Lm9/e;
.source "SourceFile"


# instance fields
.field private final c:I

.field private final d:Lm9/a;

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I


# direct methods
.method public constructor <init>(ILm9/a;Ljava/lang/String;I)V
    .locals 2

    .prologue
    const-string v0, "setter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p3, v1}, Lm9/e;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ly7/k;)V

    iput p1, p0, Lm9/s;->c:I

    iput-object p2, p0, Lm9/s;->d:Lm9/a;

    iput p4, p0, Lm9/s;->e:I

    invoke-static {}, Lj9/e;->b()[I

    move-result-object p1

    invoke-virtual {p0}, Lm9/s;->b()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget p1, p1, p2

    iput p1, p0, Lm9/s;->f:I

    rem-int p1, p4, p1

    iput p1, p0, Lm9/s;->g:I

    sub-int/2addr p4, p1

    iput p4, p0, Lm9/s;->h:I

    invoke-virtual {p0}, Lm9/s;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x1

    if-gt p2, p1, :cond_0

    const/16 p2, 0xa

    if-ge p1, p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid length for field "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm9/e;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm9/s;->b()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lm9/g;
    .locals 1

    .prologue
    const-string v0, "input"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3, p4}, Lm9/f;->a(Ljava/lang/CharSequence;II)I

    move-result p2

    iget-object p3, p0, Lm9/s;->d:Lm9/a;

    iget p4, p0, Lm9/s;->g:I

    if-lt p2, p4, :cond_0

    iget p4, p0, Lm9/s;->h:I

    :goto_0
    add-int/2addr p4, p2

    goto :goto_1

    :cond_0
    iget p4, p0, Lm9/s;->h:I

    iget v0, p0, Lm9/s;->f:I

    add-int/2addr p4, v0

    goto :goto_0

    :goto_1
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3, p1, p2}, Lm9/f;->c(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;)Lm9/g;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lm9/s;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
