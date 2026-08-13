.class public final Lk9/D;
.super Lk9/a;
.source "SourceFile"


# instance fields
.field private final a:Lk9/b;

.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/Integer;

.field private final f:Lk9/m;

.field private final g:I


# direct methods
.method public constructor <init>(Lk9/b;IILjava/lang/String;Ljava/lang/Integer;Lk9/m;)V
    .locals 1

    .prologue
    const-string v0, "accessor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lk9/a;-><init>()V

    iput-object p1, p0, Lk9/D;->a:Lk9/b;

    iput p2, p0, Lk9/D;->b:I

    iput p3, p0, Lk9/D;->c:I

    iput-object p4, p0, Lk9/D;->d:Ljava/lang/String;

    iput-object p5, p0, Lk9/D;->e:Ljava/lang/Integer;

    iput-object p6, p0, Lk9/D;->f:Lk9/m;

    const/16 p1, 0xa

    if-ge p3, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x64

    if-ge p3, p1, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    const/16 p1, 0x3e8

    if-ge p3, p1, :cond_2

    const/4 p1, 0x3

    :goto_0
    iput p1, p0, Lk9/D;->g:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Max value "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is too large"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Lk9/b;IILjava/lang/String;Ljava/lang/Integer;Lk9/m;ILy7/k;)V
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    invoke-interface {p1}, Lm9/a;->getName()Ljava/lang/String;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    move-object v5, p8

    goto :goto_0

    :cond_1
    move-object v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    move-object v6, p8

    goto :goto_1

    :cond_2
    move-object v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lk9/D;-><init>(Lk9/b;IILjava/lang/String;Ljava/lang/Integer;Lk9/m;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk9/D;->d()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Lk9/b;
    .locals 1

    iget-object v0, p0, Lk9/D;->a:Lk9/b;

    return-object v0
.end method

.method public c()Lk9/m;
    .locals 1

    iget-object v0, p0, Lk9/D;->f:Lk9/m;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lk9/D;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lk9/D;->g:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lk9/D;->c:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lk9/D;->b:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk9/D;->d:Ljava/lang/String;

    return-object v0
.end method
