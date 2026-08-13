.class public final LT/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/u$b;


# instance fields
.field private final a:Lh0/c$c;

.field private final b:Lh0/c$c;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lh0/c$c;Lh0/c$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/d;->a:Lh0/c$c;

    iput-object p2, p0, LT/d;->b:Lh0/c$c;

    iput p3, p0, LT/d;->c:I

    return-void
.end method


# virtual methods
.method public a(LY0/r;JI)I
    .locals 1

    iget-object p2, p0, LT/d;->b:Lh0/c$c;

    invoke-virtual {p1}, LY0/r;->f()I

    move-result p3

    const/4 v0, 0x0

    invoke-interface {p2, v0, p3}, Lh0/c$c;->a(II)I

    move-result p2

    iget-object p3, p0, LT/d;->a:Lh0/c$c;

    invoke-interface {p3, v0, p4}, Lh0/c$c;->a(II)I

    move-result p3

    neg-int p3, p3

    invoke-virtual {p1}, LY0/r;->i()I

    move-result p1

    add-int/2addr p1, p2

    add-int/2addr p1, p3

    iget p2, p0, LT/d;->c:I

    add-int/2addr p1, p2

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LT/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LT/d;

    iget-object v1, p0, LT/d;->a:Lh0/c$c;

    iget-object v3, p1, LT/d;->a:Lh0/c$c;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LT/d;->b:Lh0/c$c;

    iget-object v3, p1, LT/d;->b:Lh0/c$c;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, LT/d;->c:I

    iget p1, p1, LT/d;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LT/d;->a:Lh0/c$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LT/d;->b:Lh0/c$c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LT/d;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Vertical(menuAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT/d;->a:Lh0/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", anchorAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT/d;->b:Lh0/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LT/d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
