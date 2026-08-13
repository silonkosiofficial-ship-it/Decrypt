.class public Le1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le1/b$a;,
        Le1/b$b;
    }
.end annotation


# static fields
.field public static final g:Le1/b$b;

.field public static final h:I


# instance fields
.field private a:Le1/i;

.field private b:F

.field private c:Z

.field private d:Ljava/util/ArrayList;

.field private e:Le1/b$a;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le1/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le1/b$b;-><init>(Ly7/k;)V

    sput-object v0, Le1/b;->g:Le1/b$b;

    const/16 v0, 0x8

    sput v0, Le1/b;->h:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le1/b;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Le1/c;)V
    .locals 1

    const-string v0, "cache"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Le1/b;-><init>()V

    new-instance v0, Le1/a;

    invoke-direct {v0, p0, p1}, Le1/a;-><init>(Le1/b;Le1/c;)V

    iput-object v0, p0, Le1/b;->e:Le1/b$a;

    return-void
.end method

.method private final A([ZLe1/i;)Le1/i;
    .locals 9

    .prologue
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v1

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v5, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v5, v3}, Le1/b$a;->d(I)F

    move-result v5

    cmpg-float v6, v5, v1

    if-gez v6, :cond_2

    iget-object v6, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v6, v3}, Le1/b$a;->b(I)Le1/i;

    move-result-object v6

    if-eqz p1, :cond_0

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Le1/i;->o()I

    move-result v7

    aget-boolean v7, p1, v7

    if-nez v7, :cond_2

    :cond_0
    invoke-static {v6, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Le1/i;->x()Le1/i$b;

    move-result-object v7

    sget-object v8, Le1/i$b;->E:Le1/i$b;

    if-eq v7, v8, :cond_1

    invoke-virtual {v6}, Le1/i;->x()Le1/i$b;

    move-result-object v7

    sget-object v8, Le1/i$b;->F:Le1/i$b;

    if-ne v7, v8, :cond_2

    :cond_1
    cmpg-float v7, v5, v4

    if-gez v7, :cond_2

    move v4, v5

    move-object v2, v6

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method private final y(Le1/i;Le1/d;)Z
    .locals 0

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->z()I

    move-result p1

    const/4 p2, 0x1

    if-gt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return p2
.end method


# virtual methods
.method public final B(Le1/i;)V
    .locals 4

    .prologue
    const-string v0, "v"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le1/b;->a:Le1/i;

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Le1/b;->a:Le1/i;

    const/high16 v3, -0x40800000    # -1.0f

    invoke-interface {v0, v2, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object v0, p0, Le1/b;->a:Le1/i;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Le1/i;->H(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Le1/b;->a:Le1/i;

    :cond_0
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-interface {v0, p1, v2}, Le1/b$a;->k(Le1/i;Z)F

    move-result v0

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iput-object p1, p0, Le1/b;->a:Le1/i;

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, v0, p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget p1, p0, Le1/b;->b:F

    div-float/2addr p1, v0

    iput p1, p0, Le1/b;->b:F

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Le1/b$a;->e(F)V

    return-void
.end method

.method public final C()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Le1/b;->a:Le1/i;

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Le1/b;->b:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Le1/b;->f:Z

    return-void
.end method

.method public final D(F)V
    .locals 0

    iput p1, p0, Le1/b;->b:F

    return-void
.end method

.method public final E(Z)V
    .locals 0

    iput-boolean p1, p0, Le1/b;->f:Z

    return-void
.end method

.method public final F(Z)V
    .locals 0

    iput-boolean p1, p0, Le1/b;->c:Z

    return-void
.end method

.method public final G(Le1/i;)V
    .locals 0

    iput-object p1, p0, Le1/b;->a:Le1/i;

    return-void
.end method

.method public final H(Le1/b$a;)V
    .locals 0

    iput-object p1, p0, Le1/b;->e:Le1/b$a;

    return-void
.end method

.method public final I()Ljava/lang/String;
    .locals 10

    .prologue
    iget-object v0, p0, Le1/b;->a:Le1/i;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Le1/b;->b:F

    const/4 v2, 0x0

    cmpg-float v3, v1, v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move v1, v5

    :goto_1
    iget-object v3, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3}, Le1/b$a;->a()I

    move-result v3

    :goto_2
    if-ge v4, v3, :cond_8

    iget-object v6, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v6, v4}, Le1/b$a;->b(I)Le1/i;

    move-result-object v6

    if-nez v6, :cond_2

    goto/16 :goto_6

    :cond_2
    iget-object v7, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v7, v4}, Le1/b$a;->d(I)F

    move-result v7

    cmpg-float v8, v7, v2

    if-nez v8, :cond_3

    goto :goto_6

    :cond_3
    invoke-virtual {v6}, Le1/i;->toString()Ljava/lang/String;

    move-result-object v6

    const/high16 v9, -0x40800000    # -1.0f

    if-nez v1, :cond_4

    if-gez v8, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "- "

    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    mul-float/2addr v7, v9

    goto :goto_4

    :cond_4
    cmpl-float v1, v7, v2

    if-lez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " + "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    goto :goto_3

    :cond_6
    :goto_4
    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, v7, v1

    if-nez v1, :cond_7

    goto :goto_5

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move v1, v5

    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    :cond_8
    if-nez v1, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "0.0"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_9
    return-object v0
