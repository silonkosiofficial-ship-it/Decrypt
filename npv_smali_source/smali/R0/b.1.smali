.class public final LR0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/y;


# instance fields
.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LR0/b;->b:I

    return-void
.end method


# virtual methods
.method public synthetic a(LR0/h;)LR0/h;
    .locals 0

    invoke-static {p0, p1}, LR0/x;->a(LR0/y;LR0/h;)LR0/h;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(I)I
    .locals 0

    invoke-static {p0, p1}, LR0/x;->b(LR0/y;I)I

    move-result p1

    return p1
.end method

.method public c(LR0/q;)LR0/q;
    .locals 2

    .prologue
    iget v0, p0, LR0/b;->b:I

    if-eqz v0, :cond_1

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LR0/q;->q()I

    move-result p1

    iget v0, p0, LR0/b;->b:I

    add-int/2addr p1, v0

    const/4 v0, 0x1

    const/16 v1, 0x3e8

    invoke-static {p1, v0, v1}, LE7/j;->k(III)I

    move-result p1

    new-instance v0, LR0/q;

    invoke-direct {v0, p1}, LR0/q;-><init>(I)V

    return-object v0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public synthetic d(I)I
    .locals 0

    invoke-static {p0, p1}, LR0/x;->c(LR0/y;I)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LR0/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LR0/b;

    iget v1, p0, LR0/b;->b:I

    iget p1, p1, LR0/b;->b:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LR0/b;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AndroidFontResolveInterceptor(fontWeightAdjustment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LR0/b;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
