.class public final LS0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS0/s$a;
    }
.end annotation


# static fields
.field public static final g:LS0/s$a;

.field private static final h:LS0/s;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:Z

.field private final d:I

.field private final e:I

.field private final f:LT0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, LS0/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS0/s$a;-><init>(Ly7/k;)V

    sput-object v0, LS0/s;->g:LS0/s$a;

    new-instance v0, LS0/s;

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

    invoke-direct/range {v2 .. v11}, LS0/s;-><init>(ZIZIILS0/O;LT0/h;ILy7/k;)V

    sput-object v0, LS0/s;->h:LS0/s;

    return-void
.end method

.method private constructor <init>(ZIZIILS0/O;LT0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LS0/s;->a:Z

    iput p2, p0, LS0/s;->b:I

    iput-boolean p3, p0, LS0/s;->c:Z

    iput p4, p0, LS0/s;->d:I

    iput p5, p0, LS0/s;->e:I

    iput-object p7, p0, LS0/s;->f:LT0/h;

    return-void
.end method

.method public synthetic constructor <init>(ZIZIILS0/O;LT0/h;ILy7/k;)V
    .locals 8

    .prologue
    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_1

    sget-object v1, LS0/x;->b:LS0/x$a;

    invoke-virtual {v1}, LS0/x$a;->b()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_3

    sget-object v3, LS0/y;->b:LS0/y$a;

    invoke-virtual {v3}, LS0/y$a;->h()I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, p4

    :goto_3
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_4

    sget-object v4, LS0/r;->b:LS0/r$a;

    invoke-virtual {v4}, LS0/r$a;->a()I

    move-result v4

    goto :goto_4

    :cond_4
    move v4, p5

    :goto_4
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_5

    :cond_5
    move-object v5, p6

    :goto_5
    and-int/lit8 v6, p8, 0x40

    if-eqz v6, :cond_6

    sget-object v6, LT0/h;->E:LT0/h$a;

    invoke-virtual {v6}, LT0/h$a;->b()LT0/h;

    move-result-object v6

    goto :goto_6

    :cond_6
    move-object v6, p7

    :goto_6
    const/4 v7, 0x0

    move-object p1, p0

    move p2, v0

    move p3, v1

    move p4, v2

    move p5, v3

    move p6, v4

    move-object p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    invoke-direct/range {p1 .. p9}, LS0/s;-><init>(ZIZIILS0/O;LT0/h;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(ZIZIILS0/O;LT0/h;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LS0/s;-><init>(ZIZIILS0/O;LT0/h;)V

    return-void
.end method

.method public static final synthetic a()LS0/s;
    .locals 1

    sget-object v0, LS0/s;->h:LS0/s;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LS0/s;->c:Z

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LS0/s;->b:I

    return v0
.end method

.method public final d()LT0/h;
    .locals 1

    iget-object v0, p0, LS0/s;->f:LT0/h;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LS0/s;->e:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LS0/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, LS0/s;->a:Z

    check-cast p1, LS0/s;

    iget-boolean v3, p1, LS0/s;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LS0/s;->b:I

    iget v3, p1, LS0/s;->b:I

    invoke-static {v1, v3}, LS0/x;->i(II)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LS0/s;->c:Z

    iget-boolean v3, p1, LS0/s;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, LS0/s;->d:I

    iget v3, p1, LS0/s;->d:I

    invoke-static {v1, v3}, LS0/y;->n(II)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, LS0/s;->e:I

    iget v3, p1, LS0/s;->e:I

    invoke-static {v1, v3}, LS0/r;->m(II)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LS0/s;->f:LT0/h;

    iget-object p1, p1, LS0/s;->f:LT0/h;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LS0/s;->d:I

    return v0
.end method

.method public final g()LS0/O;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, LS0/s;->a:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, LS0/s;->a:Z

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS0/s;->b:I

    invoke-static {v1}, LS0/x;->j(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LS0/s;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS0/s;->d:I

    invoke-static {v1}, LS0/y;->o(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS0/s;->e:I

    invoke-static {v1}, LS0/r;->n(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-object v1, p0, LS0/s;->f:LT0/h;

    invoke-virtual {v1}, LT0/h;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImeOptions(singleLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LS0/s;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", capitalization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LS0/s;->b:I

    invoke-static {v1}, LS0/x;->k(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoCorrect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LS0/s;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", keyboardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LS0/s;->d:I

    invoke-static {v1}, LS0/y;->p(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imeAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LS0/s;->e:I

    invoke-static {v1}, LS0/r;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformImeOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hintLocales="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS0/s;->f:LT0/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