.end method

.method public J(Le1/d;Le1/i;Z)V
    .locals 3

    .prologue
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Le1/i;->A()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p2}, Le1/b$a;->g(Le1/i;)F

    move-result v0

    iget v1, p0, Le1/b;->b:F

    invoke-virtual {p2}, Le1/i;->n()F

    move-result v2

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    iput v1, p0, Le1/b;->b:F

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p2, p3}, Le1/b$a;->k(Le1/i;Z)F

    if-eqz p3, :cond_1

    invoke-virtual {p2, p0}, Le1/i;->B(Le1/b;)V

    :cond_1
    sget-object p2, Le1/d;->s:Le1/d$a;

    invoke-virtual {p2}, Le1/d$a;->c()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2}, Le1/b$a;->a()I

    move-result p2

    if-nez p2, :cond_2

    const/4 p2, 0x1

    iput-boolean p2, p0, Le1/b;->f:Z

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/d;->J(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public K(Le1/d;Le1/b;Z)V
    .locals 3

    .prologue
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p2, p3}, Le1/b$a;->j(Le1/b;Z)F

    move-result v0

    iget v1, p0, Le1/b;->b:F

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p2, Le1/b;->b:F

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    iput v1, p0, Le1/b;->b:F

    if-eqz p3, :cond_0

    iget-object p2, p2, Le1/b;->a:Le1/i;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2, p0}, Le1/i;->B(Le1/b;)V

    :cond_0
    sget-object p2, Le1/d;->s:Le1/d$a;

    invoke-virtual {p2}, Le1/d$a;->c()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Le1/b;->a:Le1/i;

    if-eqz p2, :cond_1

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2}, Le1/b$a;->a()I

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x1

    iput-boolean p2, p0, Le1/b;->f:Z

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/d;->J(Z)V

    :cond_1
    return-void
.end method

