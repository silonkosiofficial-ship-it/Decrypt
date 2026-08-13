.class public final LX0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX0/k$a;
    }
.end annotation


# static fields
.field public static final b:LX0/k$a;

.field private static final c:LX0/k;

.field private static final d:LX0/k;

.field private static final e:LX0/k;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX0/k$a;-><init>(Ly7/k;)V

    sput-object v0, LX0/k;->b:LX0/k$a;

    new-instance v0, LX0/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX0/k;-><init>(I)V

    sput-object v0, LX0/k;->c:LX0/k;

    new-instance v0, LX0/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LX0/k;-><init>(I)V

    sput-object v0, LX0/k;->d:LX0/k;

    new-instance v0, LX0/k;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LX0/k;-><init>(I)V

    sput-object v0, LX0/k;->e:LX0/k;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LX0/k;->a:I

    return-void
.end method

.method public static final synthetic a()LX0/k;
    .locals 1

    sget-object v0, LX0/k;->e:LX0/k;

    return-object v0
.end method

.method public static final synthetic b()LX0/k;
    .locals 1

    sget-object v0, LX0/k;->c:LX0/k;

    return-object v0
.end method

.method public static final synthetic c()LX0/k;
    .locals 1

    sget-object v0, LX0/k;->d:LX0/k;

    return-object v0
.end method


# virtual methods
.method public final d(LX0/k;)Z
    .locals 1

    .prologue
    iget v0, p0, LX0/k;->a:I

    iget p1, p1, LX0/k;->a:I

    or-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LX0/k;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LX0/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LX0/k;->a:I

    check-cast p1, LX0/k;

    iget p1, p1, LX0/k;->a:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LX0/k;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .prologue
    iget v0, p0, LX0/k;->a:I

    if-nez v0, :cond_0

    const-string v0, "TextDecoration.None"

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget v0, p0, LX0/k;->a:I

    sget-object v2, LX0/k;->d:LX0/k;

    iget v2, v2, LX0/k;->a:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    const-string v0, "Underline"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v0, p0, LX0/k;->a:I

    sget-object v2, LX0/k;->e:LX0/k;

    iget v2, v2, LX0/k;->a:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_2

    const-string v0, "LineThrough"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TextDecoration."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TextDecoration["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
