.class public abstract LA/W;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA/W$a;
    }
.end annotation


# static fields
.field public static final a:LA/W$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I

.field private static final g:I

.field private static final h:I

.field private static final i:I

.field private static final j:I

.field private static final k:I

.field private static final l:I

.field private static final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LA/W$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA/W$a;-><init>(Ly7/k;)V

    sput-object v0, LA/W;->a:LA/W$a;

    const/16 v0, 0x8

    invoke-static {v0}, LA/W;->h(I)I

    move-result v0

    sput v0, LA/W;->b:I

    const/4 v1, 0x4

    invoke-static {v1}, LA/W;->h(I)I

    move-result v1

    sput v1, LA/W;->c:I

    const/4 v2, 0x2

    invoke-static {v2}, LA/W;->h(I)I

    move-result v2

    sput v2, LA/W;->d:I

    const/4 v3, 0x1

    invoke-static {v3}, LA/W;->h(I)I

    move-result v3

    sput v3, LA/W;->e:I

    invoke-static {v0, v3}, LA/W;->l(II)I

    move-result v4

    sput v4, LA/W;->f:I

    invoke-static {v1, v2}, LA/W;->l(II)I

    move-result v4

    sput v4, LA/W;->g:I

    const/16 v4, 0x10

    invoke-static {v4}, LA/W;->h(I)I

    move-result v4

    sput v4, LA/W;->h:I

    const/16 v5, 0x20

    invoke-static {v5}, LA/W;->h(I)I

    move-result v5

    sput v5, LA/W;->i:I

    invoke-static {v0, v2}, LA/W;->l(II)I

    move-result v0

    sput v0, LA/W;->j:I

    invoke-static {v1, v3}, LA/W;->l(II)I

    move-result v1

    sput v1, LA/W;->k:I

    invoke-static {v0, v1}, LA/W;->l(II)I

    move-result v0

    sput v0, LA/W;->l:I

    invoke-static {v4, v5}, LA/W;->l(II)I

    move-result v0

    sput v0, LA/W;->m:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LA/W;->b:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LA/W;->d:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LA/W;->c:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, LA/W;->e:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, LA/W;->i:I

    return v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, LA/W;->l:I

    return v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, LA/W;->h:I

    return v0
.end method

.method private static h(I)I
    .locals 0

    return p0
.end method

.method public static final i(II)Z
    .locals 0

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final j(II)Z
    .locals 0

    .prologue
    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static k(I)I
    .locals 0

    return p0
.end method

.method public static final l(II)I
    .locals 0

    or-int/2addr p0, p1

    invoke-static {p0}, LA/W;->h(I)I

    move-result p0

    return p0
.end method

.method public static m(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WindowInsetsSides("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LA/W;->n(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final n(I)Ljava/lang/String;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, LA/W;->f:I

    and-int v2, p0, v1

    if-ne v2, v1, :cond_0

    const-string v1, "Start"

    invoke-static {v0, v1}, LA/W;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_0
    sget v1, LA/W;->j:I

    and-int v2, p0, v1

    if-ne v2, v1, :cond_1

    const-string v1, "Left"

    invoke-static {v0, v1}, LA/W;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_1
    sget v1, LA/W;->h:I

    and-int v2, p0, v1

    if-ne v2, v1, :cond_2

    const-string v1, "Top"

    invoke-static {v0, v1}, LA/W;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_2
    sget v1, LA/W;->g:I

    and-int v2, p0, v1

    if-ne v2, v1, :cond_3

    const-string v1, "End"

    invoke-static {v0, v1}, LA/W;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_3
    sget v1, LA/W;->k:I

    and-int v2, p0, v1

    if-ne v2, v1, :cond_4

    const-string v1, "Right"

    invoke-static {v0, v1}, LA/W;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_4
    sget v1, LA/W;->i:I

    and-int/2addr p0, v1

    if-ne p0, v1, :cond_5

    const-string p0, "Bottom"

    invoke-static {v0, p0}, LA/W;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final o(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    .prologue
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/16 v0, 0x2b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
