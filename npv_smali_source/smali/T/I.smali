.class public final LT/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/u$b;


# instance fields
.field private final a:Lh0/c$c;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lh0/c$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/I;->a:Lh0/c$c;

    iput p2, p0, LT/I;->b:I

    return-void
.end method


# virtual methods
.method public a(LY0/r;JI)I
    .locals 1

    .prologue
    invoke-static {p2, p3}, LY0/t;->f(J)I

    move-result p1

    iget v0, p0, LT/I;->b:I

    mul-int/lit8 v0, v0, 0x2

    sub-int/2addr p1, v0

    if-lt p4, p1, :cond_0

    sget-object p1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p1}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object p1

    invoke-static {p2, p3}, LY0/t;->f(J)I

    move-result p2

    invoke-interface {p1, p4, p2}, Lh0/c$c;->a(II)I

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, LT/I;->a:Lh0/c$c;

    invoke-static {p2, p3}, LY0/t;->f(J)I

    move-result v0

    invoke-interface {p1, p4, v0}, Lh0/c$c;->a(II)I

    move-result p1

    iget v0, p0, LT/I;->b:I

    invoke-static {p2, p3}, LY0/t;->f(J)I

    move-result p2

    iget p3, p0, LT/I;->b:I

    sub-int/2addr p2, p3

    sub-int/2addr p2, p4

    invoke-static {p1, v0, p2}, LE7/j;->k(III)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LT/I;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LT/I;

    iget-object v1, p0, LT/I;->a:Lh0/c$c;

    iget-object v3, p1, LT/I;->a:Lh0/c$c;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LT/I;->b:I

    iget p1, p1, LT/I;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LT/I;->a:Lh0/c$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LT/I;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Vertical(alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT/I;->a:Lh0/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", margin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LT/I;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
