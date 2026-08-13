.class public final Ln1/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/b$b$a;
    }
.end annotation


# static fields
.field public static final k:Ln1/b$b$a;

.field public static final l:I

.field private static m:I

.field private static n:I

.field private static o:I


# instance fields
.field public a:Lm1/e$b;

.field public b:Lm1/e$b;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Z

.field private i:Z

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/b$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/b$b$a;-><init>(Ly7/k;)V

    sput-object v0, Ln1/b$b;->k:Ln1/b$b$a;

    const/16 v0, 0x8

    sput v0, Ln1/b$b;->l:I

    const/4 v0, 0x1

    sput v0, Ln1/b$b;->n:I

    const/4 v0, 0x2

    sput v0, Ln1/b$b;->o:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Ln1/b$b;->m:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Ln1/b$b;->n:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Ln1/b$b;->o:I

    return v0
.end method


# virtual methods
.method public final d()Lm1/e$b;
    .locals 1

    .prologue
    iget-object v0, p0, Ln1/b$b;->a:Lm1/e$b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "horizontalBehavior"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ln1/b$b;->c:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Ln1/b$b;->j:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ln1/b$b;->g:I

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Ln1/b$b;->h:Z

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Ln1/b$b;->f:I

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Ln1/b$b;->i:Z

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Ln1/b$b;->e:I

    return v0
.end method

.method public final l()Lm1/e$b;
    .locals 1

    .prologue
    iget-object v0, p0, Ln1/b$b;->b:Lm1/e$b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "verticalBehavior"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Ln1/b$b;->d:I

    return v0
.end method

.method public final n(Lm1/e$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln1/b$b;->a:Lm1/e$b;

    return-void
.end method

.method public final o(I)V
    .locals 0

    iput p1, p0, Ln1/b$b;->c:I

    return-void
.end method

.method public final p(I)V
    .locals 0

    iput p1, p0, Ln1/b$b;->j:I

    return-void
.end method

.method public final q(I)V
    .locals 0

    iput p1, p0, Ln1/b$b;->g:I

    return-void
.end method

.method public final r(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/b$b;->h:Z

    return-void
.end method

.method public final s(I)V
    .locals 0

    iput p1, p0, Ln1/b$b;->f:I

    return-void
.end method

.method public final t(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/b$b;->i:Z

    return-void
.end method

.method public final u(I)V
    .locals 0

    iput p1, p0, Ln1/b$b;->e:I

    return-void
.end method

.method public final v(Lm1/e$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln1/b$b;->b:Lm1/e$b;

    return-void
.end method

.method public final w(I)V
    .locals 0

    iput p1, p0, Ln1/b$b;->d:I

    return-void
.end method