.method public final L(Le1/d;Le1/i;Z)V
    .locals 3

    .prologue
    const-string v0, "system"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Le1/i;->t()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p2}, Le1/b$a;->g(Le1/i;)F

    move-result v0

    iget v1, p0, Le1/b;->b:F

    invoke-virtual {p2}, Le1/i;->w()F

    move-result v2

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    iput v1, p0, Le1/b;->b:F

    iget-object v1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p2, p3}, Le1/b$a;->k(Le1/i;Z)F

    if-eqz p3, :cond_1

    invoke-virtual {p2, p0}, Le1/i;->B(Le1/b;)V

    :cond_1
    iget-object v1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/d;->z()Le1/c;

    move-result-object v2

    invoke-virtual {v2}, Le1/c;->b()[Le1/i;

    move-result-object v2

    invoke-virtual {p2}, Le1/i;->v()I

    move-result p2

    aget-object p2, v2, p2

    invoke-interface {v1, p2, v0, p3}, Le1/b$a;->h(Le1/i;FZ)V

    sget-object p2, Le1/d;->s:Le1/d$a;

    invoke-virtual {p2}, Le1/d$a;->c()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2}, Le1/b$a;->a()I

    move-result p2

    if-nez p2, :cond_2

    const/4 p2, 0x1

    iput-boolean p2, p0, Le1/b;->f:Z

    invoke-virtual {p1, p2}, Le1/d;->J(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public M(Le1/d;)V
    .locals 8

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/d;->A()[Le1/b;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v0, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x1

    if-nez v1, :cond_8

    iget-object v3, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3}, Le1/b$a;->a()I

    move-result v3

    move v4, v0

    :goto_1
    if-ge v4, v3, :cond_3

    iget-object v5, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v5, v4}, Le1/b$a;->b(I)Le1/i;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Le1/i;->r()I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_1

    invoke-virtual {v5}, Le1/i;->A()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v5}, Le1/i;->t()Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    iget-object v6, p0, Le1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    iget-object v3, p0, Le1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_7

    move v4, v0

    :goto_2
    if-ge v4, v3, :cond_6

    iget-object v5, p0, Le1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "get(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Le1/i;

    invoke-virtual {v5}, Le1/i;->A()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {p0, p1, v5, v2}, Le1/b;->J(Le1/d;Le1/i;Z)V

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Le1/i;->t()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {p0, p1, v5, v2}, Le1/b;->L(Le1/d;Le1/i;Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Le1/d;->A()[Le1/b;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Le1/i;->r()I

    move-result v5

    aget-object v5, v6, v5

    invoke-virtual {p0, p1, v5, v2}, Le1/b;->K(Le1/d;Le1/b;Z)V

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    iget-object v2, p0, Le1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :cond_7
    move v1, v2

    goto :goto_0

    :cond_8
    sget-object v0, Le1/d;->s:Le1/d$a;

    invoke-virtual {v0}, Le1/d$a;->c()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Le1/b;->a:Le1/i;

    if-eqz v0, :cond_9

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->a()I

    move-result v0

    if-nez v0, :cond_9

    iput-boolean v2, p0, Le1/b;->f:Z

    invoke-virtual {p1, v2}, Le1/d;->J(Z)V

    :cond_9
    return-void
.end method

.method public a(Le1/d$b;)V
    .locals 6

    .prologue
    instance-of v0, p1, Le1/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Le1/b;->a:Le1/i;

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->clear()V

    check-cast p1, Le1/b;

    iget-object v0, p1, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->a()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p1, Le1/b;->e:Le1/b$a;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v2, v1}, Le1/b$a;->b(I)Le1/i;

    move-result-object v2

    iget-object v3, p1, Le1/b;->e:Le1/b$a;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3, v1}, Le1/b$a;->d(I)F

    move-result v3

    iget-object v4, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v5, 0x1

    invoke-interface {v4, v2, v3, v5}, Le1/b$a;->h(Le1/i;FZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Le1/i;)V
    .locals 3

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->y()I

    move-result v0

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le1/i;->y()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/high16 v2, 0x447a0000    # 1000.0f

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Le1/i;->y()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    const v2, 0x49742400    # 1000000.0f

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Le1/i;->y()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    const v2, 0x4e6e6b28    # 1.0E9f

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Le1/i;->y()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    const v2, 0x5368d4a5    # 1.0E12f

    :cond_4
    :goto_0
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v2}, Le1/b$a;->i(Le1/i;F)V

    return-void
.end method

