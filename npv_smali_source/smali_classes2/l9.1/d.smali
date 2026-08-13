.class public final Ll9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/e;


# instance fields
.field private final a:Lx7/l;

.field private final b:I

.field private final c:I

.field private final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lx7/l;IILjava/util/List;)V
    .locals 1

    .prologue
    const-string v0, "number"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zerosToAdd"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/d;->a:Lx7/l;

    iput p2, p0, Ll9/d;->b:I

    iput p3, p0, Ll9/d;->c:I

    iput-object p4, p0, Ll9/d;->d:Ljava/util/List;

    const/4 p1, 0x1

    if-gt p1, p2, :cond_1

    const/16 p1, 0xa

    if-ge p2, p1, :cond_1

    if-gt p2, p3, :cond_0

    if-ge p3, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "The maximum number of digits ("

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ") is not in range "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "..9"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The minimum number of digits ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") is not in range 1..9"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Appendable;Z)V
    .locals 3

    .prologue
    const-string p3, "builder"

    invoke-static {p2, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Ll9/d;->a:Lx7/l;

    invoke-interface {p3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj9/a;

    iget p3, p0, Ll9/d;->c:I

    invoke-virtual {p1, p3}, Lj9/a;->g(I)I

    move-result p1

    const/4 p3, 0x0

    :goto_0
    iget v0, p0, Ll9/d;->c:I

    iget v1, p0, Ll9/d;->b:I

    add-int/2addr v1, p3

    if-le v0, v1, :cond_0

    invoke-static {}, Lj9/e;->b()[I

    move-result-object v0

    add-int/lit8 v1, p3, 0x1

    aget v0, v0, v1

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll9/d;->d:Ljava/util/List;

    iget v1, p0, Ll9/d;->c:I

    sub-int/2addr v1, p3

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lt p3, v0, :cond_1

    sub-int/2addr p3, v0

    :cond_1
    iget v0, p0, Ll9/d;->c:I

    sub-int/2addr v0, p3

    invoke-static {}, Lj9/e;->b()[I

    move-result-object v1

    aget p3, v1, p3

    div-int/2addr p1, p3

    invoke-static {}, Lj9/e;->b()[I

    move-result-object p3

    aget p3, p3, v0

    add-int/2addr p1, p3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "substring(...)"

    invoke-static {p1, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method
