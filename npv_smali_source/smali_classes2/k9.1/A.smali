.class public abstract Lk9/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/l;


# instance fields
.field private final a:Lk9/n;

.field private final b:Ljava/lang/Integer;

.field private final c:Ljava/lang/Integer;

.field private final d:Ljava/lang/Integer;

.field private final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lk9/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .prologue
    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/A;->a:Lk9/n;

    iput-object p2, p0, Lk9/A;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lk9/A;->c:Ljava/lang/Integer;

    iput-object p4, p0, Lk9/A;->d:Ljava/lang/Integer;

    iput-object p5, p0, Lk9/A;->e:Ljava/lang/Integer;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "The minimum number of digits ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ") is negative"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-eqz p3, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p4

    if-lt p1, p4, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "The maximum number of digits ("

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ") is less than the minimum number of digits ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 4

    .prologue
    new-instance v0, Ll9/h;

    new-instance v1, Lk9/A$a;

    iget-object v2, p0, Lk9/A;->a:Lk9/n;

    invoke-interface {v2}, Lk9/n;->b()Lk9/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lk9/A$a;-><init>(Ljava/lang/Object;)V

    iget-object v2, p0, Lk9/A;->b:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lk9/A;->e:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, v3}, Ll9/h;-><init>(Lx7/l;ILjava/lang/Integer;)V

    iget-object v1, p0, Lk9/A;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    new-instance v2, Ll9/i;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v2, v0, v1}, Ll9/i;-><init>(Ll9/e;I)V

    move-object v0, v2

    :cond_1
    return-object v0
.end method

.method public b()Lm9/q;
    .locals 6

    iget-object v0, p0, Lk9/A;->b:Ljava/lang/Integer;

    iget-object v1, p0, Lk9/A;->c:Ljava/lang/Integer;

    iget-object v2, p0, Lk9/A;->d:Ljava/lang/Integer;

    iget-object v3, p0, Lk9/A;->a:Lk9/n;

    invoke-interface {v3}, Lk9/n;->b()Lk9/b;

    move-result-object v3

    iget-object v4, p0, Lk9/A;->a:Lk9/n;

    invoke-interface {v4}, Lk9/n;->getName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lk9/A;->e:Ljava/lang/Integer;

    invoke-static/range {v0 .. v5}, Lm9/p;->b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Ljava/lang/Integer;)Lm9/q;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lk9/n;
    .locals 1

    iget-object v0, p0, Lk9/A;->a:Lk9/n;

    return-object v0
.end method
