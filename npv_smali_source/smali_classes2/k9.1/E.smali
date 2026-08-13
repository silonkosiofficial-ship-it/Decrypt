.class public abstract Lk9/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/l;


# instance fields
.field private final a:Lk9/D;

.field private final b:I

.field private final c:Ljava/lang/Integer;

.field private final d:I


# direct methods
.method public constructor <init>(Lk9/D;ILjava/lang/Integer;)V
    .locals 2

    .prologue
    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/E;->a:Lk9/D;

    iput p2, p0, Lk9/E;->b:I

    iput-object p3, p0, Lk9/E;->c:Ljava/lang/Integer;

    invoke-virtual {p1}, Lk9/D;->e()I

    move-result p1

    iput p1, p0, Lk9/E;->d:I

    if-ltz p2, :cond_3

    const/16 v0, 0x29

    if-lt p1, p2, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The space padding ("

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ") should be more than the minimum number of digits ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The maximum number of digits ("

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is less than the minimum number of digits ("

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The minimum number of digits ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") is negative"

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
.method public a()Ll9/e;
    .locals 3

    .prologue
    new-instance v0, Ll9/k;

    new-instance v1, Lk9/E$a;

    iget-object v2, p0, Lk9/E;->a:Lk9/D;

    invoke-virtual {v2}, Lk9/D;->b()Lk9/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lk9/E$a;-><init>(Ljava/lang/Object;)V

    iget v2, p0, Lk9/E;->b:I

    invoke-direct {v0, v1, v2}, Ll9/k;-><init>(Lx7/l;I)V

    iget-object v1, p0, Lk9/E;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    new-instance v2, Ll9/i;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v2, v0, v1}, Ll9/i;-><init>(Ll9/e;I)V

    move-object v0, v2

    :cond_0
    return-object v0
.end method

.method public b()Lm9/q;
    .locals 9

    iget v0, p0, Lk9/E;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v0, p0, Lk9/E;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lk9/E;->c:Ljava/lang/Integer;

    iget-object v0, p0, Lk9/E;->a:Lk9/D;

    invoke-virtual {v0}, Lk9/D;->b()Lk9/b;

    move-result-object v4

    iget-object v0, p0, Lk9/E;->a:Lk9/D;

    invoke-virtual {v0}, Lk9/D;->getName()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lm9/p;->f(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;ZILjava/lang/Object;)Lm9/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lk9/n;
    .locals 1

    iget-object v0, p0, Lk9/E;->a:Lk9/D;

    return-object v0
.end method
