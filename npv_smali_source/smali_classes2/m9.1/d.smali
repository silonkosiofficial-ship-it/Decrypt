.class public final Lm9/d;
.super Lm9/e;
.source "SourceFile"


# instance fields
.field private final c:I

.field private final d:I

.field private final e:Lm9/a;


# direct methods
.method public constructor <init>(IILm9/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    const-string v0, "setter"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-direct {p0, v1, p4, v0}, Lm9/e;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ly7/k;)V

    iput p1, p0, Lm9/d;->c:I

    iput p2, p0, Lm9/d;->d:I

    iput-object p3, p0, Lm9/d;->e:Lm9/a;

    const/4 p3, 0x1

    const-string p4, " for field "

    if-gt p3, p1, :cond_2

    const/16 p3, 0xa

    if-ge p1, p3, :cond_2

    if-gt p1, p2, :cond_1

    if-ge p2, p3, :cond_1

    return-void

    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid maximum length "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm9/e;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": expected "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "..9"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Invalid minimum length "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm9/e;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": expected 1..9"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lm9/g;
    .locals 3

    .prologue
    const-string v0, "input"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sub-int v0, p4, p3

    iget v1, p0, Lm9/d;->c:I

    if-ge v0, v1, :cond_0

    new-instance p1, Lm9/g$c;

    invoke-direct {p1, v1}, Lm9/g$c;-><init>(I)V

    goto :goto_0

    :cond_0
    iget v1, p0, Lm9/d;->d:I

    if-le v0, v1, :cond_1

    new-instance p1, Lm9/g$d;

    invoke-direct {p1, v1}, Lm9/g$d;-><init>(I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lm9/d;->e:Lm9/a;

    new-instance v2, Lj9/a;

    invoke-static {p2, p3, p4}, Lm9/f;->a(Ljava/lang/CharSequence;II)I

    move-result p2

    invoke-direct {v2, p2, v0}, Lj9/a;-><init>(II)V

    invoke-static {v1, p1, v2}, Lm9/f;->c(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;)Lm9/g;

    move-result-object p1

    :goto_0
    return-object p1
.end method
