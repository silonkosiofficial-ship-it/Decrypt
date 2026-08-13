.class final LN/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/D$a;
    }
.end annotation


# static fields
.field public static final f:LN/D$a;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:LN/k;

.field private final e:LN/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/D$a;-><init>(Ly7/k;)V

    sput-object v0, LN/D;->f:LN/D$a;

    return-void
.end method

.method public constructor <init>(ZIILN/k;LN/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LN/D;->a:Z

    iput p2, p0, LN/D;->b:I

    iput p3, p0, LN/D;->c:I

    iput-object p4, p0, LN/D;->d:LN/k;

    iput-object p5, p0, LN/D;->e:LN/j;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LN/D;->a:Z

    return v0
.end method

.method public c()LN/j;
    .locals 1

    iget-object v0, p0, LN/D;->e:LN/j;

    return-object v0
.end method

.method public d()LN/k;
    .locals 1

    iget-object v0, p0, LN/D;->d:LN/k;

    return-object v0
.end method

.method public e()LN/j;
    .locals 1

    iget-object v0, p0, LN/D;->e:LN/j;

    return-object v0
.end method

.method public f(LN/w;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/D;->d()LN/k;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    instance-of v0, p1, LN/D;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LN/D;->l()I

    move-result v0

    check-cast p1, LN/D;

    invoke-virtual {p1}, LN/D;->l()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LN/D;->g()I

    move-result v0

    invoke-virtual {p1}, LN/D;->g()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LN/D;->b()Z

    move-result v0

    invoke-virtual {p1}, LN/D;->b()Z

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LN/D;->e:LN/j;

    iget-object p1, p1, LN/D;->e:LN/j;

    invoke-virtual {v0, p1}, LN/j;->m(LN/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public g()I
    .locals 1

    iget v0, p0, LN/D;->c:I

    return v0
.end method

.method public h()LN/j;
    .locals 1

    iget-object v0, p0, LN/D;->e:LN/j;

    return-object v0
.end method

.method public i()LN/e;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/D;->l()I

    move-result v0

    invoke-virtual {p0}, LN/D;->g()I

    move-result v1

    if-ge v0, v1, :cond_0

    sget-object v0, LN/e;->D:LN/e;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/D;->l()I

    move-result v0

    invoke-virtual {p0}, LN/D;->g()I

    move-result v1

    if-le v0, v1, :cond_1

    sget-object v0, LN/e;->C:LN/e;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LN/D;->e:LN/j;

    invoke-virtual {v0}, LN/j;->d()LN/e;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public j(Lx7/l;)V
    .locals 0

    return-void
.end method

.method public k()LN/j;
    .locals 1

    iget-object v0, p0, LN/D;->e:LN/j;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, LN/D;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SingleSelectionLayout(isStartHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LN/D;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", crossed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LN/D;->i()LN/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", info=\n\t"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LN/D;->e:LN/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
