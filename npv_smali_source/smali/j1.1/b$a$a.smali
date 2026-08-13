.class public final Lj1/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:F

.field private h:F

.field private i:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFFLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj1/b$a$a;->a:F

    iput p2, p0, Lj1/b$a$a;->b:F

    iput p3, p0, Lj1/b$a$a;->c:F

    const-string p3, ""

    if-nez p4, :cond_0

    move-object p4, p3

    :cond_0
    iput-object p4, p0, Lj1/b$a$a;->e:Ljava/lang/String;

    if-nez p5, :cond_1

    move-object p5, p3

    :cond_1
    iput-object p5, p0, Lj1/b$a$a;->f:Ljava/lang/String;

    iput p2, p0, Lj1/b$a$a;->i:F

    iput p1, p0, Lj1/b$a$a;->h:F

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 7

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, Lj1/b$a$a;->h:F

    float-to-int v1, v1

    iget v2, p0, Lj1/b$a$a;->i:F

    float-to-int v2, v2

    if-gt v1, v2, :cond_0

    move v3, v1

    :goto_0
    iget-object v4, p0, Lj1/b$a$a;->e:Ljava/lang/String;

    iget-object v5, p0, Lj1/b$a$a;->f:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v4, p0, Lj1/b$a$a;->c:F

    float-to-int v4, v4

    add-int/2addr v1, v4

    if-eq v3, v2, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public value()F
    .locals 2

    .prologue
    iget v0, p0, Lj1/b$a$a;->g:F

    iget v1, p0, Lj1/b$a$a;->i:F

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lj1/b$a$a;->d:Z

    :cond_0
    iget-boolean v1, p0, Lj1/b$a$a;->d:Z

    if-nez v1, :cond_1

    iget v1, p0, Lj1/b$a$a;->c:F

    add-float/2addr v0, v1

    iput v0, p0, Lj1/b$a$a;->g:F

    :cond_1
    iget v0, p0, Lj1/b$a$a;->g:F

    return v0
.end method