.method public c(Le1/d;[Z)Le1/i;
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Le1/b;->A([ZLe1/i;)Le1/i;

    move-result-object p1

    return-object p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Le1/b;->a:Le1/i;

    const/4 v0, 0x0

    iput v0, p0, Le1/b;->b:F

    return-void
.end method

.method public final d(Le1/d;I)Le1/b;
    .locals 3

    const-string v0, "system"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const-string v1, "ep"

    invoke-virtual {p1, p2, v1}, Le1/d;->s(ILjava/lang/String;)Le1/i;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v1, v2}, Le1/b$a;->i(Le1/i;F)V

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const-string v1, "em"

    invoke-virtual {p1, p2, v1}, Le1/d;->s(ILjava/lang/String;)Le1/i;

    move-result-object p1

    const/high16 p2, -0x40800000    # -1.0f

    invoke-interface {v0, p1, p2}, Le1/b$a;->i(Le1/i;F)V

    return-object p0
.end method

.method public final e(Le1/i;I)Le1/b;
    .locals 1

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    int-to-float p2, p2

    invoke-interface {v0, p1, p2}, Le1/b$a;->i(Le1/i;F)V

    return-object p0
.end method

.method public final f(Le1/d;)Z
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, Le1/b;->g(Le1/d;)Le1/i;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Le1/b;->B(Le1/i;)V

    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, Le1/b$a;->a()I

    move-result v1

    if-nez v1, :cond_1

    iput-boolean v0, p0, Le1/b;->f:Z

    :cond_1
    return p1
.end method

.method public final g(Le1/d;)Le1/i;
    .locals 14

    .prologue
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v7, v2

    move v8, v7

    move v4, v3

    move v5, v4

    move v6, v5

    move-object v3, v1

    :goto_0
    if-ge v4, v0, :cond_6

    iget-object v9, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v9, v4}, Le1/b$a;->d(I)F

    move-result v9

    iget-object v10, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v10, v4}, Le1/b$a;->b(I)Le1/i;

    move-result-object v10

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10}, Le1/i;->x()Le1/i$b;

    move-result-object v11

    sget-object v12, Le1/i$b;->C:Le1/i$b;

    const/4 v13, 0x1

    if-ne v11, v12, :cond_2

    if-nez v1, :cond_0

    :goto_1
    invoke-direct {p0, v10, p1}, Le1/b;->y(Le1/i;Le1/d;)Z

    move-result v1

    move v5, v1

    move v7, v9

    move-object v1, v10

    goto :goto_3

    :cond_0
    cmpl-float v11, v7, v9

    if-lez v11, :cond_1

    goto :goto_1

    :cond_1
    if-nez v5, :cond_5

    invoke-direct {p0, v10, p1}, Le1/b;->y(Le1/i;Le1/d;)Z

    move-result v11

    if-eqz v11, :cond_5

    move v7, v9

    move-object v1, v10

    move v5, v13

    goto :goto_3

    :cond_2
    if-nez v1, :cond_5

    cmpg-float v11, v9, v2

    if-gez v11, :cond_5

    if-nez v3, :cond_3

    :goto_2
    invoke-direct {p0, v10, p1}, Le1/b;->y(Le1/i;Le1/d;)Z

    move-result v3

    move v6, v3

    move v8, v9

    move-object v3, v10

    goto :goto_3

    :cond_3
    cmpl-float v11, v8, v9

    if-lez v11, :cond_4

    goto :goto_2

    :cond_4
    if-nez v6, :cond_5

    invoke-direct {p0, v10, p1}, Le1/b;->y(Le1/i;Le1/d;)Z

    move-result v11

    if-eqz v11, :cond_5

    move v8, v9

    move-object v3, v10

    move v6, v13

    :cond_5
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    if-nez v1, :cond_7

    move-object v1, v3

    :cond_7
    return-object v1
.end method

.method public getKey()Le1/i;
    .locals 1

    iget-object v0, p0, Le1/b;->a:Le1/i;

    return-object v0
