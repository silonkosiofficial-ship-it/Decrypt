.class public final LH/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/v$a;
    }
.end annotation


# static fields
.field public static final g:LH/v$a;

.field private static final h:LH/v;

.field private static final i:LH/v;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Boolean;

.field private final c:I

.field private final d:I

.field private final e:Ljava/lang/Boolean;

.field private final f:LT0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v0, LH/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH/v$a;-><init>(Ly7/k;)V

    sput-object v0, LH/v;->g:LH/v$a;

    new-instance v0, LH/v;

    const/16 v10, 0x7f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, LH/v;-><init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;ILy7/k;)V

    sput-object v0, LH/v;->h:LH/v;

    new-instance v0, LH/v;

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, LS0/y;->b:LS0/y$a;

    invoke-virtual {v1}, LS0/y$a;->f()I

    move-result v15

    const/16 v20, 0x79

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v12, v0

    invoke-direct/range {v12 .. v21}, LH/v;-><init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;ILy7/k;)V

    sput-object v0, LH/v;->i:LH/v;

    return-void
.end method

.method private constructor <init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LH/v;->a:I

    iput-object p2, p0, LH/v;->b:Ljava/lang/Boolean;

    iput p3, p0, LH/v;->c:I

    iput p4, p0, LH/v;->d:I

    iput-object p6, p0, LH/v;->e:Ljava/lang/Boolean;

    iput-object p7, p0, LH/v;->f:LT0/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;ILy7/k;)V
    .locals 8

    .prologue
    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    sget-object v0, LS0/x;->b:LS0/x$a;

    invoke-virtual {v0}, LS0/x$a;->d()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    and-int/lit8 v1, p8, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_2

    sget-object v3, LS0/y;->b:LS0/y$a;

    invoke-virtual {v3}, LS0/y$a;->i()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, p3

    :goto_2
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_3

    sget-object v4, LS0/r;->b:LS0/r$a;

    invoke-virtual {v4}, LS0/r$a;->i()I

    move-result v4

    goto :goto_3

    :cond_3
    move v4, p4

    :goto_3
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_4

    move-object v5, v2

    goto :goto_4

    :cond_4
    move-object v5, p5

    :goto_4
    and-int/lit8 v6, p8, 0x20

    if-eqz v6, :cond_5

    move-object v6, v2

    goto :goto_5

    :cond_5
    move-object v6, p6

    :goto_5
    and-int/lit8 v7, p8, 0x40

    if-eqz v7, :cond_6

    goto :goto_6

    :cond_6
    move-object v2, p7

    :goto_6
    const/4 v7, 0x0

    move-object p1, p0

    move p2, v0

    move-object p3, v1

    move p4, v3

    move p5, v4

    move-object p6, v5

    move-object p7, v6

    move-object/from16 p8, v2

    move-object/from16 p9, v7

    invoke-direct/range {p1 .. p9}, LH/v;-><init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LH/v;-><init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;)V

    return-void
.end method

.method public static final synthetic a()LH/v;
    .locals 1

    sget-object v0, LH/v;->h:LH/v;

    return-object v0
.end method

.method private final b()Z
    .locals 1

    .prologue
    iget-object v0, p0, LH/v;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method private final c()I
    .locals 4

    .prologue
    iget v0, p0, LH/v;->a:I

    invoke-static {v0}, LS0/x;->f(I)LS0/x;

    move-result-object v0

    invoke-virtual {v0}, LS0/x;->l()I

    move-result v1

    sget-object v2, LS0/x;->b:LS0/x$a;

    invoke-virtual {v2}, LS0/x$a;->d()I

    move-result v3

    invoke-static {v1, v3}, LS0/x;->i(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LS0/x;->l()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LS0/x$a;->b()I

    move-result v0

    :goto_1
    return v0
.end method

.method private final d()LT0/h;
    .locals 1

    .prologue
    iget-object v0, p0, LH/v;->f:LT0/h;

    if-nez v0, :cond_0

    sget-object v0, LT0/h;->E:LT0/h$a;

    invoke-virtual {v0}, LT0/h$a;->b()LT0/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private final f()I
    .locals 4

    .prologue
    iget v0, p0, LH/v;->c:I

    invoke-static {v0}, LS0/y;->k(I)LS0/y;

    move-result-object v0

    invoke-virtual {v0}, LS0/y;->q()I

    move-result v1

    sget-object v2, LS0/y;->b:LS0/y$a;

    invoke-virtual {v2}, LS0/y$a;->i()I

    move-result v3

    invoke-static {v1, v3}, LS0/y;->n(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LS0/y;->q()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LS0/y$a;->h()I

    move-result v0

    :goto_1
    return v0
.end method


# virtual methods
.method public final e()I
    .locals 4

    .prologue
    iget v0, p0, LH/v;->d:I

    invoke-static {v0}, LS0/r;->j(I)LS0/r;

    move-result-object v0

    invoke-virtual {v0}, LS0/r;->p()I

    move-result v1

    sget-object v2, LS0/r;->b:LS0/r$a;

    invoke-virtual {v2}, LS0/r$a;->i()I

    move-result v3

    invoke-static {v1, v3}, LS0/r;->m(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LS0/r;->p()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LS0/r$a;->a()I

    move-result v0

    :goto_1
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LH/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LH/v;->a:I

    check-cast p1, LH/v;

    iget v3, p1, LH/v;->a:I

    invoke-static {v1, v3}, LS0/x;->i(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LH/v;->b:Ljava/lang/Boolean;

    iget-object v3, p1, LH/v;->b:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, LH/v;->c:I

    iget v3, p1, LH/v;->c:I

    invoke-static {v1, v3}, LS0/y;->n(II)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, LH/v;->d:I

    iget v3, p1, LH/v;->d:I

    invoke-static {v1, v3}, LS0/r;->m(II)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LH/v;->e:Ljava/lang/Boolean;

    iget-object v3, p1, LH/v;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LH/v;->f:LT0/h;

    iget-object p1, p1, LH/v;->f:LT0/h;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final g(Z)LS0/s;
    .locals 10

    new-instance v9, LS0/s;

    invoke-direct {p0}, LH/v;->c()I

    move-result v2

    invoke-direct {p0}, LH/v;->b()Z

    move-result v3

    invoke-direct {p0}, LH/v;->f()I

    move-result v4

    invoke-virtual {p0}, LH/v;->e()I

    move-result v5

    invoke-direct {p0}, LH/v;->d()LT0/h;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move v1, p1

    invoke-direct/range {v0 .. v8}, LS0/s;-><init>(ZIZIILS0/O;LT0/h;Ly7/k;)V

    return-object v9
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget v0, p0, LH/v;->a:I

    invoke-static {v0}, LS0/x;->j(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LH/v;->b:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LH/v;->c:I

    invoke-static {v1}, LS0/y;->o(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LH/v;->d:I

    invoke-static {v1}, LS0/r;->n(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-object v1, p0, LH/v;->e:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LH/v;->f:LT0/h;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KeyboardOptions(capitalization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LH/v;->a:I

    invoke-static {v1}, LS0/x;->k(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoCorrectEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH/v;->b:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", keyboardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LH/v;->c:I

    invoke-static {v1}, LS0/y;->p(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imeAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LH/v;->d:I

    invoke-static {v1}, LS0/r;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformImeOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "showKeyboardOnFocus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH/v;->e:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hintLocales="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH/v;->f:LT0/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
