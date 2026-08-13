.class public final Lk1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/e;
.implements Lj1/f;


# instance fields
.field private final a:Lj1/g;

.field private b:I

.field private c:Lm1/h;

.field private d:I

.field private e:I

.field private f:F

.field private g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj1/g;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/h;->a:Lj1/g;

    const/4 p1, -0x1

    iput p1, p0, Lk1/h;->d:I

    iput p1, p0, Lk1/h;->e:I

    return-void
.end method


# virtual methods
.method public a()Lm1/e;
    .locals 1

    .prologue
    iget-object v0, p0, Lk1/h;->c:Lm1/h;

    if-nez v0, :cond_0

    new-instance v0, Lm1/h;

    invoke-direct {v0}, Lm1/h;-><init>()V

    iput-object v0, p0, Lk1/h;->c:Lm1/h;

    :cond_0
    iget-object v0, p0, Lk1/h;->c:Lm1/h;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public apply()V
    .locals 2

    .prologue
    iget-object v0, p0, Lk1/h;->c:Lm1/h;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/h;->b:I

    invoke-virtual {v0, v1}, Lm1/h;->j2(I)V

    iget v0, p0, Lk1/h;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lk1/h;->c:Lm1/h;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/h;->d:I

    invoke-virtual {v0, v1}, Lm1/h;->g2(I)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lk1/h;->e:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lk1/h;->c:Lm1/h;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/h;->e:I

    invoke-virtual {v0, v1}, Lm1/h;->h2(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk1/h;->c:Lm1/h;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/h;->f:F

    invoke-virtual {v0, v1}, Lm1/h;->i2(F)V

    :goto_0
    return-void
.end method

.method public b(Lm1/e;)V
    .locals 1

    .prologue
    instance-of v0, p1, Lm1/h;

    if-eqz v0, :cond_0

    check-cast p1, Lm1/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lk1/h;->c:Lm1/h;

    return-void
.end method

.method public c()Lk1/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(Ljava/lang/Object;)Lk1/h;
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lk1/h;->d:I

    iget-object v0, p0, Lk1/h;->a:Lj1/g;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lk1/h;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lk1/h;->f:F

    return-object p0
.end method

.method public final e(F)Lk1/h;
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lk1/h;->d:I

    iput v0, p0, Lk1/h;->e:I

    iput p1, p0, Lk1/h;->f:F

    return-object p0
.end method

.method public f(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lk1/h;->g:Ljava/lang/Object;

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lk1/h;->b:I

    return-void
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk1/h;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Lk1/h;
    .locals 1

    iget-object v0, p0, Lk1/h;->a:Lj1/g;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lk1/h;->d:I

    const/4 p1, -0x1

    iput p1, p0, Lk1/h;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lk1/h;->f:F

    return-object p0
.end method