.end method

.method public final h(Le1/i;Le1/i;IFLe1/i;Le1/i;I)Le1/b;
    .locals 4

    .prologue
    const-string v0, "variableB"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variableC"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object p3, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p3, p1, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p6, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 p3, -0x40000000    # -2.0f

    invoke-interface {p1, p2, p3}, Le1/b$a;->i(Le1/i;F)V

    return-object p0

    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float v0, p4, v0

    const/high16 v2, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object p4, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p4, p1, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, v2}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p5, v2}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p6, v1}, Le1/b$a;->i(Le1/i;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    :goto_0
    iput p1, p0, Le1/b;->b:F

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    cmpg-float v0, p4, v0

    if-gtz v0, :cond_3

    iget-object p4, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p4, p1, v2}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, v1}, Le1/b$a;->i(Le1/i;F)V

    int-to-float p1, p3

    goto :goto_0

    :cond_3
    cmpl-float v0, p4, v1

    if-ltz v0, :cond_4

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p6, v2}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p5, v1}, Le1/b$a;->i(Le1/i;F)V

    int-to-float p1, p7

    neg-float p1, p1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x1

    int-to-float v1, v1

    sub-float v2, v1, p4

    mul-float v3, v1, v2

    invoke-interface {v0, p1, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float v3, v0, v2

    invoke-interface {p1, p2, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    mul-float/2addr v0, p4

    invoke-interface {p1, p5, v0}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    mul-float/2addr v1, p4

    invoke-interface {p1, p6, v1}, Le1/b$a;->i(Le1/i;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float/2addr p1, v2

    int-to-float p2, p7

    mul-float/2addr p2, p4

    add-float/2addr p1, p2

    goto :goto_0

    :cond_6
    :goto_1
    return-object p0
.end method

.method public final i(Le1/i;I)Le1/b;
    .locals 1

    const-string v0, "variable"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le1/b;->a:Le1/i;

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Le1/i;->D(F)V

    iput p2, p0, Le1/b;->b:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Le1/b;->f:Z

    return-object p0
.end method

.method public isEmpty()Z
    .locals 2

    .prologue
    iget-object v0, p0, Le1/b;->a:Le1/i;

    if-nez v0, :cond_0

    iget v0, p0, Le1/b;->b:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j(Le1/i;Le1/i;F)Le1/b;
    .locals 2

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {v0, p1, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, p3}, Le1/b$a;->i(Le1/i;F)V

    return-object p0
.end method

.method public final k(Le1/i;Le1/i;Le1/i;Le1/i;F)Le1/b;
    .locals 2

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {v0, p1, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-interface {p1, p2, v0}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p3, p5}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    neg-float p2, p5

    invoke-interface {p1, p4, p2}, Le1/b$a;->i(Le1/i;F)V

    return-object p0
.end method

.method public final l(FFFLe1/i;Le1/i;Le1/i;Le1/i;)Le1/b;
    .locals 4

    .prologue
    const/4 v0, 0x0

    iput v0, p0, Le1/b;->b:F

    cmpg-float v1, p2, v0

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v1, p1, p3

    if-nez v1, :cond_1

    :goto_0
    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p4, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p5, v2}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p7, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p6, v2}, Le1/b$a;->i(Le1/i;F)V

    goto :goto_1

    :cond_1
    cmpg-float v1, p1, v0

    if-nez v1, :cond_2

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p4, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p5, v2}, Le1/b$a;->i(Le1/i;F)V

    goto :goto_1

    :cond_2
    cmpg-float v0, p3, v0

    if-nez v0, :cond_3

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p6, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p7, v2}, Le1/b$a;->i(Le1/i;F)V

    goto :goto_1

    :cond_3
    div-float/2addr p1, p2

    div-float/2addr p3, p2

    div-float/2addr p1, p3

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2, p4, v3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2, p5, v2}, Le1/b$a;->i(Le1/i;F)V

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2, p7, p1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    neg-float p1, p1

    invoke-interface {p2, p6, p1}, Le1/b$a;->i(Le1/i;F)V

    :goto_1
    return-object p0
