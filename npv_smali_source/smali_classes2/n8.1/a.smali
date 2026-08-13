.class public final Ln8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/a$a;
    }
.end annotation


# static fields
.field public static final e:Ln8/a$a;

.field private static final f:Ln8/f;

.field private static final g:Ln8/c;


# instance fields
.field private final a:Ln8/c;

.field private final b:Ln8/c;

.field private final c:Ln8/f;

.field private final d:Ln8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln8/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln8/a$a;-><init>(Ly7/k;)V

    sput-object v0, Ln8/a;->e:Ln8/a$a;

    sget-object v0, Ln8/h;->l:Ln8/f;

    sput-object v0, Ln8/a;->f:Ln8/f;

    invoke-static {v0}, Ln8/c;->k(Ln8/f;)Ln8/c;

    move-result-object v0

    const-string v1, "topLevel(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ln8/a;->g:Ln8/c;

    return-void
.end method

.method public constructor <init>(Ln8/c;Ln8/c;Ln8/f;Ln8/c;)V
    .locals 1

    const-string v0, "packageName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callableName"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/a;->a:Ln8/c;

    iput-object p2, p0, Ln8/a;->b:Ln8/c;

    iput-object p3, p0, Ln8/a;->c:Ln8/f;

    iput-object p4, p0, Ln8/a;->d:Ln8/c;

    return-void
.end method

.method public synthetic constructor <init>(Ln8/c;Ln8/c;Ln8/f;Ln8/c;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ln8/a;-><init>(Ln8/c;Ln8/c;Ln8/f;Ln8/c;)V

    return-void
.end method

.method public constructor <init>(Ln8/c;Ln8/f;)V
    .locals 8

    const-string v0, "packageName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callableName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v7}, Ln8/a;-><init>(Ln8/c;Ln8/c;Ln8/f;Ln8/c;ILy7/k;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln8/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln8/a;

    iget-object v1, p0, Ln8/a;->a:Ln8/c;

    iget-object v3, p1, Ln8/a;->a:Ln8/c;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ln8/a;->b:Ln8/c;

    iget-object v3, p1, Ln8/a;->b:Ln8/c;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ln8/a;->c:Ln8/f;

    iget-object v3, p1, Ln8/a;->c:Ln8/f;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ln8/a;->d:Ln8/c;

    iget-object p1, p1, Ln8/a;->d:Ln8/c;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Ln8/a;->a:Ln8/c;

    invoke-virtual {v0}, Ln8/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln8/a;->b:Ln8/c;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ln8/c;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln8/a;->c:Ln8/f;

    invoke-virtual {v1}, Ln8/f;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln8/a;->d:Ln8/c;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ln8/c;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ln8/a;->a:Ln8/c;

    invoke-virtual {v1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v2

    const-string v1, "asString(...)"

    invoke-static {v2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln8/a;->b:Ln8/c;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Ln8/a;->c:Ln8/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
