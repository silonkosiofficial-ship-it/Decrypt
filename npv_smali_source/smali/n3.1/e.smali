.class public final Ln3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/e$a;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:Z

.field private final e:I

.field private final f:Lk3/x;

.field private final g:Z


# direct methods
.method synthetic constructor <init>(Ln3/e$a;Ln3/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln3/e$a;->n(Ln3/e$a;)Z

    move-result p2

    iput-boolean p2, p0, Ln3/e;->a:Z

    invoke-static {p1}, Ln3/e$a;->j(Ln3/e$a;)I

    move-result p2

    iput p2, p0, Ln3/e;->b:I

    invoke-static {p1}, Ln3/e$a;->k(Ln3/e$a;)I

    move-result p2

    iput p2, p0, Ln3/e;->c:I

    invoke-static {p1}, Ln3/e$a;->m(Ln3/e$a;)Z

    move-result p2

    iput-boolean p2, p0, Ln3/e;->d:Z

    invoke-static {p1}, Ln3/e$a;->i(Ln3/e$a;)I

    move-result p2

    iput p2, p0, Ln3/e;->e:I

    invoke-static {p1}, Ln3/e$a;->l(Ln3/e$a;)Lk3/x;

    move-result-object p2

    iput-object p2, p0, Ln3/e;->f:Lk3/x;

    invoke-static {p1}, Ln3/e$a;->o(Ln3/e$a;)Z

    move-result p1

    iput-boolean p1, p0, Ln3/e;->g:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ln3/e;->e:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ln3/e;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ln3/e;->c:I

    return v0
.end method

.method public d()Lk3/x;
    .locals 1

    iget-object v0, p0, Ln3/e;->f:Lk3/x;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ln3/e;->d:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ln3/e;->a:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Ln3/e;->g:Z

    return v0
.end method