.end method

.method public final m(Le1/i;I)Le1/b;
    .locals 1

    .prologue
    if-gez p2, :cond_0

    mul-int/lit8 p2, p2, -0x1

    int-to-float p2, p2

    iput p2, p0, Le1/b;->b:F

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    invoke-interface {p2, p1, v0}, Le1/b$a;->i(Le1/i;F)V

    goto :goto_1

    :cond_0
    int-to-float p2, p2

    iput p2, p0, Le1/b;->b:F

    iget-object p2, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 v0, -0x40800000    # -1.0f

    goto :goto_0

    :goto_1
    return-object p0
.end method

.method public final n(Le1/i;Le1/i;I)Le1/b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-gez p3, :cond_0

    mul-int/lit8 p3, p3, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p3, p3

    iput p3, p0, Le1/b;->b:F

    :cond_1
    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, p3}, Le1/b$a;->i(Le1/i;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p3}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, v1}, Le1/b$a;->i(Le1/i;F)V

    :goto_0
    return-object p0
.end method

.method public final o(Le1/i;Le1/i;Le1/i;I)Le1/b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Le1/b;->b:F

    :cond_1
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, p4}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p3, p4}, Le1/b$a;->i(Le1/i;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p4}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p3, v1}, Le1/b$a;->i(Le1/i;F)V

    :goto_0
    return-object p0
.end method

.method public final p(Le1/i;Le1/i;Le1/i;I)Le1/b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Le1/b;->b:F

    :cond_1
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, p4}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p3, v1}, Le1/b$a;->i(Le1/i;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p4}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p3, p4}, Le1/b$a;->i(Le1/i;F)V

    :goto_0
    return-object p0
.end method

.method public final q(Le1/i;Le1/i;Le1/i;Le1/i;F)Le1/b;
    .locals 2

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-interface {v0, p3, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p3, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p3, p4, v1}, Le1/b$a;->i(Le1/i;F)V

    iget-object p3, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    const/high16 p4, -0x41000000    # -0.5f

    invoke-interface {p3, p1, p4}, Le1/b$a;->i(Le1/i;F)V

    iget-object p1, p0, Le1/b;->e:Le1/b$a;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2, p4}, Le1/b$a;->i(Le1/i;F)V

    neg-float p1, p5

    iput p1, p0, Le1/b;->b:F

    return-object p0
.end method

.method public final r()V
    .locals 2

    .prologue
    iget v0, p0, Le1/b;->b:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    mul-float/2addr v0, v1

    iput v0, p0, Le1/b;->b:F

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/b$a;->c()V

    :cond_0
    return-void
.end method

.method public final s()F
    .locals 1

    iget v0, p0, Le1/b;->b:F

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Le1/b;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Le1/b;->I()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Le1/i;
    .locals 1

    iget-object v0, p0, Le1/b;->a:Le1/i;

    return-object v0
.end method

.method public final v()Le1/b$a;
    .locals 1

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    return-object v0
.end method

.method public final w()Z
    .locals 2

    .prologue
    iget-object v0, p0, Le1/b;->a:Le1/i;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le1/i;->x()Le1/i$b;

    move-result-object v0

    sget-object v1, Le1/i$b;->C:Le1/i$b;

    if-eq v0, v1, :cond_0

    iget v0, p0, Le1/b;->b:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final x(Le1/i;)Z
    .locals 1

    iget-object v0, p0, Le1/b;->e:Le1/b$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Le1/b$a;->f(Le1/i;)Z

    move-result p1

    return p1
.end method

.method public final z(Le1/i;)Le1/i;
    .locals 1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Le1/b;->A([ZLe1/i;)Le1/i;

    move-result-object p1

    return-object p1
.end method
